package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class login3Activity extends AppCompatActivity {

    private boolean isGenderBoxVisible = false; // 성별 선택 박스의 가시성 상태

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this); // 시스템 바에 맞춰 화면 가장자리가 잘 보이도록 설정
        setContentView(R.layout.login3); // layout 파일 설정

        // 뒤로가기 눌렀을때 메인으로 화면 이동
        ImageButton imagebutton = findViewById(R.id.btnLoginBack);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login3Activity.this, login1Activity.class);
                startActivity(intent);
            }
        });

        // 회원가입 버튼 눌렀을때 로그인으로 화면 이동
        Button button = findViewById(R.id.btnJoin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login3Activity.this, Login.class);
                startActivity(intent);
            }
        });

        // ImageButton 참조
        ImageButton underArrow = findViewById(R.id.underArrow);

        // 성별 선택 박스 및 텍스트 참조
        View rectBox = findViewById(R.id.rectBox);
        TextView genderChoiceOne = findViewById(R.id.genderChoiceOne);
        View rectBoxTwo = findViewById(R.id.rectBoxTwo);
        TextView genderChoiceTwo = findViewById(R.id.genderChoiceTwo);
        TextView genderSelectInput = findViewById(R.id.genderSelectInput);

        // ImageButton 클릭 리스너
        underArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isGenderBoxVisible) {
                    // 성별 선택 박스 숨기기
                    rectBox.setVisibility(View.GONE);
                    genderChoiceOne.setVisibility(View.GONE);
                    rectBoxTwo.setVisibility(View.GONE);
                    genderChoiceTwo.setVisibility(View.GONE);
                    // 아이콘 변경 (위로 화살표 → 아래로 화살표)
                    underArrow.setImageResource(R.drawable.ic_inquiry_under_arrow);
                } else {
                    // 성별 선택 박스 표시
                    rectBox.setVisibility(View.VISIBLE);
                    genderChoiceOne.setVisibility(View.VISIBLE);
                    rectBoxTwo.setVisibility(View.VISIBLE);
                    genderChoiceTwo.setVisibility(View.VISIBLE);
                    // 아이콘 변경 (아래로 화살표 → 위로 화살표)
                    underArrow.setImageResource(R.drawable.ic_up_arrow);
                }
                // 가시성 상태 반전
                isGenderBoxVisible = !isGenderBoxVisible;
            }
        });

        // 여성 선택 클릭 리스너
        genderChoiceOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                genderSelectInput.setText("여성");
                hideGenderSelection(rectBox, genderChoiceOne, rectBoxTwo, genderChoiceTwo, underArrow);
            }
        });

        // 여성 선택 박스 (rectBox) 클릭 리스너 수정
        rectBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // rectBoxTwo의 특정 속성을 사용하여 텍스트를 설정
                String textFromView = rectBox.getContentDescription().toString(); // 예: ContentDescription 사용
                genderSelectInput.setText(textFromView);

                // 성별 선택 박스 숨기기
                hideGenderSelection(rectBox, genderChoiceOne, rectBoxTwo, genderChoiceTwo, underArrow);
            }
        });

        // 남성 선택 클릭 리스너
        genderChoiceTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                genderSelectInput.setText("남성");
                hideGenderSelection(rectBox, genderChoiceOne, rectBoxTwo, genderChoiceTwo, underArrow);
            }
        });

        // 남성 선택 박스 (rectBox) 클릭 리스너 수정
        rectBoxTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // rectBoxTwo의 특정 속성을 사용하여 텍스트를 설정
                String textFromView = rectBoxTwo.getContentDescription().toString(); // 예: ContentDescription 사용
                genderSelectInput.setText(textFromView);

                // 성별 선택 박스 숨기기
                hideGenderSelection(rectBox, genderChoiceOne, rectBoxTwo, genderChoiceTwo, underArrow);
            }
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
