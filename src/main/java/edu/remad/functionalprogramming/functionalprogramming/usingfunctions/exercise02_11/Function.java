package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_11;

/**
 * Functional interface
 * @param <T> any kind of object
 * @param <U> any kind of object
 */
public interface Function<T, U> {

  /**
   * Applies the argument
   *
   * @param arg the argument to apply
   * @return the type
   */
  U apply(T arg);
}
