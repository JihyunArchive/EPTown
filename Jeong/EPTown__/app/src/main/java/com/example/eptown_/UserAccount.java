package com.example.eptown_;

import android.util.Log;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ServerValue;

public class UserAccount {
    private String userName;
    private String userEmail;
    private String phoneNum;
    private String post;
    private String address;
    private String addressDetail;
    private String birthday;
    private Boolean gender;

    // Firebase Realtime Database에 저장된 timestamp를 자동으로 생성
    private Object createdAt;
    private Object updatedAt;

    public UserAccount(String userName, String userEmail,
                       String userPhoneNum, String userPost, String userAddress, String userAddressDetail,
                       String userBirthday, Boolean userGender) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.phoneNum = userPhoneNum;
        this.post = userPost;
        this.address = userAddress;
        this.addressDetail = userAddressDetail;
        this.birthday = userBirthday;
        this.gender = userGender;
        this.createdAt = ServerValue.TIMESTAMP; // Firebase 서버 시간을 사용
        this.updatedAt = ServerValue.TIMESTAMP; // Firebase 서버 시간을 사용
    }

    // 데이터베이스에 저장하는 메소드
    public void saveToDatabase() {
        // Firebase Realtime Database에 사용자 정보 저장
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference userRef = database.getReference("users");

        String userId = FirebaseAuth.getInstance().getCurrentUser().getUid();
        userRef.child(userId).setValue(this).addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                // 저장 성공
                Log.d("UserAccount", "User information saved successfully!");
            } else {
                // 저장 실패
                Log.e("UserAccount", "Error saving user information: " + task.getException().getMessage());
            }
        });
    }

    // Getter와 Setter
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhoneNum() {
        return phoneNum;
    }

    public void setUserPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getUserPost() {
        return post;
    }

    public void setUserPost(String post) {
        this.post = post;
    }

    public String getUserAddress() {
        return address;
    }

    public void setUserAddress(String address) {
        this.address = address;
    }

    public String getUserAddressDetail() {
        return addressDetail;
    }

    public void setUserAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getUserBirthday() {
        return birthday;
    }

    public void setUserBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Boolean getUserGender() {
        return gender;
    }

    public void setUserGender(Boolean gender) {
        this.gender = gender;
    }

    public Object getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Object createdAt) {
        this.createdAt = createdAt;
    }

    public Object getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Object updatedAt) {
        this.updatedAt = updatedAt;
    }
}
