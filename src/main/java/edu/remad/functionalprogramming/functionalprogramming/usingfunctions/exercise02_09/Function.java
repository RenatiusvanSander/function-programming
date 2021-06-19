package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_09;

/**
 *
 * @param <T>
 * @param <U>
 */
public interface Function<T, U> {

  /**
   *
   * @param arg the argument to apply
   * @return the type
   */
  U apply(T arg);
}
