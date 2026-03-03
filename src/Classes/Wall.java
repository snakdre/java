package Classes;

public class Wall {
    // write code here
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }
    public void setWidth(double w) {
        this.width = w < 0 ? 0 : w;
    }
    public double getHeight() {
        return height  ;
    }
    public void setHeight(double h) {
        this.height = h < 0 ? 0 : h;
    }
    public Wall(){
        this.height = 0;
        this.width = 0;
    }
    public Wall(double h, double w) {
        this.width = w < 0 ? 0 : w;
        this.height = h < 0 ? 0 : h;
    }
    public double getArea(){
        return this.width * this.height;
    }
    static void main(){
        Wall wall = new Wall(-1.25,-1.25);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(1.125);
        wall.setWidth(1.125);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
