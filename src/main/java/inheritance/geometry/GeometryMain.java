package inheritance.geometry;

public class GeometryMain {

    public static void main(String[] args){
        Circle circle = new Circle(new Point2D(0,0),new Point2D(0,4));
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(circle);

        circle.move(new MoveDirection(2,4));
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(circle);

        circle.resize(2);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(circle);
    }
}
