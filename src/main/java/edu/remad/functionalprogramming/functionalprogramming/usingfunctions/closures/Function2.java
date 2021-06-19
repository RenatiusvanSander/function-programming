package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.closures;

/**
 * Function 2 provides a tuple of three parameters
 */
public interface Function2<T, U, V> {

  /**
   * Applis a tuple of three values
   *
   * @param t the type of Object t
   * @param u the type of Object u
   * @return
   */
  V apply(T t, U u);
}
