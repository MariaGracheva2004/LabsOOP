public class Cake extends Desert
{
    public Cake(Taste taste)
    {
        super(taste);
    }
    @Override
    public void cook()
    {
        System.out.println("Cook cake");
        taste.addTaste();
    }
}