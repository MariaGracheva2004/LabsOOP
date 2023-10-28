import colors.Color;
import service.impl.ShapesServiceImpl;
import shapes.*;
import service.ShapesService;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Часть1:  ");
        //Точка
        Point point0 = new Point(8, 2);
        point0.draw();
        point0.move(1,1);
        point0.setcolor(Color.GREEN);
        point0.draw();

        //Круг
        Point point = new Point(2, 1);
        Circle circle = new Circle(point, 5);
        circle.draw();

        circle.setcolor(Color.RED);
       // circle.setPoint(new Point(2,2));
        circle.move(1,1);
        circle.draw();

        //Прямоугольник
        Point pointA = new Point(2, 2);
        Point pointC = new Point(6, 4);
        Rectangle rectangle = new Rectangle(pointA, pointC);
        rectangle.draw();
        rectangle.setcolor(Color.BLACK);
        rectangle.move(1,1);
        rectangle.draw();

        //Треугоьник
        Point point1 = new Point(2, 1);
        Point point2= new Point(5, 1);
        Point point3= new Point(5, 4);
        Triangle triangle = new Triangle(point1, point2, point3);
        triangle.draw();

        triangle.setcolor(Color.PURPLE);
        triangle.move(4,2);
        triangle.draw();



        System.out.println("Часть2:  ");
        List<Shape> shapes = new ArrayList();

        //1)
        Point point11 = new Point(0, 0);
        Point point22= new Point(0, 4);
        Point point33= new Point(4, 0);

        Triangle triangle1 = new Triangle(point11, point22, point33);
        triangle1.setcolor(Color.RED);
        triangle1.draw();
        //2)
        Point point111 = new Point(3, 3);
        Circle circle1 = new Circle(point111, 2);
        circle1.setcolor(Color.WHITE);
        circle1.draw();
        //3)
        Point point1111 = new Point(2, 5);
        Circle circle2 = new Circle(point1111, 4);
        circle2.setcolor(Color.YELLOW);
        circle2.draw();
        //4)
        Point pointA1 = new Point(1, 1);
        Point pointC1 = new Point(5, 2);
        Rectangle rectangle1 = new Rectangle(pointA1, pointC1);
        rectangle1.draw();
        //5)
        Point point00 = new Point(100, 100);
        point00.draw();
        //6)
        Point point011= new Point(-2, 3);
        Point point022= new Point(4, 3);
        Point point033= new Point(2, 5);

        Triangle triangle2 = new Triangle(point011, point022, point033);
        triangle2.setcolor(Color.BLUE);
        triangle2.draw();

        shapes.add(triangle1);
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(rectangle1);
        shapes.add(point00);
        shapes.add(triangle2);
        /* for(int i=0; i<shapes.size(); i++)
        {
            System.out.println(shapes.get(i).getperimeter());
        }*/
        ShapesService shapesService = new ShapesServiceImpl();
        double totalSquares = shapesService.getSquares(shapes);
        double maxPerimeter = shapesService.getMaxPerimeters(shapes);
        System.out.println("Сумма площадей:  " + totalSquares);
        System.out.println("Максимальный периметр:  " + maxPerimeter);

        Set<Color> allColors = shapesService.getColors(shapes);
        System.out.println("Все цвета фигур: " + allColors);
    }
}