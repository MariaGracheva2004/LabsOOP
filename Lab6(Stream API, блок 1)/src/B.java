import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class B
{
    public static void Stream2()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество сотрудников:");
        int n = scan.nextInt();
        String[] employees = new String[n];
        System.out.println("Введите фамилии сотрудников:");
        for (int i = 0; i < n; i++)
        {
            System.out.println("Фамилия сотрудникa " + (i+1) + ":");
            employees[i] = scan.next();
        }

        System.out.println("Фамилии сотрудников, начинающиеся на 'J':");
        Stream.of(employees)
                .filter(employee -> employee.startsWith("J"))
                .forEach(System.out::println);

        if (Arrays.stream(employees).noneMatch(s -> s.startsWith("J"))) {
            System.out.println("Нет таких сотрудников");
        }
    }

}
