package com.example.eptown_;

import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class personal_informationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.personal_information);

        // EditText 뷰들을 찾음
        EditText zipCodeSpaces = findViewById(R.id.zipCodeSpaces);
        EditText addressSpaces = findViewById(R.id.addressSpaces);
        EditText addressDetailSpaces = findViewById(R.id.addressDetailSpaces);
        EditText phoneNumberSpaces = findViewById(R.id.phoneNumberSpaces);
        EditText birthdayDateSpaces = findViewById(R.id.birthdayDateSpaces);
        EditText genderSelectSpaces = findViewById(R.id.genderSelectSpaces);
        EditText verificationEnter = findViewById(R.id.verificationEnter);
        EditText zipCodeEnter = findViewById(R.id.zipCodeEnter);
        EditText addressEnter = findViewById(R.id.addressEnter);
        EditText detailAddressEnter = findViewById(R.id.detailAddressEnter);
        EditText birthdayEnter = findViewById(R.id.birthdayEnter);
        EditText genderEnter = findViewById(R.id.genderEnter);

        // 버튼들 찾음
        Button verificationTransmit = findViewById(R.id.verificationTransmit);
        Button verificationTransmitTwo = findViewById(R.id.verificationTransmitTwo);
        Button verificationEnterButton = findViewById(R.id.verificationEnterButton);
        Button verificationEnterButtonTwo = findViewById(R.id.verificationEnterButtonTwo);
        Button zipCodeButton = findViewById(R.id.zipCodeButton);
        Button zipCodeButtonTwo = findViewById(R.id.zipCodeButtonTwo);
        Button buyFixButton = findViewById(R.id.buyFixButton);

        // 회원정보 수정 완료 메시지 관련 뷰들
        ImageView registerBox = findViewById(R.id.registerBox);
        TextView register = findViewById(R.id.register);

        // genderSelectSpaces에 TextWatcher 추가
        genderSelectSpaces.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // 필요 시 구현
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    verificationTransmit.setVisibility(View.GONE);
                    verificationTransmitTwo.setVisibility(View.VISIBLE);
                } else {
                    verificationTransmit.setVisibility(View.VISIBLE);
                    verificationTransmitTwo.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                // 필요 시 구현
            }
        });

        // verificationEnter에 TextWatcher 추가
        verificationEnter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // 필요 시 구현
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    verificationEnterButton.setVisibility(View.GONE);
                    verificationEnterButtonTwo.setVisibility(View.VISIBLE);
                } else {
                    verificationEnterButton.setVisibility(View.VISIBLE);
                    verificationEnterButtonTwo.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                // 필요 시 구현
            }
        });

        // zipCodeEnter에 TextWatcher 추가
        zipCodeEnter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // 필요 시 구현
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    zipCodeButton.setVisibility(View.GONE);
                    zipCodeButtonTwo.setVisibility(View.VISIBLE);
                } else {
                    zipCodeButton.setVisibility(View.VISIBLE);
                    zipCodeButtonTwo.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                // 필요 시 구현
            }
        });

        // buyFixButton 클릭 시 메시지 표시
        buyFixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // registerBox와 register를 표시
                registerBox.setVisibility(View.VISIBLE);
                register.setVisibility(View.VISIBLE);

                // 3초 후에 메시지 숨기기
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        registerBox.setVisibility(View.GONE);
                        register.setVisibility(View.GONE);
                    }
                }, 3000); // 3000 밀리초 = 3초
            }
        });
    }
}
