package com.example.demo.diary;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaryService {
    private DiaryMapper diaryMapper;

    public DiaryService(DiaryMapper diaryMapper){
        this.diaryMapper = diaryMapper;
    }

    public List<DiaryModel> getDiaries() {
        return diaryMapper.selectDiaries();
    }

    public void insertDiary(DiaryModel diary) {
        diaryMapper.insertDiary(diary);
    }

    public void updateDiary(int diaryId, DiaryModel diary) {
        diary.setId(diaryId);
        diaryMapper.updateDiary(diary);
    }

    public void deleteDiary(int diaryId) {
        diaryMapper.deleteDiary(diaryId);
    }

}
