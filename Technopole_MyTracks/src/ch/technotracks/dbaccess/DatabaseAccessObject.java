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
	 * Get the highest timestamp per track (used to calculate the duration)
	 * @param
	 * trackId The track id
	 * @return
	 * A timestamp.
	 */
	public static long getMaxTime(int trackId)
	{
		String sql = "SELECT MAX(time) FROM Point WHERE trackId = " + trackId ;
		
		Cursor cursor = database.rawQuery(sql, null);
		
		if(!cursor.moveToFirst())
			return 0;
		
		return cursor.getLong(0);
	}
	
	/**
	 * Get the lowest timestamp per track (used to calculate the duration)
	 * @param
	 * trackId The track id
	 * @return
	 * A timestamp.
	 */
	public static long getMinTime(int trackId)
	{
		String sql = "SELECT MIN(time) FROM Point WHERE trackId = " + trackId ;
		
		Cursor cursor = database.rawQuery(sql, null);
		
		if(!cursor.moveToFirst())
			return 0;
		
		return cursor.getLong(0);
	}
	
	/**
	 * Get the number of points per track
	 * @param
	 * trackId The track ID
	 * @return
	 * Number of tracks
	 */
	public static int getNumberOfPoints(int trackId)
	{
		String sql = "SELECT COUNT(DISTINCT pointId) FROM Point WHERE trackId = " + trackId ;
		
		Cursor cursor = database.rawQuery(sql, null);
		
		if(!cursor.moveToFirst())
			return 0;
		
		return cursor.getInt(0);
	}
	
	/**
	 * Get the maximum bearing per track
	 * @param
	 * trackId The track ID
	 * @return
	 * The maximum bearing
	 */
	public static float getMaxBearing(int trackId)
	{
		String sql = "SELECT MAX(bearing) FROM Point WHERE trackId = " + trackId ;
		
		Cursor cursor = database.rawQuery(sql, null);
		
		if(!cursor.moveToFirst())
			return 0;
		
		return cursor.getFloat(0);
	}
	
	/**
	 * Get the minimum bearing per track
	 * @param
	 * trackId The track ID
	 * @return
	 * The minimum bearing
	 */
	public static float getMinBearing(int trackId)
	{
		String sql = "SELECT MIN(bearing) FROM Point WHERE trackId = " + trackId ;
		
		Cursor cursor = database.rawQuery(sql, null);
		
		if(!cursor.moveToFirst())
			return 0;
		
		return cursor.getFloat(0);
	}
	
	/**
	 * Get the average bearing per track
	 * @param
	 * trackId The track ID
	 * @return
	 * The average bearing
	 */
	public static float getAvgBearing(int trackId)
	{
		String sql = "SELECT AVG(bearing) FROM Point WHERE trackId = " + trackId ;
		
		Cursor cursor = database.rawQuery(sql, null);
		
		if(!cursor.moveToFirst())
			return 0;
		
		return cursor.getFloat(0);
	}
	
	/**
	 * Get the maximum speed per track
	 * @param
	 * trackId The track ID
	 * @return
	 * The maximum speed
	 */
	public static float getMaxSpeed(int trackId)
	{
		String sql = "SELECT MAX(speed) FROM Point WHERE trackId = " + trackId ;
		
		Cursor cursor = database.rawQuery(sql, null);
		
		if(!cursor.moveToFirst())
			return 0;
		
		return cursor.getFloat(0);
	}
	
	/**
	 * Get the minimum speed per track
	 * @param
	 * trackId The track ID
	 * @return
	 * The minimum speed
	 */
	public static float getMinSpeed(int trackId)
	{
		String sql = "SELECT MIN(speed) FROM Point WHERE trackId = " + trackId ;
		
		Cursor cursor = database.rawQuery(sql, null);
		
		if(!cursor.moveToFirst())
			return 0;
		
		return cursor.getFloat(0);
	}
	
	/**
	 * Get the average speed per track
	 * @param
	 * trackId The track ID
	 * @return
	 * The average speed
	 */
	public static float getAvgSpeed(int trackId)
	{
		String sql = "SELECT AVG(speed) FROM Point WHERE trackId = " + trackId ;
		
		Cursor cursor = database.rawQuery(sql, null);
		
		if(!cursor.moveToFirst())
			return 0;
		
		return cursor.getFloat(0);
	}
	
	/**
	 * Get the maximum altitude per track
	 * @param
	 * trackId The track ID
	 * @return
	 * The maximum altitude
	 */
	public static double getMaxAltitude(int trackId)
	{
		String sql = "SELECT MAX(altitude) FROM Point WHERE trackId = " + trackId ;
		
		Cursor cursor = database.rawQuery(sql, null);
		
		if(!cursor.moveToFirst())
			return 0;
		
		return cursor.getDouble(0);
	}
	
	/**
	 * Get the minimum altitude per track
	 * @param
	 * trackId The track ID
	 * @return
	 * The minimum altitude
	 */
	public static double getMinAltitude(int trackId)
	{
		String sql = "SELECT MIN(altitude) FROM Point WHERE trackId = " + trackId ;
		
		Cursor cursor = database.rawQuery(sql, null);
		
		if(!cursor.moveToFirst())
			return 0;
		
		return cursor.getDouble(0);
	}
	
	/**
	 * Get the average altitude per track
	 * @param
	 * trackId The track ID
	 * @return
	 * The average altitude
	 */
	public static double getAvgAltitude(int trackId)
	{
		String sql = "SELECT AVG(altitude) FROM Point WHERE trackId = " + trackId ;
		
		Cursor cursor = database.rawQuery(sql, null);
		
		if(!cursor.moveToFirst())
			return 0;
		
		return cursor.getDouble(0);
	}
	
	/**
	 * Get the maximum longitude per track
	 * @param
	 * trackId The track ID
	 * @return
	 * The maximum longitude
	 */
	public static double getMaxLongitude(int trackId)
	{
		String sql = "SELECT MAX(longitude) FROM Point WHERE trackId = " + trackId ;
		
		Cursor cursor = database.rawQuery(sql, null);
		
		if(!cursor.moveToFirst())
			return 0;
		
		return cursor.getDouble(0);
	}
	
	/**
	 * Get the minimum longitude per track
	 * @param
	 * trackId The track ID
	 * @return
	 * The minimum longitude
	 */
	public static double getMinLongitude(int trackId)
	{
		String sql = "SELECT MIN(longitude) FROM Point WHERE trackId = " + trackId ;
		
		Cursor cursor = database.rawQuery(sql, null);
		
		if(!cursor.moveToFirst())
			return 0;
		
		return cursor.getDouble(0);
	}
	
	/**
	 * Get the average longitude per track
	 * @param
	 * trackId The track ID
	 * @return
	 * The average longitude
	 */
	public static double getAvgLongitude(int trackId)
	{
		String sql = "SELECT AVG(longitude) FROM Point WHERE trackId = " + trackId ;
		
		Cursor cursor = database.rawQuery(sql, null);
		
		if(!cursor.moveToFirst())
			return 0;
		
		return cursor.getDouble(0);
	}
	
	/**
	 * Get the maximum latitude per track
	 * @param
	 * trackId The track ID
	 * @return
	 * The maximum latitude
	 */
	public static double getMaxLatitude(int trackId)
	{
		String sql = "SELECT MAX(latitude) FROM Point WHERE trackId = " + trackId ;
		
		Cursor cursor = database.rawQuery(sql, null);
		
		if(!cursor.moveToFirst())
			return 0;
		
		return cursor.getDouble(0);
	}
	
	/**
	 * Get the minimum latitude per track
	 * @param
	 * trackId The track ID
	 * @return
	 * The minimum latitude
	 */
	public static double getMinLatitude(int trackId)
	{
		String sql = "SELECT MIN(latitude) FROM Point WHERE trackId = " + trackId ;
		
		Cursor cursor = database.rawQuery(sql, null);
		
		if(!cursor.moveToFirst())
			return 0;
		
		return cursor.getDouble(0);
	}
	
	/**
	 * Calculates the average latitude per track
	 * @param
	 * trackId The track ID
	 * @return
	 * The average latitude
	 */
	public static double getAvgLatitude(int trackId)
	{
		String sql = "SELECT AVG(latitude) FROM Point WHERE trackId = " + trackId ;
		
		Cursor cursor = database.rawQuery(sql, null);
		
		if(!cursor.moveToFirst())
			return 0;
		
		return cursor.getDouble(0);
	}

	
	/**
	 * Give the last id in the tracks
	 * @return
	 * The last id
	 */
	public static int getMaxTrackId()
	{
		String sql = "SELECT MAX(trackId) FROM Track";
		
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
		String sql = "SELECT trackId AS _id, date, name FROM Track";	//AS _id necessary for the SimpleCursorAdapter

        return database.rawQuery(sql, null);
	}

	/**
	 * Get all the tracks that have not been uploaded to the datastore yet
	 * @param id The first track ID which has not been uploaded yet
	 * @return A cursor with the tracks
	 */
	public static Cursor getTracksNotUploaded(long id)
	{
		String sql = "SELECT trackId AS _id, date, name FROM Track WHERE _id > " + id;
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
		String sql = "SELECT longitude, latitude, altitude FROM Point WHERE trackId = " + trackId;

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
		String sql = "SELECT date, name FROM Track WHERE trackId = " + trackId;

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
		String sql = "SELECT pointId, trackId, latitude, longitude, altitude, speed, bearing, accuracy, satellites, time FROM Point WHERE uploaded = 'false'";
		
        	return database.rawQuery(sql, null);
	}

	/**
	 * Set the uploaded column of the point with the given id to true
	 * @param id
	 * The id of the point
	 */
	public static void setUploadedToTrue(int id)
	{
		String sql = "UPDATE Point SET uploaded = 'true' WHERE pointId = " + id;
		
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
		
		database.insert("Point", null, values);
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
		
		values.put("trackId", trackID);
		values.put("name", trackName);
		values.put("date", date);
		
		database.insert("Track", null, values);
	}
	
	/**
	 * Delete a track from the android db
	 * @param trackId
	 * The track id
	 */
	public static void deleteTrack(int trackId)
	{
		String query = "DELETE FROM Track WHERE trackId = " + trackId;
		
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
		String query = "DELETE FROM Point WHERE trackId = " + trackId;
		
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
