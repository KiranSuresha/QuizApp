package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int finalScore = 0;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getResult(View v) {
        finalScore = 0;
        RadioGroup currentRadio;
        RadioButton currentButton;

        currentRadio = (RadioGroup) findViewById(R.id.radioGroup1);

        switch (currentRadio.getCheckedRadioButtonId()) {
            case R.id.ans1A:
                currentButton = (RadioButton) findViewById(R.id.ans1A);
                currentButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.ans1B:
                finalScore += 1;
                currentButton = (RadioButton) findViewById(R.id.ans1B);
                currentButton.setBackgroundColor(0x2200FF00);
                break;
            case R.id.ans1C:
                currentButton = (RadioButton) findViewById(R.id.ans1C);
                currentButton.setBackgroundColor(0x22FF0000);
                break;
            default:
                currentButton = (RadioButton) findViewById(R.id.ans1A);
                currentButton.setBackgroundColor(0x22FF0000);
                currentButton = (RadioButton) findViewById(R.id.ans1B);
                currentButton.setBackgroundColor(0x22FF0000);
                currentButton = (RadioButton) findViewById(R.id.ans1C);
                currentButton.setBackgroundColor(0x22FF0000);
                break;
        }

        currentRadio = (RadioGroup) findViewById(R.id.radioGroup2);

        switch (currentRadio.getCheckedRadioButtonId()) {
            case R.id.ans2A:
                finalScore += 1;
                currentButton = (RadioButton) findViewById(R.id.ans2A);
                currentButton.setBackgroundColor(0x2200FF00);
                break;
            case R.id.ans2B:
                currentButton = (RadioButton) findViewById(R.id.ans2B);
                currentButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.ans2C:
                currentButton = (RadioButton) findViewById(R.id.ans2C);
                currentButton.setBackgroundColor(0x22FF0000);
                break;
            default:
                currentButton = (RadioButton) findViewById(R.id.ans2A);
                currentButton.setBackgroundColor(0x22FF0000);
                currentButton = (RadioButton) findViewById(R.id.ans2B);
                currentButton.setBackgroundColor(0x22FF0000);
                currentButton = (RadioButton) findViewById(R.id.ans2C);
                currentButton.setBackgroundColor(0x22FF0000);
                break;
        }

        currentRadio = (RadioGroup) findViewById(R.id.radioGroup3);

        switch (currentRadio.getCheckedRadioButtonId()) {
            case R.id.ans3A:
                currentButton = (RadioButton) findViewById(R.id.ans3A);
                currentButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.ans3B:
                currentButton = (RadioButton) findViewById(R.id.ans3B);
                currentButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.ans3C:
                finalScore += 1;
                currentButton = (RadioButton) findViewById(R.id.ans3C);
                currentButton.setBackgroundColor(0x2200FF00);
                break;
            default:
                currentButton = (RadioButton) findViewById(R.id.ans3A);
                currentButton.setBackgroundColor(0x22FF0000);
                currentButton = (RadioButton) findViewById(R.id.ans3B);
                currentButton.setBackgroundColor(0x22FF0000);
                currentButton = (RadioButton) findViewById(R.id.ans3C);
                currentButton.setBackgroundColor(0x22FF0000);
                break;
        }

        currentRadio = (RadioGroup) findViewById(R.id.radioGroup4);

        switch (currentRadio.getCheckedRadioButtonId()) {
            case R.id.ans4A:
                currentButton = (RadioButton) findViewById(R.id.ans4A);
                currentButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.ans4B:
                currentButton = (RadioButton) findViewById(R.id.ans4B);
                currentButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.ans4C:
                finalScore += 1;
                currentButton = (RadioButton) findViewById(R.id.ans4C);
                currentButton.setBackgroundColor(0x2200FF00);
                break;
            default:
                currentButton = (RadioButton) findViewById(R.id.ans4A);
                currentButton.setBackgroundColor(0x22FF0000);
                currentButton = (RadioButton) findViewById(R.id.ans4B);
                currentButton.setBackgroundColor(0x22FF0000);
                currentButton = (RadioButton) findViewById(R.id.ans4C);
                currentButton.setBackgroundColor(0x22FF0000);
                break;
        }

        currentRadio = (RadioGroup) findViewById(R.id.radioGroup5);

        switch (currentRadio.getCheckedRadioButtonId()) {
            case R.id.ans5A:
                finalScore += 1;
                currentButton = (RadioButton) findViewById(R.id.ans5A);
                currentButton.setBackgroundColor(0x2200FF00);
                break;
            case R.id.ans5B:
                currentButton = (RadioButton) findViewById(R.id.ans5B);
                currentButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.ans5C:
                currentButton = (RadioButton) findViewById(R.id.ans5C);
                currentButton.setBackgroundColor(0x22FF0000);
                break;
            default:
                currentButton = (RadioButton) findViewById(R.id.ans5A);
                currentButton.setBackgroundColor(0x22FF0000);
                currentButton = (RadioButton) findViewById(R.id.ans5B);
                currentButton.setBackgroundColor(0x22FF0000);
                currentButton = (RadioButton) findViewById(R.id.ans5C);
                currentButton.setBackgroundColor(0x22FF0000);
                break;
        }

        EditText enteredText = (EditText) findViewById(R.id.ans6);
        if (enteredText.getText().toString().toLowerCase().trim().contains("linux")) {
            finalScore += 1;
            enteredText.setBackgroundColor(0x2200FF00);
        } else {
            enteredText.setBackgroundColor(0x22FF0000);
        }

        enteredText = (EditText) findViewById(R.id.ans7);
        if (enteredText.getText().toString().toLowerCase().trim().contains("sqlite")) {
            finalScore += 1;
            enteredText.setBackgroundColor(0x2200FF00);
        } else {
            enteredText.setBackgroundColor(0x22FF0000);
        }

        enteredText = (EditText) findViewById(R.id.ans8);
        if (enteredText.getText().toString().toLowerCase().trim().contains("open")) {
            finalScore += 1;
            enteredText.setBackgroundColor(0x2200FF00);
        } else {
            enteredText.setBackgroundColor(0x22FF0000);
        }

        enteredText = (EditText) findViewById(R.id.ans9);
        if (enteredText.getText().toString().toLowerCase().trim().contains("kotlin")) {
            finalScore += 1;
            enteredText.setBackgroundColor(0x2200FF00);
        } else {
            enteredText.setBackgroundColor(0x22FF0000);
        }

        enteredText = (EditText) findViewById(R.id.ans10);
        if (enteredText.getText().toString().toLowerCase().trim().contains("true")) {
            finalScore += 1;
            enteredText.setBackgroundColor(0x2200FF00);
        } else {
            enteredText.setBackgroundColor(0x22FF0000);
        }

        EditText enteredName = (EditText) findViewById(R.id.nameField);
        Toast.makeText(this, enteredName.getText().toString() + ", Your score is: " + finalScore, Toast.LENGTH_SHORT).show();
    }
}