package org.codejudge.sb.common;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "id Not Found")
public class ResourceNotFoundException extends RuntimeException {

  public ResourceNotFoundException(HttpStatus notFound, String string) {
    // TODO Auto-generated constructor stub
  }

  /**
   * 
   */
  private static final long serialVersionUID = 1L;}

