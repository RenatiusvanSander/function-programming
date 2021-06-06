package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_04;

import java.util.function.Function;

/**
 *
 */
public class HigherOrderFunctionExampleJDK11 {

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
  public static final Function<Function<Integer, Integer>, Function<Function<Integer, Integer>,
      Function<Integer, Integer>>> compose = x -> y -> z -> x.apply(y.apply(z));

  public static final Function<Integer, Integer> f = compose.apply(square).apply(triple);
}
