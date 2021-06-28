package edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional.exercise03_02;

import edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_10.Tuple;

/**
 * Case represents cases
 *
 * @param <T> the type of object the case uses
 */
public class Case<T> extends Tuple<Supplier<Boolean>, Supplier<Result<T>>> {

  /**
   * Constructs an instance of {@link Case}
   *
   * @param booleanSupplier supplier for booleans
   * @param resultSupplier  supplier for results
   */
  private Case(Supplier<Boolean> booleanSupplier, Supplier<Result<T>> resultSupplier) {
    super(booleanSupplier, resultSupplier);
  }

  /**
   * @param condition the condition is true or false
   * @param value     supplier has value of result
   * @param <T>       the object of case
   * @return the case with condition and a value
   */
  public static <T> Case<T> mcase(Supplier<Boolean> condition, Supplier<Result<T>> value) {
    return new Case<>(condition, value);
  }

  /**
   * @param value supplier has value of result
   * @param <T> the object of case
   * @return the case with condition and a value
   */
  public static <T> DefaultCase<T> mcase(Supplier<Result<T>> value) {
    return new DefaultCase<>(() -> true, value);
  }

  /**
   * @param defaultCase the default case
   * @param matchers the optional matchers
   * @param <T> the object of result
   * @return result
   */
  @SafeVarargs
  public static <T> Result<T> match(DefaultCase<T> defaultCase, Case<T>... matchers) {
    for (Case<T> aCase : matchers) {
      if (aCase._1.get()) {
        return aCase._2.get();
      }
    }

    return defaultCase._2.get();
  }

  /**
   * @param <T> the type of object
   */
  private static class DefaultCase<T> extends Case<T> {

    /**
     * @param booleanSupplier supplier for {@link Boolean}
     * @param resultSupplier supplier for result
     */
    private DefaultCase(Supplier<Boolean> booleanSupplier, Supplier<Result<T>> resultSupplier) {
      super(booleanSupplier, resultSupplier);
    }
  }
}
