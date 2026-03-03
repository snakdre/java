package Classes;

public class Cylinder extends Circle{
    private double height;

    public double getHeight(){
        return (height<0) ?  0 : height;
    }
    public double getVolume(){
        return getArea() * getHeight();
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    static void main() {
        Cylinder cy = new Cylinder(2, 3);
        System.out.println(cy.getVolume());
    }
}
