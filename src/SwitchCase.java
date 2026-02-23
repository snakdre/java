public class SwitchCase {

    public static String natoAlphabet(char a){
        return switch (a) {
            case 'a', 'A' -> "Able";
            case 'b', 'B' -> "Baker";
            case 'c', 'C' -> "Charlie";
            case 'd', 'D' -> "Dog";
            case 'e', 'E' -> "Easy";
            case 'f', 'F' -> "Fox";
            case 'g', 'G' -> "George";
            case 'h', 'H' -> "How";
            case 'i', 'I' -> "Item";
            case 'j', 'J' -> "Jig";
            case 'k', 'K' -> "King";
            case 'l', 'L' -> "Love";
            case 'm', 'M' -> "Mike";
            case 'n', 'N' -> "Nan";
            case 'o', 'O' -> "Oboe";
            case 'p', 'P' -> "Peter";
            case 'q', 'Q' -> "Queen";
            case 'r', 'R' -> "Roger";
            case 's', 'S' -> "Sugar";
            case 't', 'T' -> "Tare";
            case 'u', 'U' -> "Uncle";
            case 'v', 'V' -> "Victor";
            case 'w', 'W' -> "William";
            case 'x', 'X' -> "X-Ray";
            case 'y', 'Y' -> "Yoke";
            case 'z', 'Z' -> "Zebra";
            default -> "Invalid entry";
        };
    }
    public static void main(String[] args) {}
}