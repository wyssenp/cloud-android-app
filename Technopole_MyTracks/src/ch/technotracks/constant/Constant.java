/*
 * Tools
 * 
 * v2
 *
 * 6/08/2013
 * 
 * Copyright Technopole Sierre
 */

package ch.technotracks.constant;

/**
 * A tool class
 * @author Joel
 *
 */
public abstract class Constant
{
	//downloadMap
	public static final String MAP_SERVER_URL = "http://download.mapsforge.org/maps/europe/switzerland.map";
	
	//captureDisplay
	public static final long MIN_TIME = 10 * 1000;
	public static final float MIN_DISTANCE = 2f;
	public static final int DEFAULT_ZOOM = 15;
	
	//saving
	public static final String URL_TO_UPLOAD_DATA = "http://vlhiigdev.hevs.ch:8080/TechnoTracksServer/rest/TechnoTracksServer";
	
	public static final String MAP_FOLDER_NAME = "maps";
	public static final String TECHNOTRACKS_FOLDER_NAME = "TechnoTracks";
	public static final String EXPORT_FOLDER_NAME = "export";
	public static final String CSV_FOLDER_NAME = "csv";
	public static final String KML_FOLDER_NAME = "kml";
	

}
