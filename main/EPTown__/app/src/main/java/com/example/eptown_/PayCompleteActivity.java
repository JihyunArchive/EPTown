package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class PayCompleteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.pay_complete);

        // 홈 아이콘 눌렀을때 메인으로 이동
        ImageButton imagebutton1 = findViewById(R.id.homeButton);
        imagebutton1.setOnClickListener(view -> {
            Intent intent = new Intent(PayCompleteActivity.this, MainActivity.class);
            startActivity(intent);
        });

        // 주문/배송 상세 내역 보기 눌렀을때 order_pay6으로 화면 이동
        Button button = findViewById(R.id.buyFixButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PayCompleteActivity.this, OrderPayDetail.class);
                startActivity(intent);
            }
        });
    }
}