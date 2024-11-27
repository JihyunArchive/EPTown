package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class PersonalInformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.personal_information);


        // 수정하기 버튼 누르면 마이페이지로 화면 이동
        Button button = findViewById(R.id.buyFixButton);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(PersonalInformationActivity.this, MyPageActivity.class);
            startActivity(intent);
        });

        ImageButton btnBack = findViewById(R.id.btnLoginBack);
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

        // EditText 뷰들을 찾음
        EditText addressDetailSpaces = findViewById(R.id.addressDetailSpaces);
        EditText phoneNumberSpaces = findViewById(R.id.phoneNumberSpaces);
        EditText birthdayDateSpaces = findViewById(R.id.birthdayDateSpaces);
        EditText genderSelectSpaces = findViewById(R.id.genderSelectSpaces);
        EditText verificationEnter = findViewById(R.id.verificationEnter);
        EditText zipCodeEnter = findViewById(R.id.zipCodeEnter);
        EditText addressEnter = findViewById(R.id.addressEnter);
        EditText detailAddressEnter = findViewById(R.id.detailAddressEnter);

        // 버튼들 찾음
        Button verificationTransmit = findViewById(R.id.verificationTransmit);
        Button verificationTransmitTwo = findViewById(R.id.verificationTransmitTwo);
        Button verificationEnterButton = findViewById(R.id.verificationEnterButton);
        Button verificationEnterButtonTwo = findViewById(R.id.verificationEnterButtonTwo);
        Button zipCodeButton = findViewById(R.id.zipCodeButton);
        Button zipCodeButtonTwo = findViewById(R.id.zipCodeButtonTwo);
        Button buyFixButton = findViewById(R.id.buyFixButton);

        // 회원정보 수정 완료 메시지 관련 뷰들
        ImageView registerBox = findViewById(R.id.registerBox);
        TextView register = findViewById(R.id.register);

        // genderSelectSpaces에 TextWatcher 추가
        genderSelectSpaces.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // 필요 시 구현
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    verificationTransmit.setVisibility(View.GONE);
                    verificationTransmitTwo.setVisibility(View.VISIBLE);
                } else {
                    verificationTransmit.setVisibility(View.VISIBLE);
                    verificationTransmitTwo.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                // 필요 시 구현
            }
        });

        // verificationEnter에 TextWatcher 추가
        verificationEnter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // 필요 시 구현
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    verificationEnterButton.setVisibility(View.GONE);
                    verificationEnterButtonTwo.setVisibility(View.VISIBLE);
                } else {
                    verificationEnterButton.setVisibility(View.VISIBLE);
                    verificationEnterButtonTwo.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                // 필요 시 구현
            }
        });

        // zipCodeEnter에 TextWatcher 추가
        zipCodeEnter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // 필요 시 구현
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    zipCodeButton.setVisibility(View.GONE);
                    zipCodeButtonTwo.setVisibility(View.VISIBLE);
                } else {
                    zipCodeButton.setVisibility(View.VISIBLE);
                    zipCodeButtonTwo.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                // 필요 시 구현
            }
        });

        // buyFixButton 클릭 시 메시지 표시
        buyFixButton.setOnClickListener(v -> showCustomToast("회원정보가 수정되었습니다"));
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
