package com.example.eptown_;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class login1Activity extends AppCompatActivity {
    private EditText nameInput, emailInput, passwordInput, passwordCheckInput;
    private Button btnContinueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login1);

        // EditText와 버튼 초기화
        nameInput = findViewById(R.id.nameInput);
        emailInput = findViewById(R.id.emailInput);
        passwordInput = findViewById(R.id.passwordInput);
        passwordCheckInput = findViewById(R.id.passwordCheckInput);
        btnContinueButton = findViewById(R.id.btnContinueButton);

        // 버튼 활성화를 위한 TextWatcher 설정
        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                updateButtonState();
            }

            @Override
            public void afterTextChanged(Editable s) {}
        };

        passwordInput.addTextChangedListener(textWatcher);
        passwordCheckInput.addTextChangedListener(textWatcher);

        btnContinueButton.setOnClickListener(v -> {
            // 이메일 유효성 검사
            String email = emailInput.getText().toString();
            if (!isValidEmail(email)) {
                Toast.makeText(login1Activity.this, "유효한 이메일 주소를 입력하세요.", Toast.LENGTH_SHORT).show();
                return; // 유효하지 않으면 함수 종료
            }

            // 비밀번호 유효성 검사
            String password = passwordInput.getText().toString();
            if (!isValidPassword(password)) {
                Toast.makeText(login1Activity.this, "비밀번호는 최소 8자 이상 15자 이하로, 대소문자, 숫자, 특수문자를 포함해야 합니다.", Toast.LENGTH_SHORT).show();
                return; // 유효하지 않으면 함수 종료
            }

            // 비밀번호와 비밀번호 확인 일치 여부 확인
            if (!password.equals(passwordCheckInput.getText().toString())) {
                Toast.makeText(login1Activity.this, "비밀번호가 일치하지 않습니다.", Toast.LENGTH_SHORT).show();
                return;
            }

            // 모든 유효성 검사를 통과한 경우
            Intent intent = new Intent(login1Activity.this, login3Activity.class);
            intent.putExtra("userName", nameInput.getText().toString());
            intent.putExtra("userEmail", email);
            intent.putExtra("userPassword", password);
            startActivity(intent);
        });
    }

    private void updateButtonState() {
        boolean isEnabled = !nameInput.getText().toString().isEmpty()
                && !emailInput.getText().toString().isEmpty()
                && !passwordInput.getText().toString().isEmpty()
                && !passwordCheckInput.getText().toString().isEmpty()
                && passwordInput.getText().toString().equals(passwordCheckInput.getText().toString())
                && isValidEmail(emailInput.getText().toString()) // 이메일 유효성 검사
                && isValidPassword(passwordInput.getText().toString()); // 비밀번호 유효성 검사

        btnContinueButton.setEnabled(isEnabled);
        btnContinueButton.setBackgroundColor(isEnabled ? Color.parseColor("#FFA500") : Color.WHITE);
    }

    // 이메일 유효성 검사 함수
    private boolean isValidEmail(String email) {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    // 비밀번호 유효성 검사 함수
    private boolean isValidPassword(String password) {
        // 정규식: 대소문자 + 숫자 + 특수문자 + 8~15자
        String passwordPattern = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*?_]).{8,15}$";
        return password.matches(passwordPattern);
    }
}
