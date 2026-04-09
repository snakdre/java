package Lists;

import java.util.*;

public class LinkedLists {
    record Place(String city, double distance) {
        @Override
        public String toString() {
            return city + " (" + distance + " km)";
        }
    }

    public static LinkedList<Place> initialItenarary() {
        return new LinkedList<>(List.of(
                new Place("Adelaide", 1371),
                new Place("Albury", 552),
                new Place("Alice Springs", 2770),
                new Place("Ballarat", 924),
                new Place("Bendigo", 834),
                new Place("Brisbane", 924),
                new Place("Bundaberg", 1279),
                new Place("Canberra", 285),
                new Place("Cairns", 2416),
                new Place("Coffs Harbour", 529),
                new Place("Darwin", 3977),
                new Place("Geelong", 937),
                new Place("Gold Coast", 845),
                new Place("Hobart", 1608),
                new Place("Mackay", 1724),
                new Place("Melbourne", 877),
                new Place("Newcastle", 159),
                new Place("Perth", 3935),
                new Place("Port Macquarie", 388),
                new Place("Rockhampton", 1386),
                new Place("Sunshine Coast", 1028),
                new Place("Sydney", 0),
                new Place("Tamworth", 406),
                new Place("Townsville", 2073),
                new Place("Wollongong", 84)
        ));
    }

    public static void moving(LinkedList<Place> list, boolean isForward) {
        boolean quit = false;
        if (isForward) {
            var iterator = list.listIterator();
            while (iterator.hasNext()) {
                System.out.println((iterator.next().toString()));
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        } else {
            var iterator = list.listIterator(list.size());
            while (iterator.hasPrevious()) {
                System.out.println((iterator.previous().toString()));
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    static void main() throws InterruptedException {
        LinkedList<Place> itinerary = initialItenarary();
        itinerary.sort(Comparator.comparing(Place::distance));
        Scanner input = new Scanner(System.in);
        moving(itinerary, false);
    }
}
