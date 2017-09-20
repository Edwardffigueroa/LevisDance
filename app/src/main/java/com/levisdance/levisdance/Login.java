package com.levisdance.levisdance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view){

        Intent intentLog = new Intent(this, Home.class);
        //EditText editText= (EditText) findViewById(R.id.edit_message);
        //String nombre = editText.getText().toString();
        //intent.putExtra(CLAVE_VALOR, nombre);
        startActivity(intentLog);

    }

    public void register(View view){

        Intent intentLog = new Intent(this, Registro.class);

        startActivity(intentLog);

    }

}
