package com.example.eptown_;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CommunityDeleteActivity extends AppCompatActivity {

    private static final String DEFAULT_TEXT_COLOR = "#000000"; // 기본 색상
    private static final String SELECTED_TEXT_COLOR = "#F59701"; // 선택된 색상

    private View grayScreen;
    private LinearLayout deleteBoxTwo;
    private TextView cancelTwo;
    private TextView checkTwo;
    private TextView declare;
    private TextView choiceOne;
    private TextView choiceTwo;
    private TextView choiceThree;
    private TextView choiceFour;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.community_delete);

        // 메인화면에서 커뮤니티 아이콘 눌렀을때 커뮤니티로 화면 이동
        ImageButton imagebutton = findViewById(R.id.writing);
        imagebutton.setOnClickListener(view -> {
            Intent intent = new Intent(CommunityDeleteActivity.this, CommunityPostActivity.class);
            startActivity(intent);
        });

        // 탭바에서 홈 아이콘 눌렀을때 메인으로 화면 이동
        ImageButton imagebutton2 = findViewById(R.id.tapHomeIconCategoryFeed1);
        imagebutton2.setOnClickListener(view -> {
            Intent intent = new Intent(CommunityDeleteActivity.this, MainActivity.class);
            startActivity(intent);
        });

        // 탭바에서 카테고리 아이콘 눌렀을때 카테고리 메인으로 화면 이동
        ImageButton imagebutton3 = findViewById(R.id.tapCommunityIconCategoryFeed1);
        imagebutton3.setOnClickListener(view -> {
            Intent intent = new Intent(CommunityDeleteActivity.this, CategoryMainActivity.class);
            startActivity(intent);
        });

        // 탭바에서 병원 아이콘 눌렀을때 병원으로 화면 이동
        ImageButton imagebutton4 = findViewById(R.id.tapHostpitalIconCategoryFeed1);
        imagebutton4.setOnClickListener(view -> {
            Intent intent = new Intent(CommunityDeleteActivity.this, HospitalActivity.class);
            startActivity(intent);
        });

        // 탭바에서 내 정보 아이콘 눌렀을때 내 정보로 화면 이동
        ImageButton imagebutton5 = findViewById(R.id.tapMypageIconCategoryFeed1);
        imagebutton5.setOnClickListener(view -> {
            Intent intent = new Intent(CommunityDeleteActivity.this, MyPageActivity.class);
            startActivity(intent);
        });

        // 게시물 눌렀을때 게시물 내용으로 이동
        LinearLayout layout = findViewById(R.id.firstCommunity);
        layout.setOnClickListener(view -> {
            Intent intent = new Intent(CommunityDeleteActivity.this, CommunityContentActivity.class);
            startActivity(intent);
        });

        // 게시물 눌렀을때 게시물 내용으로 이동
        LinearLayout layout1 = findViewById(R.id.secondCommunity);
        layout1.setOnClickListener(view -> {
            Intent intent = new Intent(CommunityDeleteActivity.this, CommunityContentActivity.class);
            startActivity(intent);
        });

        // 신고 UI 초기화
        initReportUI();

        ImageButton btnBack = findViewById(R.id.btnCommunityBack);
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
    }

    private void initReportUI() {
        grayScreen = findViewById(R.id.grayScreen);
        deleteBoxTwo = findViewById(R.id.deleteBoxTwo);
        cancelTwo = findViewById(R.id.cancelTwo);
        checkTwo = findViewById(R.id.checkTwo);
        declare = findViewById(R.id.declare);
        choiceOne = findViewById(R.id.choiceOne);
        choiceTwo = findViewById(R.id.choiceTwo);
        choiceThree = findViewById(R.id.choiceThree);
        choiceFour = findViewById(R.id.choiceFour);

        TextView reportButton1 = findViewById(R.id.reportOne);
        TextView reportButton2 = findViewById(R.id.reportTwo);

        // 신고 버튼 클릭 리스너
        View.OnClickListener reportClickListener = v -> showReportUI();
        reportButton1.setOnClickListener(reportClickListener);
        reportButton2.setOnClickListener(reportClickListener);

        // 취소 버튼 클릭 리스너
        cancelTwo.setOnClickListener(v -> hideReportUI());

        // 회색 화면 클릭 시 신고 UI를 숨김
        grayScreen.setOnClickListener(v -> hideReportUI());

        // 선택지 클릭 리스너 추가
        addChoiceClickListener(choiceOne);
        addChoiceClickListener(choiceTwo);
        addChoiceClickListener(choiceThree);
        addChoiceClickListener(choiceFour);

        // 확인 버튼 클릭 리스너
        checkTwo.setOnClickListener(v -> {
            showCustomToast("신고되었습니다.");
            hideReportUI();
        });

        // deleteBoxTwo 클릭 시 화면이 사라지지 않도록 하기 위한 리스너
        deleteBoxTwo.setOnClickListener(v -> {
            // 아무 동작도 하지 않음
        });
    }

    private void showReportUI() {
        grayScreen.setVisibility(View.VISIBLE);
        deleteBoxTwo.setVisibility(View.VISIBLE);
        declare.setVisibility(View.VISIBLE);
        choiceOne.setVisibility(View.VISIBLE);
        choiceTwo.setVisibility(View.VISIBLE);
        choiceThree.setVisibility(View.VISIBLE);
        choiceFour.setVisibility(View.VISIBLE);
        cancelTwo.setVisibility(View.VISIBLE);
        checkTwo.setVisibility(View.VISIBLE);
    }

    private void hideReportUI() {
        grayScreen.setVisibility(View.GONE);
        deleteBoxTwo.setVisibility(View.GONE);
        declare.setVisibility(View.GONE);
        choiceOne.setVisibility(View.GONE);
        choiceTwo.setVisibility(View.GONE);
        choiceThree.setVisibility(View.GONE);
        choiceFour.setVisibility(View.GONE);
        cancelTwo.setVisibility(View.GONE);
        checkTwo.setVisibility(View.GONE);
    }

    private void addChoiceClickListener(TextView choice) {
        choice.setOnClickListener(v -> toggleColor(choice));
    }

    private void toggleColor(TextView choice) {
        if (choice.getCurrentTextColor() == Color.parseColor(SELECTED_TEXT_COLOR)) {
            choice.setTextColor(Color.parseColor(DEFAULT_TEXT_COLOR));
        } else {
            choice.setTextColor(Color.parseColor(SELECTED_TEXT_COLOR));
        }
    }

    private void showCustomToast(String message) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast, null);

        TextView textView = layout.findViewById(R.id.custom_toast_message);
        textView.setText(message);

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        int yOffset = dpToPx(87); // 87dp를 px로 변환
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, yOffset);
        toast.show();
    }

    private int dpToPx(int dp) {
        float density = getResources().getDisplayMetrics().density;
        return (int) (dp * density);
    }

    private void navigateTo(Class<?> targetActivity) {
        Intent intent = new Intent(CommunityDeleteActivity.this, targetActivity);
        startActivity(intent);
    }
}