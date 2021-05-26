package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_00;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 *
 */
public class FunctionExamplesTest {

  @Test
  public void testCompose() {
    assertEquals(6, FunctionsExamples.triple.apply(2));
    assertEquals(4, FunctionsExamples.square.apply(2));
    assertEquals(36, FunctionsExamples.square.apply(FunctionsExamples.triple.apply(2)));
    assertEquals(27,
        FunctionsExamples.compose(FunctionsExamples.triple, FunctionsExamples.square).apply(3));
  }
}
