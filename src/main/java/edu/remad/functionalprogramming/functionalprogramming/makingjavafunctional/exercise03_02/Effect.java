package edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional.exercise03_02;

/**
 * effect interface
 *
 * @param <T> the type of object
 */
public interface Effect<T> {

  /**
   * Applies the given type.
   *
   * @param t type to apply
   */
  void apply(T t);
}
