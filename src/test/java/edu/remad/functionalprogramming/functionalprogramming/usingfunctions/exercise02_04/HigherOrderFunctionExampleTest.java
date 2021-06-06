package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_04;

import static edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_04.HigherOrderFunctionExample.f;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link HigherOrderFunctionExample}
 */
public class HigherOrderFunctionExampleTest {

  /**
   * Tests compose.
   */
  @Test
  void testCompose() {
    assertEquals(Integer.valueOf(81), f.apply(3));
  }
}