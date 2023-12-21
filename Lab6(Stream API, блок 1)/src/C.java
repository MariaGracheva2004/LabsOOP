
import java.util.Arrays;
public class C
{
    public static void Stream3()
    {
        String[] strings = {"red", "blue", "orange", "pink", "black"};

        System.out.println("Отсортированные строки:");
        Arrays.stream(strings)
                .sorted((s1, s2) -> s1.compareTo(s2))
                .forEach(System.out::println);
    }
}
