package com.levisdance.levisdance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CambioContrasena extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambio_contrasena);
    }

    public void user(View view){

        Intent intentLog = new Intent(this, Usuario.class);
        startActivity(intentLog);

    }
}
