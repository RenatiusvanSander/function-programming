package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_05;

import java.util.function.Function;

/**
 *
 */
public class PolymorphicHigherOrderFunctionJDK11 {

  /**
   * Higher composes
   *
   * @param <T> function of T
   * @param <U> function of U
   * @param <V> function of V
   * @return higher composed function
   */
  public static <T, U, V> Function<Function<T, U>, Function<Function<V, T>, Function<V, U>>> higherCompose() {
    return f -> g -> x -> f.apply(g.apply(x));
  }
}
