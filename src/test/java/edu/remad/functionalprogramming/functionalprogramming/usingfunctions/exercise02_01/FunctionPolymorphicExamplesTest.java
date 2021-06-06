package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_01;

import static edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_01.FunctionPolymorphicExamples.compose;
import static edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_01.FunctionPolymorphicExamples.square;
import static edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_01.FunctionPolymorphicExamples.triple;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link FunctionPolymorphicExamples}
 */
public class FunctionPolymorphicExamplesTest {

  /**
   * Tests the compose
   */
  @Test
  void testCompose() {
    assertEquals(Integer.valueOf(6), triple.apply(2));
    assertEquals(Integer.valueOf(4), square.apply(2));
    assertEquals(Integer.valueOf(36), square.apply(triple.apply(2)));
    assertEquals(Integer.valueOf(27), compose(triple, square).apply(3));
  }
}