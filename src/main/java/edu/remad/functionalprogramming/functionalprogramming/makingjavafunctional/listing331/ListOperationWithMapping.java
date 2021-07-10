package edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional.listing331;

import java.util.ArrayList;
import java.util.List;

/**
 * List operation with mapping
 */
public class ListOperationWithMapping {

  /**
   * function to add 20%
   */
  public static Function<Integer, Double> addTwentyPercent = x -> x * 1.2;

  /**
   * Main method
   *
   * @param args given arguments
   */
  public static void main(String... args) {
    List<Integer> prices = List.of(1, 5, 6, 56, 34, 67, 433, 987);

    List<Double> pricesTimes20Percent = map(prices, addTwentyPercent);

    for (Double price : pricesTimes20Percent) {
      System.out.println(price);
    }
  }

  /**
   * Operates a list with mapping.
   *
   * @param list list to operate
   * @param f    the mapping function
   * @param <T>  the type of list items
   * @param <U>  the type of returned list items
   * @return the mapped values by function as list
   */
  public static <T, U> List<U> map(List<T> list, Function<T, U> f) {
    List<U> newList = new ArrayList<>();
    for (T value : list) {
      newList.add(f.apply(value));
    }

    return newList;
  }
}
