package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_03;

import org.junit.jupiter.api.Test;
import static edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_03.FunctionalSeveralArgumentsExamples.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for {@link FunctionalSeveralArgumentsExamples}
 */
public class FunctionalSeveralArgumentsExamplesTest {

  /**
   * Tests
   */
  @Test
  void testBinaryOperators() {
    assertEquals(Integer.valueOf(8), add.apply(3).apply(5));
    assertEquals(Integer.valueOf(8), addOp.apply(3).apply(5));
    assertEquals(Integer.valueOf(15), multOp.apply(3).apply(5));
  }
}