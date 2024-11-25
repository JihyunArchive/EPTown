package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NewProductActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_product);

        // 뒤로가기 눌렀을때 메인으로 화면 이동
        ImageButton imagebutton = findViewById(R.id.btnCategoryFeed1Back);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewProductActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 검색 아이콘 눌렀을때 검색으로 화면 이동
        ImageButton imagebutton6 = findViewById(R.id.search);
        imagebutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewProductActivity.this,SearchActivity.class);
                startActivity(intent);
            }
        });

        // 장바구니 눌렀을때 장바구니로 화면 이동
        ImageButton imagebutton7 = findViewById(R.id.cart);
        imagebutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewProductActivity.this,CartActivity.class);
                startActivity(intent);
            }
        });

        // 첫번째 상품 누르면 itemDetail로 화면 이동
        LinearLayout layout = findViewById(R.id.userRecommendedItemOne);
        layout.setOnClickListener(view -> {
            Intent intent = new Intent(NewProductActivity.this, ItemDetails.class);
            startActivity(intent);
        });

    }
}
