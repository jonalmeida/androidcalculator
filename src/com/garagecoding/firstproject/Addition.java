package com.garagecoding.firstproject;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.os.Bundle;

public class Addition extends Activity {
	/** Called when the activity is first created. */

	private long valueOne = 0, valueTwo = 0;
	private long total = 0;
	EditText inputOne, inputTwo;
	private TextView output;


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.addition);

		inputOne = (EditText) findViewById(R.id.input1);
		inputTwo = (EditText) findViewById(R.id.input2);

		output = (TextView) findViewById(R.id.answer);
		Button enter = (Button) findViewById(R.id.enter);
		enter.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					// TODO Auto-generated method stub
					valueOne = Integer.parseInt(inputOne.getText().toString());
					valueTwo = Integer.parseInt(inputTwo.getText().toString());
					total = valueOne + valueTwo;
					output.setText("Answer: "+total);
				}catch(Exception e){
					e.printStackTrace();
				}

				//output.setText("This is text");
			}
		});



	}

	public void callAdd(View view){
		//	valueOne = Integer.parseInt(inputOne.getText().toString());
		//	valueTwo = Integer.parseInt(inputTwo.getText().toString());
		total = valueOne + valueTwo;
		output.setText("" + total);
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}


}