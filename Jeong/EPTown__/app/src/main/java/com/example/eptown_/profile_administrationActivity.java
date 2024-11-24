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

public class profile_administrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.profile_administration);

        // 버튼 참조
        Button buyFixButton = findViewById(R.id.buyFixButton);
        Button choiceButtonTwo = findViewById(R.id.choiceButtonTwo);
        Button choiceButtonThree = findViewById(R.id.choiceButtonThree);

        // buyFixButton 클릭 시 동작 설정
        buyFixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // choiceButtonTwo를 숨기게 함
                choiceButtonThree.setVisibility(View.VISIBLE);
            }
        });

        // 뒤로가기 눌렀을 때 마이페이지로 화면 이동
        ImageButton imageButton = findViewById(R.id.btnLoginBack);
        imageButton.setOnClickListener(view -> {
            Intent intent = new Intent(profile_administrationActivity.this, MyPageActivity.class);
            startActivity(intent);
        });

        // 플목이 눌렀을 때 profile_administration3로 화면 이동
        Button button = findViewById(R.id.choiceButtonOne);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(profile_administrationActivity.this, profile_administration3Activity.class);
            startActivity(intent);
        });

        // 몽실이 눌렀을 때 profile_administration3로 화면 이동
        Button button1 = findViewById(R.id.choiceButtonThree);
        button1.setOnClickListener(view -> {
            Intent intent = new Intent(profile_administrationActivity.this, profile_administration4Activity.class);
            startActivity(intent);
        });

        // EditText 참조
        EditText nameEnter = findViewById(R.id.nameEnter);
        EditText birthdayEnter = findViewById(R.id.birthdayEnter);
        EditText ageEnter = findViewById(R.id.ageEnter);
        EditText genderEnter = findViewById(R.id.genderEnter);
        EditText kindEnter = findViewById(R.id.kindEnter);
    }

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
