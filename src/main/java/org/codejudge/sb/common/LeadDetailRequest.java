package org.codejudge.sb.common;

import java.io.Serializable;

public class LeadDetailRequest implements Serializable {

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
  private String locationString;
  private String communication;
  private String status;

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

  public String getLocationString() {
    return locationString;
  }

  public void setLocationString(String locationString) {
    this.locationString = locationString;
  }

  public String getCommunication() {
    return communication;
  }

  public void setCommunication(String communication) {
    this.communication = communication;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "LeadDetailRequest [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
        + ", mobile=" + mobile + ", email=" + email + ", locationType=" + locationType
        + ", locationString=" + locationString + ", communication=" + communication + ", status="
        + status + "]";
  }

}
