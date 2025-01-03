package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class JoinMembershipActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.join_membership);

            EditText nameInput = findViewById(R.id.nameInput);
            EditText idInput = findViewById(R.id.idInput);
            EditText passwordInput = findViewById(R.id.passwordInput);
            EditText passwordCheckInput = findViewById(R.id.passwordCheckInput);

            // 계속하기 눌렀을때 login3로 화면 이동
            Button button = findViewById(R.id.btnContinueColorButton);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(JoinMembershipActivity.this, JoinMembershipDetailActivity.class);
                    startActivity(intent);
                }
            });

            ImageButton btnBack = findViewById(R.id.btnLoginBack);
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
        }
    }