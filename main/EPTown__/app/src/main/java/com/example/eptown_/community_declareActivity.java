package com.example.eptown_;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class community_declareActivity extends AppCompatActivity {

    private View grayScreen;  // 회색 배경 View
    private Button cancelButton;
    private Button checkButton;
    private ImageView deleteBox;
    private TextView declare;
    private TextView coiceOne;
    private TextView coiceTwo;
    private TextView choiceThree;
    private TextView coiceFour;
    private ImageView checkedColor;  // 체크 상태 이미지
    private ImageView registerBox;  // 신고 후 보여질 박스
    private TextView register;      // "신고되었습니다" 메시지

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.community_declare); // 레이아웃 파일 이름이 activity_main으로 가정

        // XML에서 뷰들 참조
        grayScreen = findViewById(R.id.grayScreen);  // 회색 배경
        cancelButton = findViewById(R.id.cancel);
        checkButton = findViewById(R.id.check);
        deleteBox = findViewById(R.id.deleteBox);
        declare = findViewById(R.id.declare);
        coiceOne = findViewById(R.id.coiceOne);
        coiceTwo = findViewById(R.id.coiceTwo);
        choiceThree = findViewById(R.id.choiceThree);
        coiceFour = findViewById(R.id.coiceFour);
        checkedColor = findViewById(R.id.checkedColor);
        registerBox = findViewById(R.id.registerBox);
        register = findViewById(R.id.register);

        // 취소 버튼 클릭 시 화면을 회색으로 만들고 삭제 상자 및 버튼들 숨기기
        cancelButton.setOnClickListener(v -> {
            grayScreen.setVisibility(View.GONE);  // 회색 배경 숨기기
            hideDeleteBoxAndButtons();  // 삭제 상자와 버튼들 숨기기
        });

        // 초기 상태 설정: 체크된 상태로 숨김
        checkedColor.setVisibility(View.GONE);

        // 각 선택지 클릭 리스너 설정
        setChoiceClickListener(choiceThree);  // choiceThree에 클릭 리스너 설정
        setChoiceClickListener(coiceOne);     // coiceOne에 클릭 리스너 설정
        setChoiceClickListener(coiceTwo);     // coiceTwo에 클릭 리스너 설정
        setChoiceClickListener(coiceFour);    // coiceFour에 클릭 리스너 설정

        // 확인 버튼 클릭 시 동작
        checkButton.setOnClickListener(v -> {
            // 회색 배경 숨기기
            grayScreen.setVisibility(View.GONE);

            // 화면에서 사라지기
            hideDeleteBoxAndButtons(); // 삭제 상자 및 버튼들 숨기기

            // 신고되었습니다 창과 메시지 바로 보이게 하기
            registerBox.setVisibility(View.VISIBLE);
            register.setVisibility(View.VISIBLE);

            // 3초 후에 신고된 메시지와 박스 숨기기
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    registerBox.setVisibility(View.GONE); // 신고 박스 숨기기
                    register.setVisibility(View.GONE);    // "신고되었습니다" 메시지 숨기기
                }
            }, 3000); // 3초 지연
        });
    }

    // 선택지에 클릭 리스너를 설정하는 메서드
    private void setChoiceClickListener(TextView choice) {
        choice.setOnClickListener(v -> {
            // 상태가 'checked'이면 해제, 그렇지 않으면 체크 상태로 변경
            if (checkedColor.getVisibility() == View.GONE) {
                // 체크 상태로 변경
                choice.setTextColor(getResources().getColor(R.color.orange)); // 선택된 색상으로 변경
                checkedColor.setVisibility(View.VISIBLE); // 체크 이미지 보이게 설정
            } else {
                // 해제 상태로 변경
                choice.setTextColor(getResources().getColor(R.color.black)); // 원래 텍스트 색상으로 변경
                checkedColor.setVisibility(View.GONE); // 체크 이미지 숨기기
            }
        });
    }

    // 삭제 상자 및 버튼들 숨기는 메서드
    private void hideDeleteBoxAndButtons() {
        deleteBox.setVisibility(View.GONE);    // 삭제 상자 숨기기
        declare.setVisibility(View.GONE);      // 신고 텍스트 숨기기
        coiceOne.setVisibility(View.GONE);     // 선택지 1 숨기기
        coiceTwo.setVisibility(View.GONE);     // 선택지 2 숨기기
        choiceThree.setVisibility(View.GONE);  // 선택지 3 숨기기
        coiceFour.setVisibility(View.GONE);    // 선택지 4 숨기기
        checkButton.setVisibility(View.GONE);  // 확인 버튼 숨기기
        cancelButton.setVisibility(View.GONE);  // 취소 버튼 숨기기
    }
}
