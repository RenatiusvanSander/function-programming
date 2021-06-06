package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_04;

import static edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_04.HigherOrderFunctionExampleJDK11.f;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link HigherOrderFunctionExampleJDK11}
 */
public class HigherOrderFunctionExampleJDK11Test {

  /**
   * Tests
   */
  @Test
  void testCompose() {
    assertEquals(Integer.valueOf(81), f.apply(3));
  }
}