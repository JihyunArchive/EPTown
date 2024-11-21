package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class health_information3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.health_information3);

        // 뒤로가기 버튼 눌렀을때 health_information 화면 이동
        ImageButton imagebutton = findViewById(R.id.btnCategoryFeed1Back);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(health_information3Activity.this, health_informationActivity.class);
                startActivity(intent);
            }
        });

        // 수정하기 버튼 눌렀을때 mypage으로 화면 이동
        Button button = findViewById(R.id.buyFixButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(health_information3Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // EditText 필드 참조
        EditText nameEnter = findViewById(R.id.nameEnter);
        EditText ageEnter = findViewById(R.id.ageEnter);
        EditText weightEnter = findViewById(R.id.weightEnter);
        EditText heightEnter = findViewById(R.id.heightEnter);
        EditText regularCheckUpEnter = findViewById(R.id.regularCheckUpEnter);
        EditText healthConditionEnter = findViewById(R.id.healthConditionEnter);

        // buyFixButton 클릭 시 Toast 메시지 표시
        button.setOnClickListener(v -> {
            showCustomToast("반려동물의 건강정보가 수정되었습니다");
        });
    }

    // 커스텀 Toast 메시지 표시 메서드
    private void showCustomToast(String message) {
        // LayoutInflater를 통해 커스텀 뷰를 로드
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast, findViewById(R.id.custom_toast_layout));

        // TextView에 메시지 설정
        TextView textView = layout.findViewById(R.id.custom_toast_message);
        textView.setText(message);

        // Toast 생성 및 설정
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        // 화면 하단에서 87dp 위로 위치 설정
        int yOffset = dpToPx(87);  // 87dp만큼 위로 설정
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, yOffset);
        toast.show();
    }

    // dp를 px로 변환하는 메서드
    private int dpToPx(int dp) {
        float density = getResources().getDisplayMetrics().density;
        return (int) (dp * density);
    }
}
