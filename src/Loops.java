public class Loops {

    public static void interestCalculation(double amount){
        double interestDue = 0.0;

        for(double rate=7.5; rate <=10; rate+=.25 ){
            interestDue = amount * (rate/100);
            System.out.println("$"+amount+ " on " + rate + " is " + "$"+interestDue);
        }
    }
    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            return (wholeNumber==2);
        }
        for(int divisor=2; divisor < wholeNumber; divisor++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }

    public static void  main(String[] args) {
        System.out.println(1 + " " + (isPrime(1) ? "is a prime number" : "is NOT a prime number"));
        System.out.println(2 + " " + (isPrime(2) ? "is a prime number" : "is NOT a prime number"));
        System.out.println(3 + " " + (isPrime(3) ? "is a prime number" : "is NOT a prime number"));
        System.out.println(4 + " " + (isPrime(4) ? "is a prime number" : "is NOT a prime number"));
        System.out.println(5 + " " + (isPrime(5) ? "is a prime number" : "is NOT a prime number"));
        System.out.println(6 + " " + (isPrime(6) ? "is a prime number" : "is NOT a prime number"));
        System.out.println(7 + " " + (isPrime(7) ? "is a prime number" : "is NOT a prime number"));
        System.out.println(8 + " " + (isPrime(8) ? "is a prime number" : "is NOT a prime number"));
        System.out.println(9 + " " + (isPrime(9) ? "is a prime number" : "is NOT a prime number"));
        System.out.println(10 + " " + (isPrime(10) ? "is a prime number" : "is NOT a prime number"));

    }
}
