package com.example.jakisprogram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.Pair;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;

public class MainActivity extends AppCompatActivity {
    CalendarView kalendarz;
    TextView tempo, progres, wybranadata;
    EditText temposym;
    SeekBar tempsym2;
    ProgressBar progresssym;
    Button zacznijsym, wybierzdate;


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
wybierzdate=findViewById(R.id.button);
wybranadata=findViewById(R.id.textView3);


        MaterialDatePicker datePicker=MaterialDatePicker.Builder.dateRangePicker().setSelection(Pair.create(MaterialDatePicker.thisMonthInUtcMilliseconds(),MaterialDatePicker.thisMonthInUtcMilliseconds())).build();

        wybierzdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datePicker.show(getSupportFragmentManager(),"Material_Range");
                datePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
                    @Override
                    public void onPositiveButtonClick(Object selection) {
                        wybranadata.setText(datePicker.getHeaderText());
                    }
                });
            }
        });
        zacznijsym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value;

                for (value=0;value<100;value=value+Integer.valueOf(String.valueOf(temposym.getText()))) {
                    progresssym.setProgress(value);
                }
            }
        });
    }

}