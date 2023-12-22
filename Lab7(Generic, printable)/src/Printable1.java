public class Printable1
{
    public static void main(String[] args)
    {
        Books book1 = new Books("Book 1");
        Books book2 = new Books("Book 2");
        Books book3 = new Books("Book 3");

        Magazines magazine1 = new Magazines("Mag 1");
        Magazines magazine2 = new Magazines("Mag 2");
        Magazines magazine3 = new Magazines("Mag 3");

        Printable newspaper = new Printable()
        {
            public void print()
            {
                System.out.println("Print newspaper");
            }
        };

        Printable[] printabls = {book1, book2, book3, magazine1, magazine2, magazine3, newspaper};
        for (Printable p : printabls)
        {
            p.print();
        }
    }
}
