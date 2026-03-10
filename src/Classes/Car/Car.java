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
    public Car() {
    }
    protected void runEngine(){
        System.out.println("Running Engine...");
    }
    public Car getCar(){
        return (switch(this.description){
                    case "Gas Powered" -> new ElectricCar(8, 17);
                    case "Electric" -> new ElectricCar(90, 4);
                    case "Hybrid" -> new HybridCar(120, 23, 21);
                    default -> throw new IllegalStateException("Unexpected value: " + this.description);
                });
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

    public GasPoweredCar(double gasMileage, int cylinders) {
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

class ElectricCar extends Car{
    private double mpge;
    private int batterySize;

    public ElectricCar(double mpge, int batterySize) {
        super();
        this.mpge = mpge;
        this.batterySize = batterySize;
    }

}

class HybridCar extends Car{
    private double gasMileage;
    private int cylinders;
    private int batterySize;
    public HybridCar(double gasMileage, int batterySize,  int cylinders) {
        this.gasMileage = gasMileage;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Making sure there enough battery...");
    }

    @Override
    public void drive() {
        super.drive();
    }
}



