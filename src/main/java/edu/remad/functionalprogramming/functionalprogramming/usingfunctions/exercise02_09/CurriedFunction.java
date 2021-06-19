package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_09;

/**
 * Curried function
 */
public class CurriedFunction {

  /**
   * function
   *
   * @param <A> the object
   * @param <B> the object
   * @param <C> the object
   * @param <D> the object
   * @return a function of fourth tuple
   */
  public static <A, B, C, D> Function<A, Function<B, Function<C, Function<D, String>>>> func() {
    return a -> b -> c -> d -> String.format("%s, %s, %s, %s", a, b, c, d);
  }
}
