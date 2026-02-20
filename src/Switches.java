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
    public static void printNumberInWord(int number){
        switch (number) {
            case 0 -> System.out.print("Zero");
            case 1 -> System.out.print("One");
            case 2 -> System.out.print("Two");
            case 3 -> System.out.print("Three");
            case 4 -> System.out.print("Four");
            case 5 -> System.out.print("Five");
            case 6 -> System.out.print("Six");
            case 7 -> System.out.print("Seven");
            case 8 -> System.out.print("Eight");
            case 9 -> System.out.print("Nine");
            default -> {
                if ( number < 0){
                    System.out.println(number+ " is a negative number.");
                }
                else System.out.println(number+ " is a higher than 9.");;
            }
        };
    }

    public static boolean isLeapYear(int year){
        if(year>= 1 && year <= 9999){
            int leapFlag =(year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ? 1 : 0;
            return switch (leapFlag){
                case 1 -> true;
                default -> false;
            };
        }
        else{
            System.out.println(year+ " is out of range.");
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        if(month<1 || month>12 || year<1 || year>9999){
            System.out.println("Month is out of range.");
            return -1;
        }
        else{
            return switch (month){
                case 2 -> isLeapYear(year) ? 29 : 28;
                case 4, 6, 9, 11 -> 30;
                default -> 31;

            };
        }
    }
    static void main() {

        //System.out.println(isLeapYear(99990));
        //System.out.println("Welcome to days of week: " +  daysOfTheWeek(6));
        //printNumberInWord(-15);
        System.out.println(getDaysInMonth(2, 1900));
    }
}


