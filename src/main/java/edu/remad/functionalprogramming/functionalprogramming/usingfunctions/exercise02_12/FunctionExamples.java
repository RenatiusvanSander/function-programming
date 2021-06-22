package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_12;

/**
 * factorial as functional interfaces
 */
public class FunctionExamples {

  /**
   * factorial 0, not compilable, points on itself
   */
  public static final Function<Integer, Integer> factorial0 = n -> n <= 1 ? n
      : n * FunctionExamples.factorial0.apply(n - 1);
}
