package com.example.eptown_;

import android.graphics.Color;
import android.graphics.Paint; // Paint 임포트 추가
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button; // Button 임포트 추가
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class ItemDetailsReview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_details_review);

        // 상태바 및 네비게이션 바 배경을 흰색으로, 아이콘 색상을 검정으로 설정 (API 21 이상)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

            // 상태바 배경색을 흰색으로 설정
            window.setStatusBarColor(Color.WHITE);

            // 네비게이션 바 배경색을 흰색으로 설정
            window.setNavigationBarColor(Color.WHITE);

            // 상태바 및 네비게이션 바 아이콘 색상을 검정색으로 설정 (API 26 이상)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                window.getDecorView().setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
                );
            }
        }

        // ItemCostPrice에 취소선 적용
        TextView ItemCostPriceTextView = findViewById(R.id.itemCostPrice);
        ItemCostPriceTextView.setPaintFlags(ItemCostPriceTextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        // 필터 아이콘 클릭 리스너 추가
        ImageButton choiceIcon = findViewById(R.id.choiceIcon);
        choiceIcon.setOnClickListener(view -> {
            // 필터 관련 UI 요소들을 보여주기
            ImageView changeBox = findViewById(R.id.changeBox);
            ImageView grayStick = findViewById(R.id.grayStick);
            TextView reviewText = findViewById(R.id.reviewText);
            TextView theLatest = findViewById(R.id.theLatest);
            TextView reviewHighest = findViewById(R.id.reviewHighest);
            TextView reviewLowerest = findViewById(R.id.reviewLowerest);

            // 필터 관련 UI 요소들을 VISIBLE로 설정
            changeBox.setVisibility(View.VISIBLE);
            grayStick.setVisibility(View.VISIBLE);
            reviewText.setVisibility(View.VISIBLE);
            theLatest.setVisibility(View.VISIBLE);
            reviewHighest.setVisibility(View.VISIBLE);
            reviewLowerest.setVisibility(View.VISIBLE);

            // '구매하기' 하얀 사각형 배경과 '구매하기' 버튼을 GONE으로 설정하여 숨김
            ImageView buyFixBar = findViewById(R.id.buyFixBar);
            Button buyFixButton = findViewById(R.id.buyFixButton);

            buyFixBar.setVisibility(View.GONE);
            buyFixButton.setVisibility(View.GONE);
        });

        // '평점 높은 순' 클릭 리스너 추가
        TextView reviewHighestText = findViewById(R.id.reviewHighest);
        reviewHighestText.setOnClickListener(view -> {
            // '평점 높은 순' 글자색을 오렌지색으로 변경
            reviewHighestText.setTextColor(Color.parseColor("#F59701"));
        });

        // '평점 낮은 순' 클릭 리스너 추가
        TextView reviewLowerestText = findViewById(R.id.reviewLowerest);
        reviewLowerestText.setOnClickListener(view -> {
            // '평점 높은 순' 글자색을 오렌지색으로 변경
            reviewLowerestText.setTextColor(Color.parseColor("#F59701"));
        });

        // '최신 순' 클릭 리스너 추가
        TextView theLatestText = findViewById(R.id.theLatest);
        theLatestText.setOnClickListener(view -> {
            // '평점 높은 순' 글자색을 오렌지색으로 변경
            theLatestText.setTextColor(Color.parseColor("#F59701"));
        });
    }
}
