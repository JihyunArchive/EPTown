package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class user_noticeActivity extends AppCompatActivity {

    // 상태를 추적하는 boolean 변수
    private boolean isExpanded = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.user_notice);

        // 뒤로가기 클릭시 마이페이지로 화면 이동
        ImageButton imagebutton = findViewById(R.id.btnCategoryFeed1Back);
        imagebutton.setOnClickListener(view -> {
            Intent intent = new Intent(user_noticeActivity.this, MyPageActivity.class);
            startActivity(intent);
        });

        // 필요한 뷰들을 찾음
        ImageButton inquirySeeMoreIconOne = findViewById(R.id.inquirySeeMoreIconOne);
        View inquirySeeMoreBarOne = findViewById(R.id.inquirySeeMoreBarOne);
        View inquirySeeMoreTextOne = findViewById(R.id.inquirySeeMoreTextOne);
        View inquirySeeMoreTextTwo = findViewById(R.id.inquirySeeMoreTextTwo);
        ImageButton inquirySeeMoreIconTwo = findViewById(R.id.inquirySeeMoreIconTwo);
        View inquirySeeMoreBarTwo = findViewById(R.id.inquirySeeMoreBarTwo);
        View inquirySeeMoreTextThree = findViewById(R.id.inquirySeeMoreTextThree);
        View inquirySeeMoreTextFour = findViewById(R.id.inquirySeeMoreTextFour);
        ImageButton inquirySeeMoreIconThree = findViewById(R.id.inquirySeeMoreIconThree);
        View inquirySeeMoreBarThree = findViewById(R.id.inquirySeeMoreBarThree);
        View inquirySeeMoreTextFive = findViewById(R.id.inquirySeeMoreTextFive);
        View inquirySeeMoreTextSix = findViewById(R.id.inquirySeeMoreTextSix);
        ImageButton inquirySeeMoreIconFour = findViewById(R.id.inquirySeeMoreIconFour);
        View inquirySeeMoreBarFour = findViewById(R.id.inquirySeeMoreBarFour);
        View inquirySeeMoreTextSeven = findViewById(R.id.inquirySeeMoreTextSeven);
        View inquirySeeMoreTextEight = findViewById(R.id.inquirySeeMoreTextEight);
        ImageButton inquirySeeMoreIconFive = findViewById(R.id.inquirySeeMoreIconFive);
        View inquirySeeMoreBarFive = findViewById(R.id.inquirySeeMoreBarFive);
        View inquirySeeMoreTextNine = findViewById(R.id.inquirySeeMoreTextNine);
        View inquirySeeMoreTextTen = findViewById(R.id.inquirySeeMoreTextTen);
        ImageButton inquirySeeMoreIconSix = findViewById(R.id.inquirySeeMoreIconSix);
        View inquirySeeMoreBarSix = findViewById(R.id.inquirySeeMoreBarSix);
        View inquirySeeMoreTextEleven = findViewById(R.id.inquirySeeMoreTextEleven);
        View inquirySeeMoreTextTwelve = findViewById(R.id.inquirySeeMoreTextTwelve);



        // 기본 및 클릭 시 변경할 아이콘 리소스
        int defaultIconResource = R.drawable.ic_inquiry_top_arrow;
        int clickedIconResource = R.drawable.ic_inquiry_under_arrow;

        // inquirySeeMoreIconOne 클릭 리스너 추가
        inquirySeeMoreIconOne.setOnClickListener(v -> {
            if (isExpanded) {
                // 원상복귀 상태로 설정
                inquirySeeMoreIconOne.setImageResource(defaultIconResource);
                inquirySeeMoreBarOne.setVisibility(View.VISIBLE);
                inquirySeeMoreTextOne.setVisibility(View.VISIBLE);
                inquirySeeMoreTextTwo.setVisibility(View.VISIBLE);
            } else {
                // 확장 상태로 설정
                inquirySeeMoreIconOne.setImageResource(clickedIconResource);
                inquirySeeMoreBarOne.setVisibility(View.GONE);
                inquirySeeMoreTextOne.setVisibility(View.GONE);
                inquirySeeMoreTextTwo.setVisibility(View.GONE);
            }
            // 상태를 반전
            isExpanded = !isExpanded;
        });

        // inquirySeeMoreIconTwo 클릭 리스너 추가
        inquirySeeMoreIconTwo.setOnClickListener(v -> {
            if (isExpanded) {
                // 원상복귀 상태로 설정
                inquirySeeMoreIconTwo.setImageResource(defaultIconResource);
                inquirySeeMoreBarTwo.setVisibility(View.VISIBLE);
                inquirySeeMoreTextThree.setVisibility(View.VISIBLE);
                inquirySeeMoreTextFour.setVisibility(View.VISIBLE);
            } else {
                // 확장 상태로 설정
                inquirySeeMoreIconTwo.setImageResource(clickedIconResource);
                inquirySeeMoreBarTwo.setVisibility(View.GONE);
                inquirySeeMoreTextThree.setVisibility(View.GONE);
                inquirySeeMoreTextFour.setVisibility(View.GONE);
            }
            // 상태를 반전
            isExpanded = !isExpanded;
        });

        // inquirySeeMoreIconThree 클릭 리스너 추가
        inquirySeeMoreIconThree.setOnClickListener(v -> {
            if (isExpanded) {
                // 원상복귀 상태로 설정
                inquirySeeMoreIconThree.setImageResource(defaultIconResource);
                inquirySeeMoreBarThree.setVisibility(View.VISIBLE);
                inquirySeeMoreTextFive.setVisibility(View.VISIBLE);
                inquirySeeMoreTextSix.setVisibility(View.VISIBLE);
            } else {
                // 확장 상태로 설정
                inquirySeeMoreIconThree.setImageResource(clickedIconResource);
                inquirySeeMoreBarThree.setVisibility(View.GONE);
                inquirySeeMoreTextFive.setVisibility(View.GONE);
                inquirySeeMoreTextSix.setVisibility(View.GONE);
            }
            // 상태를 반전
            isExpanded = !isExpanded;
        });

        // inquirySeeMoreIconFour 클릭 리스너 추가
        inquirySeeMoreIconFour.setOnClickListener(v -> {
            if (isExpanded) {
                // 원상복귀 상태로 설정
                inquirySeeMoreIconFour.setImageResource(defaultIconResource);
                inquirySeeMoreBarFour.setVisibility(View.VISIBLE);
                inquirySeeMoreTextSeven.setVisibility(View.VISIBLE);
                inquirySeeMoreTextEight.setVisibility(View.VISIBLE);
            } else {
                // 확장 상태로 설정
                inquirySeeMoreIconFour.setImageResource(clickedIconResource);
                inquirySeeMoreBarFour.setVisibility(View.GONE);
                inquirySeeMoreTextSeven.setVisibility(View.GONE);
                inquirySeeMoreTextEight.setVisibility(View.GONE);
            }
            // 상태를 반전
            isExpanded = !isExpanded;
        });

        // inquirySeeMoreIconFive 클릭 리스너 추가
        inquirySeeMoreIconFive.setOnClickListener(v -> {
            if (isExpanded) {
                // 원상복귀 상태로 설정
                inquirySeeMoreIconFive.setImageResource(defaultIconResource);
                inquirySeeMoreBarFive.setVisibility(View.VISIBLE);
                inquirySeeMoreTextNine.setVisibility(View.VISIBLE);
                inquirySeeMoreTextTen.setVisibility(View.VISIBLE);
            } else {
                // 확장 상태로 설정
                inquirySeeMoreIconFive.setImageResource(clickedIconResource);
                inquirySeeMoreBarFive.setVisibility(View.GONE);
                inquirySeeMoreTextNine.setVisibility(View.GONE);
                inquirySeeMoreTextTen.setVisibility(View.GONE);
            }
            // 상태를 반전
            isExpanded = !isExpanded;
        });

        // inquirySeeMoreIconSix 클릭 리스너 추가
        inquirySeeMoreIconSix.setOnClickListener(v -> {
            if (isExpanded) {
                // 원상복귀 상태로 설정
                inquirySeeMoreIconSix.setImageResource(defaultIconResource);
                inquirySeeMoreBarSix.setVisibility(View.VISIBLE);
                inquirySeeMoreTextEleven.setVisibility(View.VISIBLE);
                inquirySeeMoreTextTwelve.setVisibility(View.VISIBLE);
            } else {
                // 확장 상태로 설정
                inquirySeeMoreIconSix.setImageResource(clickedIconResource);
                inquirySeeMoreBarSix.setVisibility(View.GONE);
                inquirySeeMoreTextEleven.setVisibility(View.GONE);
                inquirySeeMoreTextTwelve.setVisibility(View.GONE);
            }
            // 상태를 반전
            isExpanded = !isExpanded;
        });
    }
}

