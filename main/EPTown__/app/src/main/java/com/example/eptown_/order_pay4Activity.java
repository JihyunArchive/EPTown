package com.example.eptown_;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class order_pay4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.order_pay4);

        EditText zipCodeContent = findViewById(R.id.zipCodeContent);
        EditText addressContent = findViewById(R.id.addressContent);
        EditText addressDetailContent = findViewById(R.id.addressDetailContent);
        EditText deliveryAddressContent = findViewById(R.id.deliveryAddressContent);
        EditText reciptientContent = findViewById(R.id.reciptientContent);
        EditText numberContent = findViewById(R.id.numberContent);
    }
}