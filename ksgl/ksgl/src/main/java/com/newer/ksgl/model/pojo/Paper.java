package com.newer.ksgl.model.pojo;


public class Paper {

  private long pid;
  private String pName;
  private long sid;
  private String topicsList;


  public long getPid() {
    return pid;
  }

  public void setPid(long pid) {
    this.pid = pid;
  }


  public String getPName() {
    return pName;
  }

  public void setPName(String pName) {
    this.pName = pName;
  }


  public long getSid() {
    return sid;
  }

  public void setSid(long sid) {
    this.sid = sid;
  }


  public String getTopicsList() {
    return topicsList;
  }

  public void setTopicsList(String topicsList) {
    this.topicsList = topicsList;
  }

}
