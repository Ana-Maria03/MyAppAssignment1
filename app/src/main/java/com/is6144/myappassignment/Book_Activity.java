package com.is6144.myappassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Book_Activity extends AppCompatActivity {
    Button btnReserve;
    Button btnRenew;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book1);

        TextView tv_title = (TextView) findViewById(R.id.tView5); // title here
        tv_title.setText(getIntent().getStringExtra("title"));

        btnReserve= (Button)findViewById(R.id.btnReserve);
        btnRenew= (Button)findViewById(R.id.btnRenew);


        btnReserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = "Reserved";
                result+=
                        (btnReserve.isPressed())? "" :"";
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();

            }
        });
        btnRenew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = "Renewed";
                result+=
                        (btnRenew.isPressed())? "" :"";
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();



            }
        });

    }
}