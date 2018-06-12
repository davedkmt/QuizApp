package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int correctChoice = 0;
    int totalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method checks the correct answer for the first question
     */

    public void firstRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radiofirst:
                if (checked)
                    correctChoice += 1;
                break;
            default:
                correctChoice += 0;
        }
        checkScore(correctChoice);
    }

    /**
     * This method checks the correct answer for the first question
     */

    public void secondRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radiosecond:
                if (checked)
                    correctChoice += 1;
                break;
            default:
                correctChoice += 0;
        }
        checkScore(correctChoice);
    }

    /**
     * This method checks the correct answer for the first question
     */

    public void thirdRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radiothird:
                if (checked)
                    correctChoice += 1;
                break;
            default:
                correctChoice += 0;
        }
        checkScore(correctChoice);
    }

    /**
     * This method checks the correct answer for the first question
     */

    public void fourthRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radiofourth:
                if (checked)
                    correctChoice += 1;
                break;
            default:
                correctChoice += 0;
        }
        checkScore(correctChoice);
    }

    /**
     * This method checks the correct answer for the first question
     */

    public void fifthRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radiofifth:
                if (checked)
                    correctChoice += 1;
                break;
            default:
                correctChoice += 0;
        }
        checkScore(correctChoice);
    }

    /**
     * This method is called to calculate score.
     */

    public void checkScore(int correctChoice) {

        correctChoice += correctChoice;
    }

    /**
     * Clear checked RadioGroup
     */

    public void reset(View view) {

        RadioGroup choice1 = (RadioGroup) findViewById(R.id.group1);
        RadioGroup choice2 = (RadioGroup) findViewById(R.id.group2);
        RadioGroup choice3 = (RadioGroup) findViewById(R.id.group3);
        RadioGroup choice4 = (RadioGroup) findViewById(R.id.group4);
        RadioGroup choice5 = (RadioGroup) findViewById(R.id.group5);
        choice1.clearCheck();
        choice2.clearCheck();
        choice3.clearCheck();
        choice4.clearCheck();
        choice5.clearCheck();

    }

    /**
     * This method is called when the Submit button is clicked.
     */

    public void submitResult(View view) {

//        Get users name

        EditText txtname = (EditText) findViewById(R.id.name);
        String fullName = txtname.getText().toString();

//        Check if the user wants to include name with the score

        CheckBox check = (CheckBox) findViewById(R.id.checkbox);
        boolean checker = check.isChecked();

//        If the user has specified a name, show it along with the score

        if (fullName.length() > 0 && checker) {
            int duration = Toast.LENGTH_LONG;

            Toast.makeText(this, fullName + " scored: " + correctChoice + " out of 5", duration).show();
            correctChoice = 0;
        } else {

            int duration = Toast.LENGTH_LONG;
            Toast.makeText(this, "Score: " + correctChoice + " out of 5", duration).show();
            correctChoice = 0;
        }

    }
}
