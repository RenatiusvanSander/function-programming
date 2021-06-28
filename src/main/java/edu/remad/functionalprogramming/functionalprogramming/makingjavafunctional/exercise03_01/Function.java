package edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional.exercise03_01;

/**
 * the functional interface
 */
public interface Function<T, U> {

  /**
   * @param arg argument
   * @return the type of U
   */
  U apply(T arg);
}
