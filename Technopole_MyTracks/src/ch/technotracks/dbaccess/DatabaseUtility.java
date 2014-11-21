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

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Class to manage the android database
 * @author Joel
 *
 */
public class DatabaseUtility extends SQLiteOpenHelper
{
	private static final String DATABASE_NAME = "TechnoTracks.db";
	private static final int DATABASE_VERSION = 2;
	private static final String TABLE_POINT = "Point";
	private static final String TABLE_TRACK = "Track";
	private static final String TABLE_USER = "User" ;
	private static final String TABLE_EMERGENCY = "Emergency" ;
	private static final String TABLE_USER_EMERGENCY = "User_Emergency" ;
	private static final String TABLE_ROLE = "Role";
	private static final String TABLE_USER_ROLE = "User_Role";
	private static final String TABLE_DISABILITY = "Disability" ;
	private static final String TABLE_USER_DURABILILTY = "User_Durability" ;
	private static final String TABLE_CHAMPIONSHIP = "Championship" ;
	private static final String TABLE_USER_CHAMPIONSHIP = "User_Championship" ;
	private static final String TABLE_AUTHENTIFICATION = "Authentification";

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

	private static final String TABLE_USER_CREATE = "CREATE TABLE IF NOT EXISTS " + TABLE_USER +
			"(userId INTEGER PRIMARY KEY NOT NULL," +
			"name TEXT," +
			"firstname TEXT," +
			"username TEXT," +
			"password TEXT," +
			"mail TEXT," +
			"championship BOOLEAN," +
			"nationality TEXT DEFAULT null," +
			"country TEXT DEFAULT null," +
			"gender TEXT DEFAULT null," +
			"dateofbirth DATE DEFAULT null," +
			"disability BOOLEAN DEFAULT 0," +
			"disabledlist BOOLEAN DEFAULT 0)";

	private static final String TABLE_AUTHENTIFICATION_CREATE = "CREATE TABLE IF NOT EXISTS " + TABLE_AUTHENTIFICATION +
			"(authentificationId INTEGER PRIMARY KEY NOT NULL," +
			"userId INTEGER," +
			"username TEXT," +
			"password TEXT)";

	private static final String TABLE_USER_EMERGENCY_CREATE = "CREATE TABLE IF NOT EXISTS " + TABLE_USER_EMERGENCY +
			"(userId INTEGER" +
			"emergencyId INTEGER)";


	private static final String TABLE_EMERGENCY_CREATE = "CREATE TABLE IF NOT EXISTS " + TABLE_EMERGENCY +
			"(emergencyId INTEGER PRIMARY KEY NOT NULL," +
			"name TEXT," +
			"firstname TEXT," +
			"mail TEXT," +
			"phone TEXT)";

	private static final String TABLE_USER_ROLE_CREATE = "CREATE TABLE IF NOT EXISTS " + TABLE_USER_ROLE +
			"(userId INTEGER" +
			"roleId INTEGER)";


	private static final String TABLE_ROLE_CREATE = "CREATE TABLE IF NOT EXISTS " + TABLE_ROLE +
			"(roleId INTEGER PRIMARY KEY NOT NULL," +
			"description TEXT)";

	private static final String TABLE_USER_CHAMPIONSHIP_CREATE = "CREATE TABLE IF NOT EXISTS " + TABLE_USER_CHAMPIONSHIP +
			"(userId INTEGER" +
			"championshipId INTEGER)";


	private static final String TABLE_CHAMPIONSHIP_CREATE = "CREATE TABLE IF NOT EXISTS " + TABLE_CHAMPIONSHIP +
			"(championshipId INTEGER PRIMARY KEY NOT NULL," +
			"userId INTEGER" +
			"name TEXT," +
			"startdate DATE," +
			"enddate DATE" +
			"isDisability BOOLEAN)";

	private static final String TABLE_USER_DISABILITY_CREATE = "CREATE TABLE IF NOT EXISTS " + TABLE_USER_DURABILILTY +
			"(userId INTEGER" +
			"disabilityId INTEGER)";


	private static final String TABLE_DISABILITY_CREATE = "CREATE TABLE IF NOT EXISTS " + TABLE_DISABILITY +
			"(disabilityId INTEGER PRIMARY KEY NOT NULL," +
			"userId INTEGER" +
			"name TEXT," +
			"startdate DATE," +
			"enddate DATE" +
			"isDisability BOOLEAN)";


	/**
	 * Create the database
	 * @param context
	 * The context in which running
	 */
	public DatabaseUtility(Context context)
	{
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
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