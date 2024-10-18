package com.example.eptown_;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.Nullable;

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 상태바 및 네비게이션 바 배경을 투명으로 설정 (API 21 이상)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

            // 상태바 배경색을 투명으로 설정
            window.setStatusBarColor(Color.TRANSPARENT);

            // 네비게이션 바 배경색을 투명으로 설정
            window.setNavigationBarColor(Color.TRANSPARENT);

            // 상태바 및 네비게이션 바 아이콘 색상을 검정색으로 설정 (API 26 이상)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                window.getDecorView().setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
                );
            }
        }

        // 스플래시 화면에서 2초 후에 메인으로 화면 이동
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                //finish(); // 스플래시 화면을 종료하여 뒤로가기 버튼을 눌렀을 때 다시 돌아오지 않도록 함
            }
        }, 1000); // 2초 딜레이
    }
}

