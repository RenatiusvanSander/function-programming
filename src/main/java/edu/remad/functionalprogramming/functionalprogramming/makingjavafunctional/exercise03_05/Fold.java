package edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional.exercise03_05;

import edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional.listing331.Function;
import java.util.List;

public class Fold {

  /**
   * Folds a list of integers
   *
   * @param is       list of numbers
   * @param identity integer is the identity of result
   * @param f        the function to fold the list
   * @return the folded is as a number
   */
  public static Integer fold(List<Integer> is, Integer identity,
      Function<Integer, Function<Integer, Integer>> f) {
    int result = identity;
    for (Integer i : is) {
      result = f.apply(result).apply(i);
    }

    return result;
  }
}
