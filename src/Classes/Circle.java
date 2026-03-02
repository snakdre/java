package Classes;

public class Circle {
    private double radius;

    public double getRadius() {
        return (radius < 0) ? 0 : radius;
    }
    public double getArea(){
        return getRadius() * getRadius() * Math.PI;
    }

    public Circle(double radius) {
        this.radius = (radius < 0) ? 0 : radius;
    }
}
