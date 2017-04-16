package com.example.hp.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnadd, btnsub, btnmul, btndiv, btndel, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btndot, btneql,btnres,btnsqt,btnpow;
    TextView result;
    double first_num, second_num;
    boolean add, sub, mul, div, pow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.result);         //connecting with the variables and buttons
        btnadd = (Button) findViewById(R.id.btnadd);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnmul = (Button) findViewById(R.id.btnmul);
        btndiv = (Button) findViewById(R.id.btndiv);
        btneql = (Button) findViewById(R.id.btneql);
        btndot = (Button) findViewById(R.id.btndot);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btndel = (Button) findViewById(R.id.btndel);
        btnsqt = (Button) findViewById(R.id.btnsqt);
        btnpow = (Button) findViewById(R.id.btnpow );
        btnres = (Button) findViewById(R.id.btnres);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {                            //for typing the required number
                result.setText(result.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "9");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + ".");
            }
        });
        btnres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first_num=Double.parseDouble(result.getText()+"");
                result.setText(1/first_num + "");
            }
        });
        btnpow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first_num=Double.parseDouble(result.getText()+"");
                pow=true;
                result.setText(null);
            }
        });
        btnsqt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num=Double.parseDouble(result.getText()+"");
                result.setText(Math.sqrt(first_num) + "");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result==null){
                    result.setText("");
                }
                else{
                    first_num=Double.parseDouble(result.getText()+"");
                    add=true;
                    result.setText(null);
                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result==null){
                    result.setText("");
                }
                else{
                    first_num=Double.parseDouble(result.getText()+"");
                    sub=true;
                    result.setText(null);
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result==null){
                    result.setText("");
                }
                else{
                    first_num=Double.parseDouble(result.getText()+"");
                    mul=true;
                    result.setText(null);
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result==null){
                    result.setText("");
                }
                else{
                    first_num=Double.parseDouble(result.getText()+"");
                    div=true;
                    result.setText(null);
                }
            }
        });
        btneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second_num=Double.parseDouble(result.getText()+"");
                if (add==true){
                    result.setText(first_num + second_num+"");
                    add=false;
                }
                if (sub==true){
                    result.setText(first_num - second_num+"");
                    sub=false;
                }
                if (mul==true){
                    result.setText(first_num * second_num+"");
                    mul=false;
                }
                if (div==true){
                    result.setText(first_num / second_num+"");
                    div=false;
                }
                if (pow==true){
                    result.setText(Math.pow(first_num,second_num) + "");
                }
            }
        });
        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
            }
        });

    }
}