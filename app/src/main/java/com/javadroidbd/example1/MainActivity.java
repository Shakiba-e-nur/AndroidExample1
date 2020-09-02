package com.javadroidbd.example1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText emailedittext;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailedittext=findViewById(R.id.editTextmail);
        password=findViewById(R.id.editTextpassword);
    }

    public void SignInClick(View view) {
        String email=emailedittext.getText().toString();
        if(email.isEmpty())
        {
            emailedittext.setError("Email Cant Be Empty!");
        }
        if(password.getText().toString().isEmpty())
        {
            password.setError("Password Cant Be Empty!");
        }
        if(password.getText().toString().length()<8)
        {
            password.setError("Password Cant Be less than 8 Character!");
        }
        else{
            Intent intent=new Intent(this,SecondActivity.class);
            Log.d("email", "value: "+emailedittext.getText());
            Log.d("email", "value: "+password.getText());
            intent.putExtra("email",""+emailedittext.getText());
            startActivity(intent);
        }




    }
//    public boolean formvalidation()
//    {
//
//        String email=emailedittext.getText().toString();
//        if(email.isEmpty())
//        {
//            emailedittext.setError("Email Cant Be Empty!");
//        }
//        return true;
//    }
}