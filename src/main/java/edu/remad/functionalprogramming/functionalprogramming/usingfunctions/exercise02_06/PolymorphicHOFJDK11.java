package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_06;

import java.util.function.Function;

/**
 *
 */
public class PolymorphicHOFJDK11 {

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
