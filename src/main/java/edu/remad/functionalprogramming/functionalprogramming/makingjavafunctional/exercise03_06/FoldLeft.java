package edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional.exercise03_06;

import java.util.List;

/**
 * Fold a list by function left
 */
public class FoldLeft {

  /**
   * Folds left.
   *
   * @param ts       list to fold left by function
   * @param identity sets the identity as object
   * @param f        the defined folding function
   * @param <T>      type of list items
   * @param <U>      the type of object
   * @return the fold left result.
   */
  public static <T, U> U foldLeft(List<T> ts, U identity, Function<U, Function<T, U>> f) {
    U result = identity;
    for (T t : ts) {
      result = f.apply(result).apply(t);
    }

    return result;
  }
}
