package com.example.demo.response;

public class InvitedListResponse {
    // m.team_id, t.team_name, m.inviter_id, u.name, m.status
    int team_id;
    String team_name;
    int inviter_id;
    String name;    // userName
    int status;

    public InvitedListResponse() {
    }

    public InvitedListResponse(int team_id, String team_name, int inviter_id, String name, int status) {
        this.team_id = team_id;
        this.team_name = team_name;
        this.inviter_id = inviter_id;
        this.name = name;
        this.status = status;
    }

    public int getTeam_id() {
        return team_id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public int getInviter_id() {
        return inviter_id;
    }

    public String getName() {
        return name;
    }

    public int getStatus() {
        return status;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public void setInviter_id(int inviter_id) {
        this.inviter_id = inviter_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
