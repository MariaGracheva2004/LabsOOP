public class Main {
    public static void main(String[] args)
    {
        Calculator<Integer> intCalculator = new Calculator<>();
        System.out.println("Сумма: " + intCalculator.sum(10, 6));
        System.out.println("Произведение: " + intCalculator.multiply(12, 3));
        System.out.println("Деление: " + intCalculator.divide(245, 5));
        System.out.println("Вычитание: " + intCalculator.subtraction(5, 3));

        Calculator<Double> doubleCalculator = new Calculator<>();
        System.out.println("Сумма: " + doubleCalculator.sum(5.0, 3.0));
        System.out.println("Произведение: " + doubleCalculator.multiply(5.3, 2.0));
        System.out.println("Деление: " + doubleCalculator.divide(100.0, 4.2));
        System.out.println("Вычитание: " + doubleCalculator.subtraction(34.0, 5.0));
    }
}