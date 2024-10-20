import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new; //Error: Не импортирован функциональный интерфейс Supplier
    BinaryOperator<Integer> plus = Integer::sum; //Errors: Не импортирован функциональный интерфейс BinaryOperator,
    BinaryOperator<Integer> minus = (x, y) -> x - y; //Error: Не импортирован функциональный интерфейс BinaryOperator
    BinaryOperator<Integer> multiply = (x, y) -> x * y; //Error: Не импортирован функциональный интерфейс BinaryOperator
    BinaryOperator<Integer> devide = (x, y) -> x / y; //Error: Не импортирован функциональный интерфейс BinaryOperator
    UnaryOperator<Integer> pow = x -> x * x; //Error: Не импортирован функциональный интерфейс UnaryOperator
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1; //Error: Не импортирован функциональный интерфейс UnaryOperator
    Predicate<Integer> isPositive = x -> x > 0; //Error: Не импортирован функциональный интерфейс Predicate
    Consumer<Integer> println = System.out::println; //Error: Не импортирован функциональный интерфейс Consumer
}
