package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_08;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_06.Function;
import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link PartialFunctionTwoArgs}
 */
public class PartialFunctionTwoArgsTest {

  /**
   * Tests partial function
   */
  @Test
  public void testPartialA() {
    Function<Integer, Function<Double, Double>> f = a -> b -> a * (1 + b / 100);
    Function<Integer, Double> g = PartialFunctionTwoArgs.partialA(16.65, f);

    assertEquals(f.apply(89).apply(16.65), g.apply(89));
    assertEquals(f.apply(0).apply(16.65), g.apply(0));
    assertEquals(f.apply(1623).apply(16.65), g.apply(1623));
  }
}