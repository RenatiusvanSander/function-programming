package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_01;

import java.util.function.Function;

/**
 * Polymorphic examples for java development kit 11
 */
public class FunctionalPolymorphicExamplesJDK11 {

  /**
   * Function multiplies argument with 3.
   */
  Function<Integer, Integer> triple = new Function<>() {

    @Override
    public Integer apply(Integer arg) {
      return arg * 3;
    }
  };

  /**
   * Function multiplies argument with itself.
   */
  Function<Integer, Integer> square = new Function<>() {

    @Override
    public Integer apply(Integer arg) {
      return arg * arg;
    }
  };

  /**
   * Composes two instances of {@link Function<Integer, Integer>}.
   *
   * @param f1 function 1
   * @param f2 function 2
   * @return the composed result
   */
  public static Function<Integer, Integer> compose(Function<Integer, Integer> f1,
      Function<Integer, Integer> f2) {
    return new Function<Integer, Integer>() {

      @Override
      public Integer apply(Integer arg) {
        return f1.apply(f2.apply(arg));
      }
    };
  }
}
