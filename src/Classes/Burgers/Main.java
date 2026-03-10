package Classes.Burgers;

import java.util.Scanner;

public class Main {
    static void main() {
         //Drink drink = new Drink("Coke", "Small");
         //Sides sides = new Sides("Fries", "Large");
         //Burger burger = new Burger("Deluxe", new Toppings("Cheese"));
         String drink, drinkSize, side, sideSize, burgerType, topping1, topping2, topping3;
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the name of the drink: ");
         drink = scanner.nextLine();
         System.out.println("What size of drink: ");
         drinkSize = scanner.nextLine();
         System.out.println("Enter choice of side: ");
         side = scanner.nextLine();
         System.out.println("What size of " + side + " : ");
         sideSize = scanner.nextLine();
         System.out.println("What type of burger: ");
         burgerType = scanner.nextLine();
         System.out.println("Any topping?: ");
         topping1 = scanner.nextLine();
         System.out.println("Any topping?: ");
         topping2 = scanner.nextLine();
         Burger burger = new Burger(burgerType);
         Burger theBurger = Burger.getBurger(burgerType);
         theBurger.addTopping(new Toppings(topping1));
         theBurger.addTopping(new Toppings(topping2));
         Drink drinks = new Drink(drink, drinkSize);
         Sides sides = new Sides(side, sideSize);



         System.out.println(drinks.getName() + " price: " + drinks.getPrice());
         System.out.println(sides.getName() + " price: " + sides.getPrice());
         System.out.println(theBurger.getType() + " burger Price: " + theBurger.getPrice());
    }


}
