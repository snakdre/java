public class Switches {
    public static String daysOfTheWeek(int i){
        return switch (i) {
            case 0 -> "Monday";
            case 1 -> "Tuesday";
            case 2 -> "Wednesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> "Invalid Entry";
        };
    }
    static void main() {
        System.out.println("Welcome to days of week: " +  daysOfTheWeek(6));
    }
}
