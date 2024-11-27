package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class OrderDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.order_details);

        // 주문 상세 더보기 버튼 누르면 주문상세로 화면 이동
        ImageButton imagebutton1 = findViewById(R.id.arrowOne);
        imagebutton1.setOnClickListener(view -> {
            Intent intent = new Intent(OrderDetailsActivity.this, OrderPayDetail.class);
            startActivity(intent);
        });

        // 주문 상세 더보기 버튼 누르면 주문상세로 화면 이동
        ImageButton imagebutton2 = findViewById(R.id.arrowTwo);
        imagebutton2.setOnClickListener(view -> {
            Intent intent = new Intent(OrderDetailsActivity.this, OrderPayDetail.class);
            startActivity(intent);
        });

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
    }
}