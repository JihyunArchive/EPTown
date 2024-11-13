package com.example.eptown_;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class profile_administrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.profile_administration);

        EditText nameEnter = findViewById(R.id.nameEnter);
        EditText birthdayEnter = findViewById(R.id.birthdayEnter);
        EditText ageEnter = findViewById(R.id.ageEnter);
        EditText genderEnter = findViewById(R.id.genderEnter);
        EditText kindEnter = findViewById(R.id.kindEnter);

        // 저장하기 버튼과 등록 확인 메시지 뷰들 찾기
        Button buyFixButton = findViewById(R.id.buyFixButton);
        ImageView registerBox = findViewById(R.id.registerBox);
        TextView register = findViewById(R.id.register);

        // 저장하기 버튼 클릭 이벤트 설정
        buyFixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 메시지를 보여주기 위해 VISIBLE로 설정
                registerBox.setVisibility(View.VISIBLE);
                register.setVisibility(View.VISIBLE);

                // 3초 후에 GONE으로 설정하여 숨기기
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
