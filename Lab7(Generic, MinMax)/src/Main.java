public class Main
{
    public static void main(String[] args)
    {
        Integer[] intArray = {30, 233, 8, 10, 5};
        MinMax<Integer> intMinMax = new MinMax<>(intArray);
        System.out.println("Минимальное значение: " + intMinMax.findMin());
        System.out.println("Максимальное значение: " + intMinMax.findMax());

        String[] stringArray = {"red", "black", "blue", "purple"};
        MinMax<String> stringMinMax = new MinMax<>(stringArray);
        System.out.println("Минимальное значение: " + stringMinMax.findMin());
        System.out.println("Максимальное значение: " + stringMinMax.findMax());
    }
}