package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_07;

import edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_06.Function;

/**
 * Partial Function
 */
public class PartialFunction {

  /**
   * Partial function.
   *
   * @param a   object for a
   * @param f   the function
   * @param <A> the object
   * @param <B> the object
   * @param <C> the object
   * @return a partial function of type and C
   */
  public static <A, B, C> Function<B, C> partialA(A a, Function<A, Function<B, C>> f) {
    return f.apply(a);
  }
}
