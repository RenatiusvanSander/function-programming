package edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional;

import edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_12.Function;
import java.util.regex.Pattern;

/**
 * most functional simple email validation
 */
public class SimpleEmailValidation3 {

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
  static Function<String, Result> emailChecker = s -> {
    if (s == null) {
      return new Result.Failure("email must not be null");
    } else if (s.length() == 0) {
      return new Result.Failure("Email must not be empty.");
    } else if (emailPattern.matcher(s).matches()) {
      return new Result.Success();
    } else {
      return new Result.Failure("email " + s + " is invalid.");
    }
  };

  /**
   * main method
   */
  public static void main(String[] args) {
    validate("this.is@mz.email");
    validate(null);
    validate("");
    validate("john.doe@acme.com");
  }


  /**
   * Logs error
   *
   * @param errorMessage error message
   */
  private static void logError(String errorMessage) {
    System.out.printf(ERROR_MESSAGE_LOGGED + "%s \n", errorMessage);
  }

  /**
   * Sends verification mail.
   *
   * @param email email to send verification
   */
  private static void sendVerificationMail(String email) {
    System.out.printf(VERIFICATION_MAIL_SENT_TO + "%s \n", email);
  }

  /**
   * Validates
   *
   * @param s the email address
   */
  static void validate(String s) {
    Result result = emailChecker.apply(s);

    if (result instanceof Result.Success) {
      sendVerificationMail(s);
    } else {
      logError(((Result.Failure) result).getErrorMessage());
    }
  }
}
