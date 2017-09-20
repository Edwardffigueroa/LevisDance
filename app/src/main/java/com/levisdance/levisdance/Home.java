package com.levisdance.levisdance;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.io.FileNotFoundException;
import java.io.InputStream;
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

        //leer la bd

        Publicacion temp1 = new Publicacion(ContextCompat.getDrawable(getApplicationContext(), R.drawable.fotodo), 1, "Edward Figueroa", "Cali - Valle del cauca", "#THISISMYTITLE", "subido hace 8 min");
        Publicacion temp2 = new Publicacion(ContextCompat.getDrawable(getApplicationContext(), R.drawable.fotouno), 1, "Edward Figueroa", "Cali - Valle del cauca", "#THISISMYTITLE", "subido hace 8 min");
        Publicacion temp3 = new Publicacion(ContextCompat.getDrawable(getApplicationContext(), R.drawable.fototres), 1, "Edward Figueroa", "Cali - Valle del cauca", "#THISISMYTITLE", "subido hace 8 min");
        Publicacion temp4 = new Publicacion(ContextCompat.getDrawable(getApplicationContext(), R.drawable.fotocuatro), 1, "Edward Figueroa", "Cali - Valle del cauca", "#THISISMYTITLE", "subido hace 8 min");

        imageList.add(temp1);
        imageList.add(temp2);
        imageList.add(temp3);
        imageList.add(temp4);

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


    public void publicar() {

        //titulo
        //la foto(dirección)
        //locacion
        //tiempo

        //agrega a la base de datos


    }

    public void agregarFoto(View view){

        Intent intentLog = new Intent(this, activity_publicar.class);
        startActivity(intentLog);


    }

   /* @Override
    protected void onActivityResult(int reqCode, int resultCode, Intent data) {
        super.onActivityResult(reqCode, resultCode, data);
        if (resultCode == RESULT_OK) try{
            final Uri imageUri = data.getData();
            String url=imageUri.getPath();
            final InputStream imageStream = getContentResolver().openInputStream(imageUri);
            final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
            ImageView imagenCargada= new ImageView(this);
            imagenCargada.setImageBitmap(selectedImage);
            Drawable ima = imagenCargada.getDrawable();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        else {
        }
    }*/

}
