package shapes;

public class Triangle extends Shape
{
    private Point N;
    private  Point M;
    private  Point L;
    double length1,length2, length3;

    public Triangle(){}
    public Triangle(Point N, Point M, Point L )// конструктор
    {
        this.N=N;
        this.M=M;
        this.L=L;
    }
    public void setN(Point N)
    {
        this.N = N;

    }
    public Point getN()
    {
        return N;
    }

    public void setM(Point M)
    {
        this.M = M;

    }
    public Point getM()
    {
        return M;
    }

    public void setL(Point L)
    {
        this.L = L;

    }
    public Point getL()
    {
        return L;
    }

    private void validate(Point N, Point M, Point L)  throws Exception
    {     if((N.getPointy()== M.getPointy())&&(N.getPointy()== L.getPointy())&&(M.getPointy()== L.getPointy()))
    {
        throw new Exception("не удалось создать фигуру, т.к. три точки лежат на одной прямой");
    }
    }

    public double getperimeter()
    {
        double P;

        length1= Math.sqrt((N.getPointx()-M.getPointx())*(N.getPointx()-M.getPointx())+(N.getPointy()-M.getPointy())*(N.getPointy()-M.getPointy()));
        length2= Math.sqrt((M.getPointx()-L.getPointx())*(M.getPointx()-L.getPointx())+(M.getPointy()-L.getPointy())*(M.getPointy()-L.getPointy()));
        length3= Math.sqrt((L.getPointx()-N.getPointx())*(L.getPointx()-N.getPointx())+(L.getPointy()-N.getPointy())*(L.getPointy()-N.getPointy()));
        P=length1+length2+length3;
        return P;
    }

    public double getarea()
    {
        double S;
        double p;
        p=(length1+length2+length3)/2;
        S=Math.sqrt(p*(p-length1)*(p-length2)*(p-length3));
        return S;
    }

    public void move(double a, double b)
    {
        N.setPointx(N.getPointx()+a);
        N.setPointy(N.getPointy()+b);
        M.setPointx(M.getPointx()+a);
        M.setPointy(M.getPointy()+b);
        L.setPointx(L.getPointx()+a);
        L.setPointy(L.getPointy()+b);
    }



    public void draw()
    {
        System.out.println("Фигура треугольник");
        try {
            validate(N, M, L);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Точка 1:  " );
        System.out.println("x:  " + N.getPointx() );
        System.out.println("y:  " + N.getPointy() );
        System.out.println("Точка 2:  " );
        System.out.println("x:  " + M.getPointx() );
        System.out.println("y:  " + M.getPointy() );
        System.out.println("Точка 3:  " );
        System.out.println("x:  " + L.getPointx() );
        System.out.println("y:  " + L.getPointy() );
        System.out.println("Периметр:  " + getperimeter());
        System.out.println("Площадь:  " + getarea() );
        System.out.println("Цвет треугольника:  " + getcolor() );
    }
}
