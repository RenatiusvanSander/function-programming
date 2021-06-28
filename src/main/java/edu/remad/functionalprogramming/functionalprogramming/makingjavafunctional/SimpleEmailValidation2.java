package edu.remad.functionalprogramming.functionalprogramming.makingjavafunctional;

import edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_12.Function;
import java.util.regex.Pattern;

public class SimpleEmailValidation2 {

  /**
   * text of verification message
   */
  public static final String VERIFICATION_MAIL_SENT_TO = "Verification mail sent to %s";

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
  private final Pattern emailPattern = Pattern.compile(EMAIL_REGEX);

  final Function<String, Boolean> emailChecker= s -> emailPattern.matcher(s).matches();

  /**
   * Tests e-mail.
   *
   * @param email email to test
   */
  public void testEmail(String email) {
    if (emailChecker.apply(email)) {
      this.sendVerificationMail(email);
    } else {
      this.logError(String.format(ERROR_MESSAGE, email));
    }
  }

  /**
   * Logs error
   *
   * @param errorMessage error message
   */
  private void logError(String errorMessage) {
    System.out.printf(ERROR_MESSAGE_LOGGED + "%s", errorMessage);
  }

  /**
   * Sends verification mail.
   *
   * @param email email to send verification
   */
  private void sendVerificationMail(String email) {
    System.out.printf(VERIFICATION_MAIL_SENT_TO + "%s", email);
  }
}
