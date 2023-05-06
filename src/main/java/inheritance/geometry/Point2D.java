package inheritance.geometry;

public class Point2D implements Moveable{

    private double x;
    private double y;

    public Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    @Override
    public String toString(){
        return String.format("Point2D{x:%f,y:%f}",x,y);
    }

    @Override
    public void move(MoveDirection moveDirection) {
        x=x+moveDirection.getX();
        y=y+moveDirection.getY();
    }
}
