package ru.geekbrains.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Calculations calculations = new Calculations();

    private TextView numberEntry, operation;

    private boolean newEntry = true;

    private final View.OnClickListener listener = view -> {
        Button button = (Button) view;
        if(newEntry) {
            numberEntry.setText(button.getText());
            newEntry = false;
        } else {
            numberEntry.append(button.getText());
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initTextView();
        initDigitButtons();
        initActionButtons();


    }

    private void initTextView() {
        numberEntry = findViewById(R.id.number_entry);
        operation = findViewById(R.id.operation);
    }

    private void initDigitButtons() {
        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonPoint = findViewById(R.id.button_point);

        button0.setOnClickListener(listener);
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);
        button5.setOnClickListener(listener);
        button6.setOnClickListener(listener);
        button7.setOnClickListener(listener);
        button8.setOnClickListener(listener);
        button9.setOnClickListener(listener);
        buttonPoint.setOnClickListener(listener);
    }

    private void initActionButtons() {
        Button buttonPlus = findViewById(R.id.button_plus);
        Button buttonMinus = findViewById(R.id.button_minus);
        Button buttonMulti = findViewById(R.id.button_multiply);
        Button buttonDiv = findViewById(R.id.button_divide);
        Button buttonEquals = findViewById(R.id.button_equals);
        buttonPlus.setOnClickListener(listener);
        buttonMinus.setOnClickListener(listener);
        buttonMulti.setOnClickListener(listener);
        buttonDiv.setOnClickListener(listener);
        buttonEquals.setOnClickListener(listener);
    }

}