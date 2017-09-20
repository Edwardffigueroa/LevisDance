package com.levisdance.levisdance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
    }

    public void login(View view){

        Intent intentLog = new Intent(this, Home.class);
        startActivity(intentLog);

    }

    public void config(View view){

        Intent intentLog = new Intent(this, CambioContrasena.class);
        startActivity(intentLog);

    }
}
