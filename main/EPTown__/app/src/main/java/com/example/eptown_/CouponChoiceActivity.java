package com.example.eptown_;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class CouponChoiceActivity extends AppCompatActivity {

    // ImageButton 및 TextView 선언
    private ImageButton unchecked, checked;
    private TextView couponDiscountTwo, couponDiscountOne;

    // 상태를 나타내는 변수
    private boolean isUncheckedChecked = false; // unchecked 버튼 상태
    private boolean isCheckedChecked = false;  // checked 버튼 상태

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.coupon_choice);

        // XML에서 뷰 초기화
        unchecked = findViewById(R.id.unchecked);
        checked = findViewById(R.id.checked);
        couponDiscountTwo = findViewById(R.id.couponDiscountTwo);
        couponDiscountOne = findViewById(R.id.couponDiscountOne);

        // unchecked 버튼 클릭 리스너 설정
        unchecked.setOnClickListener(v -> {
            if (isUncheckedChecked) {
                // 체크된 상태 -> 체크 해제 상태로 변경
                unchecked.setImageResource(R.drawable.ic_uncolor_rect);
                couponDiscountTwo.setTextColor(Color.parseColor("#CCCCCC"));
            } else {
                // 체크 해제 상태 -> 체크된 상태로 변경
                unchecked.setImageResource(R.drawable.ic_checked_circle);
                couponDiscountTwo.setTextColor(Color.parseColor("#FFA500")); // orange
            }
            // 상태 반전
            isUncheckedChecked = !isUncheckedChecked;
        });

        // checked 버튼 클릭 리스너 설정
        checked.setOnClickListener(v -> {
            if (isCheckedChecked) {
                // 체크된 상태 -> 체크 해제 상태로 변경
                checked.setImageResource(R.drawable.ic_uncolor_rect);
                couponDiscountOne.setTextColor(Color.parseColor("#CCCCCC"));
            } else {
                // 체크 해제 상태 -> 체크된 상태로 변경
                checked.setImageResource(R.drawable.ic_checked_circle);
                couponDiscountOne.setTextColor(Color.parseColor("#FFA500")); // orange
            }
            // 상태 반전
            isCheckedChecked = !isCheckedChecked;
        });

        // 뒤로가기 버튼 (btnCategoryFeed1Back)
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
    public void onBackPressed () {
        super.onBackPressed(); // 바로 이전 화면으로 이동
        finish(); // 현재 액티비티 종료
    }
}
