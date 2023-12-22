import java.util.Objects;

public class User2
{
    private static String login;
    private static String password;
    public User2(String login, String password)
    {
        this.login = login;
        this.password = password;
    }




    public static class Query
    {
        private  String login;
        private  String password;
        public Query()
        {
            this.login = User2.login;
            this.password = User2.password;
        }
        public  void  printToLog()
        {
            System.out.println("Пользователь с логином " + login + " и паролем " + password + " отправил запрос");
        }

    }

    public String getLogin()
    {
        return login;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }


    public static void initialize(String login, String password)
    {
        User2.login = login;
        User2.password = password;
    }


}
