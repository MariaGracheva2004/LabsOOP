public class Vector
{

    double x1 = 0;
    double y1 = 0;

    double x2 = 0;
    double y2 = 0;

    public Vector(double x0, double y0 , double x, double y )// конструктор
    {
        this.x1 = x0;
        this.y1 = y0;
        this.x2 = x;
        this.y2 = y;


    }


    public void setAx(double x0)
    {
        this.x1 = x0;
    }
    public double getVectorAx()
    {
        return x1;
    }

    public void setAy(double y0)
    {
        this.y1 = y0;
    }

    public double getVectorAy()
    {
        return y1;
    }

    public void setBx(double x)
    {
        this.x2 = x;
    }
    public double getVectorBx()
    {
        return x2;
    }

    public void setBy(double y)
    {
        this.y2 = y;
    }

    public double getVectorBy()
    {
        return y2;
    }

    /**
     * Вычисление скалярного произведения двух векторов
     * @param A
     * @param B
     * @return возвращает скалярное произведение
     */
    public double Skalpr(Vector A, Vector B)
    {
        double V1_x=A.x2-A.x1;
        double V1_y=A.y2-A.y1;
        double V2_x=B.x2-B.x1;
        double V2_y=B.y2-B.y1;

        return V1_x*V2_x+V1_y*V2_y;
    }

    /**
     * Вычисление длины вектора
     * @param A
     * @return возвращает длину вектора
     */
    public double length(Vector A)
    {
        return Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2)));
    }

    /**
     * Умножение вектора на число
     * @param h
     * @return возвращает координаты вектора, умноженные на число
     */
    public double proizv(double h)
    {
       double V_x=x2-x1;
       double V_y=y2-y1;
       double V_x_new;
       double V_y_new;
        V_x_new=h*V_x;
        V_y_new=h*V_y;
        System.out.println("Vector(" + V_x_new + ";"+ V_y_new + ")" );
        return 0;
    }

    /**
     * Нахождение суммы векторов
     * @param A
     * @param B
     * @return возвращает сумму векторов
     */
    public double sum(Vector A, Vector B)
    {
        double V1_x=A.x2-A.x1;
        double V1_y=A.y2-A.y1;
        double V2_x=B.x2-B.x1;
        double V2_y=B.y2-B.y1;
        double V_x_new=V1_x+V2_x;
        double V_y_new=V1_y+V2_y;
        System.out.println("(" + V_x_new + ";"+ V_y_new + ")" );
      return 0;
    }

    /**
     * Вычисление разности векторов
     * @param A
     * @param B
     * @return возвращает разность векторов
     */
    public double difference(Vector A, Vector B)
    {
        double V1_x=A.x2-A.x1;
        double V1_y=A.y2-A.y1;
        double V2_x=B.x2-B.x1;
        double V2_y=B.y2-B.y1;
        double V_x_new=V1_x-V2_x;
        double V_y_new=V1_y-V2_y;
        System.out.println("(" + V_x_new + ";"+ V_y_new + ")" );
        return 0;
    }


}
