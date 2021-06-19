package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_05;

/**
 * Functional interface
 *
 * @param <T> the type T
 * @param <U> the type U
 */
public interface Function<T, U> {

  U apply(T arg);

  static <T, U, V> Function<Function<U, V>, Function<Function<T, U>, Function<T, V>>> higherCompose() {
    return f -> g -> x -> f.apply(g.apply(x));
  }
}