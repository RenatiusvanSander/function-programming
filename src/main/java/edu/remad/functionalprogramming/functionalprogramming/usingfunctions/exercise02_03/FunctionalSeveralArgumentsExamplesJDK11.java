package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_03;

import java.util.function.Function;

public class FunctionalSeveralArgumentsExamplesJDK11 {

  public static interface  BinaryOperator extends  Function<Integer, Function<Integer, Integer>> {}

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
