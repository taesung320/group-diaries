package com.example.demo.teamDiary;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamDiaryService {
    private TeamDiaryMapper TeamDiaryMapper;

    public TeamDiaryService(TeamDiaryMapper TeamDiaryMapper){
        this.TeamDiaryMapper = TeamDiaryMapper;
    }

    public List<TeamDiaryModel> getTeamDiaries() {
        return TeamDiaryMapper.selectTeamDiaries();
    }

    public void insertTeamDiary(TeamDiaryModel teamDiary) {
        TeamDiaryMapper.insertTeamDiary(teamDiary);
    }

    public void updateTeamDiary(int teamDiaryId, TeamDiaryModel teamDiary) {
        teamDiary.setId(teamDiaryId);
        TeamDiaryMapper.updateTeamDiary(teamDiary);
    }

    public void deleteTeamDiary(int teamDiaryId) {
        TeamDiaryMapper.deleteTeamDiary(teamDiaryId);
    }

}
