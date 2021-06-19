package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_08;

import edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_06.Function;

/**
 * Partial function with two arguments
 */
public class PartialFunctionTwoArgs {

  /**
   * Partial function
   *
   * @param b   object for a
   * @param f   the function
   * @param <A> the object
   * @param <B> the object
   * @param <C> the object
   * @return a partial function of type and C
   */
  public static <A, B, C> Function<A, C> partialA(B b, Function<A, Function<B, C>> f) {
    return a -> f.apply(a).apply(b);
  }
}
