package com.newer.ksgl.model.pojo;


public class Privacy {

  private long pri_id;
  private String head;
  private String realname;
  private String idnumber;
  private String phone;
  private long sex;
  private String culture;
  private String address;

  public Privacy() {
  }

  public Privacy(long pri_id, String head, String realname, String idnumber, String phone, long sex, String culture, String address) {
    this.pri_id = pri_id;
    this.head = head;
    this.realname = realname;
    this.idnumber = idnumber;
    this.phone = phone;
    this.sex = sex;
    this.culture = culture;
    this.address = address;
  }

  public long getPri_id() {
    return pri_id;
  }

  public void setPri_id(long pri_id) {
    this.pri_id = pri_id;
  }

  public String getHead() {
    return head;
  }

  public void setHead(String head) {
    this.head = head;
  }

  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }

  public String getIdnumber() {
    return idnumber;
  }

  public void setIdnumber(String idnumber) {
    this.idnumber = idnumber;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public long getSex() {
    return sex;
  }

  public void setSex(long sex) {
    this.sex = sex;
  }

  public String getCulture() {
    return culture;
  }

  public void setCulture(String culture) {
    this.culture = culture;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Privacy{" +
            "pri_id=" + pri_id +
            ", head='" + head + '\'' +
            ", realname='" + realname + '\'' +
            ", idnumber='" + idnumber + '\'' +
            ", phone='" + phone + '\'' +
            ", sex=" + sex +
            ", culture='" + culture + '\'' +
            ", address='" + address + '\'' +
            '}';
  }
}
