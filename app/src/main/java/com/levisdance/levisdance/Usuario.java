package com.levisdance.levisdance;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.io.FileNotFoundException;
import java.io.InputStream;

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
    public void user(View view){
        Intent intentLog = new Intent(this, Usuario.class);
        startActivity(intentLog);
    }

    public void openCamera(View view) {

        Intent i = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(i);
    }

    public void agregarFoto(View view){
        try {
            Intent intent = new Intent(Intent.ACTION_PICK);
            intent.setType("image/*");
            startActivity(intent);
        }catch (Exception e){
            Log.i("Error", e.toString());
        }
    }

    @Override
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
    }

}
