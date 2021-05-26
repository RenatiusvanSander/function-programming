package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_00;

import java.util.function.Function;

public class FunctionExamplesJDK11 {

  public Function<Integer, Integer> triple = new Function<>() {

    @Override
    public Integer apply(Integer arg) {
      return arg * 3;
    }
  };
}
