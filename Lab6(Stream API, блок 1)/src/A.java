
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;
public class A
{
    public static void Stream1()
    {
//генерация массива
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int number;
        Random random = new Random();
        int randomNumber = random.nextInt(21);
        for (int i = 0; i < randomNumber; i++)
        {
            number = random.nextInt() % 100;
            arr.add(number);
        }

        System.out.println("Массив:");
        System.out.println(arr);

        Stream<Integer> a = arr.stream();
        Predicate<Integer> fx;
        fx = (x) -> (x % 2) == 0;
        Stream<Integer> resStream = a.filter(fx);
        System.out.println("Количество парных чисел: " + resStream.count());
        }
    }

