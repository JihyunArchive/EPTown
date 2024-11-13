package com.example.eptown_;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class inquire4Activity extends AppCompatActivity {

    // 상태를 추적하는 boolean 변수
    private boolean isExpanded = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.inquire4);

        // 필요한 뷰들을 찾음
        ImageView inquirySeeMoreIconOne = findViewById(R.id.inquirySeeMoreIconOne);
        View inquirySeeMoreBarOne = findViewById(R.id.inquirySeeMoreBarOne);
        View inquirySeeMoreTextOne = findViewById(R.id.inquirySeeMoreTextOne);

        // 기본 및 클릭 시 변경할 아이콘 리소스
        int defaultIconResource = R.drawable.ic_inquiry_top_arrow;
        int clickedIconResource = R.drawable.ic_inquiry_under_arrow;

        // inquirySeeMoreIconOne 클릭 리스너 추가
        inquirySeeMoreIconOne.setOnClickListener(v -> {
            if (isExpanded) {
                // 원상복귀 상태로 설정
                inquirySeeMoreIconOne.setImageResource(defaultIconResource);
                inquirySeeMoreBarOne.setVisibility(View.VISIBLE);
                inquirySeeMoreTextOne.setVisibility(View.VISIBLE);
            } else {
                // 확장 상태로 설정
                inquirySeeMoreIconOne.setImageResource(clickedIconResource);
                inquirySeeMoreBarOne.setVisibility(View.GONE);
                inquirySeeMoreTextOne.setVisibility(View.GONE);
            }
            // 상태를 반전
            isExpanded = !isExpanded;
        });
    }
}
