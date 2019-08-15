package com.newer.ksgl.model.pojo;

public class Achievement {

  private Long aid;
  private Long pid;
  private String name;
  private Long fraction;
  private String pName;


  public Long getAid() {
    return aid;
  }

  public void setAid(Long aid) {
    this.aid = aid;
  }


  public Long getPid() {
    return pid;
  }

  public void setPid(Long pid) {
    this.pid = pid;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Long getFraction() {
    return fraction;
  }

  public void setFraction(Long fraction) {
    this.fraction = fraction;
  }


  public String getPName() {
    return pName;
  }

  public void setPName(String pName) {
    this.pName = pName;
  }

  @Override
  public String toString() {
    return "Achievement{" +
            "aid=" + aid +
            ", pid=" + pid +
            ", name='" + name + '\'' +
            ", fraction=" + fraction +
            ", pName='" + pName + '\'' +
            '}';
  }

}
