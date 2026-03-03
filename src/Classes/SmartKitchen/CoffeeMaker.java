package Classes.SmartKitchen;

public class CoffeeMaker {
    private Characteristics characteristics;

    public CoffeeMaker(Characteristics characteristics) {
        this.characteristics = characteristics;
    }

    public void brewCoffee(){
        System.out.println(characteristics.isHasWorkToDo()
                ? "Brewing Coffee"
                : "There is nothing to brew");
    }
}
