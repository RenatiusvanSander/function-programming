package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_10;

import edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_10.Function;

/**
 * a curried function
 */
public class CurriedFunction {

  /**
   *
   * @param f the function
   * @param <A> object
   * @param <B> object
   * @param <C> object
   * @return a curried function
   */
  public static <A, B, C> Function<A, Function<B, C>> curry(Function<Tuple<A, B>, C> f) {
    return a -> b -> f.apply(new Tuple<>(a, b));
  }
}
