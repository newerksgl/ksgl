package com.newer.ksgl.model.pojo;


public class Errors {

  private Long eid;
  private String cntent;
  private Long userId;
  private java.sql.Timestamp feedBackTime;
  private Long conductorD;
  private java.sql.Timestamp conductorTime;


  public Long getEid() {
    return eid;
  }

  public void setEid(Long eid) {
    this.eid = eid;
  }


  public String getCntent() {
    return cntent;
  }

  public void setCntent(String cntent) {
    this.cntent = cntent;
  }


  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public java.sql.Timestamp getFeedBackTime() {
    return feedBackTime;
  }

  public void setFeedBackTime(java.sql.Timestamp feedBackTime) {
    this.feedBackTime = feedBackTime;
  }


  public Long getConductorD() {
    return conductorD;
  }

  public void setConductorD(Long conductorD) {
    this.conductorD = conductorD;
  }


  public java.sql.Timestamp getConductorTime() {
    return conductorTime;
  }

  public void setConductorTime(java.sql.Timestamp conductorTime) {
    this.conductorTime = conductorTime;
  }

}
