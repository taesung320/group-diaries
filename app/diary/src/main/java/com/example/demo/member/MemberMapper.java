package com.example.demo.member;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MemberMapper {
    List<MemberModel> selectMembers();
    void insertMember(MemberModel member);

    void updateMember(MemberModel member);

    void deleteMember(int memberId);

}
