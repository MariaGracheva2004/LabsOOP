public class Skirt extends Clothes implements Womans_clothes
{
    public Skirt(ClothingSize size0, String color0 , int cost0 )// конструктор
    {
        setSize(size0);
        setColor(color0);
        setCost(cost0);
    }

    public void dressWoman()
    {
        System.out.println(getColor() +" юбка "+getSize().getDescription()+" размера "+getSize()+ "/европейский размер:"+getSize().getEuroSize()+" стоимостью "+getCost());
    }

}
