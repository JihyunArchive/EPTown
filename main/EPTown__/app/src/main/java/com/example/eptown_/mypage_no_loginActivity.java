package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class mypage_no_loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.mypage_no_login);

        // 로그인 및 회원가입 버튼 눌렀을때 로그인으로 화면 이동
        ImageButton imagebutton = findViewById(R.id.rightArrow);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mypage_no_loginActivity.this, Login.class);
                startActivity(intent);
            }
        });

        // 알림 아이콘 누르면 알림으로 화면 이동
        ImageButton imagebutton1 = findViewById(R.id.reminderIconMyPage);
        imagebutton1.setOnClickListener(view -> {
            Intent intent = new Intent(mypage_no_loginActivity.this, notice3Activity.class);
            startActivity(intent);
        });

        // 개인정보 수정 텍스트 누르면 login으로 화면 이동
        TextView textview = findViewById(R.id.editInformation);
        textview.setOnClickListener(view -> {
            Intent intent = new Intent(mypage_no_loginActivity.this, Login.class);
            startActivity(intent);
        });

        // 반려동물 프로필 관리 텍스트 누르면 login으로화면 이동
        TextView textview1 = findViewById(R.id.petProfile);
        textview1.setOnClickListener(view -> {
            Intent intent = new Intent(mypage_no_loginActivity.this, Login.class);
            startActivity(intent);
        });

        // 건강 정보 관리 텍스트 누르면 login으로 화면 이동
        TextView textview2 = findViewById(R.id.healthInformation);
        textview2.setOnClickListener(view -> {
            Intent intent = new Intent(mypage_no_loginActivity.this, Login.class);
            startActivity(intent);
        });

        // 병원 텍스트 누르면 병원으로 화면 이동
        TextView textview3 = findViewById(R.id.hospitalMyPage);
        textview3.setOnClickListener(view -> {
            Intent intent = new Intent(mypage_no_loginActivity.this, HospitalActivity.class);
            startActivity(intent);
        });

        // 커뮤니티 텍스트 누르면 커뮤니티로 화면 이동
        TextView textview4 = findViewById(R.id.communityMyPage);
        textview4.setOnClickListener(view -> {
            Intent intent = new Intent(mypage_no_loginActivity.this, CommunityActivity.class);
            startActivity(intent);
        });

        // 홈 아이콘 누르면 메인으로 화면 이동
        ImageButton imagebutton2 = findViewById(R.id.tapHomeIconCategoryFeed1);
        imagebutton2.setOnClickListener(view -> {
            Intent intent = new Intent(mypage_no_loginActivity.this, MainActivity.class);
            startActivity(intent);
        });

        // 커뮤니티 아이콘 누르면 커뮤니티로 화면 이동
        ImageButton imagebutton3 = findViewById(R.id.tapCommunityIconCategoryFeed1);
        imagebutton3.setOnClickListener(view -> {
            Intent intent = new Intent(mypage_no_loginActivity.this, CommunityActivity.class);
            startActivity(intent);
        });

        // 카테고리 아이콘 누르면 카테고리 메인으로 화면 이동
        ImageButton imagebutton4 = findViewById(R.id.tapCategoryIconCategoryFeed1);
        imagebutton4.setOnClickListener(view -> {
            Intent intent = new Intent(mypage_no_loginActivity.this, CategoryMainActivity.class);
            startActivity(intent);
        });

        // 병원 아이콘 누르면 병원으로 화면 이동
        ImageButton imagebutton5 = findViewById(R.id.tapHostpitalIconCategoryFeed1);
        imagebutton5.setOnClickListener(view -> {
            Intent intent = new Intent(mypage_no_loginActivity.this, HospitalActivity.class);
            startActivity(intent);
        });

        // 주문/배송 아무곳이나 눌렀을때 로그인으로 화면 이동
        LinearLayout layout = findViewById(R.id.order);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mypage_no_loginActivity.this, Login.class);
                startActivity(intent);
            }
        });

        // 리뷰 아무곳이나 눌렀을때 로그인으로 화면 이동
        LinearLayout layout1 = findViewById(R.id.review);
        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mypage_no_loginActivity.this, Login.class);
                startActivity(intent);
            }
        });

        // 문의 아무곳이나 눌렀을때 로그인으로 화면 이동
        LinearLayout layout2 = findViewById(R.id.inquiry);
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mypage_no_loginActivity.this, Login.class);
                startActivity(intent);
            }
        });

        // 쿠폰 아무곳이나 눌렀을때 로그인으로 화면 이동
        LinearLayout layout3 = findViewById(R.id.cupon);
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mypage_no_loginActivity.this, Login.class);
                startActivity(intent);
            }
        });
    }
}