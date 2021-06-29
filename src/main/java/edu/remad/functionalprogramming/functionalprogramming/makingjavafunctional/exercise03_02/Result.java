package edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional.exercise03_02;

import java.util.Objects;

/**
 * the result can be instance of {@link Success} or {@link Failure}
 *
 * @param <T>the object type of result
 */
public interface Result<T> {

  /**
   * Binds effect of success or failure.
   *
   * @param Success success of an operation
   * @param failure failure of an operation
   */
  void bind(
      Effect<T> Success, Effect<String> failure);

  /**
   * Failure
   *
   * @param message error message
   * @param <T> type of class
   * @return failure
   */
  static <T> Result<T> failure(String message) {
    return new Failure<>(message);
  }

  /**
   * Success
   *
   * @param value value to set
   * @param <T> type of class
   * @return success
   */
  static <T> Result<T> success(T value) {
    return new Success<>(value);
  }

  /**
   * the result success
   *
   * @param <T> the type of class
   */
  class Success<T> implements Result<T> {

    /**
     * value
     */
    private final T value;

    @Override
    public String toString() {
      return "Success{" +
          "value=" + value +
          '}';
    }

    /**
     * Constructor
     *
     * @param t the object
     */
    private Success(T t) {
      this.value = t;
    }

    @Override
    public void bind(
        Effect<T> success, Effect<String> failure) {
      success.apply(value);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof Success)) {
        return false;
      }
      Success<?> success = (Success<?>) o;
      return value.equals(success.value);
    }

    @Override
    public int hashCode() {
      return Objects.hash(value);
    }
  }

  /**
   * the result failure
   *
   * @param <T> the type of class
   */
  class Failure<T> implements Result<T> {

    /**
     * error message
     */
    private final String errorMessage;

    /**
     * @param s the error message to log
     */
    private Failure(String s) {
      this.errorMessage = s;
    }

    @Override
    public void bind(
        Effect<T> success, Effect<String> failure) {
      failure.apply(this.errorMessage);
    }

    @Override
    public String toString() {
      return "Failure{" +
          "errorMessage='" + errorMessage + '\'' +
          '}';
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof Failure)) {
        return false;
      }
      Failure<T> failure = (Failure<T>) o;

      return errorMessage.equals(failure.errorMessage);
    }

    @Override
    public int hashCode() {
      return Objects.hash(errorMessage);
    }
  }

}
