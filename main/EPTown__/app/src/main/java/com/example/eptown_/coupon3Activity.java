package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Gravity;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class coupon3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coupon3);

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
    public void onBackPressed() {
        super.onBackPressed(); // 바로 이전 화면으로 이동
        finish(); // 현재 액티비티 종료


        // 버튼 참조
        Button buyFixButton = findViewById(R.id.buyFixButton);
        Button receiveCouponOne = findViewById(R.id.receiveCouponOne);
        Button receiveComplete = findViewById(R.id.receiveComplete);
        Button receiveCouponTwo = findViewById(R.id.receiveCouponTwo);
        Button receiveCompleteTwo = findViewById(R.id.receiveCompleteTwo);

        // buyFixButton 클릭 시 receiveCouponOne, receiveCouponTwo 숨기고 receiveComplete, receiveCompleteTwo 보이게 설정
        buyFixButton.setOnClickListener(v -> {
            receiveCouponOne.setVisibility(View.GONE);
            receiveComplete.setVisibility(View.VISIBLE);
            receiveCouponTwo.setVisibility(View.GONE);
            receiveCompleteTwo.setVisibility(View.VISIBLE);
            showCustomToast("쿠폰을 받았어요.");

        });

        // receiveCouponOne 클릭 시 receiveComplete 버튼 보이기 및 커스텀 Toast 표시
        receiveCouponOne.setOnClickListener(v -> {
            receiveCouponOne.setVisibility(View.GONE);
            receiveComplete.setVisibility(View.VISIBLE);
            showCustomToast("쿠폰을 받았어요.");
        });

        // receiveCouponTwo 클릭 시 receiveCompleteTwo 버튼 보이기 및 커스텀 Toast 표시
        receiveCouponTwo.setOnClickListener(v -> {
            receiveCouponTwo.setVisibility(View.GONE);
            receiveCompleteTwo.setVisibility(View.VISIBLE);
            showCustomToast("쿠폰을 받았어요.");
        });
    }

    private void showCustomToast(String message) {
        // LayoutInflater를 통해 커스텀 뷰를 로드
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast, findViewById(R.id.custom_toast_layout));

        // TextView에 메시지 설정
        TextView textView = layout.findViewById(R.id.custom_toast_message);
        textView.setText(message);

        // Toast 생성 및 설정
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        // 화면 하단에서 87dp 위로 위치 설정
        int yOffset = dpToPx(87);  // 87dp만큼 위로 설정
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, yOffset);
        toast.show();
    }

    // dp를 px로 변환하는 메서드
    private int dpToPx(int dp) {
        float density = getResources().getDisplayMetrics().density;
        return (int) (dp * density);
    }
}
