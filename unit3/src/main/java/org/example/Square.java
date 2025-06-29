package org.example;

public class Square extends Rectangle {
    public Square(Point point, double size) {
        super(point, size, size);
    }

    public void draw() {
        draw(Color.BLACK);
    }

    public void draw(Color color) {
        System.out.println("Нарисован квадрат цветом " + color + " с кординатой " + point);
    }
}