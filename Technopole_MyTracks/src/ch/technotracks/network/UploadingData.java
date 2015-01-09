/*
 * UploadingData
 * 
 * v2
 *
 * 6/08/2013
 * 
 * Copyright Technopole Sierre
 */

package ch.technotracks.network;

import android.database.Cursor;
import android.os.AsyncTask;

import java.io.IOException;


import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.mycompany.services.pointendpoint.Pointendpoint;
import com.mycompany.services.pointendpoint.model.Point;

import ch.technotracks.CloudEndpointUtils;
import ch.technotracks.dbaccess.DatabaseAccessObject;



/**
 * An async task to upload data on the server
 * @author Joel
 *
 */

public class UploadingData extends AsyncTask<Cursor, Void, Void>
{

	private Pointendpoint.Builder endpointBuilder;
	private Pointendpoint endpoint;
	
	/**
	 * Constructor
	 */
	public UploadingData()
	{
		//Point
		endpointBuilder = new Pointendpoint.Builder(AndroidHttp.newCompatibleTransport(), 
				new JacksonFactory(), 
				new HttpRequestInitializer() {
					@Override
					public void initialize(HttpRequest arg0) throws IOException {}
				});
		
		endpoint = CloudEndpointUtils.updateBuilder(endpointBuilder).build();
	}

	/**
	 * Upload data on server and set them to uploaded if everything went good
	 */
	@Override
	protected Void doInBackground(Cursor... params)
	{
		Cursor cursor = params[0];
	
		Point tmp;

		cursor.move(-1);
		while (cursor.moveToNext())
		{
			//tmp = new Data(cursor.getInt(0), cursor.getDouble(1), cursor.getDouble(2), cursor.getDouble(3), cursor.getFloat(4), cursor.getInt(5));

			try
			{
				tmp = new Point();
				tmp.setPointId(cursor.getLong(0));
				tmp.setTrackId(cursor.getInt(1));
				tmp.setLatitude(cursor.getDouble(2));
				tmp.setLongtitude(cursor.getDouble(3));
				tmp.setAltitude(cursor.getDouble(4));
				tmp.setSpeed(cursor.getFloat(5));
				tmp.setBearing(cursor.getFloat(6));
				tmp.setAccuracy(cursor.getFloat(7));
				tmp.setSatellites(cursor.getInt(8));
				tmp.setTime(cursor.getLong(9));
				
				endpoint.insertPoint(tmp).execute();
				
				DatabaseAccessObject.setUploadedToTrue(tmp.getPointId());
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
		cursor.close();
		
		return null;
	}

}
