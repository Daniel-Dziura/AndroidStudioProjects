package com.example.activitat2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    public String textRebut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        //Recollir informacid del Intwnt i mostrar-la Bundle
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            //llegir el contingut de extras amb la mateixa etiqueta que hem emprat per a enviar
            textRebut = extras.getString("Etiqueta");
        }

        //Recollir informaciO del lntwnt i mostrar-la
        //Bundle extras = getIntent().getExtras();
        if (extras != null) {
        //fillegir el contingut de extras amb la mateixa etiqueta que hem emprat per a enviar
            textRebut = extras.getString("Etiquetal");
            //modificar el TextView i escriure-ho
            TextView textElement = findViewById(R.id.textView);
            textElement.setText(textRebut);
    }
        //Log.e("tag", textRebut);

}

    public void obreActivitatMain(View view){
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);

    }
}