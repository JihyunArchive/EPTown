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

public class community_commentActivity extends AppCompatActivity {

    private int heartCount = 1;  // 초기 하트 클릭 수를 1로 설정

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.community_comment);

        // EditText와 ImageButton
        EditText chatHint = findViewById(R.id.chatHint);
        ImageButton heart = findViewById(R.id.heart);
        TextView heartCountTextView = findViewById(R.id.heartCount);

        // 초기 상태 설정
        heart.setTag("filled");  // "filled" 상태로 초기화
        heart.setImageResource(R.drawable.ic_heart_fill);  // 초기 이미지를 채워진 하트로 설정
        heartCountTextView.setText(String.valueOf(heartCount));  // 초기 카운트 설정

        // ImageButton 클릭 리스너 설정
        heart.setOnClickListener(v -> {
            // 현재 상태를 확인하고 이미지 및 카운트 변경
            if ("filled".equals(heart.getTag())) {
                heart.setImageResource(R.drawable.ic_heart_no_fill);  // 하트 비우기 이미지로 변경
                heart.setTag("empty");  // 상태 변경
                heartCount = 0;  // 하트 클릭 수 감소
            } else {
                heart.setImageResource(R.drawable.ic_heart_fill);  // 하트를 채운 이미지로 변경
                heart.setTag("filled");  // 상태 변경
                heartCount = 1;  // 하트 클릭 수 증가
            }

            // 숫자 갱신
            heartCountTextView.setText(String.valueOf(heartCount));
        });
    }
}
