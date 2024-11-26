package com.example.eptown_;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ScrollView;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class ItemDetailsReview extends AppCompatActivity {

    private String selectedFilter = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_details_review);

        // 홈 아이콘 눌렀을때 메인화면으로 화면 이동
        ImageButton imagebutton1 = findViewById(R.id.homeIcon);
        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetailsReview.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 알림 아이콘 눌렀을때 알림으로 화면 이동
        ImageButton imagebutton2 = findViewById(R.id.reminderIcon);
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetailsReview.this, NoticeActivity.class);
                startActivity(intent);
            }
        });

        // 장바구니 아이콘 눌렀을때 장바구니로 화면 이동
        ImageButton imagebutton3 = findViewById(R.id.cartIcon);
        imagebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetailsReview.this, CartActivity.class);
                startActivity(intent);
            }
        });

        // 쿠폰 받기 버튼 눌렀을때 쿠폰으로 화면 이동
        Button button = findViewById(R.id.getCoupon);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetailsReview.this, coupon3Activity.class);
                startActivity(intent);
            }
        });

        // 상품 정보 텍스트 눌렀을때 상품 상세로 화면 이동
        TextView textview1 = findViewById(R.id.itemInfoTabText);
        textview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetailsReview.this, ItemDetails.class);
                startActivity(intent);
            }
        });

        // 문의 텍스트 눌렀을때 item_details_inquiry로 화면 이동
        TextView textview2 = findViewById(R.id.itemInquiryTabText);
        textview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetailsReview.this, ItemDetailsInquiry.class);
                startActivity(intent);
            }
        });

        // 구매하기 버튼 눌렀을때 주문/결제로 화면 이동
        Button button1 = findViewById(R.id.buyFixButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetailsReview.this, OrderPayActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btnBack = findViewById(R.id.itemDetailsBackIcon);
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

        // 상태바 및 네비게이션 바 설정
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

            window.setStatusBarColor(Color.WHITE);
            window.setNavigationBarColor(Color.WHITE);

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                window.getDecorView().setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
                );
            }
        }

        // 취소선 설정
        TextView itemCostPriceTextView = findViewById(R.id.itemCostPrice);
        itemCostPriceTextView.setPaintFlags(itemCostPriceTextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        // 필터 아이콘 클릭 리스너
        ImageButton choiceIcon = findViewById(R.id.choiceIcon);
        choiceIcon.setOnClickListener(view -> {
            if (findViewById(R.id.changeBox).getVisibility() == View.GONE) {
                // 필터 UI 요소 표시
                setFilterVisibility(View.VISIBLE);

                // '구매하기' 버튼 숨김
                ImageView buyFixBar = findViewById(R.id.buyFixBar);
                Button buyFixButton = findViewById(R.id.buyFixButton);
                buyFixBar.setVisibility(View.GONE);
                buyFixButton.setVisibility(View.GONE);

                // 아이콘을 'ic_up_arrow'로 변경
                choiceIcon.setImageResource(R.drawable.ic_up_arrow);
            } else {
                // 필터 UI 요소 숨김
                setFilterVisibility(View.GONE);

                // 아이콘을 'ic_under_arrow'로 변경
                choiceIcon.setImageResource(R.drawable.ic_under_arrow);
            }
        });

        // '최신순' 클릭 리스너
        TextView theLatestText = findViewById(R.id.theLatest);
        theLatestText.setOnClickListener(view -> {
            selectedFilter = "최신순";
            updateFilter(selectedFilter);
            TextView choiceFilterText = findViewById(R.id.choiceFilterText);
            choiceFilterText.setText("최신순");
        });

        // '평점 높은 순' 클릭 리스너
        TextView reviewHighestText = findViewById(R.id.reviewHighest);
        reviewHighestText.setOnClickListener(view -> {
            selectedFilter = "평점 높은 순";
            updateFilter(selectedFilter);
            TextView choiceFilterText = findViewById(R.id.choiceFilterText);
            choiceFilterText.setText("평점 높은 순");
        });

        // '평점 낮은 순' 클릭 리스너
        TextView reviewLowerestText = findViewById(R.id.reviewLowerest);
        reviewLowerestText.setOnClickListener(view -> {
            selectedFilter = "평점 낮은 순";
            updateFilter(selectedFilter);
            TextView choiceFilterText = findViewById(R.id.choiceFilterText);
            choiceFilterText.setText("평점 낮은 순");
        });
    }

    private void setFilterVisibility(int visibility) {
        // 필터 관련 UI 요소 표시/숨김
        findViewById(R.id.changeBox).setVisibility(visibility);
        findViewById(R.id.grayStick).setVisibility(visibility);
        findViewById(R.id.reviewText).setVisibility(visibility);
        findViewById(R.id.theLatest).setVisibility(visibility);
        findViewById(R.id.reviewHighest).setVisibility(visibility);
        findViewById(R.id.reviewLowerest).setVisibility(visibility);

        // 필터 UI가 숨겨질 때 아이콘을 'ic_under_arrow'로 변경
        if (visibility == View.GONE) {
            ImageButton choiceIcon = findViewById(R.id.choiceIcon);
            choiceIcon.setImageResource(R.drawable.ic_under_arrow);

            // '구매하기' 버튼을 다시 보이게 함
            ImageView buyFixBar = findViewById(R.id.buyFixBar);
            Button buyFixButton = findViewById(R.id.buyFixButton);
            buyFixBar.setVisibility(View.VISIBLE);
            buyFixButton.setVisibility(View.VISIBLE);
        } else {
            // 화면 클릭 시 필터 UI 숨기기
            ScrollView mainLayout = findViewById(R.id.main); // 화면 레이아웃 ID 확인 필요
            mainLayout.setOnTouchListener((v, event) -> {
                if (findViewById(R.id.changeBox).getVisibility() == View.VISIBLE) {
                    // 필터 UI가 보이면 클릭 시 필터 숨김
                    setFilterVisibility(View.GONE);
                    ImageButton choiceIcon = findViewById(R.id.choiceIcon);
                    choiceIcon.setImageResource(R.drawable.ic_under_arrow);
                }
                return false;
            });
        }
    }

    private void updateFilter(String selectedFilter) {
        // 모든 필터 색상 초기화
        resetFilterTextColor();

        // 선택된 필터의 텍스트 색상 변경
        if (selectedFilter.equals("최신순")) {
            TextView theLatestText = findViewById(R.id.theLatest);
            theLatestText.setTextColor(Color.parseColor("#F59701"));

            // 최신순 선택 시 체크 아이콘 표시
            ImageView checkColorOne = findViewById(R.id.checkColorOne);
            checkColorOne.setVisibility(View.VISIBLE);

            // 다른 필터는 체크 아이콘 숨기기
            ImageView checkColorTwo = findViewById(R.id.checkColorTwo);
            ImageView checkColorThree = findViewById(R.id.checkColorThree);
            checkColorTwo.setVisibility(View.GONE);
            checkColorThree.setVisibility(View.GONE);

        } else if (selectedFilter.equals("평점 높은 순")) {
            TextView reviewHighestText = findViewById(R.id.reviewHighest);
            reviewHighestText.setTextColor(Color.parseColor("#F59701"));

            // 평점 높은 순 선택 시 체크 아이콘 표시
            ImageView checkColorTwo = findViewById(R.id.checkColorTwo);
            checkColorTwo.setVisibility(View.VISIBLE);

            // 다른 필터는 체크 아이콘 숨기기
            ImageView checkColorOne = findViewById(R.id.checkColorOne);
            ImageView checkColorThree = findViewById(R.id.checkColorThree);
            checkColorOne.setVisibility(View.GONE);
            checkColorThree.setVisibility(View.GONE);

        } else if (selectedFilter.equals("평점 낮은 순")) {
            TextView reviewLowerestText = findViewById(R.id.reviewLowerest);
            reviewLowerestText.setTextColor(Color.parseColor("#F59701"));

            // 평점 낮은 순 선택 시 체크 아이콘 표시
            ImageView checkColorThree = findViewById(R.id.checkColorThree);
            checkColorThree.setVisibility(View.VISIBLE);

            // 다른 필터는 체크 아이콘 숨기기
            ImageView checkColorOne = findViewById(R.id.checkColorOne);
            ImageView checkColorTwo = findViewById(R.id.checkColorTwo);
            checkColorOne.setVisibility(View.GONE);
            checkColorTwo.setVisibility(View.GONE);
        }

        // 필터 UI 숨김
        setFilterVisibility(View.GONE);

        // '전체 리뷰' -> 선택된 필터 텍스트 변경
        TextView allReviewText = findViewById(R.id.allReviewText);
        allReviewText.setText(selectedFilter);
    }

    // 텍스트 색상 초기화
    private void resetFilterTextColor() {
        TextView theLatestText = findViewById(R.id.theLatest);
        TextView reviewHighestText = findViewById(R.id.reviewHighest);
        TextView reviewLowerestText = findViewById(R.id.reviewLowerest);

        theLatestText.setTextColor(Color.BLACK);
        reviewHighestText.setTextColor(Color.BLACK);
        reviewLowerestText.setTextColor(Color.BLACK);

        // 모든 체크 아이콘 숨기기
        ImageView checkColorOne = findViewById(R.id.checkColorOne);
        ImageView checkColorTwo = findViewById(R.id.checkColorTwo);
        ImageView checkColorThree = findViewById(R.id.checkColorThree);

        checkColorOne.setVisibility(View.GONE);
        checkColorTwo.setVisibility(View.GONE);
        checkColorThree.setVisibility(View.GONE);

        // '구매하기' 버튼 클릭 리스너
        Button buyFixButton = findViewById(R.id.buyFixButton);
        buyFixButton.setOnClickListener(view -> {
            View grayScreen = findViewById(R.id.grayScreen);
            grayScreen.setVisibility(View.VISIBLE);

            // 수량 변경 UI 표시
            ImageView changeBoxTwo = findViewById(R.id.changeBoxTwo);
            ImageView grayStickTwo = findViewById(R.id.grayStickTwo);
            ImageView grayBox = findViewById(R.id.grayBox);
            TextView productPriceTwo = findViewById(R.id.productPriceTwo);
            ImageView amount = findViewById(R.id.amount);
            TextView theLargest = findViewById(R.id.theLargest);
            TextView totalPriceTwo = findViewById(R.id.totalPriceTwo);
            View priceBar = findViewById(R.id.priceBar);
            TextView totalAmount = findViewById(R.id.totalAmount);
            TextView totalPriceThree = findViewById(R.id.totalPriceThree);
            ImageButton btnMinus = findViewById(R.id.btnMinus);
            ImageButton btnPlus = findViewById(R.id.btnPlus);
            TextView number = findViewById(R.id.number);

            // 모든 UI 요소를 보이게 설정
            changeBoxTwo.setVisibility(View.VISIBLE);
            grayStickTwo.setVisibility(View.VISIBLE);
            grayBox.setVisibility(View.VISIBLE);
            productPriceTwo.setVisibility(View.VISIBLE);
            amount.setVisibility(View.VISIBLE);
            theLargest.setVisibility(View.VISIBLE);
            totalPriceTwo.setVisibility(View.VISIBLE);
            priceBar.setVisibility(View.VISIBLE);
            totalAmount.setVisibility(View.VISIBLE);
            totalPriceThree.setVisibility(View.VISIBLE);
            btnMinus.setVisibility(View.VISIBLE);
            btnPlus.setVisibility(View.VISIBLE);
            number.setVisibility(View.VISIBLE);
        });

        // '회색 화면' 클릭 시 숨기기
        View grayScreen = findViewById(R.id.grayScreen);
        grayScreen.setOnClickListener(view -> {
            grayScreen.setVisibility(View.GONE);

            // 수량 변경 UI 숨기기
            ImageView changeBoxTwo = findViewById(R.id.changeBoxTwo);
            ImageView grayStickTwo = findViewById(R.id.grayStickTwo);
            ImageView grayBox = findViewById(R.id.grayBox);
            TextView productPriceTwo = findViewById(R.id.productPriceTwo);
            ImageView amount = findViewById(R.id.amount);
            TextView theLargest = findViewById(R.id.theLargest);
            TextView totalPriceTwo = findViewById(R.id.totalPriceTwo);
            View priceBar = findViewById(R.id.priceBar);
            TextView totalAmount = findViewById(R.id.totalAmount);
            TextView totalPriceThree = findViewById(R.id.totalPriceThree);
            ImageButton btnMinus = findViewById(R.id.btnMinus);
            ImageButton btnPlus = findViewById(R.id.btnPlus);
            TextView number = findViewById(R.id.number);

            // 모든 UI 요소를 숨기게 설정
            changeBoxTwo.setVisibility(View.GONE);
            grayStickTwo.setVisibility(View.GONE);
            grayBox.setVisibility(View.GONE);
            productPriceTwo.setVisibility(View.GONE);
            amount.setVisibility(View.GONE);
            theLargest.setVisibility(View.GONE);
            totalPriceTwo.setVisibility(View.GONE);
            priceBar.setVisibility(View.GONE);
            totalAmount.setVisibility(View.GONE);
            totalPriceThree.setVisibility(View.GONE);
            btnMinus.setVisibility(View.GONE);
            btnPlus.setVisibility(View.GONE);
            number.setVisibility(View.GONE);
        });

        // Java 코드에서 버튼 클릭 리스너 설정
        ImageButton btnPlus = findViewById(R.id.btnPlus);
        ImageButton btnMinus = findViewById(R.id.btnMinus);
        TextView number = findViewById(R.id.number);

        // 초기 값 설정 (숫자 1)
        final int[] quantity = {1};
        number.setText(String.valueOf(quantity[0]));

        // 플러스 버튼 클릭 리스너
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 숫자 1 증가, 최대값 10으로 제한
                if (quantity[0] < 10) {
                    quantity[0]++;
                    number.setText(String.valueOf(quantity[0]));
                }
            }
        });

        // 마이너스 버튼 클릭 리스너
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 숫자 1 감소, 최소값 1로 제한
                if (quantity[0] > 1) { // 숫자가 1 미만으로 내려가지 않도록 방지
                    quantity[0]--;
                    number.setText(String.valueOf(quantity[0]));
                }
            }
        });
    }
}
