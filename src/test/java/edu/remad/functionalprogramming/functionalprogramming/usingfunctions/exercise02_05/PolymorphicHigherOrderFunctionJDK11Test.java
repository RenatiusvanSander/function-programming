package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Function;
import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link PolymorphicHigherOrderFunctionJDK11}
 */
public class PolymorphicHigherOrderFunctionJDK11Test {

  public static final Function<Integer, Integer> triple = x -> x * 3;

  public static final Function<Integer, Integer> square = x -> x * x;

  /**
   * Tests higher order function for JDK 11
   */
  @Test
  public void testHigherOrderCompose() {
    assertEquals(Integer.valueOf(36),
        PolymorphicHigherOrderFunctionJDK11.<Integer, Integer, Integer>higherCompose().apply(square)
            .apply(triple).apply(2));
  }
}