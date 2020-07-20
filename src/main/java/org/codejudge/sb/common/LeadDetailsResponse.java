package org.codejudge.sb.common;

import java.io.Serializable;

public class LeadDetailsResponse implements Serializable{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  
  private Long id;
  private String firstName;
  private String lastName;
  private String mobile;
  private String email;
  private String locationType;
  private String status;
  private String communication;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getLocationType() {
    return locationType;
  }

  public void setLocationType(String locationType) {
    this.locationType = locationType;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getCommunication() {
    return communication;
  }

  public void setCommunication(String communication) {
    this.communication = communication;
  }

  @Override
  public String toString() {
    return "LeadEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
        + ", mobile=" + mobile + ", email=" + email + ", locationType=" + locationType + ", status="
        + status + ", communication=" + communication + "]";
  }




}
