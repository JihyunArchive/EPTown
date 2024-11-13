package com.example.eptown_;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class inquire5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.inquire5);

        // zipCodeButton을 찾아 클릭 시 이미지 및 EditText 활성화 설정
        ImageButton zipCodeButton = findViewById(R.id.checked);

        // zipCodeButton의 기본 및 활성화 상태 drawable 리소스
        int defaultZipCodeImageResource = R.drawable.ic_checked_circle;
        int activeZipCodeImageResource = R.drawable.ic_uncolor_rect;
    }
}
