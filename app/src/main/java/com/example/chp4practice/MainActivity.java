package com.example.chp4practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions = {"1. Java has abstract classes?", "2. Java is a person?",
            "3. Java supports interface?", "4. Java was created using Python?",
            "5. Java was introduced in 1996?","6. Java was developed by Shakti & Sambit?",
            "7. Java follows OOPS concept?","8. Java is platform dependent?",
            "9. Java is also used for App Development","10. There are eight primitive data types in Java?"};
    private boolean[] answer = {true,false,true,false,false,false,true,false,true,true};
    private int score = 0;
    Button yes;
    Button no;
    TextView question;
    private int index = 0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        question =  findViewById(R.id.question);
        question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index <= questions.length - 1){
                    if(answer[index]){
                        score++;
                    }
                    index++;
                    if(index <= questions.length - 1){
                        question.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your Score is "+ score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index <= questions.length - 1){
                    if(!answer[index]){
                        score++;
                    }
                    index++;
                    if(index <= questions.length - 1){
                        question.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your Score is "+ score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}