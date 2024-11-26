package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class inquire2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.inquire2);

        // 홈 아이콘 클릭시 메인으로 화면 이동
        ImageButton imagebutton1 = findViewById(R.id.homeIcon);
        imagebutton1.setOnClickListener(view -> {
            Intent intent = new Intent(inquire2Activity.this, MainActivity.class);
            startActivity(intent);
        });

        // 알림 아이콘 클릭시 알림으로 화면 이동
        ImageButton imagebutton2 = findViewById(R.id.reminderIcon);
        imagebutton2.setOnClickListener(view -> {
            Intent intent = new Intent(inquire2Activity.this, NoticeActivity.class);
            startActivity(intent);
        });

        // 장바구니 아이콘 클릭시 장바구니로 화면 이동
        ImageButton imagebutton3 = findViewById(R.id.cartIcon);
        imagebutton3.setOnClickListener(view -> {
            Intent intent = new Intent(inquire2Activity.this, CartActivity.class);
            startActivity(intent);
        });

        // 쿠폰 받기 클릭시 쿠폰으로 화면 이동
        Button button = findViewById(R.id.getCoupon);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(inquire2Activity.this, coupon3Activity.class);
            startActivity(intent);
        });

        // 구매하기 클릭시 주문/결제으로 화면 이동
        Button button1 = findViewById(R.id.buyFixButton);
        button1.setOnClickListener(view -> {
            Intent intent = new Intent(inquire2Activity.this, OrderPayActivity.class);
            startActivity(intent);
        });

        ImageButton btnBack = findViewById(R.id.itemDetailsBackIcon);
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