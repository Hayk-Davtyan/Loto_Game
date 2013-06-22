package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Thered_Activity extends Activity implements OnClickListener {
	private Button ok, go;
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_thered);
		ok = (Button) this.findViewById(R.id.ok);
		go = (Button) this.findViewById(R.id.go);
		ok.setOnClickListener(this);
		go.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.thered, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		EditText editText;
		switch (arg0.getId()) {
		case R.id.ok:
		    editText = (EditText) findViewById(R.id.editText);
		    ok.setText((CharSequence) editText.getText());		    
			break;
		case R.id.go:
			Intent intent = new Intent(this, ForthActivity.class);
		    editText = (EditText) findViewById(R.id.editText);
		    String message = editText.getText().toString();
		    intent.putExtra(EXTRA_MESSAGE, message);
		    startActivity(intent);
			break;
		default:
			break;

		}

	}
}