package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;  // Button 클래스 import 추가
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class health_informationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.health_information);

        // 버튼 참조
        Button buyFixButton = findViewById(R.id.buyFixButton);
        Button choiceButtonTwo = findViewById(R.id.choiceButtonTwo);
        Button choiceButtonThree = findViewById(R.id.choiceButtonThree);

        // buyFixButton 클릭 시 동작 설정
        buyFixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choiceButtonThree.setVisibility(View.VISIBLE);
            }
        });

        // 뒤로가기 버튼 눌렀을때 mypage로 화면 이동
        ImageButton imagebutton = findViewById(R.id.btnCategoryFeed1Back);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(health_informationActivity.this, MyPageActivity.class);
                startActivity(intent);
            }
        });

        // 플목이 눌렀을 때 profile_administration3로 화면 이동
        Button button = findViewById(R.id.choiceButtonOne);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(health_informationActivity.this, health_information2Activity.class);
            startActivity(intent);
        });

        // 몽실이 눌렀을 때 profile_administration3로 화면 이동
        Button button1 = findViewById(R.id.choiceButtonThree);
        button1.setOnClickListener(view -> {
            Intent intent = new Intent(health_informationActivity.this, health_information3Activity.class);
            startActivity(intent);
        });

        EditText nameEnter = findViewById(R.id.nameEnter);
        EditText ageEnter = findViewById(R.id.ageEnter);
        EditText weightEnter = findViewById(R.id.weightEnter);
        EditText heightEnter = findViewById(R.id.heightEnter);
        EditText regularCheckUpEnter = findViewById(R.id.regularCheckUpEnter);
        EditText healthConditionEnter = findViewById(R.id.healthConditionEnter);
    }
}
