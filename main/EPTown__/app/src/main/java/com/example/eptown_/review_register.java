package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.LinearLayout;  // LinearLayout을 사용하여 레이아웃을 감쌀 수 있습니다.
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class review_register extends AppCompatActivity {

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

        // 뒤로가기 눌렀을때 메인으로 이동
        ImageButton imagebutton = findViewById(R.id.btnCategoryFeed1Back);
        imagebutton.setOnClickListener(view -> {
            Intent intent = new Intent(review_register.this, review_writtenActivity.class);
            startActivity(intent);
        });

        // 리뷰쓰기 눌렀을때 메인으로 이동
        TextView textview = findViewById(R.id.writtenReview);
        textview.setOnClickListener(view -> {
            Intent intent = new Intent(review_register.this, review_writtenActivity.class);
            startActivity(intent);
        });

        // 등록하기 눌렀을때 review_6 이동
        Button button = findViewById(R.id.buyFixButton);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(review_register.this, review_addActivity.class);
            startActivity(intent);
        });

        EditText contentInformation = findViewById(R.id.contentInformation);

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

        // 카메라 버튼 클릭 리스너 설정
        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 이미지 뷰의 visibility 속성을 변경하여 표시
                if (imageCat.getVisibility() == View.GONE) {
                    imageCat.setVisibility(View.VISIBLE); // 이미지 보이게 설정
                } else {
                    imageCat.setVisibility(View.GONE); // 다시 클릭하면 숨기기
                }
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
