package com.example.demo.request;

import com.example.demo.diary.DiaryModel;
import com.example.demo.user.UserModel;

public class DiaryRequest {

    private DiaryModel diaryModel;
    private UserModel userModel;

    public DiaryRequest(DiaryModel diaryModel, UserModel userModel) {
        this.diaryModel = diaryModel;
        this.userModel = userModel;
    }

    public DiaryModel getDiaryModel() {
        return diaryModel;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setDiaryModel(DiaryModel diaryModel) {
        this.diaryModel = diaryModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }
}
