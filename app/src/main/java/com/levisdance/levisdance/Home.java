package com.levisdance.levisdance;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {


    ListView listView;
    List list = new ArrayList();
    Adaptador adapter;
    ArrayList<Publicacion> imageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imageList = new ArrayList<Publicacion>();

        //ejemplo de creación de objeto

        Publicacion temp1 = new Publicacion(ContextCompat.getDrawable(getApplicationContext(), R.drawable.fotodo), 1, "Edward Figueroa", "Cali - Valle del cauca", "#THISISMYTITLE", "subido hace 8 min");
        Publicacion temp2 = new Publicacion(ContextCompat.getDrawable(getApplicationContext(), R.drawable.fotouno), 1, "Edward Figueroa", "Cali - Valle del cauca", "#THISISMYTITLE", "subido hace 8 min");

        imageList.add(temp1);
        imageList.add(temp2);

        ArrayAdapter<Publicacion> adapter = new Adaptador(this, 0, imageList);


        //Find list view and bind it with the custom adapter


        listView = (ListView) findViewById(R.id.items_list);
        listView.setAdapter(adapter);

    }

    public void user(View view){
        Intent intentLog = new Intent(this, Usuario.class);
        startActivity(intentLog);
    }

    public void openCamera(View view) {

        Intent i = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(i);
    }

}
