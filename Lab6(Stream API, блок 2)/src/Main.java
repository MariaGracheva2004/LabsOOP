import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
//        Напишите метод для поиска четных чисел в списках с
//        использованием стримов.
//Задание 1
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numbers1 = List.of(91, 80, 6, 7, 345, 9, 110);
        A task_1 = new A();
        List<Integer> Numbers = task_1.findNumbers(numbers);
        System.out.println("Четные числа: " + Numbers);
        List<Integer> Numbers1 = task_1.findNumbers(numbers1);
        System.out.println("Четные числа: " + Numbers1);

//        Приведите все непустые имена к верхнему регистру.
//        Посчитайте количество имен, начинающихся с определенной
//        буквы
//Задание 2
        B task_2 = new B();
        task_2.Names();


    }
}