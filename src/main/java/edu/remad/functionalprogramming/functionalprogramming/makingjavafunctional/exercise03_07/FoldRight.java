package edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional.exercise03_07;

import java.util.List;

/**
 * Folds Right
 */
public class FoldRight {

  /**
   * Folds a list right and returns a value.
   *
   * @param ts       the list of values to fold right
   * @param identity the identity is the class for return value
   * @param f        the right folding function to apply
   * @param <T>      the item type of list items
   * @param <U>      the type of object class from identity
   * @return the right-folded value of type U
   */
  public static <T, U> U foldRight(List<T> ts, U identity, Function<T, Function<U, U>> f) {
    U result = identity;
    for (int i = ts.size(); i > 0; i--) {
      result = f.apply(ts.get(i - 1)).apply(result);
    }

    return result;
  }
}
