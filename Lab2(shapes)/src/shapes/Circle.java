package shapes;

public class Circle extends Shape
{
    private Point point;
    private double radius;
    public Circle(){}
    public Circle(Point point, double radius )// конструктор
    {
    this.point=point;
    this.radius=radius;
    }



    public void setradius(double radius)
    {
        this.radius = radius;

    }
    public double getradius()
    {
        return radius;
    }

    public void setPoint(Point point)
    {
        this.point = point;

    }
    public Point  getPoint()
    {
        return point;
    }

    private void validate(double radius)  throws Exception
    {     if(radius <= 0)
    {
        throw new Exception("Не удалось создать фигуру. Радиус должен быть больше нуля.");
    }
    }

    public double getperimeter()
    {
        double P;
        P=2*Math.PI*this.radius;
        return P;
    }

    public double getarea()
    {
      double S;
      S=Math.PI*radius*radius;
      return S;
    }

    public void move(double a, double b)
    {
        point.setPointx(point.getPointx()+a);
        point.setPointy(point.getPointy()+b);
    }

    public void draw()
    {
        System.out.println("Фигура круг");
        System.out.println("Центр круга:  " );
        System.out.println("x:  " + point.getPointx() );
        System.out.println("y:  " + point.getPointy() );
        System.out.println("Радиус:  " + getradius());
        try {
            validate(this.radius);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Периметр:  " + getperimeter() );
        System.out.println("Площадь:  " + getarea() );
        System.out.println("Цвет круга:  " + getcolor() );
    }
}
