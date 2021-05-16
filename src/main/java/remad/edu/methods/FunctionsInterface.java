package remad.edu.methods;

import java.util.function.Function;

public class SeveralArguments {

  public static void main(String[] args) {
    Function<Integer, Function<Integer, Integer>> add = x -> y -> x + y;

    int number = add.apply(3).apply(5);
    System.out.println(number);

    BinaryOperator adds = x -> y -> x + y;
    int number_2 = adds.apply(3).apply(5);
    System.out.println(number_2);
  }

  public interface BinaryOperator extends Function<Integer, Function<Integer, Integer>> {}

}
