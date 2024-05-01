package com.example.demo;

import com.example.demo.member.MemberModel;
import com.example.demo.member.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class MemberController {

    private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members")
    public HashMap<String, Object> getMembers() {
        HashMap<String, Object> result = new HashMap<>();
        List<MemberModel> data = memberService.getMembers();
        result.put("result", "success");
        result.put("data", data);
        return result;
    }

    @PostMapping("/members")
    public HashMap<String, String> insertMember(@RequestBody MemberModel member) {

        memberService.insertMember(member);

        System.out.println(2);
        HashMap<String, String> result = new HashMap<>();
        result.put("result", "success");
        return result;
    }

    @PutMapping("/members/{id}")
    public HashMap<String, String> updateMember(@RequestBody MemberModel memberData, @PathVariable(required = true) int id) {

        memberService.updateMember(id, memberData);

        HashMap<String, String> result = new HashMap<>();
        result.put("result", "success");
        return result;
    }

    @DeleteMapping("/members/{id}")
    public HashMap<String, String> deleteMember(@PathVariable(required = true) int id, @RequestParam(defaultValue = "succ") String succMsg) {

        memberService.deleteMember(id);

        HashMap<String, String> result = new HashMap<>();
        result.put("result", succMsg);
        return result;
    }
}
