package edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional.exercise03_01;

import java.util.regex.Pattern;
import org.assertj.core.internal.cglib.core.internal.Function;

/**
 * Validates an email
 */
public class EmailValidation {

  /**
   * text of verification message
   */
  public static final String VERIFICATION_MAIL_SENT_TO = "Verification mail sent to ";

  /**
   * error message log text
   */
  public static final String ERROR_MESSAGE_LOGGED = "Error message logged: ";

  /**
   * regex matcher text
   */
  private static final String EMAIL_REGEX = "^[a-z0-9._%+-]+@[a-z0-9._]+\\.[a-z]{2,4}$";

  /**
   * the error message
   */
  private static final String ERROR_MESSAGE = "email %s is invalid.";

  /**
   * the email pattern
   */
  static Pattern emailPattern = Pattern.compile(EMAIL_REGEX);

  /**
   * Checks e-mail for validity
   */
  static Function<String, Result<String>> emailChecker = s -> {
    if (s == null) {
      return Result.failure("email must not be null");
    } else if (s.length() == 0) {
      return Result.failure("Email must not be empty.");
    } else if (emailPattern.matcher(s).matches()) {
      return Result.success(s);
    } else {
      return Result.failure("email " + s + " is invalid.");
    }
  };

  /**
   * success implementation
   */
  static Effect<String> success = s -> System.out.println("Mail sent to " + s);

  /**
   * failure implementation
   */
  static Effect<String> failure = s -> System.out.println(ERROR_MESSAGE_LOGGED + s);

  /**
   * main method
   */
  public static void main(String... args) {
    emailChecker.apply("this.is@mz.email").bind(success, failure);
    emailChecker.apply(null).bind(success, failure);
    emailChecker.apply("").bind(success, failure);
    emailChecker.apply("john.doe@acme.com").bind(success, failure);
  }
}
