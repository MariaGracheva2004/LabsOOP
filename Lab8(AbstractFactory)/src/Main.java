public class Main
{
    public static void main(String[] args)
    {   System.out.println("Сosmeticbag1:");
        CosmeticbagFactory factory1;
        factory1 = new Сosmeticbag1();
        factory1.createLipstick();
        factory1.createMascara();
        System.out.println("Сosmeticbag2:");
        CosmeticbagFactory factory2;
        factory2 = new Сosmeticbag1();
        factory2.createLipstick();
        factory2.createMascara();
    }
}