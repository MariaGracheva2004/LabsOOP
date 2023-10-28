public abstract class Clothes
{
    ClothingSize size;
    String color;
    int cost;

    public void setSize(ClothingSize s)
    {
        this.size = s;
    }

    public ClothingSize getSize()

    {
        return size;
    }

    public void setColor(String color1)

    {
        this.color = color1;
    }

    public String getColor()

    {
        return color;
    }

    public void setCost(int cost1)

    {
        this.cost = cost1;
    }

    public int getCost()

    {
        return cost;
    }
}
