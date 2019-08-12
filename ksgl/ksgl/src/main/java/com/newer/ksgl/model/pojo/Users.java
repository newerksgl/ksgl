package com.newer.ksgl.model.pojo;

public class Users {

  private String name;
  private String email;
  private String users_ip;
  private long integral;
  private String register;
  private String password;
  private long rid;
  private long pri_id;

  public Users() {
  }

  public Users(String name, String email, String users_ip, long integral, String register, String password, long rid, long pri_id) {
    this.name = name;
    this.email = email;
    this.users_ip = users_ip;
    this.integral = integral;
    this.register = register;
    this.password = password;
    this.rid = rid;
    this.pri_id = pri_id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUsers_ip() {
    return users_ip;
  }

  public void setUsers_ip(String users_ip) {
    this.users_ip = users_ip;
  }

  public long getIntegral() {
    return integral;
  }

  public void setIntegral(long integral) {
    this.integral = integral;
  }

  public String getRegister() {
    return register;
  }

  public void setRegister(String register) {
    this.register = register;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public long getRid() {
    return rid;
  }

  public void setRid(long rid) {
    this.rid = rid;
  }

  public long getPri_id() {
    return pri_id;
  }

  public void setPri_id(long pri_id) {
    this.pri_id = pri_id;
  }

  @Override
  public String toString() {
    return "Users{" +
            "name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", users_ip='" + users_ip + '\'' +
            ", integral=" + integral +
            ", register='" + register + '\'' +
            ", password='" + password + '\'' +
            ", rid=" + rid +
            ", pri_id=" + pri_id +
            '}';
  }
}
