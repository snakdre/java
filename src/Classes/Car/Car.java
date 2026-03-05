package Classes.Car;

public class Car {
    private String description;
    public void startEngine(){
        System.out.println("Starting Engine...");
    }
    public Car(String description) {
        this.description = description;
    }
    public void drive(){
        runEngine();
        System.out.println("Driving...");
    }
    protected void runEngine(){
        System.out.println("Running Engine...");
    }
}
class GasPoweredCar extends Car{
    private double gasMileage;
    private int cylinders;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " is a " +
                this.getClass().getSimpleName() + " with " + cylinders +
                " cylinders that offers " + gasMileage + " mpg";
    }

    public GasPoweredCar(String description, double gasMileage, int cylinders) {
        super(description);
        this.gasMileage = gasMileage;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Making sure I have the keys...");
        super.startEngine();
        System.out.println("Listen for rattling noise...");
    }

    public GasPoweredCar(String description) {
        super(description);
    }

    @Override
    public void drive() {
        System.out.println("Check gas level...");
        super.drive();
    }
}

class ElectricCar{
    private double mpge;
    private int batterySize;

    public ElectricCar(double mpge, int batterySize) {
        this.mpge = mpge;
        this.batterySize = batterySize;
    }

}



