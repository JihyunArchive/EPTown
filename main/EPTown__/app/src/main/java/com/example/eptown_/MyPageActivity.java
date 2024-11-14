package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MyPageActivity extends AppCompatActivity {
    private View grayScreen, deleteBox, deleteText;
    private TextView cancelButton, checkButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_page);

        // 회색 화면과 삭제 창 요소들 초기화
        grayScreen = findViewById(R.id.grayScreen);
        deleteBox = findViewById(R.id.deleteBox);
        deleteText = findViewById(R.id.deleteText);
        cancelButton = findViewById(R.id.cancel);
        checkButton = findViewById(R.id.check);

        // 회원탈퇴 버튼 클릭 시 이벤트 설정
        TextView deleteAccountTextView = findViewById(R.id.deleteAccount);
        deleteAccountTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grayScreen.setVisibility(View.VISIBLE);
                deleteBox.setVisibility(View.VISIBLE);
                deleteText.setVisibility(View.VISIBLE);
                cancelButton.setVisibility(View.VISIBLE);
                checkButton.setVisibility(View.VISIBLE);
            }
        });

        // 취소 버튼 클릭 시 이벤트
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grayScreen.setVisibility(View.GONE);
                deleteBox.setVisibility(View.GONE);
                deleteText.setVisibility(View.GONE);
                cancelButton.setVisibility(View.GONE);
                checkButton.setVisibility(View.GONE);
            }
        });

        Button button = (Button) findViewById(R.id.check);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyPageActivity.this, mypage_no_loginActivity.class);
                startActivity(intent);
            }
        });

        // 다른 화면으로 이동
        ImageView tapMypageIcon = findViewById(R.id.tapMypageIcon);
        tapMypageIcon.setOnClickListener(view -> {
            // 여기에 필요한 코드를 추가
        });

        ImageView reminderIcon = findViewById(R.id.reminderIconMyPage);
        reminderIcon.setOnClickListener(view -> {
            Intent intent = new Intent(MyPageActivity.this, NoticeActivity.class);
            startActivity(intent);
        });

        ImageView cartIcon = findViewById(R.id.cartIconMyPage);
        cartIcon.setOnClickListener(view -> {
            Intent intent = new Intent(MyPageActivity.this, CartActivity.class);
            startActivity(intent);
        });

        TextView hospitalMyPage = findViewById(R.id.hospitalMyPage);
        hospitalMyPage.setOnClickListener(view -> {
            Intent intent = new Intent(MyPageActivity.this, HospitalActivity.class);
            startActivity(intent);
        });

        TextView communityMyPage = findViewById(R.id.communityMyPage);
        communityMyPage.setOnClickListener(view -> {
            Intent intent = new Intent(MyPageActivity.this, CommunityActivity.class);
            startActivity(intent);
        });

        ImageView homeIcon = findViewById(R.id.nowTapHomeIconMyPage);
        homeIcon.setOnClickListener(view -> {
            Intent intent = new Intent(MyPageActivity.this, MainActivity.class);
            startActivity(intent);
        });

        ImageView communityIcon = findViewById(R.id.nowTapCommunityIconMyPage);
        communityIcon.setOnClickListener(view -> {
            Intent intent = new Intent(MyPageActivity.this, CommunityActivity.class);
            startActivity(intent);
        });

        ImageView categoryIcon = findViewById(R.id.tapCategoryIconMyPage);
        categoryIcon.setOnClickListener(view -> {
            Intent intent = new Intent(MyPageActivity.this, CategoryMainActivity.class);
            startActivity(intent);
        });

        ImageView hospitalIcon = findViewById(R.id.tapHospitalIconMyPage);
        hospitalIcon.setOnClickListener(view -> {
            Intent intent = new Intent(MyPageActivity.this, HospitalActivity.class);
            startActivity(intent);
        });
    }
}
