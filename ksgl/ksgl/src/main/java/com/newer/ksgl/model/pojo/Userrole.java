package com.newer.ksgl.model.pojo;


public class Userrole {

  private Integer rid;
  private String role_name;
  private Integer defaultrole;
  private String description;
  private Integer isadmin;

  public Userrole(){}

  public Userrole(Integer rid, String role_name, Integer defaultrole, String description, Integer isadmin) {
    this.rid = rid;
    this.role_name = role_name;
    this.defaultrole = defaultrole;
    this.description = description;
    this.isadmin = isadmin;
  }

  public Integer getRid() {
    return rid;
  }

  public void setRid(Integer rid) {
    this.rid = rid;
  }

  public String getRole_name() {
    return role_name;
  }

  public void setRole_name(String role_name) {
    this.role_name = role_name;
  }

  public Integer getDefaultrole() {
    return defaultrole;
  }

  public void setDefaultrole(Integer defaultrole) {
    this.defaultrole = defaultrole;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getIsadmin() {
    return isadmin;
  }

  public void setIsadmin(Integer isadmin) {
    this.isadmin = isadmin;
  }

  @Override
  public String toString() {
    return "Userrole{" +
            "rid=" + rid +
            ", role_name='" + role_name + '\'' +
            ", defaultrole=" + defaultrole +
            ", description='" + description + '\'' +
            ", isadmin=" + isadmin +
            '}';
  }
}