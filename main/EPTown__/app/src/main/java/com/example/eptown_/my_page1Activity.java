package com.example.eptown_;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class my_page1Activity extends AppCompatActivity {

    private View grayScreen;  // 회색 배경 View
    private Button cancelButton;
    private Button checkButton;
    private ImageView deleteBox;
    private TextView deleteText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_page1);

        // 뷰 요소 찾기
        grayScreen = findViewById(R.id.grayScreen);  // 회색 배경
        cancelButton = findViewById(R.id.cancel);
        checkButton = findViewById(R.id.check);
        deleteBox = findViewById(R.id.deleteBox);
        deleteText = findViewById(R.id.deleteText);

        // 취소 버튼 클릭 시 화면을 회색으로 만들고 삭제 상자 및 버튼들 숨기기
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grayScreen.setVisibility(View.GONE);  // 회색 배경 숨기기
                hideDeleteBoxAndButtons();  // 삭제 상자와 버튼들 숨기기
            }
        });

        // 확인 버튼 클릭 시 화면을 회색으로 만들고 삭제 상자 및 버튼들 숨기기
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grayScreen.setVisibility(View.VISIBLE);  // 회색 배경 보이기
                hideDeleteBoxAndButtons();  // 삭제 상자와 버튼들 숨기기
            }
        });
    }

    private void hideDeleteBoxAndButtons() {
        // 삭제 상자, 텍스트, 버튼들 숨기기
        deleteBox.setVisibility(View.GONE);
        deleteText.setVisibility(View.GONE);
        cancelButton.setVisibility(View.GONE);
        checkButton.setVisibility(View.GONE);
    }

    private void showDeleteBoxAndButtons() {
        // 삭제 상자, 텍스트, 버튼들 보이기
        deleteBox.setVisibility(View.VISIBLE);
        deleteText.setVisibility(View.VISIBLE);
        cancelButton.setVisibility(View.VISIBLE);
        checkButton.setVisibility(View.VISIBLE);
    }
}
