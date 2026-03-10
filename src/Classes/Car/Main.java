package Classes.Car;

public class Main {
    static void main() {
        Car theCar = new Car("Hybrid");
        HybridCar prius = (HybridCar) theCar.getCar();
        prius.runEngine();
    }
}
