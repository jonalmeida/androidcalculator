package com.garagecoding.firstproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Subtraction extends Activity{

	private long value1=0, value2=0;
	private long total=0;
	private TextView output;
	private EditText inputOne, inputTwo;
	Button enter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.subtraction);

		inputOne = (EditText) findViewById(R.id.input1);
		inputTwo = (EditText) findViewById(R.id.input2);

		output = (TextView) findViewById(R.id.answer);
		enter = (Button) findViewById(R.id.enter);
		enter.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
					value1 = Integer.parseInt(inputOne.getText().toString());
					value2 = Integer.parseInt(inputTwo.getText().toString());
					total = value1 - value2;
					output.setText("Answer: " + total);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});


	}

}
