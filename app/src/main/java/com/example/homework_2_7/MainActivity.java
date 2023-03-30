package com.example.homework_2_7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Integer first,second,sum;
    private boolean isOperatingClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }
    private void setNumber(String number){
        if (textView.getText().toString().equals("0") || isOperatingClick) {
            textView.setText(number);
        } else {
            textView.append(number);
        }
    }

    @SuppressLint("NonConstantResourceId")
    public void onNUmberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_zero:
                setNumber("0");
                break;
            case R.id.btn_one:
                //Кнопка 1
//                if (textView.getText().toString().equals("0")) {
//                    textView.setText("1");
//                } else {
//                    textView.append("1");
//                }
                setNumber("1");
                break;                              //КНОПКИ
            case R.id.btn_two:
                //Кнопка 2
                setNumber("2");
                break;
            case R.id.btn_three:
                setNumber("3");
                break;
            case R.id.btn_clear:
                //Очистка
                textView.setText("0");
                first = 0;
                second = 0;
                sum = 0;
                break;
        }
        isOperatingClick = false;
    }

    @SuppressLint({"SetTextI18n", "NonConstantResourceId"})
    public void onOperationClick(View view) {
        switch (view.getId()){
            case R.id.btn_plus:
                //кнопка плюс
                first = Integer.valueOf(textView.getText().toString());
                break;
            case R.id.btn_equal:
                //кнопка равно
                second = Integer.valueOf(textView.getText().toString());
                sum = first + second;
                textView.setText((sum.toString()));
                break;


        }
        isOperatingClick = true;
    }
}