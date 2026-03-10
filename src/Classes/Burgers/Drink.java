package Classes.Burgers;
import java.util.Locale;
public class Drink {
    private String name;
    private String size;
    private double drinkPrice;

    public Drink(String name, String size) {
        this.name = name;
        this.size = size;
        setDrinkPrice(size);
    }

    public String getName() {
        return name;
    }

    private void setDrinkPrice(String size) {
        String drink = name == null ? "" : name.trim().toLowerCase(Locale.ROOT);
        String s = size == null ? "" : size.trim().toLowerCase(Locale.ROOT);
        this.drinkPrice = switch (drink) {
            case "coke", "sprite", "fanta" ->
                    "small".equals(s) ? 2.19
                            : "large".equals(s) ? 2.99
                            : 2.59; // regular/default
            case "oj" ->
                    "small".equals(s) ? 2.79
                            : "large".equals(s) ? 3.79
                            : 3.29;
            case "lemonade" ->
                    "small".equals(s) ? 2.49
                            : "large".equals(s) ? 3.49
                            : 2.99;
            default -> 0.00;
        };
    }
    public double getPrice() {
        return drinkPrice;
    }
}
