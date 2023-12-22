


public class Main {
    public static void main(String[] args)
    {
        Books book1 = new Books("Book1");
        Books book2 = new Books("Book2");

        Magazines magazine1 = new Magazines("mag1");
        Magazines magazine2 = new Magazines("mag2");

        Printable newspaper = new Printable()
        {
            public void print()
            {
                System.out.println("Print newspaper");
            }
        };

        Printable[] printables = {book1, book2, magazine1, magazine2, newspaper};
        for (Printable p : printables)
        {
            p.print();
        }
    }
}