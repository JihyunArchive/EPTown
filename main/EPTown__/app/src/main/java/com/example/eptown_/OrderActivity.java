package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);

        // 적용하려는 쿠폰 선택했을때 couponChoice로 화면 이동
        ImageButton imagebutton = findViewById(R.id.rightArrowTwo);
        imagebutton.setOnClickListener(view -> {
            Intent intent = new Intent(OrderActivity.this, CouponChoiceActivity.class);
            startActivity(intent);
        });

        // 적용하기 텍스트 선택했을때 couponChoice로 화면 이동
        TextView textview = findViewById(R.id.apply);
        textview.setOnClickListener(view -> {
            Intent intent = new Intent(OrderActivity.this, CouponChoiceActivity.class);
            startActivity(intent);
        });

        // 구매하기 눌렀을때 order_pay5로 화면 이동
        Button button = (Button) findViewById(R.id.buyFixButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OrderActivity.this, PayCompleteActivity.class);
                startActivity(intent);
            }
        });

        // 사용자 입력 필드 참조
        EditText userName = findViewById(R.id.userName);
        EditText userEmail = findViewById(R.id.userEmail);
        EditText userNumber = findViewById(R.id.userNumber);
        EditText request = findViewById(R.id.request);

        // Circle 버튼 및 체크 이미지 버튼 참조
        ImageButton circleOne = findViewById(R.id.circleOne);
        ImageButton circleTwo = findViewById(R.id.circleTwo);
        ImageButton circleThree = findViewById(R.id.circleThree);

        ImageButton checkOne = findViewById(R.id.checkOne);
        ImageButton checkTwo = findViewById(R.id.checkTwo);
        ImageButton checkThree = findViewById(R.id.checkThree);

        // 뒤로가기 버튼, 회색 배경 및 삭제 상자 참조
        ImageButton btnOrderPayBack = findViewById(R.id.btnOrderPayBack);
        View grayScreen = findViewById(R.id.grayScreen);
        ImageView deleteBox = findViewById(R.id.deleteBox);
        TextView deleteText = findViewById(R.id.deleteText);

        // 상태 변수 설정
        boolean[] isCircleOneChecked = {false};
        boolean[] isCircleTwoChecked = {false};
        boolean[] isCircleThreeChecked = {false};

        // Circle 버튼 클릭 이벤트
        circleOne.setOnClickListener(view -> toggleCircleState(circleOne, isCircleOneChecked, R.drawable.ic_circle, R.drawable.ic_order_pay_circle_check));
        circleTwo.setOnClickListener(view -> toggleCircleState(circleTwo, isCircleTwoChecked, R.drawable.ic_circle, R.drawable.ic_order_pay_circle_check));

        circleThree.setOnClickListener(view -> {
            if (isCircleThreeChecked[0]) {
                circleThree.setImageResource(R.drawable.ic_circle); // 원래 이미지
                checkOne.setImageResource(R.drawable.ic_check); // 원래 이미지
                checkTwo.setImageResource(R.drawable.ic_check);
                checkThree.setImageResource(R.drawable.ic_check);
            } else {
                circleThree.setImageResource(R.drawable.ic_checked_circle); // 체크 이미지
                checkOne.setImageResource(R.drawable.ic_community_check_color);
                checkTwo.setImageResource(R.drawable.ic_community_check_color);
                checkThree.setImageResource(R.drawable.ic_community_check_color);
            }
            isCircleThreeChecked[0] = !isCircleThreeChecked[0];
        });

        // 뒤로가기 버튼 클릭 이벤트
        btnOrderPayBack.setOnClickListener(view -> {
            grayScreen.setVisibility(View.VISIBLE);
            grayScreen.setClickable(true); // 터치 이벤트 차단
            deleteBox.setVisibility(View.VISIBLE);
            deleteText.setVisibility(View.VISIBLE);

            // 3초 후 숨기고 MainActivity로 이동
            new Handler().postDelayed(() -> {
                grayScreen.setVisibility(View.GONE);
                grayScreen.setClickable(false); // 클릭 이벤트 차단 해제
                deleteBox.setVisibility(View.GONE);
                deleteText.setVisibility(View.GONE);

                // MainActivity로 화면 이동
                Intent intent = new Intent(OrderActivity.this, ItemDetails.class);
                startActivity(intent);
                finish(); // 현재 액티비티 종료 (선택적)
            }, 3000);
        });

        // 구매하기 버튼 참조
        View purchaseButton = findViewById(R.id.buyFixButton); // 구매하기 버튼 참조

        // underArrow 버튼 및 관련 요소 참조
        ImageButton underArrow = findViewById(R.id.underArrow);
        View rectBoxFive = findViewById(R.id.rectBoxFive);
        EditText requestChoice = findViewById(R.id.requestChoice);
        View thirdHorizon = findViewById(R.id.thirdHorizon);
        TextView sale = findViewById(R.id.sale);
        TextView coupon = findViewById(R.id.coupon);
        TextView apply = findViewById(R.id.apply);
        ImageButton rightArrowTwo = findViewById(R.id.rightArrowTwo);

        // underArrow 클릭 이벤트 리스너 설정
        underArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 현재 이미지가 ic_under_arrow인 경우
                if (underArrow.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.ic_under_arrow).getConstantState()) {
                    underArrow.setImageResource(R.drawable.ic_up_arrow); // ic_up_arrow로 변경
                } else {
                    underArrow.setImageResource(R.drawable.ic_under_arrow); // ic_under_arrow로 변경
                }
            }
        });

        // underArrow 버튼 클릭 이벤트
        underArrow.setOnClickListener(view -> {
            // View의 visibility 상태에 따라 레이아웃을 보여주거나 숨김
            if (rectBoxFive.getVisibility() == View.GONE) {
                rectBoxFive.setVisibility(View.VISIBLE);
                requestChoice.setVisibility(View.VISIBLE);
                moveLayoutDown(thirdHorizon, 57); // 기존 57px 이동
                moveLayoutDown(sale, 14); // sale TextView 10px 아래로 이동
                moveLayoutDown(coupon, 14); // coupon TextView 10px 아래로 이동
                moveLayoutDown(apply, 14); // apply TextView 10px 아래로 이동
                moveLayoutDown(rightArrowTwo, 14); // rightArrowTwo ImageButton 10px 아래로 이동
            } else {
                rectBoxFive.setVisibility(View.GONE);
                requestChoice.setVisibility(View.GONE);
                moveLayoutDown(thirdHorizon, -57); // 기존 57px 복원
                moveLayoutDown(sale, -14); // sale TextView 10px 복원
                moveLayoutDown(coupon, -14); // coupon TextView 10px 복원
                moveLayoutDown(apply, -14); // apply TextView 10px 복원
                moveLayoutDown(rightArrowTwo, -14); // rightArrowTwo ImageButton 10px 복원
            }
        });
    }

    /**
     * Circle 버튼의 상태를 토글하는 메서드
     */
    private void toggleCircleState(ImageButton button, boolean[] state, int defaultRes, int checkedRes) {
        if (state[0]) {
            button.setImageResource(defaultRes); // 원래 이미지
        } else {
            button.setImageResource(checkedRes); // 체크된 이미지
        }
        state[0] = !state[0];
    }

    /**
     * 레이아웃을 아래로 이동시키는 메서드
     */
    private void moveLayoutDown(View view, int offset) {
        ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        params.topMargin += offset;
        view.setLayoutParams(params);
    }
}