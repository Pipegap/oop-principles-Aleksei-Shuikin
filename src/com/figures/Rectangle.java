package com.figures;

public class Rectangle extends Shape{
    private int[] topLeftXY;
    private int[] bottomRightXY;

    public Rectangle(int[] topLeftXY, int[] bottomRightXY) {
        if (topLeftXY.length == 2 && bottomRightXY.length == 2) {
            this.topLeftXY = topLeftXY;
            this.bottomRightXY = bottomRightXY;
        } else {
            System.out.println("Кол-во координат должно быть две");
        }
    }

    @Override
    public void draw() {
        System.out.println("Нарисован прямоугольник с точками: " +
                "{" + topLeftXY[0] + ", " + topLeftXY[1] + "} " +
                "{" + bottomRightXY[0] + ", " + topLeftXY[1] + "} " +
                "{" + bottomRightXY[0] + ", " + bottomRightXY[1] + "} " +
                "{" + topLeftXY[0] + ", " + bottomRightXY[1] + "}");
    }
}