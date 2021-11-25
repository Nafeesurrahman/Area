package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            EditText squreside=findViewById(R.id.editTextNumber);


            Button button2=  findViewById(R.id.button);
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String number=squreside.getText().toString();
                    n=Integer.parseInt(number);
                    int ans=n*n;

                    TextView textView = findViewById(R.id.textView4);
                    textView.setText(String.valueOf(ans));
                }
            });

            Button button= findViewById(R.id.button3);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    n=0;
                    squreside.setText("");
                }
            });


        }

}