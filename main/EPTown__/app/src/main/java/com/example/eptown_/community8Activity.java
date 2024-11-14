package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class community8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.community8);

        // X 눌렀을때 커뮤니티로 이동
        ImageButton imagebutton = findViewById(R.id.btnCommunityClose);  // ImageButton
        imagebutton.setOnClickListener(view -> {
            Intent intent = new Intent(community8Activity.this, CommunityActivity.class);
            startActivity(intent);
        });

        // 확인 눌렀을때 커뮤니티로 이동
        Button button = findViewById(R.id.check);  // Button
        button.setOnClickListener(view -> {
            Intent intent = new Intent(community8Activity.this, CommunityActivity.class);
            startActivity(intent);
        });

        // UI 요소들 참조
        ImageButton checkedCircle = findViewById(R.id.checkedCircle);  // ImageButton
        TextView userName = findViewById(R.id.userName);
        ImageButton cameraButton = findViewById(R.id.camera);  // 사진 올리는 버튼
        ImageView postCatImage = findViewById(R.id.postCat);  // 게시물 고양이 사진

        // 회색 배경, 삭제 상자, 글 등록 여부 텍스트, 취소 및 확인 버튼
        View grayScreen = findViewById(R.id.grayScreen);
        ImageView deleteBox = findViewById(R.id.deleteBox);
        TextView deleteText = findViewById(R.id.deleteText);
        Button cancelButton = findViewById(R.id.cancel);  // Button
        Button checkButton = findViewById(R.id.check);  // Button

        // 버튼 객체 선언 (이전 코드에서 button 변수 선언 누락)
        Button postButton = findViewById(R.id.btnPost);  // Button

        // 초기 상태 설정: "checked" 상태로 시작
        checkedCircle.setTag("checked");

        // ImageButton 클릭 리스너 설정
        checkedCircle.setOnClickListener(v -> {
            // 현재 상태를 확인하고 이미지 변경
            if ("checked".equals(checkedCircle.getTag())) {
                checkedCircle.setImageResource(R.drawable.ic_unchecked_circle);  // ic_unchecked_circle로 변경
                checkedCircle.setTag("unchecked");  // 상태 변경
                // 체크되지 않은 상태일 때 익명 텍스트 표시 및 색상 변경
                userName.setText("익명");  // 텍스트 변경
                userName.setTextColor(ContextCompat.getColor(this, R.color.gray));  // 텍스트 색상 변경
            } else {
                checkedCircle.setImageResource(R.drawable.ic_checked_circle);  // ic_checked_circle로 변경
                checkedCircle.setTag("checked");  // 상태 변경
                // 체크된 상태일 때 익명 텍스트 숨기기 및 색상 원래대로 변경
                userName.setTextColor(ContextCompat.getColor(this, R.color.orange));  // 색상 원래대로
            }
        });

        // 사진 올리는 버튼 클릭 리스너 설정
        cameraButton.setOnClickListener(v -> {
            // 사진 올리는 버튼을 누르면 게시물 고양이 사진을 보이게 하거나 숨기기
            if (postCatImage.getVisibility() == View.GONE) {
                postCatImage.setVisibility(View.VISIBLE);  // 보이게 설정
            } else {
                postCatImage.setVisibility(View.GONE);  // 숨기기 설정
            }
        });

        // 게시 버튼 클릭 시 화면 요소들 보이게 하기
        postButton.setOnClickListener(v -> {
            // 회색 배경, 삭제 상자, 글 등록 여부 텍스트, 취소 및 확인 버튼을 보이게 설정
            grayScreen.setVisibility(View.VISIBLE);
            deleteBox.setVisibility(View.VISIBLE);
            deleteText.setVisibility(View.VISIBLE);
            cancelButton.setVisibility(View.VISIBLE);
            checkButton.setVisibility(View.VISIBLE);
        });

        // 취소 버튼 클릭 시 해당 UI 요소들 숨기기
        cancelButton.setOnClickListener(v -> {
            grayScreen.setVisibility(View.GONE);
            deleteBox.setVisibility(View.GONE);
            deleteText.setVisibility(View.GONE);
            cancelButton.setVisibility(View.GONE);
            checkButton.setVisibility(View.GONE);
        });

        // 확인 버튼 클릭 시 삭제 처리 후 화면 복구 (예시로 추가한 코드)
        checkButton.setOnClickListener(v -> {
            // 삭제 처리 후 UI 변경
            grayScreen.setVisibility(View.GONE);
            deleteBox.setVisibility(View.GONE);
            deleteText.setVisibility(View.GONE);
            cancelButton.setVisibility(View.GONE);
            checkButton.setVisibility(View.GONE);

            // 삭제 완료 후 UI
            // (여기서 삭제 완료 메시지나 동작을 처리하면 됩니다)
        });
    }
}
