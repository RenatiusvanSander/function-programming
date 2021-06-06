package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_03.FunctionalSeveralArgumentsExamplesJDK11.*;

import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link FunctionalSeveralArgumentsExamplesJDK11}
 */
public class FunctionalSeveralArgumentsExamplesJDK11Test {

  /**
   * Tests add and multiply operator
   */
  @Test
  void testBinaryOperatorAddAndMultiply() {
    assertEquals(Integer.valueOf(8), add.apply(3).apply(5));
    assertEquals(Integer.valueOf(8), addOp.apply(3).apply(5));
    assertEquals(Integer.valueOf(15), mult.apply(3).apply(5));
  }
}