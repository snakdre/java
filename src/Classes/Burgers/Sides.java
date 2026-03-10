package Classes.Burgers;

public class Sides {
    private double price;
    private String name;
    private String size;
    public Sides(String name, String size) {
        this.name = name;
        this.size = size;
        setPrice(size);
    }
    private void setPrice(String size) {
        this.price = switch (name) {
            case "Fries" -> "Small".equals(size) ? 2.29
                    : "Large".equals(size) ? 3.29
                    : 2.79;
            case "Salad" -> "Side".equals(size) ? 3.99 : 5.49;
            case "Soup"  -> "Cup".equals(size) ? 3.49 : 4.99;
            default      -> 0.00;
        };
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
