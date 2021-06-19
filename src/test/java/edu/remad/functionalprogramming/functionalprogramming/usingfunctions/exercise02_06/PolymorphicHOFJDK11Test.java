package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Function;
import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link PolymorphicHOFJDK11}
 */
public class PolymorphicHOFJDK11Test {

  public static final Function<Integer, Integer> triple = x ->
      x * 3;

  public static final Function<Integer, Integer> square = x ->
      x * x;

  /**
   * Tests
   */
  @Test
  void shouldSetVary() {
    assertEquals(Integer.valueOf(36), PolymorphicHOFJDK11
        .<Integer, Integer, Integer>higherAndThen().apply(triple).apply(square).apply(2));
  }
}