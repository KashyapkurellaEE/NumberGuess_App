package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
     int randomNumber;
    public void guess(View view){
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);
        int guessInt= Integer.parseInt(guessEditText.getText().toString());
        if(guessInt>randomNumber) {
            Toast.makeText(MainActivity.this, "Select a Lesser number", Toast.LENGTH_SHORT).show();
        }        if(guessInt<randomNumber) {
            Toast.makeText(MainActivity.this, "Select a greater number", Toast.LENGTH_SHORT).show();
        }
        if(guessInt==randomNumber){
            Toast.makeText(MainActivity.this, "Great Job!!", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand=new Random();
        randomNumber=rand.nextInt(20)+1;
    }
}
