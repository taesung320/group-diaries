package com.example.demo.member;

public class MemberModel {
    int id;
    int user_id;
    int team_id;

    public MemberModel(int id, int user_id, int team_id) {
        this.id = id;
        this.user_id = user_id;
        this.team_id = team_id;
    }

    public MemberModel() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getTeam_id() {
        return team_id;
    }
}
