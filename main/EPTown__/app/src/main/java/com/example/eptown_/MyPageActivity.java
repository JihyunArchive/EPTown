package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

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

        // 회원 탈퇴 여부에서 확인 누르면 mypage_no_loginActivity로 화면 이동
        Button button = (Button) findViewById(R.id.check);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyPageActivity.this, MypageNoLoginActivity.class);
                startActivity(intent);
            }
        });

        // 다른 화면으로 이동
        ImageButton tapMypageIcon = findViewById(R.id.tapMypageIconCategoryFeed1);
        tapMypageIcon.setOnClickListener(view -> {
            // 여기에 필요한 코드를 추가
        });

        // 개인정보 수정 텍스트 누르면 personal_information로 화면 이동
        TextView textview = findViewById(R.id.editInformation);
        textview.setOnClickListener(view -> {
            Intent intent = new Intent(MyPageActivity.this, PersonalInformationActivity.class);
            startActivity(intent);
        });

        // 건강 정보 관리 텍스트 누르면 health_information로 화면 이동
        TextView textview2 = findViewById(R.id.petAdministration);
        textview2.setOnClickListener(view -> {
            Intent intent = new Intent(MyPageActivity.this, PetAdministration.class);
            startActivity(intent);
        });

        // 병원 텍스트 누르면 병원으로 화면 이동
        TextView textview3 = findViewById(R.id.hospitalMyPage);
        textview3.setOnClickListener(view -> {
            Intent intent = new Intent(MyPageActivity.this, HospitalActivity.class);
            startActivity(intent);
        });

        // 커뮤니티 텍스트 누르면 커뮤니티로 화면 이동
        TextView textview4 = findViewById(R.id.communityMyPage);
        textview4.setOnClickListener(view -> {
            Intent intent = new Intent(MyPageActivity.this, CommunityActivity.class);
            startActivity(intent);
        });

        // 로그아웃 텍스트 누르면  mypage_no_login 화면 이동
        TextView textview6 = findViewById(R.id.logout);
        textview6.setOnClickListener(view -> {
            Intent intent = new Intent(MyPageActivity.this, MypageNoLoginActivity.class);
            startActivity(intent);
        });

        // 홈 아이콘 누르면 메인으로 화면 이동
        ImageButton imagebutton2 = findViewById(R.id.tapHomeIconCategoryFeed1);
        imagebutton2.setOnClickListener(view -> {
            Intent intent = new Intent(MyPageActivity.this, MainActivity.class);
            startActivity(intent);
        });

        // 커뮤니티 아이콘 누르면 커뮤니티로 화면 이동
        ImageButton imagebutton3 = findViewById(R.id.tapCommunityIconCategoryFeed1);
        imagebutton3.setOnClickListener(view -> {
            Intent intent = new Intent(MyPageActivity.this, CommunityActivity.class);
            startActivity(intent);
        });

        // 카테고리 아이콘 누르면 카테고리 메인으로 화면 이동
        ImageButton imagebutton4 = findViewById(R.id.tapCategoryIconCategoryFeed1);
        imagebutton4.setOnClickListener(view -> {
            Intent intent = new Intent(MyPageActivity.this, CategoryMainActivity.class);
            startActivity(intent);
        });

        // 병원 아이콘 누르면 병원으로 화면 이동
        ImageButton imagebutton5 = findViewById(R.id.tapHostpitalIconCategoryFeed1);
        imagebutton5.setOnClickListener(view -> {
            Intent intent = new Intent(MyPageActivity.this, HospitalActivity.class);
            startActivity(intent);
        });

        // 주문/배송 아무곳이나 눌렀을때 주문내역으로 화면 이동
        LinearLayout layout = findViewById(R.id.order);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyPageActivity.this, OrderDetailsActivity.class);
                startActivity(intent);
            }
        });

        // 리뷰 아무곳이나 눌렀을때 작성한 리뷰로 화면 이동
        LinearLayout layout1 = findViewById(R.id.review);
        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyPageActivity.this, ReviewWrittenActivity.class);
                startActivity(intent);
            }
        });

        // 문의 아무곳이나 눌렀을때 작성한 문의로 화면 이동
        LinearLayout layout2 = findViewById(R.id.inquiry);
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyPageActivity.this, InquireMyActivity.class);
                startActivity(intent);
            }
        });

        // 쿠폰 아무곳이나 눌렀을때 보유한 쿠폰으로 화면 이동
        LinearLayout layout3 = findViewById(R.id.cupon);
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyPageActivity.this, CouponActivity.class);
                startActivity(intent);
            }
        });
    }
}
