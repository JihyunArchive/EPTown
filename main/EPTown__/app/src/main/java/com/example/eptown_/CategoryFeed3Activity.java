package com.example.eptown_;

import static android.app.ProgressDialog.show;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CategoryFeed3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_feed3);

        // 뒤로가기 눌렀을때 메인으로 화면 이동
        ImageButton imagebutton = findViewById(R.id.btnCategoryFeed1Back);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryFeed3Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //모든 연령 눌렀을때 카테고리 사료1로 화면 이동
        TextView textFeed1 = findViewById(R.id.allAge);
        textFeed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryFeed3Activity.this, CategoryFeed1Activity.class);
                startActivity(intent);
            }
        });

        //키튼 눌렀을때 카테고리 사료2로 화면 이동
        TextView textFeed2 = findViewById(R.id.kitten);
        textFeed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryFeed3Activity.this, CategoryFeed2Activity.class);
                startActivity(intent);
            }
        });

        //시니어 눌렀을때 카테고리 사료4로 화면 이동
        TextView textFeed3 = findViewById(R.id.senior);
        textFeed3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryFeed3Activity.this, CategoryFeed4Activity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 홈 아이콘 눌렀을때 메인으로 화면 이동
        ImageButton imagebutton1 = findViewById(R.id.tapHomeIconCategoryFeed1);
        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // CategoryMainActivity 화면 전환
                Intent intent = new Intent(CategoryFeed3Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 커뮤니티 아이콘 눌렀을때 커뮤니티로 화면 이동
        ImageButton imagebutton2 = findViewById(R.id.tapCommunityIconCategoryFeed1);
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryFeed3Activity.this, CommunityActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 카테고리 아이콘 눌렀을때 카테고리 메인으로 화면 이동
        ImageButton imagebutton3 = findViewById(R.id.tapCategoryIconCategoryFeed1);
        imagebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryFeed3Activity.this, CategoryMainActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 병원 아이콘 눌렀을때 병원으로 화면 이동
        ImageButton imagebutton4 = findViewById(R.id.tapHostpitalIconCategoryFeed1);
        imagebutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryFeed3Activity.this, HospitalDetailsActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 내 정보 아이콘 눌렀을때 내 정보로 화면 이동
        ImageButton imagebutton5 = findViewById(R.id.tapMypageIconCategoryFeed1);
        imagebutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryFeed3Activity.this, MyPageActivity.class);
                startActivity(intent);
            }
        });

        // 첫번째 상품 누르면 itemDetail로 화면 이동
        LinearLayout layout = findViewById(R.id.userRecommendedItemOne);
        layout.setOnClickListener(view -> {
            Intent intent = new Intent(CategoryFeed3Activity.this, ItemDetails.class);
            startActivity(intent);
        });

    }
}