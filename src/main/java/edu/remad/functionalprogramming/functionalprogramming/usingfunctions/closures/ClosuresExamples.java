package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.closures;

/**
 * Closures examples
 */
public class ClosuresExamples {

  /**
   * tax rate
   */
  private double taxRate;

  /**
   * price
   */
  private double price;

  /**
   * Creates instance of {@link ClosuresExamples}
   *
   * @param taxRate the tax rate
   * @param price   the price
   */
  public ClosuresExamples(double taxRate, double price) {
    this.taxRate = taxRate;
    this.price = price;
  }

  /**
   * A method to show price including tax.
   */
  public void aMethod() {
    Function2<Double, Double, Double> addTax = (taxRate, price) -> price + price * taxRate;
    double priceIncludingTax = addTax.apply(this.taxRate, this.price);
    System.out.println(priceIncludingTax);
  }
}
