package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class review_modify extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.review_modify);

        // 뒤로가기 눌렀을때 리뷰로 화면 이동
        ImageButton imagebutton = findViewById(R.id.btnCategoryFeed1Back);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(review_modify.this, review_writtenActivity.class);
                startActivity(intent);
            }
        });

        // 수정하기 버튼 눌렀을때 리뷰로 화면 이동
        Button button = findViewById(R.id.buyFixButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(review_modify.this, review_writtenActivity.class);
                intent.putExtra("toastMessage", "리뷰가 수정되었습니다."); // 메시지를 전달
                startActivity(intent);
            }
        });

        EditText content = findViewById(R.id.content);

    }
}