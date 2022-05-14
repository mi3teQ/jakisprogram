package com.example.jakisprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CalendarView kalendarz;
    TextView tempo, progres;
    EditText temposym;
    SeekBar tempsym2;
    ProgressBar progresssym;
    Button zacznijsym;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

kalendarz=findViewById(R.id.kalendarz);
tempo=findViewById(R.id.textView);
progres=findViewById(R.id.textView2);
temposym=findViewById(R.id.editTextNumber);
tempsym2=findViewById(R.id.seekBar);
progresssym=findViewById(R.id.progressBar);
zacznijsym=findViewById(R.id.button);

    }
}