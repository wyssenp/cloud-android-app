package ch.technotracks.ui;

import java.util.Date;
import java.util.concurrent.TimeUnit;


import ch.technotracks.R;
import ch.technotracks.dbaccess.DatabaseAccessObject;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayStats extends Activity {

	private TextView tv1 ;
	private TextView tv2 ;
	private TextView tv3 ;
	private TextView tv4 ;
	private TextView tv5 ;
	private TextView tv6 ;
	private TextView tv7 ;
	private TextView tv8 ;
	private int track ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_stats);

		/* Get the selected track id and store it */
		Intent i = getIntent();
		Bundle b = i.getExtras();
		if(b != null)
		{
			track = b.getInt("trackNumber");
		}

		tv1 = (TextView) findViewById(R.id.methodOne) ;
		tv2 = (TextView) findViewById(R.id.methodTwo) ;
		tv3 = (TextView) findViewById(R.id.methodThree) ;
		tv4 = (TextView) findViewById(R.id.textView1) ;
		tv5 = (TextView) findViewById(R.id.textView2) ;
		tv6 = (TextView) findViewById(R.id.textView3) ;
		tv7 = (TextView) findViewById(R.id.textView4) ;
		tv8 = (TextView) findViewById(R.id.textView5) ;

		tv4.setText("Number of points :");
		tv5.setText("Distance traveled :");
		tv6.setText("Average Altitude :");
		tv7.setText("Time of session :");

		tv1.setText(Integer.toString(NumberOfPoints()));
		tv2.setText(String.valueOf(getFinalDistance()));
		tv3.setText(String.valueOf(AvgAltitude()));
		tv8.setText(getTime());

	}

	/**
	 * Gets the number of points per track
	 * @return Number of points
	 */
	private int NumberOfPoints() 
	{
		return DatabaseAccessObject.getNumberOfPoints(track);
	}

	/**
	 * Calls the method getAvgAltitude in the type DatabaseAccessObject
	 * @return The average altitude per track
	 */
	private double AvgAltitude() 
	{
		return DatabaseAccessObject.getAvgAltitude(track);
	}

	/**
	 * Calculates the time the track has been recorded for
	 * @return A string containing the time difference
	 */
	private String getTime() 
	{
		long i = DatabaseAccessObject.getMaxTime(track);
		long v = DatabaseAccessObject.getMinTime(track);

		Date one = new Date(i);
		Date two = new Date(v);

		return getTimeDiff(one, two); 

	}

	/**
	 * Used to calculate the difference between 2 dates
	 * @param dateOne The first date
	 * @param dateTwo The second date
	 * @return A human-readable string, for example: 0 hour(s) 12 min(s)
	 */
	@SuppressLint("DefaultLocale")
	public String getTimeDiff(Date dateOne, Date dateTwo) {
		String diff = "";
		long timeDiff = Math.abs(dateOne.getTime() - dateTwo.getTime());
		diff = String.format("%d hour(s) %d min(s)", TimeUnit.MILLISECONDS.toHours(timeDiff),
				TimeUnit.MILLISECONDS.toMinutes(timeDiff) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(timeDiff)));
		return diff;
	}

	/**
	 * Calculates the distance travelled per track
	 * @return Distance travelled
	 */
	private double getFinalDistance() {

		Cursor c = DatabaseAccessObject.getTrackPoints(track);

		double latitude;
		double longitude;
		double altitude;
		double oldLatitude = 0;
		double oldLongitude = 0;
		double oldAltitude = 0;
		double total = 0;

		if(c.getCount() > 0)	//if the cursor is not empty (ie there are track points)
		{

			c.moveToPosition(-1);

			while(c.moveToNext())
			{

				longitude = c.getDouble(0);
				latitude = c.getDouble(1);
				altitude = c.getDouble(2);

				if(c.getPosition() != 0)
				{
					total += distance(oldLatitude, latitude, oldLongitude, longitude, oldAltitude, altitude);
				}

				oldLongitude = c.getDouble(0);
				oldLatitude = c.getDouble(1);
				oldAltitude = c.getDouble(2);

			}

		}

		return total ;
	}
	
	/**
	 * Calculates the distance travelled per track, taking into consideration the earth's curvature
	 * @param lat1 Latitude 1
	 * @param lat2 Latitude 2
	 * @param lon1 Longitude 1
	 * @param lon2 Longitude 2
	 * @param el1 Altitude 1
	 * @param el2 Altitude 2
	 * @return Distance travelled
	 */
	private double distance(double lat1, double lat2, double lon1, double lon2,
			double el1, double el2) {

		final int R = 6371; // Radius of the earth

		Double latDistance = deg2rad(lat2 - lat1);
		Double lonDistance = deg2rad(lon2 - lon1);
		Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
				+ Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2))
				* Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
		Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		double distance = R * c * 1000; // convert to meters

		double height = el1 - el2;
		distance = Math.pow(distance, 2) + Math.pow(height, 2);
		return Math.sqrt(distance);
	}

	/**
	 * Convert degrees to radiant
	 * @param
	 * deg Number of degrees
	 * @return
	 * The converted angle in radiant
	 */
	private double deg2rad(double deg) {
		return (deg * Math.PI / 180.0);
	}
}
