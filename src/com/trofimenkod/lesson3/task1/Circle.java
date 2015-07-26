package com.trofimenkod.lesson3.task1;

import java.util.Map;

/**
 * Created by USR on 26.07.2015.
 */
public class Circle extends Shape  {
    private Point center, radius;

    public Circle(Point center, Point radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getRadius() {
        return radius;
    }

    public void setRadius(Point radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2* Math.PI*this.center.calcDistance(this.radius);
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(this.center.calcDistance(this.radius),2);
    }

    @Override
    public void printResult() {
        System.out.println(this.getClass().getName());
        System.out.println("Perimeter:"+perimeter());
        System.out.println("Area:"+area());
    }


}
