package shapes;

public class Rectangle extends Shape
{
    private Point A;
    private Point C;
    public Rectangle(){}
    public Rectangle(Point A, Point C )
    {
        this.A=A;
        this.C=C;
    }
    public void setA(Point A)
    {
        this.A = A;

    }
    public Point getA()
    {
        return A;
    }

    public void setC(Point C)
    {
        this.C = C;

    }
    public Point getC()
    {
        return C;
    }


    public double getperimeter()
    {
        double P;
        P=2*((C.getPointx()-A.getPointx())+(C.getPointy()- A.getPointy()));
        return P;
    }

    public double getarea()
    {
        double S;
        S=((C.getPointx()-A.getPointx())*(C.getPointy()- A.getPointy()));
        return S;
    }

    public void move(double a, double b)
    {
       A.setPointx(A.getPointx()+a);
       A.setPointy(A.getPointy()+b);
       C.setPointx(C.getPointx()+a);
       C.setPointy(C.getPointy()+b);
    }

    private void validate(Point A, Point C)  throws Exception
    {     if(A.getPointy()== C.getPointy())
    {
        throw new Exception("не удалось создать фигуру, т.к. точки лежат на одной прямой");
    }
    }
    public  void draw()
    {
        System.out.println("Фигура прямоугольник");
        try {
            validate(A, C);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Точка 1:  " );
        System.out.println("x:  " + A.getPointx() );
        System.out.println("y:  " + A.getPointy() );
        System.out.println("Точка 2:  " );
        System.out.println("x:  " + C.getPointx() );
        System.out.println("y:  " + C.getPointy() );
        System.out.println("Периметр:  " + getperimeter() );
        System.out.println("Площадь:  " + getarea());
        System.out.println("Цвет прямоугольника:  " + getcolor() );
    }
}
