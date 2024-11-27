package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class InquireNoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.inquire_no);

        ImageButton btnBack = findViewById(R.id.btnCategoryFeed1Back);
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

        // 문의하기 텍스트 클릭시 inquire5로 화면 이동
        TextView textview = findViewById(R.id.writeReview);
        textview.setOnClickListener(view -> {
            Intent intent = new Intent(InquireNoActivity.this, InquireChoiceActivity.class);
            startActivity(intent);
        });

    }
}
