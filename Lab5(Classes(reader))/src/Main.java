public class Main
{
    public static void main(String[] args)
    {
        Reader[] readers = new Reader[3];
        readers[0] = new Reader();
        readers[0].FIO = "Иванова Ю. В.";
        readers[0].ticket_number = 6547;
        readers[0].faculty = "Филологический факультет";
        readers[0].data_of_birth = "08.09.2003";
        readers[0].number_tel = "79276554329";

        readers[1] = new Reader();
        readers[1].FIO = "Петрова М. О.";
        readers[1].ticket_number = 7754;
        readers[1].faculty = "Химический факультет";
        readers[1].data_of_birth = "10.12.2001";
        readers[1].number_tel = "79277640921";

        readers[2] = new Reader();
        readers[2].FIO = "Цветков И. Н.";
        readers[2].ticket_number = 9987;
        readers[2].faculty = "Физический факультет";
        readers[2].data_of_birth = "13.04.2001";
        readers[2].number_tel = "79278445673";

        readers[0].takeBook(2);
        readers[0].takeBook( "Словарь", "Энциклопедия");
        readers[0].takeBook(new Book("Словарь", "Ожигов"), new Book("Энциклопедия", "Краснов"));

        readers[0].returnBook(2);
        readers[0].returnBook( "Словарь", "Энциклопедия");
        readers[0].returnBook(new Book("Словарь", "Ожигов"), new Book("Энциклопедия", "Краснов"));


        readers[1].takeBook(3);
        readers[1].takeBook("Учебник по химии", "Химическии реакции", "Основы химии");
        readers[1].takeBook(new Book("Учебник по химии", "Котов"), new Book("Химическии реакции", "Сивов"), new Book("Основы химии", "Белов"));


        readers[1].returnBook(3);
        readers[1].returnBook("Учебник по химии", "Химическии реакции", "Основы химии");
        readers[1].returnBook(new Book("Учебник по химии", "Котов"), new Book("Химическии реакции", "Сивов"), new Book("Основы химии", "Белов"));
    }

}