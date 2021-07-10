package edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional.listing331;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link ListOperationWithMapping}
 */
public class ListOperationWithMappingTest {

  /**
   * Tests
   */
  @Test
  void shouldSetVary() {
    List<Integer> numbers = List.of(1, 5, 6, 56, 34, 67, 433, 987);
    List<Double> expectedPrices = numbers.stream().
        map(item -> 1.2 * item).collect(Collectors.toList());

    List<Double> actualPrices = ListOperationWithMapping.map(numbers, ListOperationWithMapping.addTwentyPercent);

    Assertions.assertArrayEquals(expectedPrices.toArray(), actualPrices.toArray());

  }
}