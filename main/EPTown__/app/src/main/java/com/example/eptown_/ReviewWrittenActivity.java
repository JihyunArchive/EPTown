package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ReviewWrittenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.review_written);

        // 리뷰쓰기 텍스트 눌렀을때 review5 화면 이동
        TextView textview = findViewById(R.id.writeReview);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewWrittenActivity.this, ReviewRegister.class);
                startActivity(intent);
            }
        });

        // 더보기1 눌렀을때 review4로 화면 이동
        ImageButton imagebutton1 = findViewById(R.id.arrowOne);
        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewWrittenActivity.this, ReviewDetail.class);
                startActivity(intent);
            }
        });

        // 더보기2 눌렀을때 review4로 화면 이동
        ImageButton imagebutton2 = findViewById(R.id.arrowTwo);
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewWrittenActivity.this, ReviewDetail.class);
                startActivity(intent);
            }
        });

        // 더보기3 눌렀을때 review4로 화면 이동
        ImageButton imagebutton3 = findViewById(R.id.arrowThree);
        imagebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewWrittenActivity.this, ReviewDetail.class);
                startActivity(intent);
            }
        });

        // 수정 텍스트 눌렀을때 review6로 화면 이동
        TextView textview1 = findViewById(R.id.modify);
        textview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewWrittenActivity.this, ReviewModify.class);
                startActivity(intent);
            }
        });

        // 삭제 텍스트 눌렀을때 review_7로 화면 이동
        TextView textview2 = findViewById(R.id.delete);
        textview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewWrittenActivity.this, ReviewDeleteActivity.class);
                startActivity(intent);
            }
        });

        // 수정 텍스트 눌렀을때 review6로 화면 이동
        TextView textview3 = findViewById(R.id.modifyTwo);
        textview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewWrittenActivity.this, ReviewModify.class);
                startActivity(intent);
            }
        });

        // 삭제 텍스트 눌렀을때 review_7로 화면 이동
        TextView textview4 = findViewById(R.id.deleteTwo);
        textview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewWrittenActivity.this, ReviewDeleteActivity.class);
                startActivity(intent);
            }
        });

        // 수정 텍스트 눌렀을때 review6로 화면 이동
        TextView textview5 = findViewById(R.id.modifyThree);
        textview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewWrittenActivity.this, ReviewModify.class);
                startActivity(intent);
            }
        });

        // 삭제 텍스트 눌렀을때 review_7로 화면 이동
        TextView textview6 = findViewById(R.id.deleteThree);
        textview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewWrittenActivity.this, ReviewDeleteActivity.class);
                startActivity(intent);
            }
        });

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

        // 화면 이동 후 '리뷰가 수정되었습니다.' 메시지 표시
        String toastMessage = getIntent().getStringExtra("toastMessage");
        if (toastMessage != null && !toastMessage.isEmpty()) {
            showCustomToast(toastMessage);
        }
    }

    // 커스텀 토스트 메시지 표시
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

    // dp 단위를 px로 변환하는 메서드
    private int dpToPx(int dp) {
        float density = getResources().getDisplayMetrics().density;
        return (int) (dp * density);
    }
}

