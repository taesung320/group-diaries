package com.example.demo.team;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeamMapper {
    List<TeamModel> selectTeams();
    void insertTeam(TeamModel team);

    void updateTeam(TeamModel team);

    void deleteTeam(int teamId);

}
