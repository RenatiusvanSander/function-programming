package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_00;

/**
 * the function examples
 */
public class FunctionsExamples {

  /**
   *
   */
  public static final Function triple = new Function() {

    @Override
    public int apply(int arg) {
      return arg * 3;
    }
  };

  /**
   *
   */
  public static final Function square = new Function() {

    @Override
    public int apply(int arg) {
      return arg * arg;
    }
  };

  /**
   *
   * @param f1
   * @param f2
   * @return
   */
  public static final Function compose(final Function f1, final Function f2) {
    return new Function() {

      @Override
      public int apply(int arg) {
        return f1.apply(f2.apply(arg));
      }
    };
  }
}
