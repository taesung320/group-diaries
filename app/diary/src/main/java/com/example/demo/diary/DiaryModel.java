package com.example.demo.diary;

public class DiaryModel {

    // 공유할 그룹
    int id;
    String written_date;
    String writer;     // writer id로 변경
    String details;

    public DiaryModel() {
    }

    public DiaryModel(int id, String written_date, String writer, String details) {
        this.id = id;
        this.written_date = written_date;
        this.writer = writer;
        this.details = details;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWritten_date(String written_date) {
        this.written_date = written_date;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public String getWritten_date() {
        return written_date;
    }

    public String getWriter() {
        return writer;
    }

    public String getDetails() {
        return details;
    }
}
