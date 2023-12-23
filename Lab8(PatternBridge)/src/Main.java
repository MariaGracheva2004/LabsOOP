public class Main {
    public static void main(String[] args) {
        Desert iceCream = new IceCream(new Lemontaste());
        iceCream.cook();
        Desert cake = new Cake(new Lemontaste());
        cake.cook();

        Desert cake1 = new Cake(new Cherrytaste());
        cake1.cook();
    }
}