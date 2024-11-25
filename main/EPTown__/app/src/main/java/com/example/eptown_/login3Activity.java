package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class login3Activity extends AppCompatActivity {

    private boolean isGenderBoxVisible = false; // 성별 선택 박스의 가시성 상태

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login3); // layout 파일 설정

        // UI 요소 참조
        EditText zipCodeInput = findViewById(R.id.zipCodeInput);
        Button verificationTransmit = findViewById(R.id.verificationTransmit);
        Button verificationTransmitTwo = findViewById(R.id.verificationTransmitTwo);
        EditText addressInput = findViewById(R.id.addressInput);
        EditText addressDetailInput = findViewById(R.id.addressDetailInput);
        EditText phoneNumberInput = findViewById(R.id.phoneNumberInput);
        EditText birthdayDateInput = findViewById(R.id.birthdayDateInput);

        // 우편번호 입력 감지
        zipCodeInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().trim().length() > 0) {
                    verificationTransmit.setVisibility(View.GONE);
                    verificationTransmitTwo.setVisibility(View.VISIBLE);
                } else {
                    verificationTransmit.setVisibility(View.VISIBLE);
                    verificationTransmitTwo.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

        // 뒤로가기 버튼
        ImageButton imageButton = findViewById(R.id.btnLoginBack);
        imageButton.setOnClickListener(view -> {
            Intent intent = new Intent(login3Activity.this, login1Activity.class);
            startActivity(intent);
        });

        // 회원가입 버튼
        Button joinButton = findViewById(R.id.btnJoin);
        joinButton.setOnClickListener(view -> {
            Intent intent = new Intent(login3Activity.this, Login.class);
            startActivity(intent);
        });

        // 성별 선택 박스 관련 UI 참조
        ImageButton underArrow = findViewById(R.id.underArrow);
        View rectBox = findViewById(R.id.rectBox);
        TextView genderChoiceOne = findViewById(R.id.genderChoiceOne);
        View rectBoxTwo = findViewById(R.id.rectBoxTwo);
        TextView genderChoiceTwo = findViewById(R.id.genderChoiceTwo);
        TextView genderSelectInput = findViewById(R.id.genderSelectInput);

        // 성별 선택 박스 토글
        underArrow.setOnClickListener(view -> {
            if (isGenderBoxVisible) {
                hideGenderSelection(rectBox, genderChoiceOne, rectBoxTwo, genderChoiceTwo, underArrow);
            } else {
                rectBox.setVisibility(View.VISIBLE);
                genderChoiceOne.setVisibility(View.VISIBLE);
                rectBoxTwo.setVisibility(View.VISIBLE);
                genderChoiceTwo.setVisibility(View.VISIBLE);
                underArrow.setImageResource(R.drawable.ic_up_arrow);
                isGenderBoxVisible = true;
            }
        });

        // 성별 선택 항목 클릭 리스너
        genderChoiceOne.setOnClickListener(view -> {
            genderSelectInput.setText("여성");
            hideGenderSelection(rectBox, genderChoiceOne, rectBoxTwo, genderChoiceTwo, underArrow);
        });

        rectBox.setOnClickListener(view -> {
            String textFromView = rectBox.getContentDescription().toString();
            genderSelectInput.setText(textFromView);
            hideGenderSelection(rectBox, genderChoiceOne, rectBoxTwo, genderChoiceTwo, underArrow);
        });

        genderChoiceTwo.setOnClickListener(view -> {
            genderSelectInput.setText("남성");
            hideGenderSelection(rectBox, genderChoiceOne, rectBoxTwo, genderChoiceTwo, underArrow);
        });

        rectBoxTwo.setOnClickListener(view -> {
            String textFromView = rectBoxTwo.getContentDescription().toString();
            genderSelectInput.setText(textFromView);
            hideGenderSelection(rectBox, genderChoiceOne, rectBoxTwo, genderChoiceTwo, underArrow);
        });
    }

    // 성별 선택 박스 숨기기 함수
    private void hideGenderSelection(View rectBox, TextView genderChoiceOne, View rectBoxTwo, TextView genderChoiceTwo, ImageButton underArrow) {
        rectBox.setVisibility(View.GONE);
        genderChoiceOne.setVisibility(View.GONE);
        rectBoxTwo.setVisibility(View.GONE);
        genderChoiceTwo.setVisibility(View.GONE);
        underArrow.setImageResource(R.drawable.ic_inquiry_under_arrow);
        isGenderBoxVisible = false;
    }
}
