package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_02;

import static edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_02.FunctionalPolymorphicLambdaExamples.compose;
import static edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_02.FunctionalPolymorphicLambdaExamples.square;
import static edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_02.FunctionalPolymorphicLambdaExamples.triple;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link FunctionalPolymorphicLambdaExamples}
 */
public class FunctionalPolymorphicLambdaExamplesTest {

  /**
   * Tests the compose method
   */
  @Test
  void testCompose() {
    assertEquals(Integer.valueOf(6), triple.apply(2));
    assertEquals(Integer.valueOf(4), square.apply(2));
    assertEquals(Integer.valueOf(12), triple.apply(square.apply(2)));
    assertEquals(Integer.valueOf(36), square.apply(triple.apply(2)));
    assertEquals(Integer.valueOf(27), compose(triple, square).apply(3));
  }
}