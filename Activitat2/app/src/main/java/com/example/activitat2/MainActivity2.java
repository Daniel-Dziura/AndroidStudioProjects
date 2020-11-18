package com.example.activitat2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    public String textRebut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            textRebut = extras.getString("Etiqueta");
        }

        //Bundle extras = getIntent().getExtras();
        if (extras != null) {
            textRebut = extras.getString("Etiqueta");
            TextView textElement = findViewById(R.id.editTextTextPersonName);
            textElement.setText(textRebut);
    }
        //Log.e("tag", textRebut);
}

    @Override
    public void finish(){
        EditText text = findViewById(R.id.editTextTextPersonName);
        String valor = text.getText().toString();
        Intent data = new Intent();
        data.putExtra("Retorn", valor);

        setResult(RESULT_OK, data);

        super.finish();
    }

    public void obreActivitatMain(View view){
        //Intent data = new Intent();
        //data.putExtra("Retorn", 1);
        //setResult(RESULT_OK, data);
        finish();
        //Intent intent = new Intent(this, MainActivity.class);

        //startActivity(intent);

    }
}