package ru.geekbrains.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Calculations calc = new Calculations();

    private TextView entryField, operation;

    private String str;

    private final View.OnClickListener listenerDigits = view -> {
        Button button = (Button) view;
        if (entryField.getText().toString().equals("0")) {
            entryField.setText(button.getText());
        } else {
            entryField.append(button.getText());
        }
    };

    private final View.OnClickListener listenerZero = view -> {
        Button button = (Button) view;
        if (!entryField.getText().toString().equals("0")) {
            entryField.append(button.getText());
        }
    };

    private final View.OnClickListener listenerPoint = view -> {
        Button button = (Button) view;
        if (entryField.getText() != null) {
            str = entryField.getText().toString();
            boolean hasPoint = false;
            if (str.contains(button.getText())) {
                hasPoint = true;
            }
            if (!hasPoint) {
                entryField.append(button.getText());
            }
            str = "";
        }
        if (entryField.getText() == null || entryField.getText() == "0") {
            entryField.append("0" + button.getText());
        }
    };


    private final View.OnClickListener listenerActions = view -> {
        Button button = (Button) view;
        operation.setText(button.getText());
    };

    private final View.OnClickListener listenerEquals = view -> {
        Button button = (Button) view;
        operation.setText(button.getText());
    };


    private final View.OnClickListener listenerC = view -> {
        operation.setText("");
        entryField.setText("0");
    };

    private final View.OnClickListener listenerBackspace = view -> {
        if (entryField.getText().length() > 1) {
            str = entryField.getText().toString();
            entryField.setText(str.substring(0, str.length() - 1));

            str = "";
        }
        if (entryField.getText().length() == 0 || entryField.getText().length() == 1) {
            entryField.setText("0");
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
        operation = findViewById(R.id.operation);
        entryField = findViewById(R.id.number_entry);
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

        button0.setOnClickListener(listenerZero);
        button1.setOnClickListener(listenerDigits);
        button2.setOnClickListener(listenerDigits);
        button3.setOnClickListener(listenerDigits);
        button4.setOnClickListener(listenerDigits);
        button5.setOnClickListener(listenerDigits);
        button6.setOnClickListener(listenerDigits);
        button7.setOnClickListener(listenerDigits);
        button8.setOnClickListener(listenerDigits);
        button9.setOnClickListener(listenerDigits);
        buttonPoint.setOnClickListener(listenerPoint);
    }

    private void initActionButtons() {
        Button buttonPlus = findViewById(R.id.button_plus);
        Button buttonMinus = findViewById(R.id.button_minus);
        Button buttonMulti = findViewById(R.id.button_multiply);
        Button buttonDiv = findViewById(R.id.button_divide);
        Button buttonEquals = findViewById(R.id.button_equals);
        Button backspace = findViewById(R.id.button_backspace);
        Button buttonC = findViewById(R.id.button_c);

        buttonPlus.setOnClickListener(listenerActions);
        buttonMinus.setOnClickListener(listenerActions);
        buttonMulti.setOnClickListener(listenerActions);
        buttonDiv.setOnClickListener(listenerActions);
        buttonEquals.setOnClickListener(listenerEquals);
        backspace.setOnClickListener(listenerBackspace);
        buttonC.setOnClickListener(listenerC);
    }

}