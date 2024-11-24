package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SearchDetailsReviewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_details_review);

        // 뒤로가기 눌렀을때 검색으로 화면 이동
        ImageButton imagebutton = findViewById(R.id.btnSearchDetailsBack);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchDetailsReviewActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

        // 홈 아이콘 눌렀을때 메인으로 화면 이동
        ImageButton imagebutton1 = findViewById(R.id.tapHomeIconCategoryFeed1);
        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchDetailsReviewActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 커뮤니티 아이콘 눌렀을때 커뮤니티로 화면 이동
        ImageButton imagebutton2 = findViewById(R.id.tapCommunityIconCategoryFeed1);
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchDetailsReviewActivity.this, CommunityActivity.class);
                startActivity(intent);
            }
        });

        // 카테고리 아이콘 눌렀을때 카테고리 메인으로 화면 이동
        ImageButton imagebutton3 = findViewById(R.id.tapCategoryIconCategoryFeed1);
        imagebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchDetailsReviewActivity.this, CategoryMainActivity.class);
                startActivity(intent);
            }
        });

        // 병원 아이콘 눌렀을때 병원으로 화면 이동
        ImageButton imagebutton4 = findViewById(R.id.tapHostpitalIconCategoryFeed1);
        imagebutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchDetailsReviewActivity.this, HospitalActivity.class);
                startActivity(intent);
            }
        });

        // 내 정보 아이콘 눌렀을때 마이페이지로 화면 이동
        ImageButton imagebutton5 = findViewById(R.id.tapMypageIconCategoryFeed1);
        imagebutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchDetailsReviewActivity.this, MyPageActivity.class);
                startActivity(intent);
            }
        });

        // 첫번째 상품 누르면 itemDetail로 화면 이동
        LinearLayout layout = findViewById(R.id.userRecommendedItemOne);
        layout.setOnClickListener(view -> {
            Intent intent = new Intent(SearchDetailsReviewActivity.this, ItemDetails.class);
            startActivity(intent);
        });// 전체 버튼 눌렀을때 SearchDetails로 화면 이동
        Button button = findViewById(R.id.colorRect);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchDetailsReviewActivity.this, SearchDetailsActivity.class);
                startActivity(intent);
            }
        });

        // 인기순 버튼 눌렀을때 SearchDetailPopular로 화면 이동
        Button button1 = findViewById(R.id.uncolorRectOne);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchDetailsReviewActivity.this, SearchDetailsPopularityActivity.class);
                startActivity(intent);
            }
        });

        // 가격 높은 순 버튼 눌렀을때 SearchDetailshigher로 화면 이동
        Button button2 = findViewById(R.id.uncolorRectThree);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchDetailsReviewActivity.this, SearchDetailshigherActivity.class);
                startActivity(intent);
            }
        });

        // 가격 낮은 순 버튼 눌렀을때 SearchDetailslower로 화면 이동
        Button button3 = findViewById(R.id.uncolorRectFour);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchDetailsReviewActivity.this, SearchDetailslowerActivity.class);
                startActivity(intent);
            }
        });
    }
}
