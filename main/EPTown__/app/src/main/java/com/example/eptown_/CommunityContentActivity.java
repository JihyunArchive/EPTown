package com.example.eptown_;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CommunityContentActivity extends AppCompatActivity {

    private static final String DEFAULT_TEXT_COLOR = "#000000";
    private static final String SELECTED_TEXT_COLOR = "#F59701";

    private TextView choiceOne, choiceTwo, choiceThree, choiceFour, declare, register, deleteText, post, userNameFour, reportButtonFour, chatFour;
    private View grayScreen;
    private ImageView deleteBoxTwo, registerBox, deleteBox;
    private Button cancelTwo, checkTwo, cancel, check;
    private TextView deleteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.community_content);

        // 탭바 버튼 설정
        ImageButton imagebutton1 = findViewById(R.id.tapHomeIconCategoryFeed1);
        imagebutton1.setOnClickListener(view -> startActivity(new Intent(this, MainActivity.class)));

        ImageButton imagebutton2 = findViewById(R.id.tapCategoryIconCategoryFeed1);
        imagebutton2.setOnClickListener(view -> startActivity(new Intent(this, CategoryMainActivity.class)));

        ImageButton imagebutton3 = findViewById(R.id.tapHostpitalIconCategoryFeed1);
        imagebutton3.setOnClickListener(view -> startActivity(new Intent(this, HospitalActivity.class)));

        ImageButton imagebutton4 = findViewById(R.id.tapMypageIconCategoryFeed1);
        imagebutton4.setOnClickListener(view -> startActivity(new Intent(this, MyPageActivity.class)));

        // 삭제 상자에서 확인 버튼 눌렀을 때
        Button button = findViewById(R.id.check);
        button.setOnClickListener(view -> startActivity(new Intent(this, CommunityDeleteActivity.class)));

        // UI 요소 초기화
        initializeUI();

        // 삭제 버튼 클릭 리스너 설정
        deleteButton.setOnClickListener(v -> showDeleteUI());

        // 신고 버튼 클릭 리스너 설정
        View.OnClickListener reportClickListener = v -> showReportUI();
        findViewById(R.id.reportButton).setOnClickListener(reportClickListener);
        findViewById(R.id.reportButtonTwo).setOnClickListener(reportClickListener);
        findViewById(R.id.reportButtonThree).setOnClickListener(reportClickListener);

        // 회색 화면 클릭 시 신고 UI를 숨김
        grayScreen.setOnClickListener(v -> hideReportUI());

        // "게시" 버튼 클릭 리스너 추가
        findViewById(R.id.post).setOnClickListener(v -> {
                    // chatThree 사라지게 설정
                    findViewById(R.id.chatThree).setVisibility(View.GONE);

            // chatFour와 관련된 UI 나타나게 설정
            findViewById(R.id.fivetHorizon).setVisibility(View.VISIBLE);
            findViewById(R.id.chatFive).setVisibility(View.VISIBLE);
            findViewById(R.id.userNameFour).setVisibility(View.VISIBLE);
            findViewById(R.id.reportButtonFour).setVisibility(View.VISIBLE);
            findViewById(R.id.chatFour).setVisibility(View.VISIBLE);
        });

        // 취소 버튼 클릭 시 UI 원상복구
        cancel.setOnClickListener(v -> resetUI());
        cancelTwo.setOnClickListener(v -> resetUI());

        // 신고 확인 버튼 클릭 시 토스트 메시지
        checkTwo.setOnClickListener(v -> {
            showCustomToast("신고되었습니다.");
            hideReportUI();
        });

        // deleteBox 클릭 시 화면이 사라지지 않도록 하기 위한 리스너
        deleteBox.setOnClickListener(v -> {
            // 아무 동작도 하지 않음, 화면 사라지지 않도록
        });

        // 선택지 클릭 시 색상 변경
        choiceOne.setOnClickListener(v -> toggleColor(choiceOne));
        choiceTwo.setOnClickListener(v -> toggleColor(choiceTwo));
        choiceThree.setOnClickListener(v -> toggleColor(choiceThree));
        choiceFour.setOnClickListener(v -> toggleColor(choiceFour));

        // 뒤로가기 버튼 (btnCategoryFeed1Back)
        ImageButton btnBack = findViewById(R.id.btnCategoryFeed1Back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // onBackPressed() 메서드 호출
                onBackPressed();
            }
        });
    }

    @Override
    public void onBackPressed () {
        super.onBackPressed(); // 바로 이전 화면으로 이동
        finish(); // 현재 액티비티 종료
    }

    private void initializeUI() {
        grayScreen = findViewById(R.id.grayScreen);
        deleteBoxTwo = findViewById(R.id.deleteBoxTwo);
        cancelTwo = findViewById(R.id.cancelTwo);
        checkTwo = findViewById(R.id.checkTwo);
        declare = findViewById(R.id.declare);
        choiceOne = findViewById(R.id.choiceOne);
        choiceTwo = findViewById(R.id.choiceTwo);
        choiceThree = findViewById(R.id.choiceThree);
        choiceFour = findViewById(R.id.choiceFour);
        cancel = findViewById(R.id.cancel);
        check = findViewById(R.id.check);
        deleteBox = findViewById(R.id.deleteBox);
        deleteText = findViewById(R.id.deleteText);
        deleteButton = findViewById(R.id.deleteButton);
        userNameFour = findViewById(R.id.userNameFour);
        reportButtonFour = findViewById(R.id.reportButtonFour);
        chatFour = findViewById(R.id.chatFour);
    }

    private void resetUI() {
        grayScreen.setVisibility(View.GONE);
        deleteBox.setVisibility(View.GONE);
        deleteBoxTwo.setVisibility(View.GONE);
        deleteText.setVisibility(View.GONE);
        declare.setVisibility(View.GONE);
        choiceOne.setVisibility(View.GONE);
        choiceTwo.setVisibility(View.GONE);
        choiceThree.setVisibility(View.GONE);
        choiceFour.setVisibility(View.GONE);
        cancel.setVisibility(View.GONE);
        cancelTwo.setVisibility(View.GONE);
        check.setVisibility(View.GONE);
        checkTwo.setVisibility(View.GONE);
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

    private void showDeleteUI() {
        grayScreen.setVisibility(View.VISIBLE);
        deleteBox.setVisibility(View.VISIBLE);
        deleteText.setVisibility(View.VISIBLE);
        cancel.setVisibility(View.VISIBLE);
        check.setVisibility(View.VISIBLE);
    }

    private void toggleColor(TextView choice) {
        if (choice.getCurrentTextColor() == Color.parseColor(SELECTED_TEXT_COLOR)) {
            choice.setTextColor(Color.parseColor(DEFAULT_TEXT_COLOR));
        } else {
            choice.setTextColor(Color.parseColor(SELECTED_TEXT_COLOR));
        }
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
}
