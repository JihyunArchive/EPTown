package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SearchDetailsActivity extends AppCompatActivity {

    private Button colorRect, uncolorRect, uncolorRectOne, colorRectOne, uncolorRectTwo, colorRectTwo, uncolorRectThree, colorRectThree, uncolorRectFour, colorRectFour;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_details);

        colorRect = findViewById(R.id.colorRect);
        uncolorRect = findViewById(R.id.uncolorRect);
        uncolorRectOne = findViewById(R.id.uncolorRectOne);
        colorRectOne = findViewById(R.id.colorRectOne);
        uncolorRectTwo = findViewById(R.id.uncolorRectTwo);
        colorRectTwo = findViewById(R.id.colorRectTwo);
        uncolorRectThree = findViewById(R.id.uncolorRectThree);
        colorRectThree = findViewById(R.id.colorRectThree);
        uncolorRectFour = findViewById(R.id.uncolorRectFour);
        colorRectFour = findViewById(R.id.colorRectFour);

        // 전체 클릭 시 동작 설정
        uncolorRect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                colorRect.setVisibility(View.VISIBLE);

                uncolorRect.setVisibility(View.GONE);
                colorRectOne.setVisibility(View.GONE);
                colorRectTwo.setVisibility(View.GONE);
                colorRectThree.setVisibility(View.GONE);
                colorRectFour.setVisibility(View.GONE);;
            }
        });

        // 인기순 클릭 시 동작 설정
        uncolorRectOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                uncolorRect.setVisibility(View.VISIBLE);
                colorRectOne.setVisibility(View.VISIBLE);
                uncolorRectTwo.setVisibility(View.VISIBLE);
                uncolorRectThree.setVisibility(View.VISIBLE);;
                uncolorRectFour.setVisibility(View.VISIBLE);

                colorRectTwo.setVisibility(View.GONE);
                colorRectThree.setVisibility(View.GONE);
                colorRectFour.setVisibility(View.GONE);
            }
        });

        // 평점순 클릭 시 동작 설정
        uncolorRectTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                uncolorRect.setVisibility(View.VISIBLE);
                uncolorRectOne.setVisibility(View.VISIBLE);
                colorRectTwo.setVisibility(View.VISIBLE);
                uncolorRectThree.setVisibility(View.VISIBLE);
                uncolorRectFour.setVisibility(View.VISIBLE);

                colorRectOne.setVisibility(View.GONE);
                colorRectThree.setVisibility(View.GONE);
                colorRectFour.setVisibility(View.GONE);
            }
        });

        // 가격 높은 순 클릭 시 동작 설정
        uncolorRectThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                uncolorRect.setVisibility(View.VISIBLE);
                uncolorRectOne.setVisibility(View.VISIBLE);
                uncolorRectTwo.setVisibility(View.VISIBLE);
                colorRectThree.setVisibility(View.VISIBLE);
                uncolorRectFour.setVisibility(View.VISIBLE);

                colorRectOne.setVisibility(View.GONE);
                colorRectTwo.setVisibility(View.GONE);
                colorRectFour.setVisibility(View.GONE);
            }
        });

        // 가격 낮은 순 클릭 시 동작 설정
        uncolorRectFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                uncolorRect.setVisibility(View.VISIBLE);
                uncolorRectOne.setVisibility(View.VISIBLE);
                uncolorRectTwo.setVisibility(View.VISIBLE);
                uncolorRectThree.setVisibility(View.VISIBLE);
                colorRectFour.setVisibility(View.VISIBLE);

                colorRectOne.setVisibility(View.GONE);
                colorRectTwo.setVisibility(View.GONE);
                colorRectThree.setVisibility(View.GONE);
            }
        });

        // 홈 아이콘 눌렀을때 메인으로 화면 이동
        ImageButton imagebutton1 = findViewById(R.id.tapHomeIconCategoryFeed1);
        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchDetailsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 커뮤니티 아이콘 눌렀을때 커뮤니티로 화면 이동
        ImageButton imagebutton2 = findViewById(R.id.tapCommunityIconCategoryFeed1);
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchDetailsActivity.this, CommunityActivity.class);
                startActivity(intent);
            }
        });

        // 카테고리 아이콘 눌렀을때 카테고리 메인으로 화면 이동
        ImageButton imagebutton3 = findViewById(R.id.tapCategoryIconCategoryFeed1);
        imagebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchDetailsActivity.this, CategoryMainActivity.class);
                startActivity(intent);
            }
        });

        // 병원 아이콘 눌렀을때 병원으로 화면 이동
        ImageButton imagebutton4 = findViewById(R.id.tapHostpitalIconCategoryFeed1);
        imagebutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchDetailsActivity.this, HospitalActivity.class);
                startActivity(intent);
            }
        });

        // 내 정보 아이콘 눌렀을때 마이페이지로 화면 이동
        ImageButton imagebutton5 = findViewById(R.id.tapMypageIconCategoryFeed1);
        imagebutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchDetailsActivity.this, MyPageActivity.class);
                startActivity(intent);
            }
        });

        // 첫번째 상품 누르면 itemDetail로 화면 이동
        LinearLayout layout = findViewById(R.id.userRecommendedItemOne);
        layout.setOnClickListener(view -> {
            Intent intent = new Intent(SearchDetailsActivity.this, ItemDetails.class);
            startActivity(intent);
        });

        ImageButton btnBack = findViewById(R.id.btnSearchDetailsBack);
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




