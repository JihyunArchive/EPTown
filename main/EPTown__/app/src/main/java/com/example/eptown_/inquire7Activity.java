package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class inquire7Activity extends AppCompatActivity {

    // 상태를 추적하는 boolean 변수
    private boolean isExpanded = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.inquire7);

        // 문의하기 텍스트 클릭시 inquire5로 화면 이동
        TextView textview = findViewById(R.id.writeReview);
        textview.setOnClickListener(view -> {
            Intent intent = new Intent(inquire7Activity.this, inquire5Activity.class);
            startActivity(intent);
        });

        // 필요한 뷰들을 찾음
        ImageButton inquirySeeMoreIconOne = findViewById(R.id.inquirySeeMoreIconOne);
        View inquirySeeMoreBarOne = findViewById(R.id.inquirySeeMoreBarOne);
        View inquirySeeMoreTextOne = findViewById(R.id.inquirySeeMoreTextOne);
        ImageButton inquirySeeMoreIconTwo = findViewById(R.id.inquirySeeMoreIconTwo);
        View inquirySeeMoreBarTwo = findViewById(R.id.inquirySeeMoreBarTwo);
        View inquirySeeMoreTextTwo = findViewById(R.id.inquirySeeMoreTextTwo);
        ImageButton inquirySeeMoreIconThree = findViewById(R.id.inquirySeeMoreIconThree);
        View inquirySeeMoreBarThree = findViewById(R.id.inquirySeeMoreBarThree);
        View inquirySeeMoreTextThree = findViewById(R.id.inquirySeeMoreTextThree);
        ImageButton inquirySeeMoreIconFour = findViewById(R.id.inquirySeeMoreIconFour);
        View inquirySeeMoreBarFour = findViewById(R.id.inquirySeeMoreBarFour);
        View inquirySeeMoreTextFour = findViewById(R.id.inquirySeeMoreTextFour);


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
            } else {
                // 확장 상태로 설정
                inquirySeeMoreIconOne.setImageResource(clickedIconResource);
                inquirySeeMoreBarOne.setVisibility(View.GONE);
                inquirySeeMoreTextOne.setVisibility(View.GONE);
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
                inquirySeeMoreTextTwo.setVisibility(View.VISIBLE);
            } else {
                // 확장 상태로 설정
                inquirySeeMoreIconTwo.setImageResource(clickedIconResource);
                inquirySeeMoreBarTwo.setVisibility(View.GONE);
                inquirySeeMoreTextTwo.setVisibility(View.GONE);
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
                inquirySeeMoreTextThree.setVisibility(View.VISIBLE);
            } else {
                // 확장 상태로 설정
                inquirySeeMoreIconThree.setImageResource(clickedIconResource);
                inquirySeeMoreBarThree.setVisibility(View.GONE);
                inquirySeeMoreTextThree.setVisibility(View.GONE);
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
                inquirySeeMoreTextFour.setVisibility(View.VISIBLE);
            } else {
                // 확장 상태로 설정
                inquirySeeMoreIconFour.setImageResource(clickedIconResource);
                inquirySeeMoreBarFour.setVisibility(View.GONE);
                inquirySeeMoreTextFour.setVisibility(View.GONE);
            }
            // 상태를 반전
            isExpanded = !isExpanded;
        });

        ImageButton btnBack = findViewById(R.id.btnCategoryFeed1Back);
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

