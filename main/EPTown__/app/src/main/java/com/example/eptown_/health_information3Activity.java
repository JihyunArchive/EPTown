package com.example.eptown_;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;  // Button 클래스를 import합니다.
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class health_information3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.health_information3);

        // EditText 필드 참조
        EditText nameEnter = findViewById(R.id.nameEnter);
        EditText ageEnter = findViewById(R.id.ageEnter);
        EditText weightEnter = findViewById(R.id.weightEnter);
        EditText heightEnter = findViewById(R.id.heightEnter);
        EditText regularCheckUpEnter = findViewById(R.id.regularCheckUpEnter);
        EditText healthConditionEnter = findViewById(R.id.healthConditionEnter);

        // buyFixButton, registerBox, register 참조
        Button buyFixButton = findViewById(R.id.buyFixButton);  // Button 클래스를 사용
        ImageView registerBox = findViewById(R.id.registerBox);
        TextView register = findViewById(R.id.register);

        // buyFixButton 클릭 시 registerBox와 register를 3초 동안 보이게 설정
        buyFixButton.setOnClickListener(v -> {
            // registerBox와 register 보이기
            registerBox.setVisibility(View.VISIBLE);
            register.setVisibility(View.VISIBLE);

            // 3초 후에 registerBox와 register를 숨기기
            new Handler().postDelayed(() -> {
                registerBox.setVisibility(View.GONE);
                register.setVisibility(View.GONE);
            }, 3000);  // 3000ms = 3초
        });
    }
}
