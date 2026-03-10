package Classes.Burgers;

import java.nio.file.StandardOpenOption;

public class Toppings {
    private String name;
    private double toppingPrice;

    public String getName() {
        return name;
    }

    private void setToppingPrice(String name) {
        this.toppingPrice = switch (name) {
            case "Lettuce"     -> 0.10;
            case "Cheese"      -> 0.50;
            case "Bacon"       -> 1.25;
            case "Jalapenos"   -> 0.40;
            case "Avocado"     -> 1.50;
            case "Extra Patty" -> 2.00;
            default            -> 0.00;
        };
    }

    public Toppings(String name) {
        this.name = name;
        setToppingPrice(name);
    }
    public double getPrice() {
        return toppingPrice;
    }
}
