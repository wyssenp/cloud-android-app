package ch.technotracks.ui;

import ch.technotracks.R;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;

public class LeaderboardsRegistration extends FragmentActivity {

	//This is a comment
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_leaderboards_registration);

//		Button btnContinue = (Button) findViewById(R.id.button1);
//		Button btnDoItLater = (Button) findViewById(R.id.button2);
	}

	public void backToMain(View view) {
		Intent i = new Intent(getApplicationContext(), MainActivity.class);
		i.putExtra("registration", true);
		startActivity(i);
	}
}
