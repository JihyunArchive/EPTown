package com.example.eptown_;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class community2Activity extends AppCompatActivity {

    private int heartCount = 0;  // 하트 클릭 수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.community2);

        // EditText와 ImageButton
        EditText chatHint = findViewById(R.id.chatHint);
        ImageButton heart = findViewById(R.id.heart);
        TextView heartCountTextView = findViewById(R.id.heartCount);  // TextView 참조, 이름 변경

        // 초기 상태를 tag에 저장
        heart.setTag("empty");  // "empty" 상태로 초기화

        // ImageButton 클릭 리스너 설정
        heart.setOnClickListener(v -> {
            // 현재 상태를 확인하고 이미지 변경
            if ("empty".equals(heart.getTag())) {
                heart.setImageResource(R.drawable.ic_heart_fill);  // 이미지 변경
                heart.setTag("filled");  // 상태 변경
                heartCount++;  // 하트 클릭 수 증가
            } else {
                heart.setImageResource(R.drawable.ic_heart_no_fill);  // 원래 이미지로 변경
                heart.setTag("empty");  // 상태 변경
                heartCount--;  // 하트 클릭 수 감소
            }

            // 숫자 갱신
            heartCountTextView.setText(String.valueOf(heartCount));
        });
    }
}
