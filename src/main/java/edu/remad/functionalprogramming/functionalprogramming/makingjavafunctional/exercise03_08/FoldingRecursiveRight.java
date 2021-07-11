package edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional.exercise03_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Folds recursive
 */
public class FoldingRecursiveRight {

  /**
   * Folds right.
   *
   * @param ts       the list of values to fold right
   * @param identity the identity is the class for return value
   * @param f        the right folding function to apply
   * @param <T>      the item type of list items
   * @param <U>      the type of object class from identity
   * @return the right-folded value of type U
   */
  public static <T, U> U foldRight(List<T> ts, U identity, Function<T, Function<U, U>> f) {
    return ts.isEmpty() ? identity : f.apply(head(ts)).apply(foldRight(tail(ts), identity, f));
  }

  /**
   * Creates list with head of given list
   *
   * @param list list of items of type T. T is the class of item.
   * @param <T>  T is the class of item.
   * @return singleton list with first item of list
   */
  public static <T> T head(List<T> list) {
    if (list.isEmpty()) {
      throw new IllegalStateException("head of list is empty");
    }

    return list.get(0);
  }

  /**
   * Creates singleton list of with tail item of given list.
   *
   * @param list list of items of type T. T is the class of item.
   * @param <T>  T is the class of item.
   * @return singleton list with tail item of given list
   */
  public static <T> List<T> tail(List<T> list) {
    if (list.isEmpty()) {
      throw new IllegalStateException("tail of list is empty");
    }

    // copy to not change list
    List<T> workList = new ArrayList<>(list);
    workList.remove(0);

    return Collections.unmodifiableList(workList);
  }
}
