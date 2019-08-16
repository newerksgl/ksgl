package com.newer.ksgl.model.pojo;


public class Paper {

  private Long pid;
  private String pName;
  private Long sid;
  private String topicsList;


  public Long getPid() {
    return pid;
  }

  public void setPid(Long pid) {
    this.pid = pid;
  }


  public String getPName() {
    return pName;
  }

  public void setPName(String pName) {
    this.pName = pName;
  }


  public Long getSid() {
    return sid;
  }

  public void setSid(Long sid) {
    this.sid = sid;
  }


  public String getTopicsList() {
    return topicsList;
  }

  public void setTopicsList(String topicsList) {
    this.topicsList = topicsList;
  }

}
