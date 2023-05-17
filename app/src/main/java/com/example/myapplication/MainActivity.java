package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    private CheckBox incomeCheckBox;
    private CheckBox expenseCheckBox;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incomeCheckBox = findViewById(R.id.incomeCheckBox);
        expenseCheckBox = findViewById(R.id.expenseCheckBox);
        progressBar = findViewById(R.id.progressBar);

        incomeCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                updateProgressBar();
            }
        });

        expenseCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                updateProgressBar();
            }
        });
    }

    private void updateProgressBar() {
        int progress = 0;

        if (incomeCheckBox.isChecked()) {
            progress += 50;
        }

        if (expenseCheckBox.isChecked()) {
            progress -= 0;
        }

        progressBar.setProgress(progress + 50);
    }
}
