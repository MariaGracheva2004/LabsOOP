public class Main
{
    public static void main(String[] args)
    {

        Vector vect0 = new Vector(2, 2, 5, 5);
        Vector vect1 = new Vector(1, 2, 3, 4);
        Vector vect2 = new Vector(5, 6, 2, 7);
        double skal = vect0.Skalpr(vect1, vect2);
        System.out.println("Скалярное произведение:"+skal);
        double length_v = vect0.length(vect0);
        System.out.println("Длина вектора:"+length_v);
        System.out.println("Произведение вектора на число:");
        vect0.proizv(5);
        System.out.println("Сумма векторов:");
        vect0.sum(vect1, vect2);
        System.out.println("Разность векторов:");
        vect0.difference(vect1, vect2);

    }
}