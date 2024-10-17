package com.example.eptown_;

import static android.app.ProgressDialog.show;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HospitalActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hospital);

        // 메인화면에서 병원 아이콘 눌렀을때 병원으로 화면 이동
        ImageView image4 = (ImageView) findViewById(R.id.tapHospitalIconHospital);
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        // 뒤로가기 눌렀을때 메인으로 화면 이동
        ImageView image4_ = (ImageView) findViewById(R.id.btnHospitalBack);
        image4_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HospitalActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 홈 아이콘 눌렀으로 메인으로 화면 이동
        ImageView image4_1 = (ImageView) findViewById(R.id.nowTapHomeIconHospital);
        image4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HospitalActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 커뮤니티 아이콘 눌렀을때 커뮤니티로 화면 이동
        ImageView image4_2 = (ImageView) findViewById(R.id.tapCommunityIconHospital);
        image4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HospitalActivity.this, CommunityActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 카테고리 아이콘 눌렀을때 카테고리 메인으로 화면 이동
        ImageView image4_3 = (ImageView) findViewById(R.id.tapCategoryIconHospital);
        image4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HospitalActivity.this, CategoryMainActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 내 정보 눌렀을때 내 정보로 화면 이동
        ImageView image4_4 = (ImageView) findViewById(R.id.tapMypageIconHospital);
        image4_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HospitalActivity.this, MyPageActivity.class);
                startActivity(intent);
            }
        });

        // 병원 소개 첫번째 아무곳이나 눌렀을때 병원 디테일로 화면 이동
        LinearLayout layout = findViewById(R.id.firstHospital);
            layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(HospitalActivity.this, HospitalDetailsActivity.class);
                    startActivity(intent);
                }
            });
    }

}

