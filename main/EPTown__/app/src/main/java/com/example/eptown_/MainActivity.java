package com.example.eptown_;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 viewPager;
    private TextView bannerOrderText;
    private BannerSliderAdapter bannerSliderAdapter;
    private int[] bannerImages = {
            R.drawable.image_banner_1,
            R.drawable.image_banner_2,
            R.drawable.image_banner_3,
            R.drawable.image_banner_4,
            R.drawable.image_banner_5
    };
    private Handler handler;
    private Runnable runnable;
    private int totalImages = bannerImages.length; // 총 배너 이미지 수
    private int currentImageIndex = 0; // 현재 배너 이미지 인덱스

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // View 인셋 설정
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // 상태바 및 네비게이션바 설정
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.WHITE);
            window.setNavigationBarColor(Color.WHITE);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                window.getDecorView().setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
                );
            }
        }

        // 아이콘 클릭 시 다른 화면으로 이동하는 코드
        setIconClickListeners();

        // ViewPager2 배너 슬라이더 설정
        viewPager = findViewById(R.id.bannerImg);
        bannerOrderText = findViewById(R.id.bannerText);
        bannerSliderAdapter = new BannerSliderAdapter(bannerImages);
        viewPager.setAdapter(bannerSliderAdapter);
        viewPager.setOffscreenPageLimit(1);
        viewPager.setPageTransformer(new CustomPageTransformer());
        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                currentImageIndex = position;
                updateBannerOrderText();
            }
        });
        updateBannerOrderText();
        handler = new Handler(Looper.getMainLooper());
        runnable = () -> {
            if (viewPager.getCurrentItem() == totalImages - 1) {
                viewPager.setCurrentItem(0, false);
            } else {
                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);
            }
            handler.postDelayed(runnable, 5000);
        };
        handler.postDelayed(runnable, 5000);

        // 취소선 적용
        setStrikeThroughOnPrices();
    }

    private void setIconClickListeners() {
        // 홈 아이콘 눌렀을 때
        findViewById(R.id.tapHomeIconCategoryFeed1).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        });

        // 커뮤니티 아이콘 눌렀을 때
        findViewById(R.id.tapCommunityIconCategoryFeed1).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CommunityActivity.class);
            startActivity(intent);
        });

        // 카테고리 아이콘 눌렀을 때
        findViewById(R.id.tapCategoryIconCategoryFeed1).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CategoryMainActivity.class);
            startActivity(intent);
        });

        // 병원 아이콘 눌렀을 때
        findViewById(R.id.tapHostpitalIconCategoryFeed1).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HospitalActivity.class);
            startActivity(intent);
        });

        // 내 정보 아이콘 눌렀을 때
        findViewById(R.id.tapMypageIconCategoryFeed1).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MyPageActivity.class);
            startActivity(intent);
        });

        // 알림 아이콘 누르면 알림로 화면 이동
        ImageButton imagebutton = findViewById(R.id.reminderIcon);
        imagebutton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, NoticeActivity.class);
            startActivity(intent);
        });

        // 장바구니 아이콘 눌렀을 때
        findViewById(R.id.cartIconMain).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CartActivity.class);
            startActivity(intent);
        });

        // 검색 아이콘 눌렀을 때
        findViewById(R.id.searchIcon).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SearchActivity.class);
            startActivity(intent);
        });

        // 첫번째 상품 누르면 itemDetail로 화면 이동
        LinearLayout layout = findViewById(R.id.userRecommendedItemOne);
        layout.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ItemDetails.class);
            startActivity(intent);
        });

        // 사료 누르면 사료로 화면 이동
        LinearLayout layout1 = findViewById(R.id.categoryFood);
        layout1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CategoryFeed1Activity.class);
            startActivity(intent);
        });

        // 간식 누르면 간식으로 화면 이동
        LinearLayout layout2 = findViewById(R.id.categorySnack);
        layout2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CategorySnack1Activity.class);
            startActivity(intent);
        });

        // 용품 상품 누르면 용품으로 화면 이동
        LinearLayout layout3 = findViewById(R.id.categoryItem);
        layout3.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CategoryProduct1Activity.class);
            startActivity(intent);
        });

        // 신상 누르면 신상 상품으로 화면 이동
        LinearLayout layout4 = findViewById(R.id.newProduct);
        layout4.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, NewProductActivity.class);
            startActivity(intent);
        });

        // 크리스마스 할인특가 누르면 할인특가 상품으로 화면 이동
        LinearLayout layout5 = findViewById(R.id.christmasSale);
        layout5.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SaleProductActivity.class);
            startActivity(intent);
        });

        // 배너 누르면 할인특가 상품으로 화면 이동
        androidx.viewpager2.widget.ViewPager2 androidx = findViewById(R.id.bannerImg);
        androidx.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SaleProductActivity.class);
            startActivity(intent);
        });
    }

    private void updateBannerOrderText() {
        bannerOrderText.setText((currentImageIndex + 1) + " / " + totalImages);
    }

    private void setStrikeThroughOnPrices() {
        int[] priceTextViewIds = {
                R.id.costPriceOne, R.id.costPriceTwo, R.id.costPriceThree,
                R.id.costPriceFour, R.id.costPriceFive, R.id.costPriceSix,
                R.id.costPriceSeven, R.id.costPriceEight, R.id.costPriceNine,
                R.id.costPriceTen, R.id.costPriceEleven, R.id.costPriceTwelve
        };
        for (int id : priceTextViewIds) {
            TextView textView = findViewById(id);
            textView.setPaintFlags(textView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(runnable);
    }

    private class CustomPageTransformer implements ViewPager2.PageTransformer {
        @Override
        public void transformPage(@NonNull View page, float position) {
            if (position < -1) {
                page.setAlpha(0);
            } else if (position <= 1) {
                page.setAlpha(1 - Math.abs(position));
                page.setTranslationX(-position * page.getWidth());
            } else {
                page.setAlpha(0);
            }
        }
    }
}
