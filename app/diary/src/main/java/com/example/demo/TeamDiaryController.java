package com.example.demo;

import com.example.demo.teamDiary.TeamDiaryModel;
import com.example.demo.teamDiary.TeamDiaryService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class TeamDiaryController {

    private TeamDiaryService teamDiaryService;

    public TeamDiaryController(TeamDiaryService teamDiaryService) {
        this.teamDiaryService = teamDiaryService;
    }

    @GetMapping("/teamDiaries")
    public HashMap<String, Object> getTeamDiaries() {
        HashMap<String, Object> result = new HashMap<>();
        List<TeamDiaryModel> data = teamDiaryService.getTeamDiaries();
        result.put("result", "success");
        result.put("data", data);
        return result;
    }

    @PostMapping("/teamDiaries")
    public HashMap<String, String> insertTeamDiary(@RequestBody TeamDiaryModel teamDiary) {

        teamDiaryService.insertTeamDiary(teamDiary);

        System.out.println(2);
        HashMap<String, String> result = new HashMap<>();
        result.put("result", "success");
        return result;
    }

    @PutMapping("/teamDiaries/{id}")
    public HashMap<String, String> updateTeamDiary(@RequestBody TeamDiaryModel teamDiaryData, @PathVariable(required = true) int id) {

        teamDiaryService.updateTeamDiary(id, teamDiaryData);

        HashMap<String, String> result = new HashMap<>();
        result.put("result", "success");
        return result;
    }

    @DeleteMapping("/teamDiaries/{id}")
    public HashMap<String, String> deleteTeamDiary(@PathVariable(required = true) int id, @RequestParam(defaultValue = "succ") String succMsg) {

        teamDiaryService.deleteTeamDiary(id);

        HashMap<String, String> result = new HashMap<>();
        result.put("result", succMsg);
        return result;
    }
}
