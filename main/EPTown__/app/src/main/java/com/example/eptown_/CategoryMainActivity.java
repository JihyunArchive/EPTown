package com.example.eptown_;

import static android.app.ProgressDialog.show;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CategoryMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_main);

        // 메인화면에서 카테고리 아이콘을 눌렀을때 카테고리로 화면 이동
        ImageButton imagebutton = findViewById(R.id.tapCategoryIconCategoryFeed1);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        // 뒤로가기 눌렀을때 메인으로 화면 이동
        ImageButton imagebutton1 = findViewById(R.id.btnCategoryFeed1Back);
        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 홈 아이콘 눌렀을때 메인으로 화면 이동
        ImageButton imagebutton2 = findViewById(R.id.tapHomeIconCategoryFeed1);
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 커뮤니티 아이콘 눌렀을때 커뮤니티로 화면 이동
        ImageButton imagebutton3 = findViewById(R.id.tapCommunityIconCategoryFeed1);
        imagebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, CommunityActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 병원 아이콘 눌렀을때 병원으로 화면 이동
        ImageButton imagebutton4 = findViewById(R.id.tapHostpitalIconCategoryFeed1);
        imagebutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, HospitalActivity.class);
                startActivity(intent);
            }
        });

        // 탭바에서 내 정보 아이콘 눌렀을때 내 정보로 화면 이동
        ImageButton imagebutton5 = findViewById(R.id.tapMypageIconCategoryFeed1);
        imagebutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, MyPageActivity.class);
                startActivity(intent);
            }
        });

        //카테고리 메인화면에서 사료 눌렀을때 카테고리 사료1로 화면 이동
        TextView textFeed = findViewById(R.id.feedCategory);
        textFeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, CategoryFeed1Activity.class);
                startActivity(intent);
            }
        });

        //카테고리 메인화면에서 간식 눌렀을때 카테고리 간식1로 화면 이동
        TextView textSnack = findViewById(R.id.snackCategory);
        textSnack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, CategorySnack1Activity.class);
                startActivity(intent);
            }
        });

        //카테고리 메인화면에서 용품 눌렀을때 카테고리 용품1으로 화면 이동
        TextView textProduct = findViewById(R.id.productCategory);
        textProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, CategoryProduct1Activity.class);
                startActivity(intent);
            }
        });

        //카테고리 메인화면에서 사료의 모든연령 눌렀을때 카테고리 사료1로 화면 이동
        TextView textCategory1 = findViewById(R.id.allAge);
        textCategory1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, CategoryFeed1Activity.class);
                startActivity(intent);
            }
        });

        //카테고리 메인화면에서 사료의 키튼 눌렀을때 카테고리 사료2로 화면 이동
        TextView textCategory2 = findViewById(R.id.kitten);
        textCategory2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, CategoryFeed2Activity.class);
                startActivity(intent);
            }
        });

        //카테고리 메인화면에서 사료의 키튼 나이 눌렀을때 카테고리 사료2로 화면 이동
        TextView textCategory2_ = findViewById(R.id.oneUnder);
        textCategory2_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, CategoryFeed2Activity.class);
                startActivity(intent);
            }
        });

        //카테고리 메인화면에서 사료의 어덜트 눌렀을때 카테고리 사료3로 화면 이동
        TextView textCategory3 = findViewById(R.id.adualt);
        textCategory3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, CategoryFeed3Activity.class);
                startActivity(intent);
            }
        });

        //카테고리 메인화면에서 사료의 어덜트 나이 눌렀을때 카테고리 사료3로 화면 이동
        TextView textCategory3_ = findViewById(R.id.oneUp);
        textCategory3_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, CategoryFeed3Activity.class);
                startActivity(intent);
            }
        });

        //카테고리 메인화면에서 사료의 시니어 눌렀을때 카테고리 사료4로 화면 이동
        TextView textCategory4 = findViewById(R.id.senior);
        textCategory4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, CategoryFeed4Activity.class);
                startActivity(intent);
            }
        });

        //카테고리 메인화면에서 사료의 시니어 나이 눌렀을때 카테고리 사료4로 화면 이동
        TextView textCategory4_ = findViewById(R.id.sevenUp);
        textCategory4_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, CategoryFeed4Activity.class);
                startActivity(intent);
            }
        });

        //카테고리 메인화면에서 간식의 전체 눌렀을때 카테고리 간식1로 화면 이동
        TextView textSnack1 = findViewById(R.id.snackTotal);
        textSnack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, CategorySnack1Activity.class);
                startActivity(intent);
            }
        });

        //카테고리 메인화면에서 간식의 수제간식 눌렀을때 카테고리 간식2로 화면 이동
        TextView textSnack2 = findViewById(R.id.handSnack);
        textSnack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, CategorySnack2Activity.class);
                startActivity(intent);
            }
        });

        //카테고리 메인화면에서 간식의 캔 눌렀을때 카테고리 간식3로 화면 이동
        TextView textSnack3 = findViewById(R.id.can);
        textSnack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, CategorySnack3Activity.class);
                startActivity(intent);
            }
        });

        //카테고리 메인화면에서 간식의 파우치 눌렀을때 카테고리 간식4로 화면 이동
        TextView textSnack4 = findViewById(R.id.pouch);
        textSnack4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, CategorySnack4Activity.class);
                startActivity(intent);
            }
        });

        //카테고리 메인화면에서 간식의 음료 눌렀을때 카테고리 간식5로 화면 이동
        TextView textSnack5 = findViewById(R.id.drink);
        textSnack5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, CategorySnack5Activity.class);
                startActivity(intent);
            }
        });

        //카테고리 메인화면에서 간식의 영양/기능 눌렀을때 카테고리 간식6로 화면 이동
        TextView textSnack6 = findViewById(R.id.health);
        textSnack6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, CategorySnack6Activity.class);
                startActivity(intent);
            }
        });

        //카테고리 메인화면에서 간식의 처방식 눌렀을때 카테고리 간식7로 화면 이동
        TextView textSnack7 = findViewById(R.id.prescriptionFood);
        textSnack7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, CategorySnack7Activity.class);
                startActivity(intent);
            }
        });

        //카테고리 메인화면에서 용품의 전체 눌렀을때 카테고리 용품1로 화면 이동
        TextView textProduct1 = findViewById(R.id.productTotal);
        textProduct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, CategoryProduct1Activity.class);
                startActivity(intent);
            }
        });

        //카테고리 메인화면에서 용품의 생활용품 눌렀을때 카테고리 용품2로 화면 이동
        TextView textProduct2 = findViewById(R.id.lifeProduct);
        textProduct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, CategoryProduct2Activity.class);
                startActivity(intent);
            }
        });

        //카테고리 메인화면에서 용품의 위생용품 눌렀을때 카테고리 용품3로 화면 이동
        TextView textProduct3 = findViewById(R.id.washProduct);
        textProduct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, CategoryProduct3Activity.class);
                startActivity(intent);
            }
        });

        //카테고리 메인화면에서 용품의 기타 눌렀을때 카테고리 용품4로 화면 이동
        TextView textProduct4 = findViewById(R.id.etc);
        textProduct4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryMainActivity.this, CategoryProduct4Activity.class);
                startActivity(intent);
            }
        });


    }
}
