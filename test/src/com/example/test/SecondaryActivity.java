package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SecondaryActivity extends Activity implements OnClickListener {
	private Button b1, b2, b3, b4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_secondary);
		b1 = (Button) this.findViewById(R.id.b1);
		b2 = (Button) this.findViewById(R.id.b2);
		b3 = (Button) this.findViewById(R.id.b3);
		b4 = (Button) this.findViewById(R.id.b4);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.secondary, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.b1:
			b2.setVisibility(View.VISIBLE);
			break;
		case R.id.b2:
			b3.setVisibility(View.VISIBLE);
			b4.setVisibility(View.VISIBLE);
			break;
		case R.id.b3:
			finish();
			break;
		case R.id.b4:
			Intent intent = new Intent(arg0.getContext(), Thered_Activity.class);
			startActivity(intent);
			break;
		default:
			break;
		}
	}

}
