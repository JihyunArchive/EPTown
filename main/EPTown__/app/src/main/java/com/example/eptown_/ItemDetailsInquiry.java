package com.example.eptown_;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ItemDetailsInquiry extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_details_inquiry);

        // 뒤로가기 눌렀을때 메인으로 화면 이동
        ImageView image = (ImageView) findViewById(R.id.itemDetailsBackIcon);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetailsInquiry.this,MainActivity.class);
                startActivity(intent);
            }
        });

        // 홈 아이콘 눌렀을때 메인으로 화면 이동
        ImageView image1 = (ImageView) findViewById(R.id.homeIcon);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetailsInquiry.this,MainActivity.class);
                startActivity(intent);
            }
        });

        // 알림 아이콘 눌렀을때 알림으로 화면 이동
        ImageView image2 = (ImageView) findViewById(R.id.reminderIcon);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetailsInquiry.this,NoticeActivity.class);
                startActivity(intent);
            }
        });

        // 장바구니 눌렀을때 메인으로 화면 이동
        ImageView image3 = (ImageView) findViewById(R.id.cartIcon);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetailsInquiry.this,CartActivity.class);
                startActivity(intent);
            }
        });

        // 구매하기 눌렀을때 주문/결제으로 화면 이동
        ImageView image4 = (ImageView) findViewById(R.id.buyFixButton);
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetailsInquiry.this,OrderPayActivity.class);
                startActivity(intent);
            }
        });

        //리뷰 눌렀을때 디테일 리뷰로 화면 이동
        TextView textDetails1 = findViewById(R.id.itemReviewTabText);
        textDetails1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetailsInquiry.this, ItemDetailsReview.class);
                startActivity(intent);
            }
        });

        //상품정보 눌렀을때 디테일 상품정보로 화면 이동
        TextView textDetails2 = findViewById(R.id.itemInfoTabText);
        textDetails2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetailsInquiry.this, ItemDetails.class);
                startActivity(intent);
            }
        });

        // 쿠폰받기눌렀을때 디테일 쿠폰으로 화면 이동
        ImageView image5 = (ImageView) findViewById(R.id.getCoupon);
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetailsInquiry.this, ItemDetailsCoupon.class);
                startActivity(intent);
            }
        });

        // 상태바 및 네비게이션 바 배경을 흰색으로, 아이콘 색상을 검정으로 설정 (API 21 이상)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

            // 상태바 배경색을 흰색으로 설정
            window.setStatusBarColor(Color.WHITE);

            // 네비게이션 바 배경색을 흰색으로 설정
            window.setNavigationBarColor(Color.WHITE);

            // 상태바 및 네비게이션 바 아이콘 색상을 검정색으로 설정 (API 26 이상)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                window.getDecorView().setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
                );
            }
        }

        // ItemCostPrice에 취소선 적용
        TextView ItemCostPriceTextView = findViewById(R.id.itemCostPrice);
        ItemCostPriceTextView.setPaintFlags(ItemCostPriceTextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
    }
}
