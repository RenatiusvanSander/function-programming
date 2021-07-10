package edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional.exercise03_02;

import static edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional.exercise03_02.Case.match;
import static edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional.exercise03_02.Case.mcase;
import static edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional.exercise03_02.Result.failure;
import static edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional.exercise03_02.Result.success;

import java.util.regex.Pattern;

/**
 * Validates email
 */
public class EmailValidation {

  /**
   * error message log text
   */
  public static final String ERROR_MESSAGE_LOGGED = "Error message logged: ";
  /**
   * regex matcher text
   */
  private static final String EMAIL_REGEX = "^[a-z0-9._%+-]+@[a-z0-9._]+\\.[a-z]{2,4}$";
  /**
   * the email pattern
   */
  static Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
  /**
   * success implementation
   */
  static Effect<String> success = s -> System.out.println("Mail sent to " + s);

  /**
   * failure implementation
   */
  static Effect<String> failure = s -> System.out.println(ERROR_MESSAGE_LOGGED + s);

  /**
   * checks email
   */
  static Function<String, Result<String>> emailChecker = s -> match(mcase(() -> success(s)),
      mcase(() -> s == null, () -> failure("email must not be null")),
      mcase(() -> s.length() == 0, () -> failure("email must not be empty.")),
      mcase(() -> !emailPattern.matcher(s).matches(),
          () -> failure("email " + s + " is invalid.")));

  /**
   * main method
   *
   * @param args the arguments
   */
  public static void main(String... args) {
    emailChecker.apply("this.is@mz.email").bind(success, failure);
    emailChecker.apply(null).bind(success, failure);
    emailChecker.apply("").bind(success, failure);
    emailChecker.apply("john.doe@acme.com").bind(success, failure);
  }

}