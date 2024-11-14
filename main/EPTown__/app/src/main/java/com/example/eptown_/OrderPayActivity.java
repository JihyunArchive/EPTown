package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OrderPayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_pay);

        // 뒤로가기 눌렀을때 메인로 화면 이동
        ImageView image7_ = findViewById(R.id.btnOrderPayBack);
        image7_.setOnClickListener(view -> {
            Intent intent = new Intent(OrderPayActivity.this, MainActivity.class);
            startActivity(intent);
        });

        // circleOne과 circleTwo의 ImageButton 객체 참조
        ImageButton circleOne = findViewById(R.id.circleOne);
        ImageButton circleTwo = findViewById(R.id.circleTwo);

        // circleOne 클릭 시 이미지 변경
        circleOne.setOnClickListener(view -> {
            circleOne.setImageResource(R.drawable.ic_order_pay_circle_check);  // 이미지를 변경
        });

        // circleTwo 클릭 시 이미지 변경
        circleTwo.setOnClickListener(view -> {
            circleTwo.setImageResource(R.drawable.ic_order_pay_circle_check);  // 이미지를 변경
        });
    }
}
