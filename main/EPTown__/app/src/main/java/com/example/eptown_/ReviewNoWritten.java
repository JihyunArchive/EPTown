package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ReviewNoWritten extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.review_no_written);

        // 홈 아이콘 눌렀을때 메인화면으로 화면 이동
        ImageButton imagebutton1 = findViewById(R.id.homeIcon);
        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewNoWritten.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 알림 아이콘 눌렀을때 알림으로 화면 이동
        ImageButton imagebutton2 = findViewById(R.id.reminderIcon);
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewNoWritten.this, NoticeActivity.class);
                startActivity(intent);
            }
        });

        // 장바구니 아이콘 눌렀을때 장바구니로 화면 이동
        ImageButton imagebutton3 = findViewById(R.id.cartIcon);
        imagebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewNoWritten.this, CartActivity.class);
                startActivity(intent);
            }
        });

        // 쿠폰 받기 버튼 눌렀을때 쿠폰으로 화면 이동
        Button button = findViewById(R.id.getCoupon);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewNoWritten.this, CouponReceiveActivity.class);
                startActivity(intent);
            }
        });

        // 상품 정보 텍스트 눌렀을때 상품 상세로 화면 이동
        TextView textview1 = findViewById(R.id.itemInfoTabText);
        textview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewNoWritten.this, ItemDetails.class);
                startActivity(intent);
            }
        });

        // 문의 텍스트 눌렀을때 item_details_inquiry로 화면 이동
        TextView textview2 = findViewById(R.id.itemInquiryTabText);
        textview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewNoWritten.this, ItemDetailsInquiry.class);
                startActivity(intent);
            }
        });

        // 구매하기 버튼 눌렀을때 주문/결제로 화면 이동
        Button button1 = findViewById(R.id.buyFixButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewNoWritten.this, OrderActivity.class);
                startActivity(intent);
            }
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