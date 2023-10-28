package shapes;

import colors.Color;

public abstract class Shape
{

    public Color color = Color.TRANSPARENT;

    public Color getcolor()
    {
        return color;
    }

    public void setcolor(Color color)
    {
        this.color = color;
    }

    public double getarea()
    {
        return 0.0;
    }
    public double getperimeter()
    {
        return 0.0;
    }

    public void move(double moveX, double moveY) {}//метод, который позволит переместить фигуру на плоскости
    public void draw() {}//метод который будет выводить название фигуры, ее цвет, координаты точек
}
