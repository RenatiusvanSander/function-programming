package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_02;

import static edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_02.FunctionalPolymorphicLambdaExamplesJDK11.compose;
import static edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_02.FunctionalPolymorphicLambdaExamplesJDK11.square;
import static edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_02.FunctionalPolymorphicLambdaExamplesJDK11.triple;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link FunctionalPolymorphicLambdaExamplesJDK11}
 */
public class FunctionalPolymorphicLambdaExamplesJDK11Test {

  /**
   * Tests compose method  that uses JDK 11
   */
  @Test
  void testComposeJDK11() {
    assertEquals(Integer.valueOf(6), triple.apply(2));
    assertEquals(Integer.valueOf(4), square.apply(2));
    assertEquals(Integer.valueOf(12), triple.apply(square.apply(2)));
    assertEquals(Integer.valueOf(36), square.apply(triple.apply(2)));
    assertEquals(Integer.valueOf(27), compose(triple, square).apply(3));
  }
}