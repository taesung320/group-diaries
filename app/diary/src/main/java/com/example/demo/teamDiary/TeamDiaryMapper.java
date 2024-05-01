package com.example.demo.teamDiary;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeamDiaryMapper {
    List<TeamDiaryModel> selectTeamDiaries();
    void insertTeamDiary(TeamDiaryModel teamDiary);

    void updateTeamDiary(TeamDiaryModel teamDiary);

    void deleteTeamDiary(int teamDiaryId);

}
