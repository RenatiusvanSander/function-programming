package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_10;

import java.util.Objects;

/**
 * a tuple of two objects
 *
 * @param <T> object
 * @param <U> object
 */
public class Tuple<T, U> {

  /**
   * first object of tuple
   */
  public final T _1;

  /**
   * second object of tuple
   */
  public final U _2;

  /**
   * @param t is an Object
   * @param u is an Object
   */
  public Tuple(T t, U u) {
    this._1 = Objects.requireNonNull(t);
    this._2 = Objects.requireNonNull(u);
  }

  @Override
  public String toString() {
    return String.format("(%s,%s)", _1, _2);
  }
}
