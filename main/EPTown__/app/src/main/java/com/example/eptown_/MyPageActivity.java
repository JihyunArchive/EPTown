package com.example.eptown_;

import static android.app.ProgressDialog.show;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MyPageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_page);

        // 메인화면에서 내 정보 눌렀을때 내 정보로 화면 이동
        ImageView image5 = (ImageView) findViewById(R.id.tapMypageIcon);
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        // 알림 아이콘 눌렀을때 알림으로 화면 이동
        ImageView image5_ = (ImageView) findViewById(R.id.reminderIconMyPage);
        image5_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyPageActivity.this, NoticeActivity.class);
                startActivity(intent);
            }
        });

        // 장바구니 아이콘 눌렀을때 장바구니로 화면 이동
        ImageView image5__ = (ImageView) findViewById(R.id.cartIconMyPage);
        image5__.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyPageActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });

        //병원 텍스트 눌렀을때 병원으로 화면 이동
        TextView hospitalMyPage= (TextView) findViewById(R.id.hospitalMyPage);
        hospitalMyPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyPageActivity.this, HospitalActivity.class);
                startActivity(intent);
            }
        });

        //커뮤니티 텍스트 눌렀을때 커뮤니티로 화면 이동
        TextView communityMyPage= (TextView) findViewById(R.id.communityMyPage);
        communityMyPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyPageActivity.this, CommunityActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 홈 아이콘 눌렀을때 메인으로 화면 이동
        ImageView image5_1 = (ImageView) findViewById(R.id.nowTapHomeIconMyPage);
        image5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyPageActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 커뮤니티 아이콘을 눌렀을때 커뮤니티로 화면 이동
        ImageView image5_2 = (ImageView) findViewById(R.id.nowTapCommunityIconMyPage);
        image5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyPageActivity.this, CommunityActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 카테고리 아이콘 눌렀을때 카테고리 메인으로 화면 이동
        ImageView image5_3 = (ImageView) findViewById(R.id.tapCategoryIconMyPage);
        image5_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyPageActivity.this, CategoryMainActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 병원 아이콘 눌렀을때 병원으로 화면 이동
        ImageView image5_4 = (ImageView) findViewById(R.id.tapHospitalIconMyPage);
        image5_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyPageActivity.this, HospitalActivity.class);
                startActivity(intent);
            }
        });
    }

}

