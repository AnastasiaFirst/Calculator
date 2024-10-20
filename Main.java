public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        try {
            devideZero(a, b);
        }
        catch(ArithmeticException e) {
            System.out.println("Деление на ноль!");
        }
        int d = calc.multiply.apply(a, b);
        int e = calc.pow.apply(a);
        int f = calc.abs.apply(a);
        boolean k = calc.isPositive.test(a);
        //calc.println.accept(c); //Error: При текущих входных параметрах программа
        // выдавала ошибку: деление на ноль. Было добавлено исключение, чтобы программа не умирала
        calc.println.accept(d);
        calc.println.accept(e);
        calc.println.accept(f);
        System.out.println(k); //Error: Consumer - функциональный интерфейс, который принимает
        // в качестве входного аргумента объект типа Integer, а мы подаем ему на вход объект типа
        // boolean
    }

    private static void devideZero(int aa, int bb) {
        Calculator calc = Calculator.instance.get();
        System.out.println(calc.devide.apply(aa, bb));
    }
}