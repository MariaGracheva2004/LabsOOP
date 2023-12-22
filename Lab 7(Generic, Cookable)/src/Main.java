public class Main
{
    public static void main(String[] args)
    {
        Food cake = new Food();
        cake.prepare(new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("Чтобы приготовить торт нужно " + str);
            }
        }, "добавить молоко, яица, масло, муку, шоколад, орехи");

        Food pancake = new Food();
        pancake.prepare(new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("Чтобы приготовить блины нужно " + str);
            }
        }, "добавить молоко, яица, масло, муку");

    }

}