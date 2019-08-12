package com.newer.ksgl.model.pojo;

public class Achievement {

  private long aid;
  private long pid;
  private String name;
  private long fraction;
  private String pName;


  public long getAid() {
    return aid;
  }

  public void setAid(long aid) {
    this.aid = aid;
  }


  public long getPid() {
    return pid;
  }

  public void setPid(long pid) {
    this.pid = pid;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getFraction() {
    return fraction;
  }

  public void setFraction(long fraction) {
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
