public class Phone
{
    int number;
    String model;
    int weight;

    public Phone(int number, String model, int weight)
    {
        this(number, model);
        this.weight = weight;
    }
    public Phone(int number, String model)
    {
        this.number = number;
        this.model = model;
    }
    public Phone() { }

    public void receiveCall(String name)
    {
        System.out.println("Звонит "+ name);
    }

    public void receiveCall(String name, int number)
    {
        System.out.println("Звонит "+ name);
        System.out.println(number);
    }
    public int getNumber()
    {
        return number;
    }
    public void information()
    {
        System.out.println("Номер телефона:"+ getNumber());
        System.out.println("Модель: "+ this.model);
        System.out.println("Вес: "+ this.weight);
    }
    public void sendMessage(int... numbers)
    {
        System.out.print("Отправка сообщений на номера: ");
        for (int num : numbers)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
