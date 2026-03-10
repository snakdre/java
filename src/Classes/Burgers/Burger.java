package Classes.Burgers;

public class Burger {
    private String type;
    protected double price;
    private Toppings topping1;
    private Toppings topping2;
    private Toppings topping3;

    public Burger(String type, Toppings toppings) {
        this.type = type;
        this.topping1 = toppings;
        setPrice(type);
    }
    public void addTopping(Toppings topping) {
        this.topping1 = topping;
        setPrice(getType());
    }
    public Burger(){
         this.type ="Regular";
         this.topping1 = new Toppings("Cheese");
         setPrice(type);
    }
    public Burger(String type){
        this.type = type;
        setPrice(type);
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(String type) {
        this.price  += switch (type){
            case "Vegan" -> 5.99;
            case "Deluxe" -> 6.99;
            default -> 5.49;
        };
    }
    public static Burger getBurger(String type){
        return switch(type){
            case "Vegan" -> new VeganBurger(type);
            case "Deluxe" -> new DeluxeBurger(type);
            default ->      new Burger();
        };
    }
    public String getType() {
        return type;
    }
}

class DeluxeBurger extends Burger {


    public DeluxeBurger(Toppings topping1, Toppings topping2) {
        super("Deluxe", new Toppings("Cheese"));
        this.price = getPrice()+topping1.getPrice()+topping2.getPrice();
    }

    public DeluxeBurger(String type) {
        super(type);
    }
}

class VeganBurger extends Burger {
    public VeganBurger(String type) {
        super("Vegan", new Toppings("Cheese"));
    }
}
