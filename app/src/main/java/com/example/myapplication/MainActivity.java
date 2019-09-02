package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private TextView textView;
    private int num1 = 1;
    private int num2 = 1;
    private int point = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        textView = (TextView)findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1>num2){
                    point++;
                    textView.setText("point:"+String.valueOf(point));
                    Toast.makeText(MainActivity.this,"加一分",Toast.LENGTH_LONG).show();
                }else{
                    point--;
                    textView.setText("point:"+String.valueOf(point));
                    Toast.makeText(MainActivity.this,"减一分",Toast.LENGTH_LONG).show();
                }
                init();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1<num2){
                    point++;
                    textView.setText("point:"+String.valueOf(point));
                    Toast.makeText(MainActivity.this,"加一分",Toast.LENGTH_LONG).show();
                }else{
                    point--;
                    textView.setText("point:"+String.valueOf(point));
                    Toast.makeText(MainActivity.this,"减一分",Toast.LENGTH_LONG).show();
                }
                init();
            }
        });
        init();
    }

    private void init(){
        boolean flage = true;
        while(flage){
            num1 = (int)(Math.random() * 100);
            num2 = (int)(Math.random() * 100);
            if(num1 == num2){
                flage = true;
            }else{
                flage = false;
            }
        }
        button.setText(String.valueOf(num1));
        button2.setText(String.valueOf(num2));
    }

}
