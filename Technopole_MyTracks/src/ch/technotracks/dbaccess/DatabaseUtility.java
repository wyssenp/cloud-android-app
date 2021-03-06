/*
 * DatabaseUtility
 * 
 * v2
 *
 * 6/08/2013
 * 
 * Copyright Technopole Sierre
 */

package ch.technotracks.dbaccess;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Class to manage the android database
 * @author Joel
 *
 */
@SuppressLint("SdCardPath")
public class DatabaseUtility extends SQLiteOpenHelper
{
	private static final String DATABASE_NAME = "TechnoTracks.db";
	private static final String DB_PATH = "/mnt/sdcard/" ;
	private static final int DATABASE_VERSION = 2;
	private static final String TABLE_POINT = "Point";
	private static final String TABLE_TRACK = "Track";

	private static final String TABLE_POINTS_CREATE = "CREATE TABLE IF NOT EXISTS " + TABLE_POINT +
			"(pointId INTEGER PRIMARY KEY NOT NULL," +
			"trackId INTEGER," +
			"latitude DOUBLE," +
			"longitude DOUBLE," +
			"altitude DOUBLE," +
			"speed FLOAT," +
			"bearing FLOAT," +
			"accuracy FLOAT," +
			"satellites INTEGER," +
			"time LONG," +
			"uploaded BOOLEAN)";

	private static final String TABLE_TRACKS_CREATE = "CREATE TABLE IF NOT EXISTS " + TABLE_TRACK +
			"(trackId INTEGER PRIMARY KEY NOT NULL," +
			"userId INTEGER," +
			"date DATE," +
			"name TEXT," +
			"type TEXT)";
	/**
	 * Create the database
	 * @param context
	 * The context in which running
	 */
	public DatabaseUtility(Context context)
	{
		super(context, DB_PATH + DATABASE_NAME, null, DATABASE_VERSION);
	}

	/**
	 * Create the various table
	 */
	@Override
	public void onCreate(SQLiteDatabase db)
	{
		db.execSQL(TABLE_POINTS_CREATE);
		db.execSQL(TABLE_TRACKS_CREATE);
	}

	/**
	 * Called on database upgrade
	 */
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
	{
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_POINT);
		onCreate(db);
	}
}
