package edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional;

public interface Result {

  /**
   * successful computation
   */
  public class Success implements Result {

  }

  /**
   *
   */
  class Failure implements Result {

    /**
     * error message
     */
    private final String errorMessage;

    /**
     * @param s the error message to log
     */
    public Failure(String s) {
      this.errorMessage = s;
    }

    /**
     * @return error message
     */
    public String getErrorMessage() {
      return this.errorMessage;
    }
  }

}
