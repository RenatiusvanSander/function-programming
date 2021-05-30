package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_00;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link FunctionExamplesJDK11}
 */
public class FunctionExamplesJDK11TestTest {

  /**
   * Tests apply 2 returns 6 as result.
   */
  @Test
  void shouldApplyTwoReturnSix() {
    FunctionExamplesJDK11 obj = new FunctionExamplesJDK11();
    Integer expectedNumber = 6;

    Integer result = obj.triple.apply(2);

    assertEquals(expectedNumber, result," Triple applz result is not 6");
  }
}