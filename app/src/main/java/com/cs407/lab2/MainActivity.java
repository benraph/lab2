package com.cs407.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //hello
    }

    public void clickFunction(View view){
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        Log.i("INFO","Button Clicked");

        Toast.makeText(MainActivity.this, myTextField.getText().toString(),Toast.LENGTH_LONG).show();
    }
}