import java.util.Objects;

public class User1
{
    private  String login;
    private  String password;
    public User1(String login, String password)
    {
        this.login = login;
        this.password = password;
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

    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User1 user = (User1) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    public int hashCode()
    {
        return Objects.hash(login, password);
    }

    public void createQuery()
    {

        class Query
        {

            public  void  printToLog()
            {
                System.out.println("Пользователь с логином " + login + " и паролем " + password + " отправил запрос");
            }

        }

        Query query = new Query();
        query.printToLog();
    }

}
