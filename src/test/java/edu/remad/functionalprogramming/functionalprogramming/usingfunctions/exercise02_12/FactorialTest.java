package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_12;

import static edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_12.Factorial.factorial1;
import static edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_12.FunctionExamples.factorial0;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link Factorial}
 */
public class FactorialTest {

  /**
   * Tests factorial.
   */
  @Test
  void testFactorial() {
    assertEquals(Integer.valueOf(3628800), factorial0.apply(10));
    assertEquals(Integer.valueOf(3628800), factorial1.apply(10));
    FunctionExamples x = new FunctionExamples();
  }
}