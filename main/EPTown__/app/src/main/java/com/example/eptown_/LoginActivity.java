package com.example.eptown_;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        EditText nameInput = findViewById(R.id.idText);
        EditText idInput = findViewById(R.id.passwordText);

        // 로그인 버튼 눌렀을때 메인으로 화면 이동
        Button button = (Button) findViewById(R.id.btnContinueColorButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //회원가입 눌렀을때 회원가입 화면으로 화면 이동
        TextView text = findViewById(R.id.signUpText);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, JoinMembershipActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btnBack = findViewById(R.id.getCouponBackIcon);
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


        // 상태바 및 네비게이션 바 배경을 흰색으로, 아이콘 색상을 검정으로 설정 (API 21 이상)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

            // 상태바 배경색을 흰색으로 설정
            window.setStatusBarColor(Color.WHITE);

            // 네비게이션 바 배경색을 흰색으로 설정
            window.setNavigationBarColor(Color.WHITE);

            // 상태바 및 네비게이션 바 아이콘 색상을 검정색으로 설정 (API 26 이상)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                window.getDecorView().setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
                );
            }
        }
    }
}

