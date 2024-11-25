package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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

        // 게시하고 확인버튼 눌렀을때 커뮤니티로 이동
        Button button = findViewById(R.id.checkButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(community8Activity.this, CommunityAddActivity.class);
                startActivity(intent);
            }
        });

        // UI 요소들 참조
        ImageButton cameraButton = findViewById(R.id.camera);  // 사진 올리는 버튼
        ImageView postCatImage = findViewById(R.id.postCat);  // 게시물 고양이 사진

        // 회색 배경, 삭제 상자, 글 등록 여부 텍스트, 취소 및 확인 버튼
        View grayScreen = findViewById(R.id.grayScreen);
        ImageView deleteBox = findViewById(R.id.deleteBox);
        TextView deleteText = findViewById(R.id.deleteText);
        Button cancelButton = findViewById(R.id.cancel);  // Button
        Button checkButton = findViewById(R.id.checkButton);  // Button

        // 버튼 객체 선언 (이전 코드에서 button 변수 선언 누락)
        Button postButton = findViewById(R.id.btnPost);  // Button

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

        // 회색 배경 클릭 시 화면이 사라지게 하기
        grayScreen.setOnClickListener(v -> {
            grayScreen.setVisibility(View.GONE);
            deleteBox.setVisibility(View.GONE);
            deleteText.setVisibility(View.GONE);
            cancelButton.setVisibility(View.GONE);
            checkButton.setVisibility(View.GONE);
        });

        // deleteBox 클릭 시 화면이 사라지지 않도록 하기 위한 리스너
        deleteBox.setOnClickListener(v -> {
            // 아무 동작도 하지 않음, 화면 사라지지 않도록
        });
    }
}
