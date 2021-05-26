package edu.remad.functionalprogramming.functionalprogramming;

/**
 * The class represents a payment.
 */
public class Payment {

  /**
   * the credit card
   */
  public final CreditCard cc;

  /**
   * the amount
   */
  public final int amount;

  /**
   * Constructs an instance of {@link Payment}
   *
   * @param cc     the credit card for the payment
   * @param amount the amount of a payment
   */
  public Payment(CreditCard cc, int amount) {
    this.cc = cc;
    this.amount = amount;
  }

  /**
   * Combines two payments.
   *
   * @param payment1 the first payment
   * @param payment2 the second payment
   * @return the combined payments as one payments
   */
  public static Payment combine(Payment payment1, Payment payment2) {
    if (payment1.cc.equals(payment2.cc)) {
      return new Payment(payment1.cc, payment1.amount + payment2.amount);
    } else {
      throw new IllegalStateException();
    }
  }
}
