package com.example.vismay.helloworld;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class LoginAcc extends AppCompatActivity {
    
    String username_input;
    String password_input;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_acc);
    }
    
    public void login_username_doc(View v)
    {
        EditText setnullu=(EditText) findViewById(R.id.login_username);
        setnullu.setText("");
    }
    public void login_password_doc(View v)
    {
        EditText setnullp=(EditText) findViewById(R.id.login_password);
        setnullp.setText("");
    }
    public void signup_page_doc(View v)
    {
        Intent i=new Intent(this,CreateAcc.class);
        startActivity(i);
    }
    public void login_button_doc(View v)
    {
        EditText iUsername=(EditText) findViewById(R.id.login_username);       // getting the data from the layout
        EditText iPassword=(EditText) findViewById(R.id.login_password);        // with the help of ids
        username_input=iUsername.getText().toString();
        password_input=iPassword.getText().toString();
        if(username_input.isEmpty() || password_input.isEmpty()){
            android.widget.Toast.makeText(getApplicationContext(), "username or password empty", Toast.LENGTH_SHORT).show();
        }
    }
}