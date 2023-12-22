public class Main
{
    public static void main(String[] args)
    {

        GenericClass<String,Hamster,Integer> gena=new GenericClass<>("abc", new Hamster(),123);
        gena.showTypes();
    }
}