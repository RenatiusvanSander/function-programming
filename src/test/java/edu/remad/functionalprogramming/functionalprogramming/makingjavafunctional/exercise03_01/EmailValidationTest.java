package edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional.exercise03_01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link EmailValidation}
 */
public class EmailValidationTest {

  /**
   * Tests
   */
  @Test
  void shouldSetVary() {
    Result<String> result = EmailValidation.emailChecker.apply("pam.tolks@web.de");

    Assertions.assertEquals(result.getClass(), Result.Success.class);
  }
}