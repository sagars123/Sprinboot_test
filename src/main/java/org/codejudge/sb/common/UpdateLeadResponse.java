package org.codejudge.sb.common;

import java.io.Serializable;

public class UpdateLeadResponse implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  private String status;
  private String reason;

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public String toString() {
    return "UpdateLeadResponse [status=" + status + ", reason=" + reason + "]";
  }



}
