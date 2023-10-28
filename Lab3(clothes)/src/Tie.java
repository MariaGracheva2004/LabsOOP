public class Tie extends Clothes implements Mens_clother
{
    public Tie(ClothingSize size0, String color0 , int cost0 )// конструктор
    {
        setSize(size0);
        setColor(color0);
        setCost(cost0);
    }

    public void dressMan()
    {
        System.out.println(getColor() +" галстук "+getSize().getDescription()+" размера "+getSize()+ "/европейский размер:"+getSize().getEuroSize()+" стоимостью "+getCost());
    }

}
