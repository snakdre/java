package Classes.SmartKitchen;

public class Refrigirator {
    private Characteristics characteristics;


    public void orderFood(){
        System.out.println(characteristics.isHasWorkToDo()
                ? "Food has been ordered"
                : "There is no work to do.");
    }

    public Refrigirator(Characteristics characteristics) {
        this.characteristics = characteristics;}
}
