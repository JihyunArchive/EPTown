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

public class ReviewAddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.review_add);

        showCustomToast("리뷰가 등록되었습니다.");

        // 뒤로가기 눌렀을때 마이페이지로 화면 이동
        ImageButton imagebutton = findViewById(R.id.btnCategoryFeed1Back);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewAddActivity.this, MyPageActivity.class);
                startActivity(intent);
            }
        });

        // 리뷰쓰기 텍스트 눌렀을때 review5 화면 이동
        TextView textview = findViewById(R.id.writeReview);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewAddActivity.this, ReviewRegister.class);
                startActivity(intent);
            }
        });

        // 더보기1 눌렀을때 review4로 화면 이동
        ImageButton imagebutton1 = findViewById(R.id.arrowOne);
        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewAddActivity.this, ReviewDetail.class);
                startActivity(intent);
            }
        });

        // 더보기2 눌렀을때 review4로 화면 이동
        ImageButton imagebutton2 = findViewById(R.id.arrowTwo);
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewAddActivity.this, ReviewDetail.class);
                startActivity(intent);
            }
        });

        // 더보기3 눌렀을때 review4로 화면 이동
        ImageButton imagebutton3 = findViewById(R.id.arrowThree);
        imagebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewAddActivity.this, ReviewDetail.class);
                startActivity(intent);
            }
        });

        // 더보기4 눌렀을때 review4로 화면 이동
        ImageButton imagebutton4 = findViewById(R.id.arrowFour);
        imagebutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewAddActivity.this, ReviewDetail.class);
                startActivity(intent);
            }
        });

        // 수정 텍스트 눌렀을때 review6로 화면 이동
        TextView textview1 = findViewById(R.id.modify);
        textview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewAddActivity.this, ReviewModify.class);
                startActivity(intent);
            }
        });

        // 삭제 텍스트 눌렀을때 review_7로 화면 이동
        TextView textview2 = findViewById(R.id.delete);
        textview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewAddActivity.this, ReviewDeleteActivity.class);
                startActivity(intent);
            }
        });

        // 수정 텍스트 눌렀을때 review6로 화면 이동
        TextView textview3 = findViewById(R.id.modifyTwo);
        textview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewAddActivity.this, ReviewModify.class);
                startActivity(intent);
            }
        });

        // 삭제 텍스트 눌렀을때 review_7로 화면 이동
        TextView textview4 = findViewById(R.id.deleteTwo);
        textview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewAddActivity.this, ReviewDeleteActivity.class);
                startActivity(intent);
            }
        });

        // 수정 텍스트 눌렀을때 review6로 화면 이동
        TextView textview5 = findViewById(R.id.modifyThree);
        textview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewAddActivity.this, ReviewModify.class);
                startActivity(intent);
            }
        });

        // 삭제 텍스트 눌렀을때 review_7로 화면 이동
        TextView textview6 = findViewById(R.id.deleteThree);
        textview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewAddActivity.this, ReviewDeleteActivity.class);
                startActivity(intent);
            }
        });

        // 수정 텍스트 눌렀을때 review6로 화면 이동
        TextView textview7 = findViewById(R.id.modifyFour);
        textview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewAddActivity.this, ReviewModify.class);
                startActivity(intent);
            }
        });

        // 삭제 텍스트 눌렀을때 review_7로 화면 이동
        TextView textview8 = findViewById(R.id.deleteFour);
        textview8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReviewAddActivity.this, ReviewDeleteActivity.class);
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
