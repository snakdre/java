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

    public static void sumOf3and5(){
        int count = 0, result = 0;
        for(int i=1; i <= 1000 && count<5; i++){
            if(i%5==0 && i%3==0){
                System.out.println(i + " is divisible both by 3 and 5");
                count++;
                result += i;
            }
        }
        System.out.println(result + " is the sum of those numbers divisible both by 3 and 5");
    }

    static void main(String[] args) {
        sumOf3and5();
    }

}

/*public static void  main(String[] args) {

            /*    int primeNumberCounter = 0;
                for(int counter = 0; counter < 1000; counter++){
                    if(isPrime(counter)){
                        ++primeNumberCounter;
                        System.out.println(counter + " " + (isPrime(counter) ? "is a prime number" : "is NOT a prime number"));
                        if(primeNumberCounter == 3){
                            break;
                        }
                    }
                }
            }

    }

}
            */