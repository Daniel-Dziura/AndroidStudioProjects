package com.example.activitat_9;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    //static final String[] PAISOS = new String[]{
    //       "España", "Francia", "Portugal"
    //};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        String[] paisos = getResources().getStringArray(R.array.paisos_array);

        //ArrayAdapter<String> A = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, PAISOS);
        //setListAdapter(A);
        ArrayAdapter<String> a = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paisos);
        setListAdapter(a);

        ListView lv = getListView();
        lv.setTextFilterEnabled(true);
    }

    public void onListItemClick(ListView parent, View v, int position, long id){
        String pais = ((TextView) v).getText().toString();
        Toast.makeText(getApplicationContext(), pais, Toast.LENGTH_SHORT).show();

        //Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/" + pais));
        //startActivity(i);

        maps(pais);
    }

    public void maps(String pais) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + pais);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }

}