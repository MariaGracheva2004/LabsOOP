import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class B
{
    public static void Names()
    {
    List<String> names = Arrays.asList("Anna", "Vera", "olga", "David", "mary", "Kate", "Alen");

    // Приведение всех имен к верхнему регистру
    List<String> newNames = names.stream()
            .filter(name -> !name.isEmpty())
            .map(String::toUpperCase)
            .collect(Collectors.toList());

        System.out.println("Имена приведенные к верхнему регистру: " + newNames);

    // Подсчет количества имен, начинающихся с определенной буквы
    Map<Character, Long> counter = names.stream()
            .filter(name -> !name.isEmpty())
            .collect(Collectors.groupingBy(name -> name.charAt(0), Collectors.counting()));

        System.out.println("Количество имен, начинающихся с каждой буквы: " + counter);
}
}