package remad.edu.methods;

/**
 * functions for functional programming.
 */
public class Functions {

  /**
   * Main
   *
   * @param args the arguments
   */
  public static void main(String[] args) {

    Function triple = new Function() {
      @Override
      public int apply(int arg) {
        return arg * 3;
      }
    };

    Function square = new Function() {
      @Override
      public int apply(int arg) {
        return arg * 3;
      }
    };

    System.out.println(triple.apply(2));

    System.out.println(compose(triple, square));

    FunctionClazz<Integer, Integer> triple_2 = new FunctionClazz<Integer, Integer>() {
      @Override
      public Integer apply(Integer arg) {
        return arg * 3;
      }
    };

    FunctionClazz<Integer, Integer> square_2 = new FunctionClazz<Integer, Integer>() {
      @Override
      public Integer apply(Integer arg) {
        return arg * 3;
      }
    };

    System.out.println(triple_2.apply(4));

    System.out.println(compose(triple_2, square_2));
  }

  /**
   * Composes two instances of {@link Function}
   *
   * @param f1 the function 1
   * @param f2 the function 2
   * @return the composed two functions to one
   */
  public static Function compose(final Function f1, final Function f2) {
    return new Function() {
      @Override
      public int apply(int arg) {
        return f1.apply(f2.apply(arg));
      }
    };
  }

  /**
   * Composes two instances of {@link FunctionClazz}
   *
   * @param f1 the function 1
   * @param f2 the function 2
   * @return the composed {@link FunctionClazz}
   */
  public static FunctionClazz<Integer, Integer> compose(final FunctionClazz<Integer, Integer> f1,
      final FunctionClazz<Integer, Integer> f2) {
    return new FunctionClazz<Integer, Integer>() {
      @Override
      public Integer apply(Integer arg) {
        return f1.apply(f2.apply(arg));
      }
    };
  }
}
