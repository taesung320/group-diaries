package com.example.demo.diary;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DiaryMapper {
    List<DiaryModel> selectDiaries();
    void insertDiary(DiaryModel diary);

    void updateDiary(DiaryModel diary);

    void deleteDiary(int diaryId);

}
