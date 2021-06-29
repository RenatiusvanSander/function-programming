package edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional.exercise03_02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for {@link EmailValidation}
 */
public class EmailValidationTest {

  /**
   * Tests email is invalid.
   */
  @Test
  void emailCheckerShouldReturnFailureEmailInvalid() {
    final String emailToTest = "this.is@mz.email";
    Result<String> expectedResult = Result.failure("email " + emailToTest + " is invalid.");

    Result<String> actualResult = EmailValidation.emailChecker.apply(emailToTest);

    Assertions.assertEquals(expectedResult, actualResult);
  }

  /**
   * Tests email is empty.
   */
  @Test
  void emailCheckerShouldReturnFailureEmailNotBeEmpty() {
    final String emailToTest = "";
    Result<String> expectedResult = Result.failure("email must not be empty.");

    Result<String> actualResult = EmailValidation.emailChecker.apply(emailToTest);

    Assertions.assertEquals(expectedResult, actualResult);
  }

  /**
   * Tests email is null.
   */
  @Test
  void emailCheckerShouldReturnFailureEmailNotNull() {
    Result<String> expectedResult = Result.failure("email must not be null");

    Result<String> actualResult = EmailValidation.emailChecker.apply(null);

    Assertions.assertEquals(expectedResult, actualResult);
  }

  /**
   * Tests email matches.
   */
  @Test
  void emailCheckerShouldReturnSuccess() {
    String emailToTest = "remad@remad.de";
    Result<String> expectedResult = Result.success(emailToTest);

    Result<String> actualResult = EmailValidation.emailChecker.apply(emailToTest);

    Assertions.assertEquals(expectedResult, actualResult);
  }
}