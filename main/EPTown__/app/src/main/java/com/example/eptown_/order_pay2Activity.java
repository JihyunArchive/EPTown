package com.example.eptown_;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class order_pay2Activity extends AppCompatActivity {

    private boolean isRequestVisible = false; // 요청사항 창 상태 확인 변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.order_pay2);

        EditText request = findViewById(R.id.request);
        EditText userName = findViewById(R.id.userName);
        EditText userEmail = findViewById(R.id.userEmail);
        EditText userNumber = findViewById(R.id.userNumber);

        // 배송 요청사항 관련 UI 요소
        ImageButton underArrow = findViewById(R.id.underArrow);
        View rectBoxFive = findViewById(R.id.rectBoxFive);
        EditText requestTwo = findViewById(R.id.requestTwo);

        // 처음에는 요청사항 창을 숨김
        rectBoxFive.setVisibility(View.GONE);
        requestTwo.setVisibility(View.GONE);

        // 화살표 버튼 클릭 리스너 추가
        underArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isRequestVisible) {
                    // 요청사항 창을 숨김
                    rectBoxFive.setVisibility(View.GONE);
                    requestTwo.setVisibility(View.GONE);
                    underArrow.setImageResource(R.drawable.ic_under_arrow);
                } else {
                    // 요청사항 창을 표시
                    rectBoxFive.setVisibility(View.VISIBLE);
                    requestTwo.setVisibility(View.VISIBLE);
                    underArrow.setImageResource(R.drawable.ic_up_arrow);
                }
                isRequestVisible = !isRequestVisible; // 상태 토글
            }
        });
    }
}
