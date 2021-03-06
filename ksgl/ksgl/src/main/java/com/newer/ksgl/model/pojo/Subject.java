package com.newer.ksgl.model.pojo;


public class Subject {

  private Long sid;
  private String name;
  private String image;

  public Subject() {
  }

  public Subject(Long sid, String name, String image) {
    this.sid = sid;
    this.name = name;
    this.image = image;
  }

  public Long getSid() {
    return sid;
  }

  public void setSid(Long sid) {
    this.sid = sid;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  @Override
  public String toString() {
    return "Subject{" +
            "sid=" + sid +
            ", name='" + name + '\'' +
            ", image='" + image + '\'' +
            '}';
  }
}
