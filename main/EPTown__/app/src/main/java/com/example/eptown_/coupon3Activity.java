package com.example.eptown_;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class coupon3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coupon3);

        // 버튼 참조
        Button buyFixButton = findViewById(R.id.buyFixButton);
        Button receiveCouponOne = findViewById(R.id.receiveCouponOne);
        Button receiveComplete = findViewById(R.id.receiveComplete);
        Button receiveCouponTwo = findViewById(R.id.receiveCouponTwo);
        Button receiveCompleteTwo = findViewById(R.id.receiveCompleteTwo);

        // registerBox와 register 참조
        ImageView registerBox = findViewById(R.id.registerBox);
        TextView register = findViewById(R.id.register);

        // buyFixButton 클릭 시 receiveCouponOne, receiveCouponTwo 숨기고 receiveComplete, receiveCompleteTwo 보이게 설정
        buyFixButton.setOnClickListener(v -> {
            receiveCouponOne.setVisibility(View.GONE);
            receiveComplete.setVisibility(View.VISIBLE);
            receiveCouponTwo.setVisibility(View.GONE);
            receiveCompleteTwo.setVisibility(View.VISIBLE);

            // registerBox와 register를 보이게 설정
            registerBox.setVisibility(View.VISIBLE);
            register.setVisibility(View.VISIBLE);

            // 3초 후에 registerBox와 register를 숨기기
            new Handler().postDelayed(() -> {
                registerBox.setVisibility(View.GONE);
                register.setVisibility(View.GONE);
            }, 3000); // 3000ms = 3초
        });

        // receiveCouponOne 클릭 시 receiveComplete 버튼과 registerBox, register를 3초 동안 보이게 설정
        receiveCouponOne.setOnClickListener(v -> {
            receiveCouponOne.setVisibility(View.GONE);
            receiveComplete.setVisibility(View.VISIBLE);
            registerBox.setVisibility(View.VISIBLE);
            register.setVisibility(View.VISIBLE);

            // 3초 후 registerBox와 register 숨기기
            new Handler().postDelayed(() -> {
                registerBox.setVisibility(View.GONE);
                register.setVisibility(View.GONE);
            }, 3000);
        });

        // receiveCouponTwo 클릭 시 receiveCompleteTwo 버튼과 registerBox, register를 3초 동안 보이게 설정
        receiveCouponTwo.setOnClickListener(v -> {
            receiveCouponTwo.setVisibility(View.GONE);
            receiveCompleteTwo.setVisibility(View.VISIBLE);
            registerBox.setVisibility(View.VISIBLE);
            register.setVisibility(View.VISIBLE);

            // 3초 후 registerBox와 register 숨기기
            new Handler().postDelayed(() -> {
                registerBox.setVisibility(View.GONE);
                register.setVisibility(View.GONE);
            }, 3000);
        });
    }
}
