package Classes.SmartKitchen;

public class Dishwasher {
    private Characteristics characteristics;
    private boolean hasWorkToDo;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void doDishes() {
        System.out.println(isHasWorkToDo()
                ? "The dishwasher cycle has started"
                : "There is no work to do");
    }

    public Dishwasher(Characteristics characteristics) {
        this.characteristics = characteristics;
    }
}
