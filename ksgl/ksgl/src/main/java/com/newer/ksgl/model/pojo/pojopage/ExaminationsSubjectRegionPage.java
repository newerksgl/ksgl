package com.newer.ksgl.model.pojo.pojopage;

import com.newer.ksgl.model.pojo.Region;
import com.newer.ksgl.model.pojo.Subject;

public class ExaminationsSubjectRegionPage {
    private Long id;
    private Long sid;
    private Long reid;
    private Long number;
    private String statetest;
    private String name;
    private Subject s;
    private Region r;

    @Override
    public String toString() {
        return "ExaminationsSubjectRegionPage{" +
                "id=" + id +
                ", sid=" + sid +
                ", reid=" + reid +
                ", number=" + number +
                ", statetest='" + statetest + '\'' +
                ", name='" + name + '\'' +
                ", s=" + s +
                ", r=" + r +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Long getReid() {
        return reid;
    }

    public void setReid(Long reid) {
        this.reid = reid;
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

    public Subject getS() {
        return s;
    }

    public void setS(Subject s) {
        this.s = s;
    }

    public Region getR() {
        return r;
    }

    public void setR(Region r) {
        this.r = r;
    }
}
