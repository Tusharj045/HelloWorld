package com.example.vismay.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseDatabase database = FirebaseDatabase.getInstance(); // getting the object of Firebase

        myRef.setValue("Starting Value");

    }
    public void login_doc_page(View v)
    {
        Intent i=new Intent(this,LoginAcc.class);
        startActivity(i);
        finish();
    }
    public void login_pat_page(View v)
    {
        Intent i=new Intent(this,LoginAccPat.class);
        startActivity(i);
        finish();
    }

}
