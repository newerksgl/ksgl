package com.newer.ksgl.model.pojo.pojopage;

import com.newer.ksgl.model.pojo.Exas;
import com.newer.ksgl.model.pojo.Question;
import com.newer.ksgl.model.pojo.Subject;

public class ExasSubjectQuestionPage {
    private Long sid;
    private Long qid;
    private String questionStem;
    private String reference;
    private String problem;
    private String difficulty;
    private Long eid;
    private String date;
    private Subject s;
    private Question q;

    @Override
    public String toString() {
        return "ExasSubjectQuestionPage{" +
                "sid=" + sid +
                ", qid=" + qid +
                ", questionStem='" + questionStem + '\'' +
                ", reference='" + reference + '\'' +
                ", problem='" + problem + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", eid=" + eid +
                ", date='" + date + '\'' +
                ", s=" + s +
                ", q=" + q +
                '}';
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Long getQid() {
        return qid;
    }

    public void setQid(Long qid) {
        this.qid = qid;
    }

    public String getQuestionstem() {
        return questionStem;
    }

    public void setQuestionStem(String questionStem) {
        this.questionStem = questionStem;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public Long getEid() {
        return eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Subject getS() {
        return s;
    }

    public void setS(Subject s) {
        this.s = s;
    }

    public Question getQ() {
        return q;
    }

    public void setQ(Question q) {
        this.q = q;
    }
}
