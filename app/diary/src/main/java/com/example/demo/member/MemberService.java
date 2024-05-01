package com.example.demo.member;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    private MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper){
        this.memberMapper = memberMapper;
    }

    public List<MemberModel> getMembers() {
        return memberMapper.selectMembers();
    }

    public void insertMember(MemberModel member) {
        memberMapper.insertMember(member);
    }

    public void updateMember(int memberId, MemberModel member) {
        member.setId(memberId);
        memberMapper.updateMember(member);
    }

    public void deleteMember(int memberId) {
        memberMapper.deleteMember(memberId);
    }

}
