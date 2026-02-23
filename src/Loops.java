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
    public static boolean isOdd(int number){
        return (number % 2 != 0) && number > 0;
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if(start<0 || end<0 || start>end){
            System.out.println("Invalid input: Make sure both numbers are positive and start is smaller than end");
            return -1;
        }
        for(int i=start; i<=end; i++){
            if(isOdd(i)){
                sum+=i;
            }
        }
        return sum;
    }

    public static boolean isEven(int number){
        return (number % 2 == 0) && number > 0;
    }
    public static void printNumbers(int start, int end){
        if(start<0 || end<0 || start>end){
            System.out.println("Invalid input: Make sure both numbers are positive and start is smaller than end");
        }
        int counter = start;
        while(counter<=end){
            System.out.println("Even number : " + counter);
            if(!isEven(counter)){
                continue;
            }
            counter+=1;
        }
    }
    public static int sumDigits(int number){
        if(number<0){
            return -1;
        }
        int sum = 0;
        while(number > 0){
            sum= number % 10;
            number /= 10;
        }
        sum+=number;
        return sum;
    }
    public static int getEvenDigitSum(int number){
        int sum = 0;
        while(number>0){
            int  digit = number % 10;
            if(isEven(digit)){
                sum+=digit;
            }
            number /= 10;
        }
        return sum;
    }
    public static int sumFirstAndLastDigit(int n){
        if(n<10){
            return n*2;
        }
        int originalLastDigit = n%10;
        int firstDigit = 0;
        while(n>0) {
            n /= 10;
            firstDigit = n%10;
        }
        return (n<0) ? -1 : originalLastDigit + firstDigit;
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int endCompare = number;
        while(Math.abs(number) > 0){
            reverse = reverse * 10 + number % 10;;
            number = number/10;
        }
        return reverse==endCompare;
        }
    public static boolean hasSharedDigit(int n1, int n2){

    }

    static void main(String[] args) {

        System.out.print(getEvenDigitSum(123456789));
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