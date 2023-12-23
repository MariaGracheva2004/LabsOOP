
public class Cosmeticbag2 implements CosmeticbagFactory
{
    @Override
    public Lipstick createLipstick()
    {
        return new  Cosm2Lipstick();
    }

    @Override
    public Mascara createMascara()
    {
        return new Cosm2Mascara();
    }
}
 class Cosm2Lipstick implements Lipstick
{
    public Cosm2Lipstick () {
        System.out.println("Add Lipstick ");
    }
}

 class Cosm2Mascara implements Mascara
{
    public Cosm2Mascara() {
        System.out.println("Add Mascara");
    }
}