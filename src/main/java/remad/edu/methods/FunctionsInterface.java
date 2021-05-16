package remad.edu.methods;

import java.util.function.Function;

/**
 * This demonstrates the power of {@link Function} / {@link FunctionalInterface}
 */
public class FunctionsInterface {

  /**
   * Some examples for what a function interface can be used.
   *
   * @param args the operating system parameters to start this method.
   */
  public static void main(String[] args) {
    Function<Integer, Integer> triple = x -> x * 3;
    Function<Integer, Integer> square = x -> x * x;

    Function<Integer, Function<Integer, Integer>> add = x -> y -> x + y;

    int number = add.apply(3).apply(5);
    System.out.println(number);

    BinaryOperator adds = x -> y -> x + y;
    int number_2 = adds.apply(3).apply(5);
    System.out.println(number_2);

    BinaryOperator mul = x -> y -> x * y;
    int number_3 = mul.apply(3).apply(5);
    System.out.println(number_3);

    //higher order function (HOF)
    Function<Function<Integer, Integer>, Function<Function<Integer, Integer>, Function<Integer, Integer>>> compose = x -> y -> z -> x
        .apply(y.apply(z));
    Function<Integer, Integer> f = compose.apply(square).apply(triple);
    System.out.println(f.apply(2));
  }

  public interface BinaryOperator extends Function<Integer, Function<Integer, Integer>> {
    // empty
  }

}
