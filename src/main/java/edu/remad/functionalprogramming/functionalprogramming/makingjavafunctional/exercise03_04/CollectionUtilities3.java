package edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional.exercise03_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Utilities for collections 3
 */
public class CollectionUtilities3 {

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

  /**
   * Appends an item to given list in a new list
   *
   * @param list list to add item t.
   * @param t    is an item to add to created list. t is type of the item class.
   * @param <T>  T is the class of item.
   * @return new immutable list appended given list and item t
   */
  public static <T> List<T> append(List<T> list, T t) {
    List<T> ts = new ArrayList<>(list);
    ts.add(t);

    return Collections.unmodifiableList(ts);
  }
}
