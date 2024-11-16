package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class order_pay5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.order_pay5);

        Button button = (Button) findViewById(R.id.buyFixButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(order_pay5Activity.this, order_pay6Activity.class);
                startActivity(intent);
            }
        });

        // 적용하려는 쿠폰 선택했을때 커뮤니티로 이동
        ImageButton imagebutton = findViewById(R.id.btnOrderPayBack);
        imagebutton.setOnClickListener(view -> {
            Intent intent = new Intent(order_pay5Activity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}