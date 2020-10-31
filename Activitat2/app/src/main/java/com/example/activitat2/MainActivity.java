package com.example.activitat2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void obreActivitat(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

        EditText tx = (EditText) findViewById(R.id.editText1);
        String texte = tx.getText().toString();

        intent.putExtra("Etiqueta", texte);

    }
}