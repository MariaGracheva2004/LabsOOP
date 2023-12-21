import java.util.List;
import java.util.stream.Collectors;

public class A
{

 public static List<Integer> findNumbers(List<Integer> numbers)
 {
            return numbers.stream()
                    .filter(n -> n % 2 == 0) // фильтруем только четные числа
                    .collect(Collectors.toList()); // собираем результат в список
 }


}
