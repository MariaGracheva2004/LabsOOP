public class Сosmeticbag1 implements CosmeticbagFactory {
    @Override
    public Lipstick createLipstick()
    {
        return new  Cosm1Lipstick();
    }

    @Override
    public Mascara createMascara()
    {
        return new Cosm1Mascara();
    }
}



class Cosm1Lipstick implements Lipstick
{
    public Cosm1Lipstick()
    {
        System.out.println("Add Lipstick ");
    }
}

 class Cosm1Mascara implements Mascara
{
    public Cosm1Mascara()
    {
        System.out.println("Add Mascara");
    }
}