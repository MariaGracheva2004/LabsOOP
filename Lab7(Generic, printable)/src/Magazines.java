public class Magazines implements Printable
{
    private String title;

    public Magazines(String title)
    {
        this.title = title;
    }

    public void print()
    {
        System.out.println("Print magazine: " + title);
    }

}
