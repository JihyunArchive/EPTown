package com.example.eptown_;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ItemDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_details);

        // 홈 아이콘 눌렀을때 마이페이지로 화면 이동
        ImageButton imagebutton1 = findViewById(R.id.homeIcon);
        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetails.this, MyPageActivity.class);
                startActivity(intent);
            }
        });

        // 알림 아이콘 눌렀을때 알림으로 화면 이동
        ImageButton imagebutton2 = findViewById(R.id.reminderIcon);
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetails.this, NoticeActivity.class);
                startActivity(intent);
            }
        });

        // 장바구니 아이콘 눌렀을때 장바구니로 화면 이동
        ImageButton imagebutton3 = findViewById(R.id.cartIcon);
        imagebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetails.this, CartActivity.class);
                startActivity(intent);
            }
        });

        // 쿠폰받기 버튼 눌렀을때 coupon3로 화면 이동
        Button button = findViewById(R.id.getCoupon);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetails.this, coupon3Activity.class);
                startActivity(intent);
            }
        });

        // 리뷰 텍스트 눌렀을때 item_details_review로 화면 이동
        TextView textview = findViewById(R.id.itemReviewTabText);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetails.this, ItemDetailsReview.class);
                startActivity(intent);
            }
        });

        // 문의 텍스트 눌렀을때 item_details_inquiry로 화면 이동
        TextView textview1 = findViewById(R.id.itemInquiryTabText);
        textview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetails.this, ItemDetailsInquiry.class);
                startActivity(intent);
            }
        });

        // 구매하기 버튼 눌렀을때 주문/결제 화면 이동
        Button button1 = findViewById(R.id.buyFixButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetails.this, OrderPayActivity.class);
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
