package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println(calc.calc(2, 3, "+"));
        System.out.println(calc.calc(10, 4, "-"));
        System.out.println(calc.calc(3, 5, "*"));
        System.out.println(calc.calc(8, 2, "/"));

        try {
            System.out.println(calc.calc(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calc(5, 5, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}