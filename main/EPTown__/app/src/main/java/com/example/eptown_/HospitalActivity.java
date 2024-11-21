package com.example.eptown_;

import static android.app.ProgressDialog.show;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
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
        ImageButton imagebutton = findViewById(R.id.tapHostpitalIconCategoryFeed1);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        // 뒤로가기 눌렀을때 메인으로 화면 이동
        ImageButton imagebutton1 = findViewById(R.id.btnHospitalBack);
        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HospitalActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 홈 아이콘 눌렀으로 메인으로 화면 이동
        ImageButton imagebutton2 = findViewById(R.id.tapHomeIconCategoryFeed1);
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HospitalActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 커뮤니티 아이콘 눌렀을때 커뮤니티로 화면 이동
        ImageButton imagebutton3 = findViewById(R.id.tapCommunityIconCategoryFeed1);
        imagebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HospitalActivity.this, CommunityActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 카테고리 아이콘 눌렀을때 카테고리 메인으로 화면 이동
        ImageButton imagebutton4 = findViewById(R.id.tapCategoryIconCategoryFeed1);
        imagebutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HospitalActivity.this, CategoryMainActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 내 정보 눌렀을때 내 정보로 화면 이동
        ImageButton imagebutton5 = findViewById(R.id.tapHostpitalIconCategoryFeed1);
        imagebutton5.setOnClickListener(new View.OnClickListener() {
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

        // 병원 소개 첫번째 아무곳이나 눌렀을때 병원 디테일로 화면 이동
        LinearLayout layout1 = findViewById(R.id.firstHospital);
        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HospitalActivity.this, HospitalDetailsActivity.class);
                startActivity(intent);
            }
        });

        // 병원 소개 두번째 아무곳이나 눌렀을때 병원 디테일로 화면 이동
        LinearLayout layout2 = findViewById(R.id.secondHospital);
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HospitalActivity.this, HospitalDetailsActivity.class);
                startActivity(intent);
            }
        });

        // 병원 소개 세번째 아무곳이나 눌렀을때 병원 디테일로 화면 이동
        LinearLayout layout3 = findViewById(R.id.thirdHospital);
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HospitalActivity.this, HospitalDetailsActivity.class);
                startActivity(intent);
            }
        });

        // 병원 소개 네번째 아무곳이나 눌렀을때 병원 디테일로 화면 이동
        LinearLayout layout4 = findViewById(R.id.fourthHospital);
        layout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HospitalActivity.this, HospitalDetailsActivity.class);
                startActivity(intent);
            }
        });

        // 병원 소개 다섯번째 아무곳이나 눌렀을때 병원 디테일로 화면 이동
        LinearLayout layout5 = findViewById(R.id.fifthHospital);
        layout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HospitalActivity.this, HospitalDetailsActivity.class);
                startActivity(intent);
            }
        });
    }

}

