package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_01;

import java.util.function.Function;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link FunctionalPolymorphicExamplesJDK11}
 */
public class FunctionalPolymorphicExamplesJDK11Test {

  /**
   * Sets up
   */
  @BeforeEach
  void setUp() {
  }

  /**
   * Tests
   */
  @Test
  void shouldSetVary() {
    FunctionalPolymorphicExamplesJDK11 examples = new FunctionalPolymorphicExamplesJDK11();

    Function<Integer, Integer> triple = examples.triple;
    Function<Integer, Integer> square = examples.square;

    Function<Integer, Integer> composeFunction = FunctionalPolymorphicExamplesJDK11
        .compose(triple, square);
  }
}