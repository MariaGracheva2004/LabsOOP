public class Main {
    public static void main(String[] args)
    {
        Phone phone1 = new Phone(8927544, "Samsung", 160 );
        Phone phone2 = new Phone(8923143, "iphone", 180);
        Phone phone3 = new Phone(8928675, "huawei", 120);
        phone1.information();
        //phone1.receiveCall("Ольга");
        phone1.receiveCall("Ольга", 9888755);
        phone1.sendMessage(3456786, 6543459, 9987678);
        phone2.information();
        //phone2.receiveCall("Инна");
        phone2.receiveCall("Инна", 6575764);
        phone3.information();
        //phone3.receiveCall("Дарья");
        phone3.receiveCall("Дарья", 8765768);

    }
}