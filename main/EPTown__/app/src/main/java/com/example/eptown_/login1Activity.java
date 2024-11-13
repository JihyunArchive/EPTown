package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class login1Activity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.login1);

            Button button = (Button) findViewById(R.id.btnContinueColorButton);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(login1Activity.this, login3Activity.class);
                    startActivity(intent);
                }
            });

            // 버튼과 입력 필드 참조
            Button btnContinueButton = findViewById(R.id.btnContinueButton);
            Button btnContinueColorButton = findViewById(R.id.btnContinueColorButton);
            EditText passwordCheckInput = findViewById(R.id.passwordCheckInput);

            // TextWatcher 추가하여 비밀번호 입력 상태를 감지
            passwordCheckInput.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    if (s.length() > 0) {
                        // 텍스트가 있을 때 기본 버튼을 숨기고, 색상이 다른 버튼을 보이게 함
                        btnContinueButton.setVisibility(Button.GONE);
                        btnContinueColorButton.setVisibility(Button.VISIBLE);
                    } else {
                        // 텍스트가 없을 때 기본 버튼을 다시 보이게 하고, 색상 버튼을 숨김
                        btnContinueButton.setVisibility(Button.VISIBLE);
                        btnContinueColorButton.setVisibility(Button.GONE);
                    }
                }

                @Override
                public void afterTextChanged(Editable s) {}
            });

        }
    }