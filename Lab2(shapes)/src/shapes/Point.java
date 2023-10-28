package shapes;

public class Point extends Shape
{


        private double x=0.0;
        private double y=0.0;

        public Point(){};
        public Point(double x, double y)
        {
            this.x = x;
            this.y = y;
        }
        public void setPointx(double x)
        {
            this.x = x;

        }
        public double getPointx()
        {
            return x;
        }

        public void setPointy(double y)
        {
            this.y = y;

        }
        public double getPointy()
        {
            return y;
        }



    public void move(double a, double b)
    {
        this.x=this.x+a;
        this.y=this.y+b;
    }



    public void draw()
    {
        System.out.println("Фигура точка");
        System.out.println("x:  " + x );
        System.out.println("y:  " + y );
        System.out.println("Цвет точки:  " + getcolor() );
    }
    }

