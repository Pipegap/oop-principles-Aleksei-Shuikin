package com.figures;

public class Circle extends Shape{
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    @Override
    public void draw() {
        System.out.println("Нарисован круг в точке с координатами: (" + this.x + ", " + this.y + ") " +
                "и радиусом: " + this.radius);
    }

}
