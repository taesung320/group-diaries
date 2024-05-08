package com.example.demo.teamDiary;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeamDiaryMapper {

    // 모든 팀 일기 리스트 조회
    List<TeamDiaryModel> selectTeamDiaries();

    // 팁 일기 생성
    void insertTeamDiary(TeamDiaryModel teamDiary);

    // 팀 일기 수정
    void updateTeamDiary(TeamDiaryModel teamDiary);

    // 팀 일기 삭제 (공유 해제)
    void deleteTeamDiary(int teamDiaryId);

    // 현재 팀에 공유된 일기 리스트 요청
    List<TeamDiaryModel> requestTeamDiaries(int teamId);

    // 선택한 일기가 공유된 팀들의 id 요청
    List<Integer> requestSharedTeams(int diaryId);



}
