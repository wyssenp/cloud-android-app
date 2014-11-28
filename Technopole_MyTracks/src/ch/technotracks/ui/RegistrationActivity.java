package ch.technotracks.ui;

import ch.technotracks.R;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;

public class RegistrationActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//This is a comment 2
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registration);
		
		ImageView questionMark = (ImageView) findViewById(R.id.helpRegistration);
		questionMark.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), R.string.toastLeaderboards, Toast.LENGTH_LONG).show();
			}
		});
		
		Button button = (Button) findViewById(R.id.buttonContinue);
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(),LeaderboardsRegistration.class);
				CheckBox cbLeaderboards = (CheckBox) findViewById(R.id.checkBoxLeaderboards);
				boolean isLeaderboards = cbLeaderboards.isChecked();
				i.putExtra("leaderboards", isLeaderboards);
				startActivity(i);
			}
		});
	}

	

}
