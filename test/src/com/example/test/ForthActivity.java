package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ForthActivity extends Activity implements OnClickListener {
	private Button ok, go;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_forth);
		TextView text = (TextView) this.findViewById(R.id.textview);
		text.setText((CharSequence)getIntent().getStringExtra(Thered_Activity.EXTRA_MESSAGE));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.forth, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		switch (arg0.getId()) {
		case R.id.ok:
			EditText editText = (EditText) findViewById(R.id.editText);
			ok.setText((CharSequence) editText.getText());
			break;
		case R.id.go:
			// Intent intent = new Intent(this, DisplayMessageActivity.class);
			// EditText editText = (EditText) findViewById(R.id.editText);
			// String message = editText.getText().toString();
			// intent.putExtra(EXTRA_MESSAGE, message);
			// startActivity(intent);
			break;
		default:
			break;

		}
	}
}
