package com.example.eptown_;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Login extends AppCompatActivity {
    private FirebaseAuth nFirebaseAuth;
    private DatabaseReference nDatabaseRef;
    private EditText idText, passwordText;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        nFirebaseAuth = FirebaseAuth.getInstance();
        nDatabaseRef = FirebaseDatabase.getInstance().getReference();

        idText = findViewById(R.id.idText);
        passwordText = findViewById(R.id.passwordText);
        btnLogin = findViewById(R.id.btnLogin);

        // 로그인 버튼 눌렀을때 메인으로 화면 이동
        Button image = (Button) findViewById(R.id.btnLogin);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 상태바 및 네비게이션 바 배경을 흰색으로, 아이콘 색상을 검정으로 설정 (API 21 이상)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

            // 상태바 배경색을 흰색으로 설정
            window.setStatusBarColor(Color.WHITE);

            // 네비게이션 바 배경색을 흰색으로 설정
            window.setNavigationBarColor(Color.WHITE);

            // 상태바 및 네비게이션 바 아이콘 색상을 검정색으로 설정 (API 26 이상)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                window.getDecorView().setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
                );
            }
        }
    }
}
