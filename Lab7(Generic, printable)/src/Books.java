public class Books implements Printable
{
    private String title;

    public Books(String title)
    {
        this.title = title;
    }

    @Override
    public void print()
    {
        System.out.println("Print book: " + title);
    }
}
