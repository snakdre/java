public class Loops {

    public static void interestCalculation(double amount){
        double interestDue = 0.0;

        for(double rate=7.5; rate <=10; rate+=.25 ){
            interestDue = amount * (rate/100);
            System.out.println("$"+amount+ " on " + rate + " is " + "$"+interestDue);
        }
    }
    public static boolean isPrime(int wholeNumber){


        return true;
    }

    static void main() {
        interestCalculation(1000);
    }
}
