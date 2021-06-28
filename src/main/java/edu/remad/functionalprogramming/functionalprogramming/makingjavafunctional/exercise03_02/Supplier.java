package edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional.exercise03_02;

/**
 * The supplier functional interface
 *
 * @param <T> the type of supported object
 */
public interface Supplier<T> {

  /**
   * Gets the supported object
   *
   * @return the supported type
   */
  T get();
}
