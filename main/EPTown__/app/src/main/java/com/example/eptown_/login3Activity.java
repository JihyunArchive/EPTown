package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class login3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);  // 시스템 바에 맞춰 화면 가장자리가 잘 보이도록 설정
        setContentView(R.layout.login3);  // layout 파일 설정

        Button button = (Button) findViewById(R.id.btnJoin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login3Activity.this, Login.class);
                startActivity(intent);
            }
        });

        // 우편번호 입력란과 버튼 참조
        EditText zipCodeInput = findViewById(R.id.zipCodeInput);
        Button verificationTransmit = findViewById(R.id.verificationTransmit);  // 기본 우편번호 찾기 버튼
        Button verificationTransmitTwo = findViewById(R.id.verificationTransmitTwo);  // 활성화된 우편번호 찾기 버튼

        // zipCodeSpaces 입력란에 텍스트가 변경될 때마다 버튼의 가시성 변경
        zipCodeInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    // 텍스트가 있으면 기본 버튼 숨기고, 활성화된 버튼 보이기
                    verificationTransmit.setVisibility(Button.GONE);
                    verificationTransmitTwo.setVisibility(Button.VISIBLE);
                } else {
                    // 텍스트가 없으면 기본 버튼 보이게 하고, 활성화된 버튼 숨기기
                    verificationTransmit.setVisibility(Button.VISIBLE);
                    verificationTransmitTwo.setVisibility(Button.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

        // 성별 입력란과 회원가입 버튼 참조
        EditText genderSelectInput = findViewById(R.id.genderSelectInput);
        Button btnJoin = findViewById(R.id.btnJoin);  // 기본 회원가입 버튼

        // 나머지 EditText 글씨만 표시
        EditText addressInput = findViewById(R.id.addressInput);
        EditText addressDetailInput = findViewById(R.id.addressDetailInput);
        EditText phoneNumberInput = findViewById(R.id.phoneNumberInput);
        EditText birthdayDateInput = findViewById(R.id.birthdayDateInput);
    }
}
