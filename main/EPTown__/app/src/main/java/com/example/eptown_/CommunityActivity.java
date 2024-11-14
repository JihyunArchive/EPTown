package com.example.eptown_;

import static android.app.ProgressDialog.show;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CommunityActivity extends AppCompatActivity {

    private static final String SELECTED_TEXT_COLOR = "#FF5733"; // 원하는 색상 코드

    private View grayScreen;
    private LinearLayout deleteBoxTwo;
    private TextView cancelTwo;
    private TextView checkTwo;
    private TextView declare;
    private TextView choiceOne;
    private TextView choiceTwo;
    private TextView choiceThree;
    private TextView choiceFour;
    private LinearLayout registerBox;
    private TextView register;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.community);

        // 메인화면에서 커뮤니티 아이콘 눌렀을때 커뮤니티로 화면 이동
        ImageButton imagebutton = findViewById(R.id.writing);
        imagebutton.setOnClickListener(view -> {
            Intent intent = new Intent(CommunityActivity.this, community8Activity.class);
            startActivity(intent);
            // 커뮤니티 화면으로 이동
        });

        // 뒤로가기 눌렀을때 메인으로 화면 이동
        ImageView image2_ = findViewById(R.id.btnCommunityBack);
        image2_.setOnClickListener(view -> {
            Intent intent = new Intent(CommunityActivity.this, MainActivity.class);
            startActivity(intent);
        });

        // 탭바에서 홈 아이콘 눌렀을때 메인으로 화면 이동
        ImageView image2_1 = findViewById(R.id.nowTapHomeIconCommunity);
        image2_1.setOnClickListener(view -> {
            Intent intent = new Intent(CommunityActivity.this, MainActivity.class);
            startActivity(intent);
        });

        // 탭바에서 카테고리 아이콘 눌렀을때 카테고리 메인으로 화면 이동
        ImageView image2_2 = findViewById(R.id.tapCategoryIconCommunity);
        image2_2.setOnClickListener(view -> {
            Intent intent = new Intent(CommunityActivity.this, CategoryMainActivity.class);
            startActivity(intent);
        });

        // 탭바에서 병원 아이콘 눌렀을때 병원으로 화면 이동
        ImageView image2_3 = findViewById(R.id.tapHostpitalIconCommunity);
        image2_3.setOnClickListener(view -> {
            Intent intent = new Intent(CommunityActivity.this, HospitalActivity.class);
            startActivity(intent);
        });

        // 탭바에서 내 정보 아이콘 눌렀을때 내 정보로 화면 이동
        ImageView image2_4 = findViewById(R.id.tapMypageIconCommunity);
        image2_4.setOnClickListener(view -> {
            Intent intent = new Intent(CommunityActivity.this, MyPageActivity.class);
            startActivity(intent);
        });

        // 게시물 눌렀을때 게시물 내용으로 이동
        LinearLayout layout = findViewById(R.id.firstCommunity);
        layout.setOnClickListener(view -> {
            Intent intent = new Intent(CommunityActivity.this, community2Activity.class);
            startActivity(intent);
        });

        // 신고 버튼들 참조
        TextView reportButton1 = findViewById(R.id.reportOne);
        TextView reportButton2 = findViewById(R.id.reportTwo);
        TextView reportButton3 = findViewById(R.id.reportThree);

        // 신고 UI 요소들 참조
        grayScreen = findViewById(R.id.grayScreen);
        deleteBoxTwo = findViewById(R.id.deleteBoxTwo);
        cancelTwo = findViewById(R.id.cancelTwo);
        checkTwo = findViewById(R.id.checkTwo);
        declare = findViewById(R.id.declare);
        choiceOne = findViewById(R.id.choiceOne);
        choiceTwo = findViewById(R.id.choiceTwo);
        choiceThree = findViewById(R.id.choiceThree);
        choiceFour = findViewById(R.id.choiceFour);

        // 신고 후 뜨는 UI 요소들
        registerBox = findViewById(R.id.registerBox);
        register = findViewById(R.id.register);

        // 신고 버튼 클릭 시 회색 배경과 삭제 상자 및 선택지, 신고 텍스트 보이기
        View.OnClickListener reportClickListener = v -> {
            grayScreen.setVisibility(View.VISIBLE);
            deleteBoxTwo.setVisibility(View.VISIBLE);
            declare.setVisibility(View.VISIBLE);
            choiceOne.setVisibility(View.VISIBLE);
            choiceTwo.setVisibility(View.VISIBLE);
            choiceThree.setVisibility(View.VISIBLE);
            choiceFour.setVisibility(View.VISIBLE);
            cancelTwo.setVisibility(View.VISIBLE);
            checkTwo.setVisibility(View.VISIBLE);
        };

        reportButton1.setOnClickListener(reportClickListener);
        reportButton2.setOnClickListener(reportClickListener);
        reportButton3.setOnClickListener(reportClickListener);

        // 취소 버튼 클릭 시 화면 원상복귀 (신고 화면)
        cancelTwo.setOnClickListener(v -> {
            grayScreen.setVisibility(View.GONE);
            deleteBoxTwo.setVisibility(View.GONE);
            declare.setVisibility(View.GONE);
            choiceOne.setVisibility(View.GONE);
            choiceTwo.setVisibility(View.GONE);
            choiceThree.setVisibility(View.GONE);
            choiceFour.setVisibility(View.GONE);
            cancelTwo.setVisibility(View.GONE);
            checkTwo.setVisibility(View.GONE);
        });

        // 확인 버튼 클릭 시 신고 처리 및 UI 변경
        checkTwo.setOnClickListener(v -> {
            // 신고 처리 후 UI 변경
            grayScreen.setVisibility(View.GONE);
            deleteBoxTwo.setVisibility(View.GONE);
            declare.setVisibility(View.GONE);
            choiceOne.setVisibility(View.GONE);
            choiceTwo.setVisibility(View.GONE);
            choiceThree.setVisibility(View.GONE);
            choiceFour.setVisibility(View.GONE);
            cancelTwo.setVisibility(View.GONE);
            checkTwo.setVisibility(View.GONE);

            // 신고 완료 후 UI
            registerBox.setVisibility(View.VISIBLE);
            register.setVisibility(View.VISIBLE);

            // 3초 후 신고 완료 메시지 숨기기
            new Handler().postDelayed(() -> {
                registerBox.setVisibility(View.GONE);
                register.setVisibility(View.GONE);
            }, 3000);  // 3000ms = 3초 후 실행
        });

        // 선택지 1 클릭 시 색상 변경
        choiceOne.setOnClickListener(v -> toggleColor(choiceOne));

        // 선택지 2 클릭 시 색상 변경
        choiceTwo.setOnClickListener(v -> toggleColor(choiceTwo));

        // 선택지 3 클릭 시 색상 변경
        choiceThree.setOnClickListener(v -> toggleColor(choiceThree));

        // 선택지 4 클릭 시 색상 변경
        choiceFour.setOnClickListener(v -> toggleColor(choiceFour));
    }

    // 색상 변경을 위한 메소드
    private void toggleColor(TextView choice) {
        if (choice.getCurrentTextColor() == Color.parseColor(SELECTED_TEXT_COLOR)) {
            choice.setTextColor(Color.parseColor("#000000")); // 기본 색상
        } else {
            choice.setTextColor(Color.parseColor(SELECTED_TEXT_COLOR)); // 선택된 색상
        }
    }
}
