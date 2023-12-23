public class Main {
    public static void main(String[] args)
    {
        TypeFile typefile = new FileUse();
        NameFile namefile = new FileNameAdapter((FileUse) typefile);


        typefile.copyfile("txt", "AAA");
    }
}