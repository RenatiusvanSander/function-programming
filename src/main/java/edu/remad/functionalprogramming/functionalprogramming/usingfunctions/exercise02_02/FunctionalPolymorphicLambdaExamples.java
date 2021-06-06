package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_02;

/**
 * All functional programmings replaced bz lambda
 */
public class FunctionalPolymorphicLambdaExamples {

  /**
   * Argument is applied with multiplied with 3.
   */
  public static final Function<Integer, Integer> triple = x -> x * 3;

  /**
   * Function multiplies argument with itself.
   */
  public static final Function<Integer, Integer> square = x -> x * x;

  /**
   * Composes two functions.
   *
   * @param f1 function 1
   * @param f2 function 2
   * @return the composed new Function, {@code Function<Integer, Integer>}
   */
  public static Function<Integer, Integer> compose(Function<Integer, Integer> f1,
      Function<Integer, Integer> f2) {
    return arg -> f1.apply(f2.apply(arg));
  }
}
