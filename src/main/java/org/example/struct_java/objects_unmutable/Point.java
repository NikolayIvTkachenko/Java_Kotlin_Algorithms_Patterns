package org.example.struct_java.objects_unmutable;

public class Point implements Cloneable {

    private double x;
    private double y;

    public Point() {}

    public Point(double x, double y) {
        this.x = x;
        this.y= y;
    }

    public Point(Point another) {
        this.x = another.x;
        this.y = another.y;
    }

    public Point clonePoint() {
        Point point = new Point();
        point.setX(this.x);
        point.setY(this.y);
        return point;
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

    @Override
    public Point clone() throws CloneNotSupportedException {
       return (Point) super.clone();
    }
}
