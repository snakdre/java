package Classes.SmartKitchen;

public class Characteristics {
    private String brand;
    private String model;
    private boolean hasWorkToDo;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public Characteristics(String brand, String model, String color, boolean hasWorkToDo) {
        this.brand = brand;
        this.model = model;
        this.hasWorkToDo = hasWorkToDo;

    }

}
