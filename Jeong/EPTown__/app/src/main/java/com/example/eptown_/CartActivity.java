package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CartActivity extends AppCompatActivity {

    private ImageButton uncheckRectOne, colorRectOne, colorRectTwo, uncheckRectTwo, uncheckRectThree, btnMinus, btnPlus;
    private View grayScreen, priceBar;
    private ImageView changeBox, grayStick, grayBox, amount, deleteBox;
    private TextView productPriceTwo, theLargest, number, totalPriceTwo, deleteText, deleteProduct, totalAmount, totalPriceThree;
    private Button rectBoxOne, rectBoxTwo, cancel, check;

    private boolean isChecked = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart);

        // 뒤로가기 눌렀을때 메인으로 화면 이동
        ImageButton imagebutton = findViewById(R.id.btnCartBack);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CartActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // 구매하기 눌렀을때 주문/결제로 화면 이동
        Button button = findViewById(R.id.buyFixButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CartActivity.this, OrderPayActivity.class);
                startActivity(intent);
            }
        });

        // 초기화
        uncheckRectOne = findViewById(R.id.uncheckRectOne);
        colorRectOne = findViewById(R.id.colorRectOne);
        colorRectTwo = findViewById(R.id.colorRectTwo);
        uncheckRectTwo = findViewById(R.id.uncheckRectTwo);
        uncheckRectThree = findViewById(R.id.uncheckRectThree);

        grayScreen = findViewById(R.id.grayScreen);
        changeBox = findViewById(R.id.changeBox);
        grayStick = findViewById(R.id.grayStick);
        grayBox = findViewById(R.id.grayBox);
        productPriceTwo = findViewById(R.id.productPriceTwo);
        amount = findViewById(R.id.amount);
        btnMinus = findViewById(R.id.btnMinus);
        btnPlus = findViewById(R.id.btnPlus);
        theLargest = findViewById(R.id.theLargest);
        number = findViewById(R.id.number);
        totalPriceTwo = findViewById(R.id.totalPriceTwo);

        rectBoxOne = findViewById(R.id.rectBoxOne);
        rectBoxTwo = findViewById(R.id.rectBoxTwo);

        deleteBox = findViewById(R.id.deleteBox);
        deleteText = findViewById(R.id.deleteText);
        cancel = findViewById(R.id.cancel);
        check = findViewById(R.id.check);
        deleteProduct = findViewById(R.id.deleteProduct);
        priceBar = findViewById(R.id.priceBar);
        totalAmount = findViewById(R.id.totalAmount);
        totalPriceThree = findViewById(R.id.totalPriceThree);

        // 클릭 리스너 설정
        setupRectBoxClickListener(rectBoxOne, rectBoxTwo);

        // 회색 화면 클릭 시 숨김
        setupGrayScreenClickListener();

        // 각 버튼을 findViewById로 연결
        uncheckRectOne = findViewById(R.id.uncheckRectOne);
        colorRectOne = findViewById(R.id.colorRectOne);
        colorRectTwo = findViewById(R.id.colorRectTwo);
        uncheckRectTwo = findViewById(R.id.uncheckRectTwo);
        uncheckRectThree = findViewById(R.id.uncheckRectThree);

        // 각 버튼에 토글 기능 설정
        setupToggleButton(uncheckRectOne);
        setupToggleButton(uncheckRectTwo);
        setupToggleButton(uncheckRectThree);

        // 색깔 직사각형 그룹의 토글 기능 설정
        setupColorRectGroupToggle(colorRectOne, colorRectTwo);
        setupColorRectTwoToggle(colorRectTwo, colorRectOne);

        // uncheckRectOne 버튼을 눌렀을 때 처리할 토글 기능 설정
        setupUncheckRectOneToggle();

        // uncheckRectTwo와 uncheckRectThree를 동시에 토글하는 기능 설정
        setupUncheckRectTwoToggle();

        // uncheckRectThree와 uncheckRectTwo를 동시에 토글하는 기능 설정
        setupUncheckRectThreeToggle();

        View.OnClickListener reportClickListener = v -> showReportUI();

        deleteProduct.setOnClickListener(v -> showDeleteUI());

    }

    // 단일 버튼에 대한 토글 기능 설정
    private void setupToggleButton(ImageButton button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 버튼 클릭 시 상태가 체크된 상태라면 이미지 리소스를 'unchecked'로, 아니라면 'checked'로 변경
                if (isChecked) {
                    button.setImageResource(R.drawable.ic_uncheck_rect);
                } else {
                    button.setImageResource(R.drawable.ic_cart_check);
                }
                isChecked = !isChecked; // 상태 반전
            }
        });
    }

    // 두 개의 버튼을 동시에 토글하는 기능 설정
    private void setupColorRectGroupToggle(ImageButton button1, ImageButton button2) {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isChecked) {
                    button1.setImageResource(R.drawable.ic_uncheck_rect);
                    button2.setImageResource(R.drawable.ic_uncheck_rect);
                } else {
                    button1.setImageResource(R.drawable.ic_cart_check);
                    button2.setImageResource(R.drawable.ic_cart_check);
                }
                isChecked = !isChecked; // 상태 반전
            }
        });
    }

    // 두 번째 색깔 직사각형 버튼을 토글하는 기능 설정
    private void setupColorRectTwoToggle(ImageButton button1, ImageButton button2) {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isChecked) {
                    button1.setImageResource(R.drawable.ic_uncheck_rect);
                    button2.setImageResource(R.drawable.ic_uncheck_rect);
                } else {
                    button1.setImageResource(R.drawable.ic_cart_check);
                    button2.setImageResource(R.drawable.ic_cart_check);
                }
                isChecked = !isChecked; // 상태 반전
            }
        });
    }

    // uncheckRectOne 버튼을 눌렀을 때 모든 버튼 상태를 동시에 변경하는 기능 설정
    private void setupUncheckRectOneToggle() {
        uncheckRectOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 상태가 체크된 상태라면 모든 버튼을 'unchecked'로 변경, 아니라면 모두 'checked'로 변경
                if (isChecked) {
                    uncheckRectOne.setImageResource(R.drawable.ic_uncheck_rect);
                    colorRectOne.setImageResource(R.drawable.ic_uncheck_rect);
                    colorRectTwo.setImageResource(R.drawable.ic_uncheck_rect);
                    uncheckRectTwo.setImageResource(R.drawable.ic_uncheck_rect);
                    uncheckRectThree.setImageResource(R.drawable.ic_uncheck_rect);
                } else {
                    uncheckRectOne.setImageResource(R.drawable.ic_cart_check);
                    colorRectOne.setImageResource(R.drawable.ic_cart_check);
                    colorRectTwo.setImageResource(R.drawable.ic_cart_check);
                    uncheckRectTwo.setImageResource(R.drawable.ic_cart_check);
                    uncheckRectThree.setImageResource(R.drawable.ic_cart_check);
                }
                isChecked = !isChecked; // 상태 반전
            }
        });
    }

    // uncheckRectTwo 버튼을 눌렀을 때 uncheckRectTwo와 uncheckRectThree의 상태를 동시에 변경하는 기능 설정
    private void setupUncheckRectTwoToggle() {
        uncheckRectTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isChecked) {
                    uncheckRectTwo.setImageResource(R.drawable.ic_uncheck_rect);
                    uncheckRectThree.setImageResource(R.drawable.ic_uncheck_rect);
                } else {
                    uncheckRectTwo.setImageResource(R.drawable.ic_cart_check);
                    uncheckRectThree.setImageResource(R.drawable.ic_cart_check);
                }
                isChecked = !isChecked; // 상태 반전
            }
        });
    }

    // uncheckRectThree 버튼을 눌렀을 때 uncheckRectTwo와 uncheckRectThree의 상태를 동시에 변경하는 기능 설정
    private void setupUncheckRectThreeToggle() {
        uncheckRectThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isChecked) {
                    uncheckRectTwo.setImageResource(R.drawable.ic_uncheck_rect);
                    uncheckRectThree.setImageResource(R.drawable.ic_uncheck_rect);
                } else {
                    uncheckRectTwo.setImageResource(R.drawable.ic_cart_check);
                    uncheckRectThree.setImageResource(R.drawable.ic_cart_check);
                }
                isChecked = !isChecked; // 상태 반전
            }
        });
    }

    private void showReportUI() {
        grayScreen.setVisibility(View.VISIBLE);
        deleteBox.setVisibility(View.VISIBLE);
        deleteText.setVisibility(View.VISIBLE);
        cancel.setVisibility(View.VISIBLE);
        check.setVisibility(View.VISIBLE);
    }

    private void showDeleteUI() {
        grayScreen.setVisibility(View.VISIBLE);
        deleteBox.setVisibility(View.VISIBLE);
        deleteText.setVisibility(View.VISIBLE);
        cancel.setVisibility(View.VISIBLE);
        check.setVisibility(View.VISIBLE);
    }


    private void setupRectBoxClickListener(View... rectBoxes) {
        for (View rectBox : rectBoxes) {
            rectBox.setOnClickListener(v -> {
                toggleVisibility(
                        grayScreen, changeBox, grayStick, grayBox,
                        productPriceTwo, amount, btnMinus, btnPlus, theLargest, number, totalPriceTwo,
                        priceBar, totalAmount, totalPriceThree
                );
                applyBlurEffect(true, rectBoxOne, rectBoxTwo); // 블러 처리
            });
        }
    }

    private void setupGrayScreenClickListener() {
        grayScreen.setOnClickListener(v -> {
            toggleVisibility(grayScreen, changeBox, grayStick, grayBox, productPriceTwo, amount, btnMinus, btnPlus, theLargest, number, totalPriceTwo, priceBar, totalAmount, totalPriceThree) ;
            applyBlurEffect(false, rectBoxOne, rectBoxTwo); // 블러 해제
        });
    }

    private void toggleVisibility(View... views) {
        for (View view : views) {
            view.setVisibility(view.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
        }
    }

    private void applyBlurEffect(boolean shouldBlur, View... views) {
        for (View view : views) {
            view.setAlpha(shouldBlur ? 0.5f : 1.0f); // 블러 효과를 50%로 설정
        }

        // 뷰 요소를 찾기
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        number = findViewById(R.id.number);

        // btnPlus 클릭 이벤트 처리
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentNumber = Integer.parseInt(number.getText().toString());  // 현재 숫자를 가져옴

                // 숫자가 10보다 작을 때만 증가시킴
                if (currentNumber < 10) {
                    currentNumber++;  // 숫자를 1 증가시킴
                    number.setText(String.valueOf(currentNumber));  // TextView 업데이트
                    number.setVisibility(View.VISIBLE);  // TextView가 보이도록 설정
                }

                // 선택적으로 btnMinus의 가시성 처리 (btnPlus가 클릭되면 btnMinus가 보이도록 설정)
                btnMinus.setVisibility(View.VISIBLE);
            }
        });

        // btnMinus 클릭 이벤트 처리
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentNumber = Integer.parseInt(number.getText().toString());  // 현재 숫자를 가져옵니다.

                // 숫자가 1보다 클 때만 감소시킴
                if (currentNumber > 1) {
                    currentNumber--;  // 숫자를 1 감소시킵니다.
                    number.setText(String.valueOf(currentNumber));  // 텍스트 뷰를 업데이트합니다.
                }
            }
        });

        // changeBox 클릭 시 화면이 사라지지 않도록 하기 위한 리스너
        changeBox.setOnClickListener(v -> {
            // 아무 동작도 하지 않음, 화면 사라지지 않도록
        });

    }
}

