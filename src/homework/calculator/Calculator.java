package homework.calculator;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Calculator {

  static Supplier<Calculator> instance = Calculator::new;
  BinaryOperator<Integer> plus = (x, y) -> x + y;
  BinaryOperator<Integer> minus = (x, y) -> x - y;
  BinaryOperator<Integer> multiply = (x, y) -> x * y;
  //невозможно делить на 0, поэтому необходима проверка
  BinaryOperator<Integer> divide = (x, y) -> {
    if (y != 0) {
      return x / y;
    } else {
      System.out.println("Делить на 0 нельзя");
      return Integer.MIN_VALUE;
    }
  };
  UnaryOperator<Integer> pow = x -> x * x;
  UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
  Consumer<Integer> println = System.out::println;
}
