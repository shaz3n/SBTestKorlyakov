package org.example;

public class Triangle extends Figure {
    Point p2;
    Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        super(p1);
        this.p2 = p2;
        this.p3 = p3;
    }

    public double area() {
        return Math.abs((point.x * (p2.y - p3.y) + p2.x * (p3.y - point.y) + p3.x * (point.y - p2.y)) / 2.0);
    }

    public double perimeter() {
        double a = distance(point, p2);
        double b = distance(p2, p3);
        double c = distance(p3, point);
        return a + b + c;
    }

    private double distance(Point a, Point b) {
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }

    public void draw() {
        draw(Color.BLACK);
    }

    public void draw(Color color) {
        System.out.println("Нарисован треугольник цветом " + color + " с кординатами " + point + " " + p2 + " " + p3);
    }
}
