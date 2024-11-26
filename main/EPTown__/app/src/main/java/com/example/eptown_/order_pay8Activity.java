package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

        // 문의하기 텍스트 눌렀을때 inquire6로 화면 이동
        TextView textview = findViewById(R.id.inquire);
        textview.setOnClickListener(view -> {
            Intent intent = new Intent(order_pay8Activity.this, inquire6Activity.class);
            startActivity(intent);
        });

        ImageButton btnBack = findViewById(R.id.btnOrderPayBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // onBackPressed() 메서드 호출
                onBackPressed();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed(); // 바로 이전 화면으로 이동
        finish(); // 현재 액티비티 종료
    }
}