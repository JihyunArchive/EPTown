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

public class review_deleteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.review_delete);

        // 리뷰가 등록되었음을 알리는 토스트 메시지
        showCustomToast("리뷰가 삭제되었습니다.");

        // 뒤로가기 눌렀을때 마이페이지로 화면 이동
        ImageButton imagebutton = findViewById(R.id.btnCategoryFeed1Back);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(review_deleteActivity.this, MyPageActivity.class);
                startActivity(intent);
            }
        });

        // 리뷰쓰기 텍스트 눌렀을때 review_register 화면 이동
        TextView textview = findViewById(R.id.writeReview);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(review_deleteActivity.this, review_register.class);
                startActivity(intent);
            }
        });

        // 더보기1 눌렀을때 review_detail 화면 이동
        ImageButton imagebutton1 = findViewById(R.id.arrowOne);
        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(review_deleteActivity.this, review_detail.class);
                startActivity(intent);
            }
        });

        // 더보기2 눌렀을때 review_detail 화면 이동
        ImageButton imagebutton2 = findViewById(R.id.arrowTwo);
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(review_deleteActivity.this, review_detail.class);
                startActivity(intent);
            }
        });

        // 수정 텍스트 눌렀을때 review_modify 화면 이동
        TextView textview1 = findViewById(R.id.modify);
        textview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(review_deleteActivity.this, review_modify.class);
                startActivity(intent);
            }
        });

        // 두 번째 수정 텍스트 눌렀을때 review_modify 화면 이동
        TextView textview3 = findViewById(R.id.modifyTwo);
        textview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(review_deleteActivity.this, review_modify.class);
                startActivity(intent);
            }
        });
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
