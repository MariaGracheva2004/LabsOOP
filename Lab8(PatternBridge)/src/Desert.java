public abstract class Desert
{
    protected Taste taste;

    public Desert(Taste taste)
    {
        this.taste = taste;
    }
    public abstract void cook();
}
