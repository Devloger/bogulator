package com.example.a219.bogulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BoguLator extends AppCompatActivity {

    Button one;
    Integer poprzedniczka;
    String dzialanko;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_bogu_lator);

        text = findViewById(R.id.text);
    }

    public void onClick(View view) {

        switch(view.getId()) {
            case R.id.zero:
                apendzik(0);
                break;
            case R.id.one:
                apendzik(1);
                break;
            case R.id.two:
                apendzik(2);
                break;
            case R.id.three:
                apendzik(3);
                break;
            case R.id.four:
                apendzik(4);
                break;
            case R.id.five:
                apendzik(5);
                break;
            case R.id.six:
                apendzik(6);
                break;
            case R.id.seven:
                apendzik(7);
                break;
            case R.id.eight:
                apendzik(8);
                break;
            case R.id.nine:
                apendzik(9);
                break;
            case R.id.negation:
                text.setText(String.valueOf(Integer.parseInt(text.getText().toString())*-1));
                break;
            case R.id.plus:
                text.setText("olaBoga");
                break;
            case R.id.minus:
                text.setText("olaBoga");
                break;
            case R.id.equal:
                text.setText("olaBoga");
                break;
            case R.id.multiply:
                text.setText("olaBoga");
                break;
            case R.id.divide:
                text.setText("olaBoga");
                ustawuszka(5, "dodawanie");
                break;
            case R.id.back:
                text.setText(text.getText().toString().substring(0, text.getText().toString().length()-1));
                break;
            case R.id.d2:
                text.setText(String.valueOf(Integer.parseInt(text.getText().toString())/2));
                break;
            case R.id.s2:
                text.setText(String.valueOf(Integer.parseInt(text.getText().toString())*Integer.parseInt(text.getText().toString())));
                break;
        }

    }

    private void apendzik(int i) {
        if(Integer.parseInt(text.getText().toString()) == 0) {
            text.setText(String.valueOf(i));
        } else {
            text.append(String.valueOf(i));
        }
    }

    private void ustawuszka(int i) {
        poprzedniczka = Integer.parseInt(text.getText().toString());
        text.setText("0");
    }
}