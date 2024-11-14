package com.example.eptown_;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class community2Activity extends AppCompatActivity {

    private int heartCount = 0;
    private static final String DEFAULT_TEXT_COLOR = "#F59701";
    private static final String SELECTED_TEXT_COLOR = "#F59701";

    private TextView choiceOne, choiceTwo, choiceThree, choiceFour, declare, register, deleteText;
    private View grayScreen;
    private ImageView deleteBoxTwo, registerBox, deleteBox;
    private Button cancelTwo, checkTwo, cancel, check;
    private TextView deleteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.community2);

        // 뒤로가기 눌렀을때 커뮤니티로 이동
        ImageButton imagebutton = findViewById(R.id.btnCategoryFeed1Back);
        imagebutton.setOnClickListener(view -> {
            Intent intent = new Intent(community2Activity.this, CommunityActivity.class);
            startActivity(intent);
        });

        // UI 요소들 참조
        ImageButton heart = findViewById(R.id.heart);
        TextView heartCountTextView = findViewById(R.id.heartCount);
        ImageButton checkedCircle = findViewById(R.id.checkedCircle);
        ImageButton checkedCircleGray = findViewById(R.id.checkedCircleGray);
        TextView userName = findViewById(R.id.userName);

        // 신고 버튼들 참조
        TextView reportButton1 = findViewById(R.id.reportButton);
        TextView reportButton2 = findViewById(R.id.reportButtonTwo);
        TextView reportButton3 = findViewById(R.id.reportButtonThree);

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

        // 삭제 관련 UI 요소들
        cancel = findViewById(R.id.cancel);
        check = findViewById(R.id.check);
        deleteBox = findViewById(R.id.deleteBox);
        deleteText = findViewById(R.id.deleteText); // 추가된 부분

        deleteButton = findViewById(R.id.deleteButton);

        // 하트 클릭 시 하트 상태 변경 및 클릭 수 증가/감소
        heart.setTag("empty");
        heart.setOnClickListener(v -> {
            if ("empty".equals(heart.getTag())) {
                heart.setImageResource(R.drawable.ic_heart_fill);
                heart.setTag("filled");
                heartCount++;
            } else {
                heart.setImageResource(R.drawable.ic_heart_no_fill);
                heart.setTag("empty");
                heartCount--;
            }
            heartCountTextView.setText(String.valueOf(heartCount));
        });

        // checkedCircle 클릭 시 이름 색상 변경
        checkedCircle.setOnClickListener(v -> {
            checkedCircle.setVisibility(View.GONE);
            checkedCircleGray.setVisibility(View.VISIBLE);
            userName.setTextColor(Color.parseColor("#8A8A8E"));
        });

        // checkedCircleGray 클릭 시 원상복구
        checkedCircleGray.setOnClickListener(v -> {
            checkedCircleGray.setVisibility(View.GONE);
            checkedCircle.setVisibility(View.VISIBLE);
            userName.setTextColor(Color.parseColor(DEFAULT_TEXT_COLOR));
        });

        // 삭제 버튼 클릭 시 회색 배경, 삭제 상자 및 삭제 여부, 취소/확인 버튼 보이기
        deleteButton.setOnClickListener(v -> {
            grayScreen.setVisibility(View.VISIBLE);
            deleteBox.setVisibility(View.VISIBLE);
            deleteText.setVisibility(View.VISIBLE); // 삭제 메시지 보이기
            cancel.setVisibility(View.VISIBLE);
            check.setVisibility(View.VISIBLE);
        });

        // 취소 버튼 클릭 시 화면 원상복귀
        cancel.setOnClickListener(v -> {
            grayScreen.setVisibility(View.GONE);
            deleteBox.setVisibility(View.GONE);
            deleteText.setVisibility(View.GONE); // 삭제 메시지 숨기기
            cancel.setVisibility(View.GONE);
            check.setVisibility(View.GONE);
        });

        // 확인 버튼 클릭 시 삭제 처리 및 UI 변경
        check.setOnClickListener(v -> {
            // 삭제 처리 후 UI 변경
            grayScreen.setVisibility(View.GONE);
            deleteBox.setVisibility(View.GONE);
            deleteText.setVisibility(View.GONE); // 삭제 메시지 숨기기
            cancel.setVisibility(View.GONE);
            check.setVisibility(View.GONE);

            // 삭제 완료 후 UI
            registerBox.setVisibility(View.VISIBLE);
            register.setVisibility(View.VISIBLE);

            // 3초 후 삭제 완료 메시지 숨기기
            new Handler().postDelayed(() -> {
                registerBox.setVisibility(View.GONE);
                register.setVisibility(View.GONE);
            }, 3000);  // 3000ms = 3초 후 실행
        });

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
