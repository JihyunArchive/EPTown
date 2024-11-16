package com.example.eptown_;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Login extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private DatabaseReference mDatabaseRef;
    private EditText idText, passwordText;
    private Button btnContinueColorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        // Firebase 인증 객체 초기화
        mAuth = FirebaseAuth.getInstance();
        // Firebase Realtime Database 객체 초기화
        mDatabaseRef = FirebaseDatabase.getInstance().getReference();

        // EditText와 버튼 초기화
        idText = findViewById(R.id.idText);
        passwordText = findViewById(R.id.passwordText);
        btnContinueColorButton = findViewById(R.id.btnContinueColorButton);

        // 상태바 및 네비게이션 바 색상 설정
        setStatusBarAndNavigationBar();

        // 로그인 버튼 클릭 시 이벤트 처리
        btnContinueColorButton.setOnClickListener(view -> attemptLogin());

        // 텍스트 변경 시 버튼 색상 업데이트
        idText.addTextChangedListener(new android.text.TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                updateLoginButtonState();
            }

            @Override
            public void afterTextChanged(android.text.Editable editable) {}
        });

        passwordText.addTextChangedListener(new android.text.TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                updateLoginButtonState();
            }

            @Override
            public void afterTextChanged(android.text.Editable editable) {}
        });
    }

    private void attemptLogin() {
        String email = idText.getText().toString();
        String password = passwordText.getText().toString();

        // 이메일 또는 비밀번호가 비어있는지 확인
        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "이메일과 비밀번호를 입력하세요.", Toast.LENGTH_SHORT).show();
            return;
        }

        // Firebase Authentication을 사용하여 로그인 시도
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        navigateToMainActivity();
                    } else {
                        String errorMessage = task.getException() != null ? task.getException().getMessage() : "로그인 실패";
                        Toast.makeText(this, "아이디 또는 비밀번호가 올바르지 않습니다.", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    // 상태바 및 네비게이션 바 색상 설정 메서드
    private void setStatusBarAndNavigationBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(Color.WHITE);
            window.setNavigationBarColor(Color.WHITE);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                window.getDecorView().setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
                );
            }
        }
    }

    // MainActivity로 이동하는 메서드
    private void navigateToMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish(); // 현재 Login Activity 종료
    }

    // 로그인 버튼 색상 업데이트 메서드
    private void updateLoginButtonState() {
        String email = idText.getText().toString();
        String password = passwordText.getText().toString();

        // 이메일과 비밀번호가 모두 입력되었을 때 버튼을 주황색으로 변경
        if (!email.isEmpty() && !password.isEmpty()) {
            btnContinueColorButton.setBackgroundColor(Color.parseColor("#FFA500")); // 주황색
            btnContinueColorButton.setTextColor(Color.WHITE); //글시 하얀색
        } else {
            btnContinueColorButton.setBackgroundColor(Color.GRAY); // 비활성화된 색상
        }
    }
}
