package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OrderPayDetail extends AppCompatActivity {

    private View grayScreen;
    private View changeBox;
    private View grayStick;
    private View inquiryTypeTwo;
    private View courier;
    private View courierName;
    private View invoice;
    private View invoiceName;
    private View sendPeople;
    private View sendPeopleName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_pay_detail);

        // 환불요청1 눌렀을때 order_details3로 이동
        Button button = findViewById(R.id.refundButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OrderPayDetail.this, OrderDetailsRefundActivity.class);
                startActivity(intent);
            }
        });

        // 환불요청2 눌렀을때 order_details3로 이동
        Button button1 = findViewById(R.id.refundButtonTwo);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OrderPayDetail.this, OrderDetailsRefundActivity.class);
                startActivity(intent);
            }
        });

        // 문의하기 텍스트 눌렀을때 inquire6으로 이동
        TextView textview = findViewById(R.id.inquire);
        textview.setOnClickListener(view -> {
            Intent intent = new Intent(OrderPayDetail.this, InquireWriteActivity.class);
            startActivity(intent);
        });

        // 문의하기2 텍스트 눌렀을때 inquire6으로 이동
        TextView textview1 = findViewById(R.id.inquireTwo);
        textview1.setOnClickListener(view -> {
            Intent intent = new Intent(OrderPayDetail.this, InquireWriteActivity.class);
            startActivity(intent);
        });

        // 버튼과 뷰 연결
        ImageButton rightArrowOne = findViewById(R.id.rightArrowOne);
        grayScreen = findViewById(R.id.grayScreen);
        changeBox = findViewById(R.id.changeBox);
        grayStick = findViewById(R.id.grayStick);
        inquiryTypeTwo = findViewById(R.id.inquiryTypeTwo);
        courier = findViewById(R.id.courier);
        courierName = findViewById(R.id.courierName);
        invoice = findViewById(R.id.invoice);
        invoiceName = findViewById(R.id.invoiceName);
        sendPeople = findViewById(R.id.sendPeople);
        sendPeopleName = findViewById(R.id.sendPeopleName);

        // 버튼 클릭 이벤트
        rightArrowOne.setOnClickListener(v -> {
            grayScreen.setVisibility(View.VISIBLE);
            changeBox.setVisibility(View.VISIBLE);
            grayStick.setVisibility(View.VISIBLE);
            inquiryTypeTwo.setVisibility(View.VISIBLE);
            courier.setVisibility(View.VISIBLE);
            courierName.setVisibility(View.VISIBLE);
            invoice.setVisibility(View.VISIBLE);
            invoiceName.setVisibility(View.VISIBLE);
            sendPeople.setVisibility(View.VISIBLE);
            sendPeopleName.setVisibility(View.VISIBLE);
        });

        // 회색 화면 클릭 이벤트
        grayScreen.setOnClickListener(v -> {
            grayScreen.setVisibility(View.GONE);
            changeBox.setVisibility(View.GONE);
            grayStick.setVisibility(View.GONE);
            inquiryTypeTwo.setVisibility(View.GONE);
            courier.setVisibility(View.GONE);
            courierName.setVisibility(View.GONE);
            invoice.setVisibility(View.GONE);
            invoiceName.setVisibility(View.GONE);
            sendPeople.setVisibility(View.GONE);
            sendPeopleName.setVisibility(View.GONE);
        });

        // changeBox 클릭 시 화면이 사라지지 않도록 하기 위한 리스너
        changeBox.setOnClickListener(v -> {
            // 아무 동작도 하지 않음, 화면 사라지지 않도록
        });

        ImageButton btnBack = findViewById(R.id.btnOrderPayBack);
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
    }
}