package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReviewRegister extends AppCompatActivity {

    // 별을 위한 ImageButton 객체 선언
    private ImageButton starOne, starTwo, starThree, starFour, starFive;

    // 각 별의 상태를 추적할 변수
    private boolean isStarOneActive = true;
    private boolean isStarTwoActive = true;
    private boolean isStarThreeActive = true;
    private boolean isStarFourActive = true;
    private boolean isStarFiveActive = true;  // starFive의 상태 변수 추가

    // 사진 올리는 버튼과 사진 이미지 뷰 선언
    private ImageButton cameraButton;
    private ImageView imageCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.review_register);

        // 리뷰쓰기 눌렀을때 메인으로 이동
        TextView textview = findViewById(R.id.writtenReview);
        textview.setOnClickListener(view -> {
            Intent intent = new Intent(ReviewRegister.this, ReviewWrittenActivity.class);
            startActivity(intent);
        });

        // 등록하기 눌렀을때 review_6 이동
        Button button = findViewById(R.id.buyFixButton);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(ReviewRegister.this, ReviewAddActivity.class);
            startActivity(intent);
        });

        ImageButton btnBack = findViewById(R.id.btnCategoryFeed1Back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // onBackPressed() 메서드 호출
                onBackPressed();
            }
        });

        // 카메라 버튼과 이미지 뷰 초기화
        cameraButton = findViewById(R.id.camera);
        imageCat = findViewById(R.id.imageCat);

        // 카메라 버튼 클릭 시 ImageView 토글
        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imageCat.getVisibility() == View.GONE) {
                    imageCat.setVisibility(View.VISIBLE); // 이미지 보이기
                } else {
                    imageCat.setVisibility(View.GONE); // 이미지 숨기기
                }
            }
        });

        // EditText 필터 설정
        EditText contentInformationTwo = findViewById(R.id.contentInformationTwo);

        // 숫자 한 글자만 입력 가능하도록 필터 설정
        InputFilter inputFilter = new InputFilter() {
            @Override
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                try {
                    int input = Integer.parseInt(source.toString());
                    if (input >= 1 && input <= 5 && dest.length() == 0) {
                        return null; // 입력 허용 (한 글자만 허용)
                    }
                } catch (NumberFormatException e) {
                    // 숫자가 아닐 경우 처리
                }
                return ""; // 입력 차단
            }
        };

        // 글자 수 제한 필터 추가
        InputFilter lengthFilter = new InputFilter.LengthFilter(1);

        // 필터 적용
        contentInformationTwo.setFilters(new InputFilter[]{inputFilter, lengthFilter});
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed(); // 바로 이전 화면으로 이동
        finish(); // 현재 액티비티 종료
    }
}
