package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_02;

/**
 * Polymorphic functional interface
 */
public interface Function<T, U>{

  /**
   * Applies the argument to implementation
   *
   * @param arg the argument to apply
   * @return the applied argument
   */
  U apply(T arg);
}
