package com.newer.ksgl.model.pojo;


public class Errors {

  private long eid;
  private String cntent;
  private long userId;
  private java.sql.Timestamp feedBackTime;
  private long conductorD;
  private java.sql.Timestamp conductorTime;


  public long getEid() {
    return eid;
  }

  public void setEid(long eid) {
    this.eid = eid;
  }


  public String getCntent() {
    return cntent;
  }

  public void setCntent(String cntent) {
    this.cntent = cntent;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public java.sql.Timestamp getFeedBackTime() {
    return feedBackTime;
  }

  public void setFeedBackTime(java.sql.Timestamp feedBackTime) {
    this.feedBackTime = feedBackTime;
  }


  public long getConductorD() {
    return conductorD;
  }

  public void setConductorD(long conductorD) {
    this.conductorD = conductorD;
  }


  public java.sql.Timestamp getConductorTime() {
    return conductorTime;
  }

  public void setConductorTime(java.sql.Timestamp conductorTime) {
    this.conductorTime = conductorTime;
  }

}
