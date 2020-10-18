package com.example.vismay.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class CreateAcc extends AppCompatActivity {          // Account Creation of Person

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_acc);
    }
    public void register_username_func(View v)      // when registering the person
    {
        EditText reguse=(EditText) findViewById(R.id.register_username);
        reguse.setText("");
    }
    public void register_email_func(View v)
    {
        EditText regemail=(EditText) findViewById(R.id.register_email);
        regemail.setText("");
    }
    public void register_password_func(View v)
    {
        EditText regpass=(EditText) findViewById(R.id.register_password);
        regpass.setText("");
    }
    public void register_passwordc_func(View v)
    {
        EditText regpassc=(EditText) findViewById(R.id.register_passwordc);
        regpassc.setText("");
    }
    public void homepage(View v)
    {
        EditText iUsername=(EditText) findViewById(R.id.register_username);
        EditText iPassword=(EditText) findViewById(R.id.register_password);
        EditText iEmail=(EditText) findViewById(R.id.register_email);
        EditText iPasswordc=(EditText) findViewById(R.id.register_passwordc);
        String email_input_reg=iEmail.getText().toString();
        String username_input_reg=iUsername.getText().toString();
        String password_input_reg=iPassword.getText().toString();
        String password_c_input_reg=iPasswordc.getText().toString();
    }
}
