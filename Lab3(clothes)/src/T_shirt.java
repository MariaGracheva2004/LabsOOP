public class T_shirt  extends Clothes implements Mens_clothes, Womans_clothes
{
    public T_shirt(ClothingSize size0,  String color0 , int cost0 )// конструктор
    {
        setSize(size0);
        setColor(color0);
        setCost(cost0);
    }

    public void dressMan()
    {
        System.out.println(getColor() +" футболка "+getSize().getDescription()+" размера "+getSize()+ "/европейский размер:"+getSize().getEuroSize()+" стоимостью "+getCost());

    }

    public void dressWoman()
    {
        System.out.println(getColor() +" футболка "+getSize().getDescription()+" размера "+getSize()+ "/европейский размер:"+getSize().getEuroSize()+" стоимостью "+getCost());
    }
}
