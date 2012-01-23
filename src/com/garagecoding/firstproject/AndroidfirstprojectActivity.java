package com.garagecoding.firstproject;

import android.app.Activity;
import android.widget.*;
import android.os.Bundle;

public class AndroidfirstprojectActivity extends Activity {
	/** Called when the activity is first created. */

	private int valueOne = 0, valueTwo = 0;
	private int total = 0;
	private TextView output;
	Button enter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		output = (TextView) findViewById(R.id.answer);
		enter = (Button) findViewById(R.id.enter);
/*		enter.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				total = valueOne + valueTwo;
				output.setText(total);
			}
		});
*/
		setContentView(R.layout.main);
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
	
}