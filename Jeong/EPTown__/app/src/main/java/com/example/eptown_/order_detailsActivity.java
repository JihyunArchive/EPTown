package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class order_detailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.order_details);

        // 뒤로가기 버튼 누르면 마이페이지로 화면 이동
        ImageButton imagebutton = findViewById(R.id.btnCategoryFeed1Back);
        imagebutton.setOnClickListener(view -> {
            Intent intent = new Intent(order_detailsActivity.this, MyPageActivity.class);
            startActivity(intent);
        });

        // 주문 상세 더보기 버튼 누르면 주문상세로 화면 이동
        ImageButton imagebutton1 = findViewById(R.id.arrowOne);
        imagebutton1.setOnClickListener(view -> {
            Intent intent = new Intent(order_detailsActivity.this, order_pay6Activity.class);
            startActivity(intent);
        });

        // 주문 상세 더보기 버튼 누르면 주문상세로 화면 이동
        ImageButton imagebutton2 = findViewById(R.id.arrowTwo);
        imagebutton2.setOnClickListener(view -> {
            Intent intent = new Intent(order_detailsActivity.this, order_pay6Activity.class);
            startActivity(intent);
        });
    }
}