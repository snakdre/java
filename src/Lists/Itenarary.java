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
    public static void operation(LinkedList<Place> list, Place p , boolean isAdding){
        ListIterator<Place> iterator = list.listIterator();
        while(iterator.hasNext()){
            if(isAdding){
                if (p.getDistance() <= iterator.next().getDistance()){
                    iterator.previous();
                    list.add(p);
                }
            }
            else{
                if(p.getTown().equals(iterator.next().getTown())){
                    iterator.previous();
                    iterator.remove();
                }
            }
        }
        iterator.add(p);
        //list.sort(Comparator.comparingInt(Place::getDistance));
        //adding
    }
    static void main() {
       LinkedList<Place> list = initialItenarary();
       for(Place p : list){
           System.out.println(p);
       }
        operation(list, new Place("Imaginaire", 5400), true);
        for(Place p : list){
            System.out.println(p);
        }
        operation(list, new Place("Imaginaire", 5400), true);

    }
}
