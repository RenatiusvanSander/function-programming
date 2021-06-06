package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_03;

import edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_02.Function;

/**
 *
 */
public class FunctionalSeveralArgumentsExamples {

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
  public static Function<Integer, Integer> compose(
      Function<Integer, Integer> f1,
      Function<Integer, Integer> f2) {
    return arg -> f1.apply(f2.apply(arg));
  }

  /**
   * adds two functions
   */
  public static final Function<Integer, Function<Integer, Integer>> add = x -> y -> x + y;

  /**
   * add operator
   */
  public static final BinaryOperator addOp = x -> y -> x + y;

  /**
   * multiply two functions
   */
  public static final BinaryOperator multOp = x -> y -> x * y;
}
