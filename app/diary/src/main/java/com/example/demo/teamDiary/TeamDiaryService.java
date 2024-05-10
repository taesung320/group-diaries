package com.example.demo.teamDiary;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamDiaryService {
    private TeamDiaryMapper TeamDiaryMapper;

    public TeamDiaryService(TeamDiaryMapper TeamDiaryMapper){
        this.TeamDiaryMapper = TeamDiaryMapper;
    }

    // 모든 팀 일기 리스트 조회
    public List<TeamDiaryModel> getTeamDiaries() {
        return TeamDiaryMapper.selectTeamDiaries();
    }

    // 팁 일기 생성
    public void insertTeamDiary(TeamDiaryModel teamDiary) {
        TeamDiaryMapper.insertTeamDiary(teamDiary);
    }

    // 팀 일기 수정
    public void updateTeamDiary(int teamDiaryId, TeamDiaryModel teamDiary) {
        teamDiary.setId(teamDiaryId);
        TeamDiaryMapper.updateTeamDiary(teamDiary);
    }

    // 팀 일기 삭제 (공유 해제)
    public void deleteTeamDiary(int teamDiaryId) {
        TeamDiaryMapper.deleteTeamDiary(teamDiaryId);
    }

    // 현재 팀에 공유된 일기 리스트 요청
    public List<TeamDiaryModel> requestTeamDiaries(int teamId) {
        return TeamDiaryMapper.requestTeamDiaries(teamId);
    }

    // 선택한 일기가 공유된 팀들의 id, 이름 요청
    public List<Integer> requestSharedTeams(int diaryId) {
        return TeamDiaryMapper.requestSharedTeams(diaryId);
    }


}
