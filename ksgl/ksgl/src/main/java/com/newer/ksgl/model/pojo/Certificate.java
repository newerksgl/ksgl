package com.newer.ksgl.model.pojo;

public class Certificate {

  private Long cid;
  private String thumbnail;
  private String title;
  private double price;
  private java.sql.Timestamp addtime;
  private String brief;


  public Long getCid() {
    return cid;
  }

  public void setCid(Long cid) {
    this.cid = cid;
  }


  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public java.sql.Timestamp getAddtime() {
    return addtime;
  }

  public void setAddtime(java.sql.Timestamp addtime) {
    this.addtime = addtime;
  }


  public String getBrief() {
    return brief;
  }

  public void setBrief(String brief) {
    this.brief = brief;
  }

}
