public class Reader
{
    String FIO;
    int ticket_number;
    String faculty;
    String data_of_birth;
    String number_tel;


    public void takeBook(int count_book)
    {
        System.out.println(FIO + " взял(а) " + count_book + " книг/книги");
    }
    public void takeBook(String... bookNames)
    {
        System.out.print(FIO + " взял(а) книги: ");
        for (String book : bookNames)
        {
            System.out.print(book + "  ");
        }
        System.out.println();
    }

    public void takeBook(Book... books)
    {
        System.out.print(FIO + " взял(а) книги: ");
        for (Book book : books) {
            System.out.print(book.getName() + " (" + book.getAuthor() + "), ");
        }
        System.out.println();
    }

    public void returnBook(int count_book)
    {
        System.out.println(FIO + " вернул(а) " + count_book + " книги");
    }

    public void returnBook(String... bookNames)
    {
        System.out.print(FIO + " вернул(а) книги: ");
        for (String book : bookNames) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }

    public void returnBook(Book... books)
    {
        System.out.print(FIO + " вернул(а) книги: ");
        for (Book book : books)
        {
            System.out.print(book.getName() + " (" + book.getAuthor() + "), ");
        }
        System.out.println();
    }

}
