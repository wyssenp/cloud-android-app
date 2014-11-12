/*
 * DatabaseAccessObject
 * 
 * v2
 *
 * 6/08/2013
 * 
 * Copyright Technopole Sierre
 */

package ch.technotracks.dbaccess;

import java.util.Calendar;

import ch.technotracks.network.UploadingData;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Class to access the android database
 * @author Joel
 *
 */
public abstract class DatabaseAccessObject
{
	private static SQLiteDatabase database;
	private static SQLiteOpenHelper helper;

	/**
	 * Open the database
	 * @param context
     * The context in which running
	 */
	public static void open(Context context)
	{
		helper = new DatabaseUtility(context);
		database = helper.getWritableDatabase();
	}
	
	/**
	 * Close the database
	 */
	public static void close()
	{
		helper.close();
	}
	
	/**
	 * Give the last id in the tracks
	 * @return
	 * The last id
	 */
	public static int getMaxTrackId()
	{
		String sql = "SELECT MAX(id) FROM Tracks";
		
		Cursor cursor = database.rawQuery(sql, null);
		
		if(!cursor.moveToFirst())
			return 0;
		
		return cursor.getInt(0);
	}

	/**
	 * Get all tracks in the db
	 * @return
	 * A cursor with all the tracks
	 */
	public static Cursor getTracks()
	{
		String sql = "SELECT id AS _id, date, name FROM Tracks";	//AS _id necessary for the SimpleCursorAdapter

        return database.rawQuery(sql, null);
	}

	/**
	 * Get all points for a given tracks
	 * @param trackId
	 * The track id
	 * @return
	 * A cursor containing data
	 */
	public static Cursor getTrackPoints(int trackId)
	{
		String sql = "SELECT longitude, latitude, altitude FROM Points WHERE trackId = " + trackId;

        return database.rawQuery(sql, null);
	}

	/**
	 * Get the track details for a given id
	 * @param trackId
	 * The track id
	 * @return
	 * A cursor containing datas
	 */
	public static Cursor getTrackDetails(int trackId)
	{
		String sql = "SELECT date, name FROM Tracks WHERE id = " + trackId;

        return database.rawQuery(sql, null);
	}

	/**
	 * Tell if the database has points to upload
	 * @return
	 * true if some data are not uploaded
	 */
	public static boolean hasDataToUpload()
	{
		int nb = selectAllToUpload().getCount();

        return nb != 0;

    }

	/**
	 * Select all data which are not yet uploaded
	 * @return
	 * A cursor containing all data to upload
	 */
	private static Cursor selectAllToUpload()
	{
		String sql = "SELECT id, latitude, longitude, altitude, accuracy, satellites FROM Points WHERE uploaded = 'false'";

        return database.rawQuery(sql, null);
	}

	/**
	 * Set the uploaded column of the point with the given id to true
	 * @param id
	 * The id of the point
	 */
	public static void setUploadedToTrue(int id)
	{
		String sql = "UPDATE Points SET uploaded = 'true' WHERE id = " + id;
		
		Cursor c = database.rawQuery(sql, null);
		c.moveToFirst();
		c.close();
	}

	/**
	 * Write a point in the app database
	 * @param trackID
	 * The id of the track
	 * @param latitude
	 * The latitude in decimal degree
	 * @param longitude
	 * The longitude in decimal degree
	 * @param altitude
	 * The altitude in meters
	 * @param speed
	 * The speed in meters by second
	 * @param bearing
	 * The bearing in degree
	 * @param accuracy
	 * The accuracy in meters
	 * @param time
	 * The time in millisecond since 1 Jan 1970
	 * @param satellites
	 * The number of satellites
	 */
	public static void writePoint(int trackID, double latitude, double longitude, double altitude, float speed, float bearing, float accuracy, long time, int satellites)
	{
		ContentValues values = new ContentValues();
		
		values.put("trackId", trackID);
		values.put("latitude", latitude);
		values.put("longitude", longitude);
		values.put("altitude", altitude);
		values.put("speed", speed);
		values.put("bearing", bearing);
		values.put("accuracy", accuracy);
		values.put("time", time);
		values.put("satellites", satellites);
		values.put("uploaded", "false");
		
		database.insert("Points", null, values);
	}
	
	/**
	 * Create track in the db
	 * @param trackID
	 * The track id
	 * @param trackName
	 * The track name
	 */
	public static void writeTrack(int trackID, String trackName)
	{
		ContentValues values = new ContentValues();
		
		Calendar c = Calendar.getInstance();
		String date = c.get(Calendar.DAY_OF_MONTH) + "/" +
						(c.get(Calendar.MONTH) + 1) + "/" +
						c.get(Calendar.YEAR);
		
		values.put("id", trackID);
		values.put("name", trackName);
		values.put("date", date);
		
		database.insert("Tracks", null, values);
	}
	
	/**
	 * Delete a track from the android db
	 * @param trackId
	 * The track id
	 */
	public static void deleteTrack(int trackId)
	{
		String query = "DELETE FROM Tracks WHERE id = " + trackId;
		
		database.execSQL(query);
		
		deletePoints(trackId);
	}
	
	/**
	 * Delete all points linked to a track
	 * @param trackId
	 * The track id
	 */
	private static void deletePoints(int trackId)
	{
		String query = "DELETE FROM Points WHERE trackId = " + trackId;
		
		database.execSQL(query);
	}

	/**
	 * Call an async task to save data on the server
	 */
	public static void save()
	{
		Cursor cursor = selectAllToUpload();
		
		new UploadingData().execute(cursor);
	}
}
