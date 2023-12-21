

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main

{
    public static void main(String[] args)
    {
//Для любого набора случайно-сгенерированных чисел нужно
// определить количество парных. Для решения задачи
// использовать средства программного интерфейса Stream API.
        A task_1 = new A();//Задание 1
        task_1.Stream1();
// Задано множество фамилий сотрудников. Разработать
// программу, которая отображает все фамилии, начинающиеся на
// букву «J». Задачу решить с использованием Stream API
        B task_2 = new B();//Задание 2
        task_2.Stream2();
//Задан массив строк. Используя средства StreamAPI отсортировать
//строки в лексикографическом порядке
        C task_3 = new C();//Задание 3
        task_3.Stream3();
    }
}