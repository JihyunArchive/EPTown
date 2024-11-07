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

public class CategorySnack5Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_snack5);

        // 뒤로가기 눌렀을때 메인으로 화면 이동
        ImageView image = (ImageView) findViewById(R.id.btnCategorySnack5Back);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorySnack5Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //전체 눌렀을때 카테고리 간식1로 화면 이동
        TextView textSnack1 = findViewById(R.id.total);
        textSnack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorySnack5Activity.this, CategorySnack1Activity.class);
                startActivity(intent);
            }
        });

        //수제간식 눌렀을때 카테고리 간식2로 화면 이동
        TextView textSnack2 = findViewById(R.id.handSnack);
        textSnack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorySnack5Activity.this, CategorySnack2Activity.class);
                startActivity(intent);
            }
        });

        // 캔 눌렀을때 카테고리 간식3으로 화면 이동
        TextView textSnack3 = findViewById(R.id.can);
        textSnack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorySnack5Activity.this, CategorySnack3Activity.class);
                startActivity(intent);
            }
        });

        // 파우치 눌렀을때 카테고리 간식4로 화면 이동
        TextView textSnack4 = findViewById(R.id.pouch);
        textSnack4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorySnack5Activity.this, CategorySnack4Activity.class);
                startActivity(intent);
            }
        });

        //영양/기능 눌렀을때 카테고리 간식6으로 화면 이동
        TextView textSnack5 = findViewById(R.id.health);
        textSnack5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorySnack5Activity.this, CategorySnack6Activity.class);
                startActivity(intent);
            }
        });

        //처방식 눌렀을때 카테고리 간식7로 화면 이동
        TextView textSnack6 = findViewById(R.id.prescriptionFood);
        textSnack6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorySnack5Activity.this, CategorySnack7Activity.class);
                startActivity(intent);
            }
        });

        //상품 이름1 눌렀을때 아이템 디테일로 화면 이동
        TextView textFeed4 = findViewById(R.id.firstNameOne);
        textFeed4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorySnack5Activity.this, ItemDetails.class);
                startActivity(intent);
            }
        });

        //상품 이름2 눌렀을때 아이템 디테일로 화면 이동
        TextView textFeed5 = findViewById(R.id.firstNameTwo);
        textFeed5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorySnack5Activity.this, ItemDetails.class);
                startActivity(intent);
            }
        });

        // 탭바에서 홈 아이콘 눌렀을때 메인으로 화면 이동
        ImageView image1 = (ImageView) findViewById(R.id.nowTapHomeIconCategorySnack5);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorySnack5Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 커뮤니티 아이콘 눌렀을때 커뮤니티로 화면 이동
        ImageView image2 = (ImageView) findViewById(R.id.tapCommunityIconCategorySnack5);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorySnack5Activity.this, CommunityActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 카테고리 아이콘 눌렀을때 카테고리 메인으로 화면 이동
        ImageView image3 = (ImageView) findViewById(R.id.tapCategoryIconCategorySnack5);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorySnack5Activity.this, CategoryMainActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 병원 아이콘 눌렀을때 병원으로 화면 이동
        ImageView image4 = (ImageView) findViewById(R.id.tapHostpitalIconCategorySnack5);
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorySnack5Activity.this, HospitalDetailsActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 내 정보 아이콘 눌렀을때 내 정보로 화면 이동
        ImageView image5 = (ImageView) findViewById(R.id.tapMypageIconCategorySnack5);
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorySnack5Activity.this, MyPageActivity.class);
                startActivity(intent);
            }
        });

        // 알림 아이콘 눌렀을때 알림으로 화면 이동
        ImageView image6 = (ImageView) findViewById(R.id.search);
        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorySnack5Activity.this,NoticeActivity.class);
                startActivity(intent);
            }
        });

        // 장바구니 눌렀을때 장바구니로 화면 이동
        ImageView image7 = (ImageView) findViewById(R.id.cart);
        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorySnack5Activity.this,CartActivity.class);
                startActivity(intent);
            }
        });

        // 상품 이미지 눌렀을때 아이템 디테일로 화면 이동
        ImageView image8 = (ImageView) findViewById(R.id.firstImage);
        image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategorySnack5Activity.this,ItemDetails.class);
                startActivity(intent);
            }
        });
    }
}