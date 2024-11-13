package com.example.eptown_;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class coupon3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.coupon3);

        // receiveCouponOne 버튼과 receiveComplete 버튼 참조
        Button receiveCouponOne = findViewById(R.id.receiveCouponOne);
        Button receiveComplete = findViewById(R.id.receiveComplete);

        // receiveCouponTwo 버튼과 receiveCompleteTwo 버튼 참조
        Button receiveCouponTwo = findViewById(R.id.receiveCouponTwo);
        Button receiveCompleteTwo = findViewById(R.id.receiveCompleteTwo);

        // registerBox와 register 참조
        ImageView registerBox = findViewById(R.id.registerBox);
        TextView register = findViewById(R.id.register);

        // receiveCouponOne 버튼 클릭 시 receiveComplete 버튼과 registerBox, register를 3초 동안 보이게 설정
        receiveCouponOne.setOnClickListener(v -> {
            receiveCouponOne.setVisibility(View.GONE);  // receiveCouponOne 숨기기
            receiveComplete.setVisibility(View.VISIBLE);  // receiveComplete 보이기

            // registerBox와 register를 보이게 설정
            registerBox.setVisibility(View.VISIBLE);
            register.setVisibility(View.VISIBLE);

            // 3초 후에 registerBox와 register를 숨기기
            new Handler().postDelayed(() -> {
                registerBox.setVisibility(View.GONE);
                register.setVisibility(View.GONE);
            }, 3000);  // 3000ms = 3초
        });

        // receiveCouponTwo 버튼 클릭 시 receiveCompleteTwo 버튼과 registerBox, register를 3초 동안 보이게 설정
        receiveCouponTwo.setOnClickListener(v -> {
            receiveCouponTwo.setVisibility(View.GONE);  // receiveCouponTwo 숨기기
            receiveCompleteTwo.setVisibility(View.VISIBLE);  // receiveCompleteTwo 보이기

            // registerBox와 register를 보이게 설정
            registerBox.setVisibility(View.VISIBLE);
            register.setVisibility(View.VISIBLE);

            // 3초 후에 registerBox와 register를 숨기기
            new Handler().postDelayed(() -> {
                registerBox.setVisibility(View.GONE);
                register.setVisibility(View.GONE);
            }, 3000);  // 3000ms = 3초
        });
    }
}
