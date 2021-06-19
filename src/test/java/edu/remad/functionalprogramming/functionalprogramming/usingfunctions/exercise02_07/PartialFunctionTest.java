package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_07;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_06.Function;
import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link PartialFunction}
 */
public class PartialFunctionTest {

  /**
   * Tests partial function
   */
  @Test
  public void testPartialA() {
    Function<Integer, Function<Double, Double>> f = a -> b -> a * (1 + b / 100);
    Function<Double, Double> g = PartialFunction.partialA(89, f);

    assertEquals(f.apply(89).apply(7.0), g.apply(7.0));
    assertEquals(f.apply(89).apply(0.0), g.apply(0.0));
    assertEquals(f.apply(89).apply(16.65), g.apply(16.65));
  }
}