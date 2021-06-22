package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_12;

/**
 * Several factorial realizations
 */
public class Factorial {

  /**
   * factorial first waz done static
   */
  public static final Function<Integer, Integer> factorial0 = n -> n <= 1 ? n
      : n * FunctionExamples.factorial0.apply(n - 1);

  /**
   * factorial done as static
   */
  public static Function<Integer, Integer> factorial1;
  static {
    factorial1 = n -> n <= 1 ? n : n * factorial1.apply(n - 1);
  }

  /**
   * factorial done as lambda.
   */
  public final Function<Integer, Integer> factorial2 = n -> n <= 1 ? n
      : n * this.factorial2.apply(n - 1);

  /**
   * factorial done as method
   */
  public Function<Integer, Integer> factorial3;
  {
    factorial3 = n -> n <= 1 ? n : n * factorial3.apply(n - 1);
  }
}
