package org.codejudge.sb.common;

import java.io.Serializable;

public class MarkLeadSuccessResponse implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  private String status;
  private String communication;
  private String explanation;
  
  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
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
    return "MarkLeadSuccessResponse [status=" + status + ", communication=" + communication
        + ", explanation=" + explanation + "]";
  }

}
