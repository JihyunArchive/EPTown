package com.example.eptown_;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class profile_administration3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.profile_administration3);

        // 뷰 요소들 초기화
        Button buyFixButton = findViewById(R.id.buyFixButton);
        ImageView registerBox = findViewById(R.id.registerBox);
        TextView register = findViewById(R.id.register);

        // 저장하기 버튼 클릭 시 이벤트 설정
        buyFixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 수정 완료 메시지를 보이도록 설정
                registerBox.setVisibility(View.VISIBLE);
                register.setVisibility(View.VISIBLE);

                // 3초 후에 메시지를 숨기도록 Handler 설정
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        registerBox.setVisibility(View.GONE);
                        register.setVisibility(View.GONE);
                    }
                }, 3000); // 3000 milliseconds = 3 seconds
            }
        });
    }
}
