package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_06;

/**
 * Polymorphic functional interface
 */
public interface Function<T, U>{

  /**
   * Applies the argument to implementation
   *
   * @param arg the argument to apply
   * @return the applied argument
   */
  U apply(T arg);

  /**
   * Higher composes
   *
   * @param <T> function of T
   * @param <U> function of U
   * @param <V> function of V
   * @return higher composed function
   */
  static <T, U, V> Function<Function<T, U>, Function<Function<U, V>, Function<T, V>>> higherAndThen() {
    return f -> g -> x -> g.apply(f.apply(x));
  }
}
