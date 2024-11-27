package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class InquireChoiceActivity extends AppCompatActivity {

    private ImageButton checked;  // ImageButton 선언
    private ImageButton unchecked;  // ImageButton 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.inquire_choice);

        // 문의하기 눌렀을때 inquire6로 화면 이동
        Button button = findViewById(R.id.btnInquire);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InquireChoiceActivity.this, InquireWriteActivity.class);
                startActivity(intent);
            }
        });

        // 내 문의 내역 텍스트 클릭시 inquire4로 화면 이동
        TextView textview = findViewById(R.id.writtenReview);
        textview.setOnClickListener(view -> {
            Intent intent = new Intent(InquireChoiceActivity.this, InquireMyActivity.class);
            startActivity(intent);
        });

        // ImageButton을 XML 레이아웃에서 가져오기
        checked = findViewById(R.id.checked);
        unchecked = findViewById(R.id.unchecked);

        // 각 ImageButton 클릭 리스너 설정
        checked.setOnClickListener(v -> toggleIcon(checked, R.drawable.ic_uncolor_rect, R.drawable.ic_checked_circle));
        unchecked.setOnClickListener(v -> toggleIcon(unchecked, R.drawable.ic_uncolor_rect, R.drawable.ic_checked_circle));
    }

    // 아이콘을 토글하는 메소드
    private void toggleIcon(ImageButton button, int uncheckedResId, int checkedResId) {
        // 현재 버튼에 설정된 아이콘을 확인하여 토글
        if (button.getDrawable().getConstantState().equals(getResources().getDrawable(uncheckedResId).getConstantState())) {
            // unchecked 상태 -> checked 상태로 변경
            button.setImageResource(checkedResId);
        } else {
            // checked 상태 -> unchecked 상태로 변경
            button.setImageResource(uncheckedResId);
        }

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
    public void onBackPressed() {
        super.onBackPressed(); // 바로 이전 화면으로 이동
        finish(); // 현재 액티비티 종료
    }
}
