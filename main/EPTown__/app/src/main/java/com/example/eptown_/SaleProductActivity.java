package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SaleProductActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sale_product);

        // 뒤로가기 눌렀을때 메인으로 화면 이동
        ImageButton imagebutton = findViewById(R.id.btnCategoryFeed1Back);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SaleProductActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 첫번째 상품 누르면 itemDetail로 화면 이동
        LinearLayout layout = findViewById(R.id.userRecommendedItemOne);
        layout.setOnClickListener(view -> {
            Intent intent = new Intent(SaleProductActivity.this, ItemDetails.class);
            startActivity(intent);
        });

    }
}
