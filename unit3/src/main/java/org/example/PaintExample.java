package org.example;

public class PaintExample {
    public static void main(String[] args) {
        //работа классов
        Circle c = new Circle(new Point(5, 5), 10);
        Rectangle r = new Rectangle(new Point(0, 0), 4, 6);
        Square s = new Square(new Point(1, 1), 3);
        Triangle t = new Triangle(new Point(0, 0), new Point(4, 0), new Point(2, 3));

        FigureUtil.draw(c, Color.RED);
        FigureUtil.draw(s, Color.GREEN);
        FigureUtil.draw(t, Color.BLUE);

        System.out.println("Площадь круга: " + FigureUtil.area(c));
        System.out.println("Периметр треугольника: " + FigureUtil.perimeter(t));
    }
}