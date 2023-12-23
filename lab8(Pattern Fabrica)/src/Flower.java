abstract class Flower
{
    private String color;

    public Flower(String color) {
        this.color = color;
    }

    public abstract String getName();
    public String getColor() {
        return color;
    }
}

class Rose extends Flower
{
    public Rose(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Роза " + getColor();
    }
}
class Lily extends Flower
{
    public Lily(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Лилия " + getColor();
    }
}
