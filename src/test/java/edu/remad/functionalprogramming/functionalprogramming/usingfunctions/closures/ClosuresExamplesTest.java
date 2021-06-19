package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.closures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link ClosuresExamples}
 */
public class ClosuresExamplesTest {

  /**
   * the tax rate.
   */
  private static double taxRate;

  /**
   * the price
   */
  private static double price;

  @BeforeAll
  static void setUp() {
    taxRate = 0.09;
    price = 12.00;
  }

  /**
   * tests the constructor
   *
   * @throws Exception When runtime errors happens.
   */
  @Test
  void testConstructor() throws Exception {
    ClosuresExamples closure = new ClosuresExamples(taxRate, price);

    Assertions
        .assertNotNull(closure, "The constructor test shows the closure was not instantiated.");
  }

  /**
   * Tests closure
   */
  @Test
  void testClosureExample() {
    Assertions.assertDoesNotThrow(() -> {
      ClosuresExamples closure = new ClosuresExamples(taxRate, price);
      closure.aMethod();
    }, "Failure thrown exception.");
  }
}