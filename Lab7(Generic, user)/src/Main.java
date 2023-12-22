public class Main
{
    public static void main(String[] args)
    {
// пункт 1
        User user = new User("user001", "778786gfdy");
        User.Query query = user.new Query();
        query.printToLog();

        User.Query query1 = new User("user002", "lkldy").new Query();
        query1.printToLog();

        User user1 = new User("user003", "7777dy");
        user1.createQuery();
// пункт 2
        User1 user11 = new User1("user004", "787dhggv");
        user11.createQuery();
// пункт 3
        User2 user22 = new User2("user005", "fylgfg");
        User2.Query query22 = new User2.Query();
        query22.printToLog();


    }
}