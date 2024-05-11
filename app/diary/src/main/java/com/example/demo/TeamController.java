package com.example.demo;

import com.example.demo.request.CreateTeamRequest;
import com.example.demo.team.TeamModel;
import com.example.demo.team.TeamService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class TeamController {

    private TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    // 모든 팀 리스트 조회
    @GetMapping("/teams")
    public HashMap<String, Object> getTeams() {
        List<TeamModel> data = teamService.getTeams();

        HashMap<String, Object> result = new HashMap<>();
        result.put("result", "success");
        result.put("data", data);
        return result;
    }

    // 팀 생성
    @PostMapping("/teams")
    public HashMap<String, String> insertTeam(@RequestBody TeamModel team) {

        teamService.insertTeam(team);

        HashMap<String, String> result = new HashMap<>();
        result.put("result", "success");
        return result;
    }

    // 팀 수정
    @PutMapping("/teams/{id}")
    public HashMap<String, String> updateTeam(@RequestBody TeamModel teamData, @PathVariable(required = true) int id) {

        teamService.updateTeam(id, teamData);

        HashMap<String, String> result = new HashMap<>();
        result.put("result", "success");
        return result;
    }

    // 팀 삭제
    @DeleteMapping("/teams/{id}")
    public HashMap<String, String> deleteTeam(@PathVariable(required = true) int id, @RequestParam(defaultValue = "succ") String succMsg) {

        teamService.deleteTeam(id);

        HashMap<String, String> result = new HashMap<>();
        result.put("result", succMsg);
        return result;
    }

//    // 사용자가 속한 팀 만들기 요청
//    @PostMapping("/teams/create/{userId}")
//    public HashMap<String, String> requestCreateTeam(@PathVariable(required = true) int userId, @RequestBody CreateTeamRequest team) {
//
//        teamService.requestCreateTeam(userId, team);
//
//        HashMap<String, String> result = new HashMap<>();
//        result.put("result", "success");
//        return result;
//    }

}
