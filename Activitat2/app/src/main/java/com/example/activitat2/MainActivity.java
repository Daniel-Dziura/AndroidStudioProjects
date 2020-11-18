package com.example.activitat2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    //public class MainActivity extends ActionBarActivity implements OnClickListener {

    int CODIGO = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Activitat 6
        Button b = (Button) findViewById(R.id.act6);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MostraMissatge("Boto 1");}
        });

        Button b2 = (Button) findViewById(R.id.act61);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MostraMissatge("Boto 1.1");}
        });

        //Activitat 7
        Button bt1 = (Button)findViewById(R.id.act71);
        Button bt2 = (Button)findViewById(R.id.act72);

        bt1.setOnClickListener(this);

        bt2.setOnClickListener(this);

    }




    public void obreActivitat(View view){
        Intent intent = new Intent(this, MainActivity2.class);

        EditText tx = (EditText) findViewById(R.id.formulari);
        String texte = tx.getText().toString();

        intent.putExtra("Etiqueta", texte);

        startActivityForResult(intent,CODIGO);
        //startActivity(intent);

    }

    public void compartir(View view){
        Intent compartir = new Intent(Intent.ACTION_SEND);
        compartir.setType("text/plain");

        EditText et = (EditText) findViewById(R.id.formulari);
        String texte = et.getText().toString();

        compartir.putExtra(android.content.Intent.EXTRA_TEXT,texte);
        startActivity(compartir);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if (resultCode == RESULT_OK && requestCode == CODIGO) {
            String resposta = data.getExtras().getString("Retorn");
            Toast.makeText(this, resposta, Toast.LENGTH_SHORT).show();
        }

    }



    //Activitat 7
    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.act71:
                MostraMissatge("B1");
                break;

            case R.id.act72:
                MostraMissatge("B2");
                break;
        }

    }

    public void MostraMissatge (String b){

        Toast.makeText(this, b, Toast.LENGTH_SHORT).show();
    }

}