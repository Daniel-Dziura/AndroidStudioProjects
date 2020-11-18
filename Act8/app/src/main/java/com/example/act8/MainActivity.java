package com.example.act8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1 = (Button)findViewById(R.id.web);
        bt1.setOnClickListener(this);

        Button bt2 = (Button)findViewById(R.id.numero);
        bt2.setOnClickListener(this);

        Button bt3 = (Button)findViewById(R.id.pick);
        bt3.setOnClickListener(this);

        Button bt4 = (Button)findViewById(R.id.maps);
        bt4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.web:
                openWeb();
                break;
            case R.id.numero:
                numero();
                break;
            case R.id.pick:
                pick();
                break;
            case R.id.maps:
                maps();
                break;
        }

    }

    public void openWeb() {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://paucasesnovescifp.cat/"));
        startActivity(browserIntent);
    }

    public void numero() {
        Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:123456789"));
        startActivity(callIntent);
    }

    public void pick() {
        Intent pickContact = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
        pickContact.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE);
        startActivityForResult(pickContact, 1);
    }
    public void maps() {
        Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }


}