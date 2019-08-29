package com.newer.ksgl.model.pojo.pojopage;

import com.newer.ksgl.model.pojo.Paper;
import com.newer.ksgl.model.pojo.Subject;

public class ExaminationsSubjectPaperPage {
    private Long id;
    private Long number;
    private String statetest;
    private String name;
    private Paper p;
    private Subject s;

    public ExaminationsSubjectPaperPage() {
    }

    public ExaminationsSubjectPaperPage(Long id, Long number, String statetest, String name) {
        this.id = id;
        this.number = number;
        this.statetest = statetest;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getStatetest() {
        return statetest;
    }

    public void setStatetest(String statetest) {
        this.statetest = statetest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Paper getP() {
        return p;
    }

    public void setP(Paper p) {
        this.p = p;
    }

    public Subject getS() {
        return s;
    }

    public void setS(Subject s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "ExaminationsSubjectPaperPage{" +
                "id=" + id +
                ", number=" + number +
                ", statetest='" + statetest + '\'' +
                ", name='" + name + '\'' +
                ", p=" + p +
                ", s=" + s +
                '}';
    }
}
