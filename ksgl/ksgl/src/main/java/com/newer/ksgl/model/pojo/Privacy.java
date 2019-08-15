package com.newer.ksgl.model.pojo;


public class Privacy {

  private Long pri_id;
  private String head;
  private String realname;
  private String idnumber;
  private String phone;
  private Long sex;
  private String culture;
  private String address;

  public Privacy() {
  }

  public Privacy(Long pri_id, String head, String realname, String idnumber, String phone, Long sex, String culture, String address) {
    this.pri_id = pri_id;
    this.head = head;
    this.realname = realname;
    this.idnumber = idnumber;
    this.phone = phone;
    this.sex = sex;
    this.culture = culture;
    this.address = address;
  }

  public Long getPri_id() {
    return pri_id;
  }

  public void setPri_id(Long pri_id) {
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

  public Long getSex() {
    return sex;
  }

  public void setSex(Long sex) {
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
