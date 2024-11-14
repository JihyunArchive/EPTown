package com.example.eptown_;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.LinearLayout;  // LinearLayout을 사용하여 레이아웃을 감쌀 수 있습니다.

import androidx.appcompat.app.AppCompatActivity;

public class review5Activity extends AppCompatActivity {

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

    // 기존 레이아웃을 감싸는 ScrollView 선언
    private ScrollView scrollView;
    private LinearLayout mainLayout;  // 기존 레이아웃

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.review5);

        // 각 ImageButton 객체를 찾기
        starOne = findViewById(R.id.starOne);
        starTwo = findViewById(R.id.starTwo);
        starThree = findViewById(R.id.starThree);
        starFour = findViewById(R.id.starFour);
        starFive = findViewById(R.id.starFive);  // starFive 찾기

        // 각 별에 클릭 리스너 설정
        setStarClickListener(starOne, 1);
        setStarClickListener(starTwo, 2);
        setStarClickListener(starThree, 3);
        setStarClickListener(starFour, 4);
        setStarClickListener(starFive, 5);  // starFive에 리스너 추가

        // 사진 올리는 버튼과 이미지 뷰 객체 초기화
        cameraButton = findViewById(R.id.camera);  // cameraButton 초기화
        imageCat = findViewById(R.id.imageCat);  // imageCat 초기화

        // ScrollView와 기존 레이아웃 초기화
        scrollView = findViewById(R.id.scrollView);  // ScrollView 객체 초기화
        mainLayout = findViewById(R.id.main);  // 기존 레이아웃 초기화

        // 사진 올리는 버튼에 클릭 리스너 설정
        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 기존 화면 숨기고 ScrollView 보이기
                mainLayout.setVisibility(View.GONE);  // 기존 레이아웃 숨기기
                scrollView.setVisibility(View.VISIBLE); // ScrollView 보이기
            }
        });
    }

    // 별 클릭 시 아이콘을 바꾸는 메서드
    private void setStarClickListener(ImageButton star, int starIndex) {
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 클릭된 별의 상태를 확인하고 이미지 변경
                switch (starIndex) {
                    case 1:
                        if (isStarOneActive) {
                            star.setImageResource(R.drawable.ic_star_no); // 비활성화된 별
                        } else {
                            star.setImageResource(R.drawable.ic_star_color); // 활성화된 별
                        }
                        isStarOneActive = !isStarOneActive; // 상태 반전
                        break;
                    case 2:
                        if (isStarTwoActive) {
                            star.setImageResource(R.drawable.ic_star_no);
                        } else {
                            star.setImageResource(R.drawable.ic_star_color);
                        }
                        isStarTwoActive = !isStarTwoActive;
                        break;
                    case 3:
                        if (isStarThreeActive) {
                            star.setImageResource(R.drawable.ic_star_no);
                        } else {
                            star.setImageResource(R.drawable.ic_star_color);
                        }
                        isStarThreeActive = !isStarThreeActive;
                        break;
                    case 4:
                        if (isStarFourActive) {
                            star.setImageResource(R.drawable.ic_star_no);
                        } else {
                            star.setImageResource(R.drawable.ic_star_color);
                        }
                        isStarFourActive = !isStarFourActive;
                        break;
                    case 5:  // starFive 처리
                        if (isStarFiveActive) {
                            star.setImageResource(R.drawable.ic_star_no);
                        } else {
                            star.setImageResource(R.drawable.ic_star_color);
                        }
                        isStarFiveActive = !isStarFiveActive;  // 상태 반전
                        break;
                }
            }
        });
    }
}
