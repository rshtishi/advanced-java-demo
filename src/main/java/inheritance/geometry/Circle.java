package inheritance.geometry;

public class Circle implements Moveable{

    private Point2D center;
    private Point2D point;
    private double radius;
    private static final double PI = 3.14;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
        computeRadius();
    }

    private void computeRadius() {
        double dx = center.getX() - point.getX();
        double dy = center.getY() - point.getY();
        radius = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public double getRadius() {
        return radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public String toString(){
        return String.format("Circle{center:%s,point:%s}",center.toString(),point.toString());
    }

    @Override
    public void move(MoveDirection moveDirection){
        center.move(moveDirection);
        point.move(moveDirection);
    }
}
