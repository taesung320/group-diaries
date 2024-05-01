package com.example.demo;

import com.example.demo.diary.DiaryModel;
import com.example.demo.diary.DiaryService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class DiaryController {

    private DiaryService diaryService;

    public DiaryController(DiaryService diaryService) {
        this.diaryService = diaryService;
    }

    @GetMapping("/diaries")
    public HashMap<String, Object> getDiaries() {
        HashMap<String, Object> result = new HashMap<>();
        List<DiaryModel> data = diaryService.getDiaries();
        result.put("result", "success");
        result.put("data", data);
        return result;
    }

    @PostMapping("/diaries")
    public HashMap<String, String> insertDiary(@RequestBody DiaryModel diary) {

        diaryService.insertDiary(diary);

        System.out.println(2);
        HashMap<String, String> result = new HashMap<>();
        result.put("result", "success");
        return result;
    }

    @PutMapping("/diaries/{id}")
    public HashMap<String, String> updateDiary(@RequestBody DiaryModel diaryData, @PathVariable(required = true) int id) {

        diaryService.updateDiary(id, diaryData);

        HashMap<String, String> result = new HashMap<>();
        result.put("result", "success");
        return result;
    }

    @DeleteMapping("/diaries/{id}")
    public HashMap<String, String> deleteDiary(@PathVariable(required = true) int id, @RequestParam(defaultValue = "succ") String succMsg) {

        diaryService.deleteDiary(id);

        HashMap<String, String> result = new HashMap<>();
        result.put("result", succMsg);
        return result;
    }
}
