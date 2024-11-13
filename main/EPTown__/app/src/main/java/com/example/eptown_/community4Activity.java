package com.example.eptown_;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class community4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.community4);

        // EditText, ImageButton, TextView 참조
        EditText titleInput = findViewById(R.id.titleInput);
        EditText content = findViewById(R.id.content);
        ImageButton checkedCircle = findViewById(R.id.checkedCircle);
        TextView userName = findViewById(R.id.userName);

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
                userName.setTextColor(getResources().getColor(R.color.gray));  // 텍스트 색상 변경
            } else {
                checkedCircle.setImageResource(R.drawable.ic_checked_circle);  // ic_checked_circle로 변경
                checkedCircle.setTag("checked");  // 상태 변경
                // 체크된 상태일 때 익명 텍스트 숨기기 및 색상 원래대로 변경
                userName.setTextColor(getResources().getColor(R.color.orange));  // 색상 원래대로
            }
        });
    }
}
