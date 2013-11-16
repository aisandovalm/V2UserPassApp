package com.multimedios.userpassword;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	EditText cuadro_usuario, cuadro_password;//Cuadros de texto donde se ingresara la información de usuario
	String string_usuario, string_password;//Strings donde se guardarán los datos ingresados por el usuario

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        cuadro_usuario = (EditText) findViewById(R.id.txt_usuario);
        cuadro_password = (EditText) findViewById(R.id.txt_password);
    }

    public void cambiarActividad(View v){
    	string_usuario = cuadro_usuario.getText().toString();//Obtiene el contenido ingresado en el cuadro de texto y lo pasa a string_usuario
    	string_password = cuadro_password.getText().toString();
    	
    	Intent irActividad2 = new Intent(getApplicationContext(), Actividad2.class);
    	irActividad2.putExtra("usuario", string_usuario);
    	irActividad2.putExtra("password", string_password);
    	startActivity(irActividad2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
