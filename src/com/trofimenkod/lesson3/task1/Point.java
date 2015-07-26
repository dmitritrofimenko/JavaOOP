package com.trofimenkod.lesson3.task1;

/**
 * Created by USR on 26.07.2015.
 */
public class Point {
    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }


    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcDistance (Point point){
        return Math.sqrt((this.x - point.getX()) * (this.x - point.getX())+ (this.y - point.getY()) * (this.y - point.getY()));

    }
}
