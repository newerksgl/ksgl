package com.newer.ksgl.model.pojo;


public class Recycle {

  private long rid;
  private long type;
  private String content;
  private String name;
  private java.sql.Timestamp time;
  private String diffculty;


  public long getRid() {
    return rid;
  }

  public void setRid(long rid) {
    this.rid = rid;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public java.sql.Timestamp getTime() {
    return time;
  }

  public void setTime(java.sql.Timestamp time) {
    this.time = time;
  }


  public String getDiffculty() {
    return diffculty;
  }

  public void setDiffculty(String diffculty) {
    this.diffculty = diffculty;
  }

}
