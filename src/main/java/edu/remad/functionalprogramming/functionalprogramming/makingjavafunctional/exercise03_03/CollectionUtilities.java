package edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional.exercise03_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Utilities for collection
 */
public class CollectionUtilities {

  /**
   * Creates empty list
   * @param <T> class of element type
   * @return created empty list of the element type
   */
  public static <T> List<T> list() {
    return Collections.emptyList();
  }

  /**
   * Creates list with one element
   *
   * @param t type of element, {@code T.class}
   * @param <T> class of element type
   * @return a list with single element
   */
  public static <T> List<T> list(T t) {
    return Collections.singletonList(t);
  }

  /**
   * Creates immutable list with item of given list.
   *
   * @param list collection of items T, T is the type of the item class
   * @param <T> class of element type
   * @return unmodifiable list, populated with items of list
   */
  public static <T> List<T> list(Collection<T> list) {
    return Collections.unmodifiableList(new ArrayList<>(list));
  }

  /**
   * Creates immutable list with given var arg array as items.
   *
   * @param t var arg array of T. T is the class of T.
   * @param <T> class of element type
   * @return unmodifiable list, populated with items of var arg
   */
  @SafeVarargs
  public static <T> List<T> list(T... t) {
    return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(t, t.length)));
  }

}
