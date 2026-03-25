package Lists;

import java.util.*;

public class Itenarary {
    public static void printMenu(){
        System.out.println("""
                Available Actions - Select word or letter:
                (F)orward
                (B)ackward
                (L)ist places
                (M)enu
                (Q)uit
                """);
    }
    public static void printSubMenu(){
        System.out.println("""
                Available Actions - Select word or letter:
                (A)dd Stop
                (R)emove Stop
                (B)ack to Main Menu
                """);
    }
    public static LinkedList<Place> initialItenarary(){
        Place adelaide = new Place("Adelaide", 1373);
        Place aliceSprings = new Place("Alice Springs", 2771);
        Place brisbane = new Place("Brisbane", 917);
        Place darwin = new Place("Darwin", 3972);
        Place melbourne = new Place("Melbourne", 877);
        Place perth = new Place("Perth", 3923);
        Place sydney = new Place("Sydney", 0);
        return new LinkedList<>(List.of(adelaide, aliceSprings, brisbane, darwin, melbourne, perth, sydney));
    }
    public static void moving(LinkedList<Place> list, boolean isForward){
        if(isForward) list.sort(Comparator.comparingInt(Place::getDistance));
        else list.sort(Comparator.comparingInt(Place::getDistance).reversed());
        Iterator<Place> iterator = list.iterator();
        while(iterator.hasNext()){
            Place place = iterator.next();
            System.out.print(place.toString());
            if(iterator.hasNext()) System.out.print(" ➜ ");
        }
    }
    public static void listCities(LinkedList<Place> list){
        for(Place place: list){
            System.out.print(place.toString());
        }
    }
    public static void operation(LinkedList<Place> list, Place p , boolean isAdding){
        ListIterator<Place> iterator = list.listIterator();
        if(isAdding){
            while(iterator.hasNext()){
                if (p.getDistance() <= iterator.next().getDistance()){
                    iterator.previous();
                    iterator.add(p);
                    return;
                }
            }
            iterator.add(p);
            return;
        }

        while(iterator.hasNext()){
            if(p.getTown().equals(iterator.next().getTown())){
                iterator.remove();
                return;
            }
        }
    }
    static void main() {
       LinkedList<Place> list = initialItenarary();
       Scanner sc = new Scanner(System.in);
       boolean exit = true;
       printMenu();
        while(exit){
            switch (sc.nextLine().toUpperCase(Locale.ROOT)) {
                case "F":
                    moving(list, true);
                    break;
                case "B":
                    moving(list, false);
                    break;
                case "L":
                    listCities(list);
                    break;
                case "M":
                    printSubMenu();
                    switch(sc.nextLine().toUpperCase(Locale.ROOT)){
                        case "A":
                            System.out.print("Enter your city: ");
                            var town = sc.nextLine();
                            System.out.print("Enter the city's distance: ");
                            var distance = sc.nextInt();
                            operation(list, new Place(town, distance), true);
                        case "R":
                            System.out.print("Enter your city: ");
                            town = sc.nextLine();
                            System.out.print("Enter the city's distance: ");
                            distance = sc.nextInt();
                            operation(list, new Place(town, distance), false);
                        case "B":
                    }
                    break;
                case "Q":
                    exit = false;
                    break;
            }
        }

    }
}
