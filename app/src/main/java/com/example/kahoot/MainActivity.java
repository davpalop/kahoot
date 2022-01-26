package com.example.kahoot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button start;
    private EditText nick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.start);
        nick = (EditText) findViewById(R.id.nick);


    }
    public void startQuestionary(){
        if (nick.getText() == null) {
            Toast.makeText(this, "Debe introducir un Nick", Toast.LENGTH_LONG).show();
        } else {
            Intent intent_question = new Intent(this, Question.class);
            startActivity(intent_question);
        }
    }

}