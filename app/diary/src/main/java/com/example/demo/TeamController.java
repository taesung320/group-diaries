package com.example.demo;

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

    @GetMapping("/teams")
    public HashMap<String, Object> getTeams() {
        HashMap<String, Object> result = new HashMap<>();
        List<TeamModel> data = teamService.getTeams();
        result.put("result", "success");
        result.put("data", data);
        return result;
    }

    @PostMapping("/teams")
    public HashMap<String, String> insertTeam(@RequestBody TeamModel team) {

        teamService.insertTeam(team);

        System.out.println(2);
        HashMap<String, String> result = new HashMap<>();
        result.put("result", "success");
        return result;
    }

    @PutMapping("/teams/{id}")
    public HashMap<String, String> updateTeam(@RequestBody TeamModel teamData, @PathVariable(required = true) int id) {

        teamService.updateTeam(id, teamData);

        HashMap<String, String> result = new HashMap<>();
        result.put("result", "success");
        return result;
    }

    @DeleteMapping("/teams/{id}")
    public HashMap<String, String> deleteTeam(@PathVariable(required = true) int id, @RequestParam(defaultValue = "succ") String succMsg) {

        teamService.deleteTeam(id);

        HashMap<String, String> result = new HashMap<>();
        result.put("result", succMsg);
        return result;
    }
}
