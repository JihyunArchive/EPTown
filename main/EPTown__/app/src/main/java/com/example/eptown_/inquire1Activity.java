package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class inquire1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.inquire1);

        // 뒤로가기 버튼 클릭시 마이페이지로 화면 이동
        ImageButton imagebutton = findViewById(R.id.btnCategoryFeed1Back);
        imagebutton.setOnClickListener(view -> {
            Intent intent = new Intent(inquire1Activity.this, MyPageActivity.class);
            startActivity(intent);
        });

        // 문의하기 텍스트 클릭시 inquire5로 화면 이동
        TextView textview = findViewById(R.id.writeReview);
        textview.setOnClickListener(view -> {
            Intent intent = new Intent(inquire1Activity.this, inquire5Activity.class);
            startActivity(intent);
        });
    }
}