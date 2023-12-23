public class IceCream extends Desert
{
    public IceCream(Taste taste)
    {
        super(taste);
    }
    @Override
    public void cook()
    {
        System.out.println("Cook IceCream");
        taste.addTaste();
    }
}
