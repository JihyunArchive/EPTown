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

public class CategoryProduct4Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_product4);

        // 뒤로가기 눌렀을때 메인으로 화면 이동
        ImageView image = (ImageView) findViewById(R.id.btnCategoryProduct4Back);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // CategoryMainActivity 화면 전환
                Intent intent = new Intent(CategoryProduct4Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //전체 눌렀을때 카테고리 용품1로 화면 이동
        TextView textProduct1 = findViewById(R.id.total);
        textProduct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 화면 전환: CategoryMainActivity -> CategoryFeed1Activity
                Intent intent = new Intent(CategoryProduct4Activity.this, CategoryProduct1Activity.class);
                startActivity(intent);
            }
        });

        //생활용품 눌렀을때 카테고리 용품2로 화면 이동
        TextView textProduct2 = findViewById(R.id.lifeProduct);
        textProduct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 화면 전환: CategoryMainActivity -> CategoryFeed1Activity
                Intent intent = new Intent(CategoryProduct4Activity.this, CategoryProduct2Activity.class);
                startActivity(intent);
            }
        });

        //위생용품 눌렀을때 카테고리 용품3으로 화면 이동
        TextView textProduct3 = findViewById(R.id.washProduct);
        textProduct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 화면 전환: CategoryMainActivity -> CategoryFeed1Activity
                Intent intent = new Intent(CategoryProduct4Activity.this, CategoryProduct3Activity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 홈 아이콘 눌렀을때 메인으로 화면 이동
        ImageView image1 = (ImageView) findViewById(R.id.nowTapHomeIconCategorySnack4);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // CategoryMainActivity 화면 전환
                Intent intent = new Intent(CategoryProduct4Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 커뮤니티 아이콘 눌렀을때 커뮤니티로 화면 이동
        ImageView image2 = (ImageView) findViewById(R.id.tapCommunityIconCategoryProduct4);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // CategoryMainActivity 화면 전환
                Intent intent = new Intent(CategoryProduct4Activity.this, CommunityActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 카테고리 아이콘 눌렀을때 카테고리 메인으로 화면 이동
        ImageView image3 = (ImageView) findViewById(R.id.tapCategoryIconCategoryProduct4);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // CategoryMainActivity 화면 전환
                Intent intent = new Intent(CategoryProduct4Activity.this, CategoryMainActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 병원 아이콘 눌렀을때 병원으로 화면 이동
        ImageView image4 = (ImageView) findViewById(R.id.tapHostpitalIconCategoryProduct4);
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // CategoryMainActivity 화면 전환
                Intent intent = new Intent(CategoryProduct4Activity.this, HospitalDetailsActivity.class);
                startActivity(intent);
            }
        });
        // 탭바에서 내 정보 아이콘 눌렀을때 내 정보로 화면 이동
        ImageView image5 = (ImageView) findViewById(R.id.tapMypageIconCategoryProduct4);
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // CategoryMainActivity 화면 전환
                Intent intent = new Intent(CategoryProduct4Activity.this, MyPageActivity.class);
                startActivity(intent);
            }
        });

        // 알림 아이콘 눌렀을때 알림으로 화면 이동
        ImageView image6 = (ImageView) findViewById(R.id.search);
        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryProduct4Activity.this,NoticeActivity.class);
                startActivity(intent);
            }
        });

        // 장바구니 눌렀을때 장바구니로 화면 이동
        ImageView image7 = (ImageView) findViewById(R.id.cart);
        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryProduct4Activity.this,CartActivity.class);
                startActivity(intent);
            }
        });

    }
}
