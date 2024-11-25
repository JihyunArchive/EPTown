package com.example.eptown_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class PetAdministration extends AppCompatActivity {

    private TextView name, nameEnter, birthday, birthdayEnter, age, ageEnter, gender, genderEnter, kind, kindEnter,
            weigth, weigthEnter, heigher, heigherEnter, regularCheck, regularCheckEnter, healthCondition,
            healthConditionEnter, nameTwo, nameTwoEnter, birthdayTwo, birthdayTwoEnter, ageTwo, ageTwoEnter, genderTwo,
            genderTwoEnter, kindTwo, kindTwoEnter, weigthTwo, weigthTwoEnter, heigherTwo, heigherTwoEnter, regularCheckTwo,
            regularCheckTwoEnter, healthConditionTwo, healthConditionTwoEnter, nameThree, nameThreeEnter, birthdayThree,
            birthdayThreeEnter, ageThree, ageThreeEnter, genderThree, genderThreeEnter, kindThree, kindThreeEnter,
            weigthThree, weigthThreeEnter, heigherThree, heigherThreeEnter, regularCheckThree, regularCheckThreeEnter,
            healthConditionThree, healthConditionEnterThree;

    private ImageView enterBoxOne, enterBoxTwo, enterBoxThree, enterBoxFour, enterBoxFive, enterBoxSix, enterBoxSeven,
            enterBoxEight, enterBoxNine, buyFixBar, enterBoxTen, enterBoxEleven, enterBoxTwelve, enterBoxThirteen,
            enterBoxFourteen, enterBoxFifteen, enterBoxSixteen, enterBoxSeventeen, enterBoxEighteen, buyBar, enterBoxNinteen,
            enterBoxTwenty, enterBoxTwentyOne, enterBoxTwentyTwo, enterBoxTwentyThree, enterBoxTwentyFour, enterBoxTwentyFive,
            enterBoxTwentySix, enterBoxTwentySeven;

    private Button modifyButton, buyFixButton, choiceButtonTwo, choiceButtonThree, choiceButtonFour, choiceButtonFive, choiceButtonOne, choiceButtonSix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.pet_administration);

        // 뒤로가기 버튼 눌렀을 때 mypage로 화면 이동
        ImageButton imagebutton = findViewById(R.id.btnCategoryFeed1Back);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PetAdministration.this, MyPageActivity.class);
                startActivity(intent);
            }
        });

        name = findViewById(R.id.name);
        nameEnter = findViewById(R.id.nameEnter);
        birthday = findViewById(R.id.birthday);
        birthdayEnter = findViewById(R.id.birthdayEnter);
        age = findViewById(R.id.age);
        ageEnter = findViewById(R.id.ageEnter);
        gender = findViewById(R.id.gender);
        genderEnter = findViewById(R.id.genderEnter);
        kind = findViewById(R.id.kind);
        kindEnter = findViewById(R.id.kindEnter);
        weigth = findViewById(R.id.weigth);
        weigthEnter = findViewById(R.id.weigthEnter);
        heigher = findViewById(R.id.heigher);
        heigherEnter = findViewById(R.id.heigherEnter);
        regularCheck = findViewById(R.id.regularCheck);
        regularCheckEnter = findViewById(R.id.regularCheckEnter);
        healthCondition = findViewById(R.id.healthCondition);
        healthConditionEnter = findViewById(R.id.healthConditionEnter);
        nameTwo = findViewById(R.id.nameTwo);
        nameTwoEnter = findViewById(R.id.nameTwoEnter);
        birthdayTwo = findViewById(R.id.birthdayTwo);
        birthdayTwoEnter = findViewById(R.id.birthdayTwoEnter);
        ageTwo = findViewById(R.id.ageTwo);
        ageTwoEnter = findViewById(R.id.ageTwoEnter);
        genderTwo = findViewById(R.id.genderTwo);
        genderTwoEnter = findViewById(R.id.genderTwoEnter);
        kindTwo = findViewById(R.id.kindTwo);
        kindTwoEnter = findViewById(R.id.kindTwoEnter);
        weigthTwo = findViewById(R.id.weigthTwo);
        weigthTwoEnter = findViewById(R.id.weigthTwoEnter);
        heigherTwo = findViewById(R.id.heigherTwo);
        heigherTwoEnter = findViewById(R.id.heigherTwoEnter);
        regularCheckTwo = findViewById(R.id.regularCheckTwo);
        regularCheckTwoEnter = findViewById(R.id.regularCheckTwoEnter);
        healthConditionTwo = findViewById(R.id.healthConditionTwo);
        healthConditionTwoEnter = findViewById(R.id.healthConditionTwoEnter);
        enterBoxOne = findViewById(R.id.enterBoxOne);
        enterBoxTwo = findViewById(R.id.enterBoxTwo);
        enterBoxThree = findViewById(R.id.enterBoxThree);
        enterBoxFour = findViewById(R.id.enterBoxFour);
        enterBoxFive = findViewById(R.id.enterBoxFive);
        enterBoxSix = findViewById(R.id.enterBoxSix);
        enterBoxSeven = findViewById(R.id.enterBoxSeven);
        enterBoxEight = findViewById(R.id.enterBoxEight);
        enterBoxNine = findViewById(R.id.enterBoxNine);
        buyFixBar = findViewById(R.id.buyFixBar);
        enterBoxTen = findViewById(R.id.enterBoxTen);
        enterBoxEleven = findViewById(R.id.enterBoxEleven);
        enterBoxTwelve = findViewById(R.id.enterBoxTwelve);
        enterBoxThirteen = findViewById(R.id.enterBoxThirteen);
        enterBoxFourteen = findViewById(R.id.enterBoxFourteen);
        enterBoxFifteen = findViewById(R.id.enterBoxFifteen);
        enterBoxSixteen = findViewById(R.id.enterBoxSixteen);
        enterBoxSeventeen = findViewById(R.id.enterBoxSeventeen);
        enterBoxEighteen = findViewById(R.id.enterBoxEighteen);
        buyBar = findViewById(R.id.buyBar);
        nameThree = findViewById(R.id.nameThree);
        nameThreeEnter = findViewById(R.id.nameThreeEnter);
        birthdayThree = findViewById(R.id.birthdayThree);
        birthdayThreeEnter = findViewById(R.id.birthdayThreeEnter);
        ageThree = findViewById(R.id.ageThree);
        ageThreeEnter = findViewById(R.id.ageThreeEnter);
        genderThree = findViewById(R.id.genderThree);
        genderThreeEnter = findViewById(R.id.genderThreeEnter);
        kindThree = findViewById(R.id.kindThree);
        kindThreeEnter = findViewById(R.id.kindThreeEnter);
        weigthThree = findViewById(R.id.weigthThree);
        weigthThreeEnter = findViewById(R.id.weigthThreeEnter);
        heigherThree = findViewById(R.id.heigherThree);
        heigherThreeEnter = findViewById(R.id.heigherThreeEnter);
        regularCheckThree = findViewById(R.id.regularCheckThree);
        regularCheckThreeEnter = findViewById(R.id.regularCheckThreeEnter);
        healthConditionThree = findViewById(R.id.healthConditionThree);
        healthConditionEnterThree = findViewById(R.id.healthConditionEnterThree);
        enterBoxNinteen = findViewById(R.id.enterBoxNinteen);
        enterBoxTwenty = findViewById(R.id.enterBoxTwenty);
        enterBoxTwentyOne = findViewById(R.id.enterBoxTwentyOne);
        enterBoxTwentyTwo = findViewById(R.id.enterBoxTwentyTwo);
        enterBoxTwentyThree = findViewById(R.id.enterBoxTwentyThree);
        enterBoxTwentyFour = findViewById(R.id.enterBoxTwentyFour);
        enterBoxTwentyFive = findViewById(R.id.enterBoxTwentyFive);
        enterBoxTwentySix = findViewById(R.id.enterBoxTwentySix);
        enterBoxTwentySeven = findViewById(R.id.enterBoxTwentySeven);

        // 버튼 참조
        modifyButton = findViewById(R.id.modifyButton);
        buyFixButton = findViewById(R.id.buyFixButton);
        choiceButtonOne = findViewById(R.id.choiceButtonOne);
        choiceButtonTwo = findViewById(R.id.choiceButtonTwo);
        choiceButtonThree = findViewById(R.id.choiceButtonThree);
        choiceButtonFour = findViewById(R.id.choiceButtonFour);
        choiceButtonFive = findViewById(R.id.choiceButtonFive);
        choiceButtonSix = findViewById(R.id.choiceButtonSix);

        // 초기 상태 설정
        choiceButtonTwo.setVisibility(View.GONE); // "선택 안한 플목이" 숨김
        choiceButtonFive.setVisibility(View.GONE); // "선택한 추가하기 버튼" 숨김

        // buyFixButton 클릭 시 동작 설정
        buyFixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choiceButtonThree.setVisibility(View.VISIBLE);
                choiceButtonFour.setVisibility(View.VISIBLE);
                choiceButtonFive.setVisibility(View.GONE);

                nameTwo.setVisibility(View.GONE);
                enterBoxTen.setVisibility(View.GONE);
                nameTwoEnter.setVisibility(View.GONE);
                birthdayTwo.setVisibility(View.GONE);
                enterBoxEleven.setVisibility(View.GONE);
                birthdayTwoEnter.setVisibility(View.GONE);
                ageTwo.setVisibility(View.GONE);
                enterBoxTwelve.setVisibility(View.GONE);
                ageTwoEnter.setVisibility(View.GONE);
                genderTwo.setVisibility(View.GONE);
                enterBoxThirteen.setVisibility(View.GONE);
                genderTwoEnter.setVisibility(View.GONE);
                kindTwo.setVisibility(View.GONE);
                enterBoxFourteen.setVisibility(View.GONE);
                kindTwoEnter.setVisibility(View.GONE);
                weigthTwo.setVisibility(View.GONE);
                enterBoxFifteen.setVisibility(View.GONE);
                weigthTwoEnter.setVisibility(View.GONE);
                heigherTwo.setVisibility(View.GONE);
                enterBoxSixteen.setVisibility(View.GONE);
                heigherTwoEnter.setVisibility(View.GONE);
                regularCheckTwo.setVisibility(View.GONE);
                enterBoxSeventeen.setVisibility(View.GONE);
                regularCheckTwoEnter.setVisibility(View.GONE);
                healthConditionTwo.setVisibility(View.GONE);
                enterBoxEighteen.setVisibility(View.GONE);
                healthConditionTwoEnter.setVisibility(View.GONE);
                buyBar.setVisibility(View.GONE);
                buyFixButton.setVisibility(View.GONE);

                nameThree.setVisibility(View.VISIBLE);
                nameThreeEnter.setVisibility(View.VISIBLE);
                birthdayThree.setVisibility(View.VISIBLE);
                birthdayThreeEnter.setVisibility(View.VISIBLE);
                ageThree.setVisibility(View.VISIBLE);
                ageThreeEnter.setVisibility(View.VISIBLE);
                genderThree.setVisibility(View.VISIBLE);
                genderThreeEnter.setVisibility(View.VISIBLE);
                kindThree.setVisibility(View.VISIBLE);
                kindThreeEnter.setVisibility(View.VISIBLE);
                weigthThree.setVisibility(View.VISIBLE);
                weigthThreeEnter.setVisibility(View.VISIBLE);
                heigherThree.setVisibility(View.VISIBLE);
                heigherThreeEnter.setVisibility(View.VISIBLE);
                regularCheckThree.setVisibility(View.VISIBLE);
                regularCheckThreeEnter.setVisibility(View.VISIBLE);
                healthConditionThree.setVisibility(View.VISIBLE);
                healthConditionEnterThree.setVisibility(View.VISIBLE);
                enterBoxNinteen.setVisibility(View.VISIBLE);
                enterBoxTwenty.setVisibility(View.VISIBLE);
                enterBoxTwentyOne.setVisibility(View.VISIBLE);
                enterBoxTwentyTwo.setVisibility(View.VISIBLE);
                enterBoxTwentyThree.setVisibility(View.VISIBLE);
                enterBoxTwentyFour.setVisibility(View.VISIBLE);
                enterBoxTwentyFive.setVisibility(View.VISIBLE);
                enterBoxTwentySix.setVisibility(View.VISIBLE);
                enterBoxTwentySeven.setVisibility(View.VISIBLE);
                enterBoxTwentyTwo.setVisibility(View.VISIBLE);
                enterBoxTwentyThree.setVisibility(View.VISIBLE);
                enterBoxTwentyFour.setVisibility(View.VISIBLE);
                buyFixBar.setVisibility(View.VISIBLE);
                modifyButton.setVisibility(View.VISIBLE);
            }
        });

        // choiceButtonFour (추가하기 버튼) 클릭 시 동작 설정
        choiceButtonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // "추가하기 버튼"과 "플목이 버튼" 가시성 조정
                choiceButtonFour.setVisibility(View.GONE);
                choiceButtonTwo.setVisibility(View.VISIBLE);
                choiceButtonFive.setVisibility(View.VISIBLE);

                // "플목이" 숨기기
                name.setVisibility(View.GONE);
                nameEnter.setVisibility(View.GONE);
                birthday.setVisibility(View.GONE);
                birthdayEnter.setVisibility(View.GONE);
                age.setVisibility(View.GONE);
                ageEnter.setVisibility(View.GONE);
                gender.setVisibility(View.GONE);
                genderEnter.setVisibility(View.GONE);
                kind.setVisibility(View.GONE);
                kindEnter.setVisibility(View.GONE);
                weigth.setVisibility(View.GONE);
                weigthEnter.setVisibility(View.GONE);
                heigher.setVisibility(View.GONE);
                heigherEnter.setVisibility(View.GONE);
                regularCheck.setVisibility(View.GONE);
                regularCheckEnter.setVisibility(View.GONE);
                healthCondition.setVisibility(View.GONE);
                healthConditionEnter.setVisibility(View.GONE);
                enterBoxOne.setVisibility(View.GONE);
                enterBoxTwo.setVisibility(View.GONE);
                enterBoxThree.setVisibility(View.GONE);
                enterBoxFour.setVisibility(View.GONE);
                enterBoxFive.setVisibility(View.GONE);
                enterBoxSix.setVisibility(View.GONE);
                enterBoxSeven.setVisibility(View.GONE);
                enterBoxEight.setVisibility(View.GONE);
                enterBoxNine.setVisibility(View.GONE);
                buyFixBar.setVisibility(View.GONE);
                modifyButton.setVisibility(View.GONE);

                // "추가하기" 보이기
                nameTwo.setVisibility(View.VISIBLE);
                enterBoxTen.setVisibility(View.VISIBLE);
                nameTwoEnter.setVisibility(View.VISIBLE);
                birthdayTwo.setVisibility(View.VISIBLE);
                enterBoxEleven.setVisibility(View.VISIBLE);
                birthdayTwoEnter.setVisibility(View.VISIBLE);
                ageTwo.setVisibility(View.VISIBLE);
                enterBoxTwelve.setVisibility(View.VISIBLE);
                ageTwoEnter.setVisibility(View.VISIBLE);
                genderTwo.setVisibility(View.VISIBLE);
                enterBoxThirteen.setVisibility(View.VISIBLE);
                genderTwoEnter.setVisibility(View.VISIBLE);
                kindTwo.setVisibility(View.VISIBLE);
                enterBoxFourteen.setVisibility(View.VISIBLE);
                kindTwoEnter.setVisibility(View.VISIBLE);
                weigthTwo.setVisibility(View.VISIBLE);
                enterBoxFifteen.setVisibility(View.VISIBLE);
                weigthTwoEnter.setVisibility(View.VISIBLE);
                heigherTwo.setVisibility(View.VISIBLE);
                enterBoxSixteen.setVisibility(View.VISIBLE);
                heigherTwoEnter.setVisibility(View.VISIBLE);
                regularCheckTwo.setVisibility(View.VISIBLE);
                enterBoxSeventeen.setVisibility(View.VISIBLE);
                regularCheckTwoEnter.setVisibility(View.VISIBLE);
                healthConditionTwo.setVisibility(View.VISIBLE);
                enterBoxEighteen.setVisibility(View.VISIBLE);
                healthConditionTwoEnter.setVisibility(View.VISIBLE);
                buyBar.setVisibility(View.VISIBLE);
                buyFixButton.setVisibility(View.VISIBLE);
            }
        });

        // "선택 안한 플목이 버튼" 클릭 시 동작 설정
        choiceButtonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // "추가하기 버튼"과 관련된 요소 숨기기
                choiceButtonFour.setVisibility(View.VISIBLE); // "추가하기 버튼" 다시 보이기
                choiceButtonTwo.setVisibility(View.GONE); // "선택 안한 플목이 버튼" 숨기기
                choiceButtonFive.setVisibility(View.GONE); // "선택한 추가하기 버튼" 숨기기
                choiceButtonSix.setVisibility(View.VISIBLE); // "선택안한 몽실이 버튼" 다시 보이기

                // 원래 상태 복원
                name.setVisibility(View.VISIBLE);
                nameEnter.setVisibility(View.VISIBLE);
                birthday.setVisibility(View.VISIBLE);
                birthdayEnter.setVisibility(View.VISIBLE);
                age.setVisibility(View.VISIBLE);
                ageEnter.setVisibility(View.VISIBLE);
                gender.setVisibility(View.VISIBLE);
                genderEnter.setVisibility(View.VISIBLE);
                kind.setVisibility(View.VISIBLE);
                kindEnter.setVisibility(View.VISIBLE);
                weigth.setVisibility(View.VISIBLE);
                weigthEnter.setVisibility(View.VISIBLE);
                heigher.setVisibility(View.VISIBLE);
                heigherEnter.setVisibility(View.VISIBLE);
                regularCheck.setVisibility(View.VISIBLE);
                regularCheckEnter.setVisibility(View.VISIBLE);
                healthCondition.setVisibility(View.VISIBLE);
                healthConditionEnter.setVisibility(View.VISIBLE);
                enterBoxOne.setVisibility(View.VISIBLE);
                enterBoxTwo.setVisibility(View.VISIBLE);
                enterBoxThree.setVisibility(View.VISIBLE);
                enterBoxFour.setVisibility(View.VISIBLE);
                enterBoxFive.setVisibility(View.VISIBLE);
                enterBoxSix.setVisibility(View.VISIBLE);
                enterBoxSeven.setVisibility(View.VISIBLE);
                enterBoxEight.setVisibility(View.VISIBLE);
                enterBoxNine.setVisibility(View.VISIBLE);
                buyFixBar.setVisibility(View.VISIBLE);
                modifyButton.setVisibility(View.VISIBLE);

                // "추가하기" 관련 요소 숨기기
                nameTwo.setVisibility(View.GONE);
                enterBoxTen.setVisibility(View.GONE);
                nameTwoEnter.setVisibility(View.GONE);
                birthdayTwo.setVisibility(View.GONE);
                enterBoxEleven.setVisibility(View.GONE);
                birthdayTwoEnter.setVisibility(View.GONE);
                ageTwo.setVisibility(View.GONE);
                enterBoxTwelve.setVisibility(View.GONE);
                ageTwoEnter.setVisibility(View.GONE);
                genderTwo.setVisibility(View.GONE);
                enterBoxThirteen.setVisibility(View.GONE);
                genderTwoEnter.setVisibility(View.GONE);
                kindTwo.setVisibility(View.GONE);
                enterBoxFourteen.setVisibility(View.GONE);
                kindTwoEnter.setVisibility(View.GONE);
                weigthTwo.setVisibility(View.GONE);
                enterBoxFifteen.setVisibility(View.GONE);
                weigthTwoEnter.setVisibility(View.GONE);
                heigherTwo.setVisibility(View.GONE);
                enterBoxSixteen.setVisibility(View.GONE);
                heigherTwoEnter.setVisibility(View.GONE);
                regularCheckTwo.setVisibility(View.GONE);
                enterBoxSeventeen.setVisibility(View.GONE);
                regularCheckTwoEnter.setVisibility(View.GONE);
                healthConditionTwo.setVisibility(View.GONE);
                enterBoxEighteen.setVisibility(View.GONE);
                healthConditionTwoEnter.setVisibility(View.GONE);
                buyBar.setVisibility(View.GONE);
                buyFixButton.setVisibility(View.GONE);

                nameThree.setVisibility(View.GONE);
                nameThreeEnter.setVisibility(View.GONE);
                birthdayThree.setVisibility(View.GONE);
                birthdayThreeEnter.setVisibility(View.GONE);
                ageThree.setVisibility(View.GONE);
                ageThreeEnter.setVisibility(View.GONE);
                genderThree.setVisibility(View.GONE);
                genderThreeEnter.setVisibility(View.GONE);
                kindThree.setVisibility(View.GONE);
                kindThreeEnter.setVisibility(View.GONE);
                weigthThree.setVisibility(View.GONE);
                weigthThreeEnter.setVisibility(View.GONE);
                heigherThree.setVisibility(View.GONE);
                heigherThreeEnter.setVisibility(View.GONE);
                regularCheckThree.setVisibility(View.GONE);
                regularCheckThreeEnter.setVisibility(View.GONE);
                healthConditionThree.setVisibility(View.GONE);
                healthConditionEnterThree.setVisibility(View.GONE);
                enterBoxNinteen.setVisibility(View.GONE);
                enterBoxTwenty.setVisibility(View.GONE);
                enterBoxTwentyOne.setVisibility(View.GONE);
                enterBoxTwentyTwo.setVisibility(View.GONE);
                enterBoxTwentyThree.setVisibility(View.GONE);
                enterBoxTwentyFour.setVisibility(View.GONE);
                enterBoxTwentyFive.setVisibility(View.GONE);
                enterBoxTwentySix.setVisibility(View.GONE);
                enterBoxTwentySeven.setVisibility(View.GONE);
                enterBoxTwentyTwo.setVisibility(View.GONE);
                enterBoxTwentyThree.setVisibility(View.GONE);
                enterBoxTwentyFour.setVisibility(View.GONE);
            }
        });

        // "선택 안한 몽실이 버튼" 클릭 시 동작 설정
        choiceButtonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // "추가하기 버튼"과 관련된 요소 숨기기
                choiceButtonFour.setVisibility(View.VISIBLE); // "선택 안한 추가하기 버튼" 다시 보이기
                choiceButtonTwo.setVisibility(View.VISIBLE); // "선택 안한 플목이 버튼" 다시 보이기
                choiceButtonFive.setVisibility(View.GONE); // "선택한 추가하기 버튼" 숨기기
                choiceButtonSix.setVisibility(View.GONE); // "선택안한 몽실이 버튼" 다시 보이기

                // 원래 상태 복원
                nameThree.setVisibility(View.VISIBLE);
                nameThreeEnter.setVisibility(View.VISIBLE);
                birthdayThree.setVisibility(View.VISIBLE);
                birthdayThreeEnter.setVisibility(View.VISIBLE);
                ageThree.setVisibility(View.VISIBLE);
                ageThreeEnter.setVisibility(View.VISIBLE);
                genderThree.setVisibility(View.VISIBLE);
                genderThreeEnter.setVisibility(View.VISIBLE);
                kindThree.setVisibility(View.VISIBLE);
                kindThreeEnter.setVisibility(View.VISIBLE);
                weigthThree.setVisibility(View.VISIBLE);
                weigthThreeEnter.setVisibility(View.VISIBLE);
                heigherThree.setVisibility(View.VISIBLE);
                heigherThreeEnter.setVisibility(View.VISIBLE);
                regularCheckThree.setVisibility(View.VISIBLE);
                regularCheckThreeEnter.setVisibility(View.VISIBLE);
                healthConditionThree.setVisibility(View.VISIBLE);
                healthConditionEnterThree.setVisibility(View.VISIBLE);
                enterBoxNinteen.setVisibility(View.VISIBLE);
                enterBoxTwenty.setVisibility(View.VISIBLE);
                enterBoxTwentyOne.setVisibility(View.VISIBLE);
                enterBoxTwentyTwo.setVisibility(View.VISIBLE);
                enterBoxTwentyThree.setVisibility(View.VISIBLE);
                enterBoxTwentyFour.setVisibility(View.VISIBLE);
                enterBoxTwentyFive.setVisibility(View.VISIBLE);
                enterBoxTwentySix.setVisibility(View.VISIBLE);
                enterBoxTwentySeven.setVisibility(View.VISIBLE);
                enterBoxTwentyTwo.setVisibility(View.VISIBLE);
                enterBoxTwentyThree.setVisibility(View.VISIBLE);
                enterBoxTwentyFour.setVisibility(View.VISIBLE);
                buyFixBar.setVisibility(View.VISIBLE);
                modifyButton.setVisibility(View.VISIBLE);

                // "플목이" 관련 요소 숨기기
                name.setVisibility(View.GONE);
                nameEnter.setVisibility(View.GONE);
                birthday.setVisibility(View.GONE);
                birthdayEnter.setVisibility(View.GONE);
                age.setVisibility(View.GONE);
                ageEnter.setVisibility(View.GONE);
                gender.setVisibility(View.GONE);
                genderEnter.setVisibility(View.GONE);
                kind.setVisibility(View.GONE);
                kindEnter.setVisibility(View.GONE);
                weigth.setVisibility(View.GONE);
                weigthEnter.setVisibility(View.GONE);
                heigher.setVisibility(View.GONE);
                heigherEnter.setVisibility(View.GONE);
                regularCheck.setVisibility(View.GONE);
                regularCheckEnter.setVisibility(View.GONE);
                healthCondition.setVisibility(View.GONE);
                healthConditionEnter.setVisibility(View.GONE);
                enterBoxOne.setVisibility(View.GONE);
                enterBoxTwo.setVisibility(View.GONE);
                enterBoxThree.setVisibility(View.GONE);
                enterBoxFour.setVisibility(View.GONE);
                enterBoxFive.setVisibility(View.GONE);
                enterBoxSix.setVisibility(View.GONE);
                enterBoxSeven.setVisibility(View.GONE);
                enterBoxEight.setVisibility(View.GONE);
                enterBoxNine.setVisibility(View.GONE);

                // "추가하기" 관련 요소 숨기기
                nameTwo.setVisibility(View.GONE);
                enterBoxTen.setVisibility(View.GONE);
                nameTwoEnter.setVisibility(View.GONE);
                birthdayTwo.setVisibility(View.GONE);
                enterBoxEleven.setVisibility(View.GONE);
                birthdayTwoEnter.setVisibility(View.GONE);
                ageTwo.setVisibility(View.GONE);
                enterBoxTwelve.setVisibility(View.GONE);
                ageTwoEnter.setVisibility(View.GONE);
                genderTwo.setVisibility(View.GONE);
                enterBoxThirteen.setVisibility(View.GONE);
                genderTwoEnter.setVisibility(View.GONE);
                kindTwo.setVisibility(View.GONE);
                enterBoxFourteen.setVisibility(View.GONE);
                kindTwoEnter.setVisibility(View.GONE);
                weigthTwo.setVisibility(View.GONE);
                enterBoxFifteen.setVisibility(View.GONE);
                weigthTwoEnter.setVisibility(View.GONE);
                heigherTwo.setVisibility(View.GONE);
                enterBoxSixteen.setVisibility(View.GONE);
                heigherTwoEnter.setVisibility(View.GONE);
                regularCheckTwo.setVisibility(View.GONE);
                enterBoxSeventeen.setVisibility(View.GONE);
                regularCheckTwoEnter.setVisibility(View.GONE);
                healthConditionTwo.setVisibility(View.GONE);
                enterBoxEighteen.setVisibility(View.GONE);
                healthConditionTwoEnter.setVisibility(View.GONE);
                buyBar.setVisibility(View.GONE);
                buyFixButton.setVisibility(View.GONE);
            }
        });

    }
}
