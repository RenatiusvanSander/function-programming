package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link Function}
 */
public class FunctionTest {

  public static final Function<Integer, Integer> triple = x ->
      x * 3;

  public static final Function<Integer, Integer> square = x ->
      x * x;

  /**
   * Tests higher order function.
   */
  @Test
  public void testHigherOrderCompose() {
    assertEquals(Integer.valueOf(36), Function
        .<Integer, Integer, Integer>higherAndThen().apply(triple).apply(square).apply(2));
  }
}
