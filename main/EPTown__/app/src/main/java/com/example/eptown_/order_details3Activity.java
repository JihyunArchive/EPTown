package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class order_details3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.order_details3);

        EditText titleInput = findViewById(R.id.contentInformation);

        // 뒤로가기 버튼 누르면 주문상세로 화면 이동
        ImageButton imagebutton = findViewById(R.id.btnCategoryFeed1Back);
        imagebutton.setOnClickListener(view -> {
                Intent intent = new Intent(order_details3Activity.this, order_pay6Activity.class);
                startActivity(intent);
        });

        // 접수하기 눌렀을때 주문상세로 화면 이동
        Button button = findViewById(R.id.buyFixButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(order_details3Activity.this, order_pay8Activity.class);
                startActivity(intent);
            }
        });

    }
}