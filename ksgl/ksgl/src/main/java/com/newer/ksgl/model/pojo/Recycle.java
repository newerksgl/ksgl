package com.newer.ksgl.model.pojo;


public class Recycle {

  private Long rid;
  private Long type;
  private String content;
  private String name;
  private java.sql.Timestamp time;
  private String diffculty;


  public Long getRid() {
    return rid;
  }

  public void setRid(Long rid) {
    this.rid = rid;
  }


  public Long getType() {
    return type;
  }

  public void setType(Long type) {
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
