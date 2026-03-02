package Classes.SmartKitchen;

public class Main {
    static void main() {
        Refrigirator fridge = new Refrigirator(new Characteristics("Whirpool", "DB100", "Blue", true));
        Dishwasher dishwasher = new Dishwasher(new Characteristics("Miele", "DB100", "Grey", false));
        CoffeeMaker coffeemaker = new CoffeeMaker(new Characteristics("Ninja", "DB100", "Black", true));

        fridge.orderFood();
        dishwasher.doDishes();
        coffeemaker.brewCoffee();
    }
}
