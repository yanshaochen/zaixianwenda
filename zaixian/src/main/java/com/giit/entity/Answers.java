package com.giit.entity;

import java.sql.Timestamp;

public class Answers {
    private Integer id;
    private String anscontent;
    private String ansdate;
    private Integer qid;
    private Questions question;

    public Questions getQuestion() {
        return question;
    }

    public void setQuestion(Questions question) {
        this.question = question;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnscontent() {
        return anscontent;
    }

    public void setAnscontent(String anscontent) {
        this.anscontent = anscontent;
    }

    public String getAnsdate() {
        return ansdate;
    }

    public void setAnsdate(String ansdate) {
        this.ansdate = ansdate;
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    @Override
    public String toString() {
        return "Answers{" +
                "id=" + id +
                ", anscontent='" + anscontent + '\'' +
                ", ansdate=" + ansdate +
                ", qid=" + qid +
                '}';
    }
}
