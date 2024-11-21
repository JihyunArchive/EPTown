package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class order_pay8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.order_pay8);

        // 뒤로가기 눌렀을때 order_pay6로 화면 이동
        ImageButton imagebutton = findViewById(R.id.btnOrderPayBack);
        imagebutton.setOnClickListener(view -> {
            Intent intent = new Intent(order_pay8Activity.this, order_pay6Activity.class);
            startActivity(intent);
        });

        // 문의하기 텍스트 눌렀을때 inquire6로 화면 이동
        TextView textview = findViewById(R.id.inquire);
        textview.setOnClickListener(view -> {
            Intent intent = new Intent(order_pay8Activity.this, inquire6Activity.class);
            startActivity(intent);
        });
    }
}