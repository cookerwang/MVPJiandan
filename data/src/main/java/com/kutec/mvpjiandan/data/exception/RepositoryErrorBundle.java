package com.kutec.mvpjiandan.data.exception;

import com.kutec.mvpjiandan.domain.common.exception.ErrorBundle;

public class RepositoryErrorBundle implements ErrorBundle {

  private final Exception exception;

  public RepositoryErrorBundle(Exception exception) {
    this.exception = exception;
  }

  @Override
  public Exception getException() {
    return exception;
  }

  @Override
  public String getErrorMessage() {
    String message = "";
    if (this.exception != null) {
      this.exception.getMessage();
    }
    return message;
  }
}
