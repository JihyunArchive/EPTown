package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class login3Activity extends AppCompatActivity {
    private EditText zipCodeInput, phoneNumberInput, addressInput, addressDetailInput, birthdayDateInput, genderSelectInput;
    private Button btnJoin;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login3);
        EdgeToEdge.enable(this);  // 시스템 바에 맞춰 화면 가장자리가 잘 보이도록 설정

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        // EditText initialization
        zipCodeInput = findViewById(R.id.zipCodeInput);
        phoneNumberInput = findViewById(R.id.phoneNumberInput);
        addressInput = findViewById(R.id.addressInput);
        addressDetailInput = findViewById(R.id.addressDetailInput);
        birthdayDateInput = findViewById(R.id.birthdayDateInput);
        genderSelectInput = findViewById(R.id.genderSelectInput);
        btnJoin = findViewById(R.id.btnJoin);

        // Add text watchers to validate inputs and enable/disable the join button
        addTextWatchers();

        // Retrieve data from login1Activity
        String userName = getIntent().getStringExtra("userName");
        String userEmail = getIntent().getStringExtra("userEmail");
        String userPassword = getIntent().getStringExtra("userPassword");

        // Button to save user details and create an account
        btnJoin.setOnClickListener(v -> createAccount(userName, userEmail, userPassword));
    }

    // Add text watchers for form validation
    private void addTextWatchers() {
        TextWatcher formValidator = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                checkFormValid();
            }

            @Override
            public void afterTextChanged(Editable editable) {}
        };

        zipCodeInput.addTextChangedListener(formValidator);
        phoneNumberInput.addTextChangedListener(formValidator);
        addressInput.addTextChangedListener(formValidator);
        addressDetailInput.addTextChangedListener(formValidator);
        birthdayDateInput.addTextChangedListener(formValidator);
    }

    // Check if all fields are valid, if so, enable btnJoin with orange color
    private void checkFormValid() {
        boolean isFormValid = !zipCodeInput.getText().toString().isEmpty() &&
                !phoneNumberInput.getText().toString().isEmpty() &&
                !addressInput.getText().toString().isEmpty() &&
                !addressDetailInput.getText().toString().isEmpty() &&
                !birthdayDateInput.getText().toString().isEmpty() &&
                isValidPhoneNumber(phoneNumberInput.getText().toString()) &&
                isValidBirthday(birthdayDateInput.getText().toString());

        if (isFormValid) {
            btnJoin.setEnabled(true);
            btnJoin.setBackgroundColor(getResources().getColor(R.color.orange));  // Change to orange color
        } else {
            btnJoin.setEnabled(false);
            btnJoin.setBackgroundColor(getResources().getColor(R.color.gray));  // Change to gray when disabled
        }
    }

    // 계정 생성 및 Firebase에 저장
    private void createAccount(String userName, String userEmail, String userPassword) {
        // Firebase Authentication to create the user account
        mAuth.createUserWithEmailAndPassword(userEmail, userPassword)
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        // User successfully created
                        FirebaseUser user = mAuth.getCurrentUser();

                        if (user != null) {
                            saveUserDetails(userName, userEmail, user.getUid());
                        }
                    } else {
                        // If sign up fails, display a message to the user.
                        Toast.makeText(login3Activity.this, "Authentication failed: " + task.getException(), Toast.LENGTH_SHORT).show();
                    }
                });
    }

    //Firebase Realtime Database에 저장
    private void saveUserDetails(String userName, String userEmail, String userId) {
        // 입력된 정보 가져오기
        String userPhone = phoneNumberInput.getText().toString();
        String userPost = zipCodeInput.getText().toString();
        String userAddress = addressInput.getText().toString();
        String userAddressDetail = addressDetailInput.getText().toString();
        String userBirthday = birthdayDateInput.getText().toString();
        String genderStr = genderSelectInput.getText().toString();

        // 전화번호 및 생년월일 유효성 검사
        if (!isValidPhoneNumber(userPhone)) {
            Toast.makeText(this, "올바른 전화번호 형식을 입력해주세요.", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!isValidBirthday(userBirthday)) {
            Toast.makeText(this, "올바른 생일 형식을 입력해주세요. (예: YYYY-MM-DD)", Toast.LENGTH_SHORT).show();
            return;
        }

        // 성별 정보 처리 (남성: true, 여성: false)
        Boolean userGender = null;
        if (genderStr.equalsIgnoreCase("남성")) {
            userGender = true;
        } else if (genderStr.equalsIgnoreCase("여성")) {
            userGender = false;
        }

        // 사용자 데이터 준비 (UserAccount 객체 생성)
        UserAccount userAccount = new UserAccount(userName, userEmail, userPhone, userPost, userAddress, userAddressDetail, userBirthday, userGender);

        // Firebase Realtime Database에 사용자 정보 저장
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("users").child(userId);
        reference.setValue(userAccount)
                .addOnSuccessListener(aVoid -> {
                    // 회원가입 완료 메시지
                    Toast.makeText(this, "회원가입에 성공했습니다.", Toast.LENGTH_SHORT).show();

                    // Login 화면으로 이동
                    Intent intent = new Intent(this, Login.class);  // loginActivity는 Login 화면을 나타내는 액티비티
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // 현재 액티비티 종료
                    startActivity(intent);
                    finish();  // 현재 회원가입 액티비티 종료
                })
                .addOnFailureListener(e -> {
                    Toast.makeText(this, "데이터 저장에 실패했습니다: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                });
    }

    // 이메일 유효성 검사
    private boolean isValidEmail(String email) {
        String emailPattern = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailPattern);
    }

    // 전화번호 유효성 검사
    private boolean isValidPhoneNumber(String phoneNumber) {
        String phonePattern = "^\\d{3}-\\d{4}-\\d{4}$";
        return phoneNumber.matches(phonePattern);
    }

    // 생일 유효성 검사
    private boolean isValidBirthday(String birthday) {
        String birthdayPattern = "^\\d{4}-\\d{2}-\\d{2}$";
        return birthday.matches(birthdayPattern);
    }
}
