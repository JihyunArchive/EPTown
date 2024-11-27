package com.example.eptown_;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class inquire10Activity extends AppCompatActivity {

    // 뷰 요소들 선언
    private View grayScreen;
    private View buyBarTwo, changeBox, grayStick, changeBoxTwo, grayStickTwo;
    private Button cancelButtonTwo, registrationButtonTwo, registrationButtonThree;
    private Button registrationButton, registrationButtonColor; // 등록 버튼 추가
    private TextView inquiryTypeTwo, product, service, order, delivery, nameEnter, inquiryProductType, productPrice;
    private TextView lastSelectedTextView; // 마지막으로 선택된 TextView를 추적하는 변수
    private TextView optionChoice; // optionChoice TextView
    private EditText contentInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this); // EdgeToEdge 설정
        setContentView(R.layout.inquire10); // 레이아웃 설정

        // 뒤로가기 눌렀을때 itemdetailsinquiry로 화면 이동
        ImageButton imagebutton = findViewById(R.id.btnCategoryFeed1Back);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(inquire10Activity.this, ItemDetailsInquiry.class);
                startActivity(intent);
            }
        });

        // 등록 버튼 클릭시 inquire7로 화면 이동
        registrationButtonColor = findViewById(R.id.registrationButtonColor);
        registrationButtonColor.setOnClickListener(view -> {
            Intent intent = new Intent(inquire10Activity.this, inquire7Activity.class);
            startActivity(intent);
        });

        // 취소 버튼 클릭시 inquire4로 화면 이동
        Button button1 = findViewById(R.id.cancelButton);
        button1.setOnClickListener(view -> {
            Intent intent = new Intent(inquire10Activity.this, ItemDetailsInquiry.class);
            startActivity(intent);
        });

        // EditText 초기화
        EditText titleInformation = findViewById(R.id.titleInformation);
        EditText contentInformation = findViewById(R.id.contentInformation);

        // 뷰 초기화
        ImageButton underArrow = findViewById(R.id.underArrow);
        grayScreen = findViewById(R.id.grayScreen);
        buyBarTwo = findViewById(R.id.buyBarTwo);
        cancelButtonTwo = findViewById(R.id.cancelButtonTwo);
        registrationButtonTwo = findViewById(R.id.registrationButtonTwo);
        changeBox = findViewById(R.id.changeBox);
        grayStick = findViewById(R.id.grayStick);
        inquiryTypeTwo = findViewById(R.id.inquiryTypeTwo);
        product = findViewById(R.id.product);
        service = findViewById(R.id.service);
        order = findViewById(R.id.order);
        delivery = findViewById(R.id.delivery);
        nameEnter = findViewById(R.id.nameEnter);
        ImageButton underArrowTwo = findViewById(R.id.underArrowTwo);
        changeBoxTwo = findViewById(R.id.changeBoxTwo);
        grayStickTwo = findViewById(R.id.grayStickTwo);
        inquiryProductType = findViewById(R.id.inquiryProductType);
        productPrice = findViewById(R.id.productPrice);
        optionChoice = findViewById(R.id.optionChoice);

        // TextView 클릭 리스너 설정
        setupTextViewClickListener(product);
        setupTextViewClickListener(service);
        setupTextViewClickListener(order);
        setupTextViewClickListener(delivery);
        setupTextViewClickListener(inquiryProductType); // inquiryProductType 클릭 리스너 설정
        setupTextViewClickListener(productPrice); // productPrice 클릭 리스너 설정

        // 아래 화살표 버튼 클릭 시 UI 표시
        underArrow.setOnClickListener(v -> showUIForFirstSet());

        // 두 번째 화살표 버튼 클릭 시 UI 표시
        underArrowTwo.setOnClickListener(v -> showUIForSecondSet());

        // 회색 화면 클릭 시 UI 숨기기
        grayScreen.setOnClickListener(v -> hideAllUI());

        // EditText에 TextWatcher 추가
        registrationButton = findViewById(R.id.registrationButton);
        contentInformation.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // 입력 변경 전 처리 (필요 없다면 생략 가능)
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // 글자 입력 상태에 따라 버튼 전환
                if (s.toString().trim().isEmpty()) {
                    // 입력이 비어있으면 회색 버튼 표시
                    registrationButton.setVisibility(View.VISIBLE);
                    registrationButtonColor.setVisibility(View.GONE);
                } else {
                    // 입력이 있으면 검은색 버튼 표시
                    registrationButton.setVisibility(View.GONE);
                    registrationButtonColor.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                // 입력 변경 후 처리 (필요 없다면 생략 가능)
            }
        });
    }

    // TextView 클릭 리스너 설정 메서드
    private void setupTextViewClickListener(TextView textView) {
        textView.setOnClickListener(v -> {
            // 마지막으로 선택된 TextView 색상을 기본값으로 복원
            if (lastSelectedTextView != null) {
                lastSelectedTextView.setTextColor(Color.BLACK); // 기본 검정색으로 설정
            }

            // 새로 선택된 TextView의 색상을 변경하고 참조 업데이트
            textView.setTextColor(Color.parseColor("#FFA500")); // 주황색으로 설정
            lastSelectedTextView = textView;

            // 옵션 선택에 대한 텍스트 설정 (옵션을 선택해달라는 안내 텍스트)
            if (textView == inquiryProductType || textView == productPrice) {
                optionChoice.setText(textView.getText()); // optionChoice에만 설정
            } else {
                nameEnter.setText(textView.getText()); // 그 외 텍스트는 nameEnter에 설정
            }

            hideAllUI(); // 모든 UI 요소 숨기기
        });
    }

    // 첫 번째 UI 표시 메서드
    private void showUIForFirstSet() {
        grayScreen.setVisibility(View.VISIBLE);
        buyBarTwo.setVisibility(View.VISIBLE);
        cancelButtonTwo.setVisibility(View.VISIBLE);
        registrationButtonTwo.setVisibility(View.VISIBLE);
        changeBox.setVisibility(View.VISIBLE);
        grayStick.setVisibility(View.VISIBLE);
        inquiryTypeTwo.setVisibility(View.VISIBLE);
        product.setVisibility(View.VISIBLE);
        service.setVisibility(View.VISIBLE);
        order.setVisibility(View.VISIBLE);
        delivery.setVisibility(View.VISIBLE);

        // 마지막으로 선택된 TextView 강조 표시
        if (lastSelectedTextView != null) {
            lastSelectedTextView.setTextColor(Color.parseColor("#FFA500"));
        }
    }

    // 두 번째 UI 표시 메서드
    private void showUIForSecondSet() {
        grayScreen.setVisibility(View.VISIBLE);  // 회색 화면을 표시
        changeBoxTwo.setVisibility(View.VISIBLE);
        grayStickTwo.setVisibility(View.VISIBLE);
        inquiryProductType.setVisibility(View.VISIBLE);
        productPrice.setVisibility(View.VISIBLE);
        buyBarTwo.setVisibility(View.VISIBLE);
        cancelButtonTwo.setVisibility(View.VISIBLE);
        registrationButtonTwo.setVisibility(View.VISIBLE);
    }

    // 모든 UI 숨기기 메서드
    private void hideAllUI() {
        grayScreen.setVisibility(View.GONE);
        buyBarTwo.setVisibility(View.GONE);
        cancelButtonTwo.setVisibility(View.GONE);
        registrationButtonTwo.setVisibility(View.GONE);
        changeBox.setVisibility(View.GONE);
        grayStick.setVisibility(View.GONE);
        inquiryTypeTwo.setVisibility(View.GONE);
        product.setVisibility(View.GONE);
        service.setVisibility(View.GONE);
        order.setVisibility(View.GONE);
        delivery.setVisibility(View.GONE);
        changeBoxTwo.setVisibility(View.GONE);
        grayStickTwo.setVisibility(View.GONE);
        inquiryProductType.setVisibility(View.GONE);
        productPrice.setVisibility(View.GONE);
    }
}