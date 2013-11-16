package com.multimedios.userpassword;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class Actividad2 extends Activity {
	
	String usuario, password;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_actividad2);
		
		Bundle extras = getIntent().getExtras();
		if(extras != null){
			usuario = extras.getString("usuario");
			password = extras.getString("password");
		}
		
		TextView text_usuario = (TextView) findViewById(R.id.txt2_usuario);
		text_usuario.setText(usuario);
		
		TextView text_password = (TextView) findViewById(R.id.txt2_password);
		text_password.setText(password);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.actividad2, menu);
		return true;
	}

}
