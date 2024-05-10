package com.example.demo.response;


public class AllTeamDiariesResponse {

    String user_name;
    String color;
    String initial;
    String written_date;
    String diary_title;

    public AllTeamDiariesResponse() {
    }

    public AllTeamDiariesResponse(String user_name, String color, String initial, String written_date, String diary_title) {
        this.user_name = user_name;
        this.color = color;
        this.initial = initial;
        this.written_date = written_date;
        this.diary_title = diary_title;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getColor() {
        return color;
    }

    public String getInitial() {
        return initial;
    }

    public String getWritten_date() {
        return written_date;
    }

    public String getDiary_title() {
        return diary_title;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public void setWritten_date(String written_date) {
        this.written_date = written_date;
    }

    public void setDiary_title(String diary_title) {
        this.diary_title = diary_title;
    }
}
