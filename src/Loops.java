import java.util.Scanner;

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
        if(n1<10 || n1>99 || n2<10 || n2>99){
            System.out.println("Invalid input");
            return false;
        }
        int temp2 = n2; //loading the value in a temp
        while(n1 > 0){
            int digit = n1 % 10; //get the last digit
            n1 /= 10; //reset the number
            n2= temp2; //reloading the value of the number 2
            while(n2 > 0){
                int digit2 = n2 % 10;
                if(digit == digit2){
                    return true;
                }
                n2 /= 10;
            }
        }
        return false;
    }
    public static boolean isValid(int n) {
        if(n<10 || n>1000){
            return false;
        }
        return true;
    }
    public static boolean hasSameLastDigit(int n1, int n2, int n3){
        if(isValid(n1) && isValid(n2) && isValid(n3)){
            return n2 % 10 == n3 % 10 || n1 % 10 == n2 % 10 || n1 % 10 == n3 % 10;
        }
        return false;
    }
    public static void printFactors(int number){
        if(number<1){
            System.out.println("Invalid Value");
        }
        String factors = "";
        for(int i=1; i<=number; i++){
            if(number % i == 0){
                factors = factors + i + " ";
            }
        }
        System.out.println(factors);
    }
    public static int getGreatestCommonDivisor(int n1, int n2){
        if(n1<10 || n2<10){
            return -1;
        }
        int biggestFactor1 = 0;
        for(int i=1; i<=n1||i<=n2; i++){
            if(n1 % i == 0 && n2 % i == 0){
                biggestFactor1 = i;

            }
        }
        return biggestFactor1;
    }
    public static boolean isPerfectNumber(int number){
        if(number<1){
            return false;
        }
        int factors = 0;
        for(int i=1; i<number; i++){
            if(number % i == 0){
                factors+=i;
            }
        }
        return factors == number;
    }
    /*public static String numberToWords(int number){
        String numbers = "";
        while(Math.abs(number) > 0){
            int digit = number % 10;
            number = number / 10;
            numbers =  switch(digit){
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                default -> "Nine";
            } + " ";
            numbers

        }

    }*/
    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        int digits = 0;
        while(number > 0){
            number /= 10;
            digits++;
        }
        return digits;
    }
    public static int reverse(int number){
        int reversed = 0;
        int endCompare = number;
        while(Math.abs(number) > 0){
            reversed = reversed * 10 + number % 10;;
            number = number/10;
        }
        return reversed;
    }
    public static int getLargestPrime(int number){
        if(number <= 2){
            return (number);
        }
        for(int divisor=2; divisor < number; divisor++){
            if(number % divisor == 0){
                return number;
            }
        }
        return -1;
    }
    public static void displyValidInteger(){
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        while(counter<=5){
            try{
                System.out.println("Enter number: " + counter);
                //System.out.println("You have entered: " + Integer.parseInt(scanner.nextLine()));
                counter++;
                sum+=Integer.parseInt(scanner.nextLine());
            }catch(NumberFormatException e) {
                System.out.println("Please enter a valid number");
                break;
                }
            }
        System.out.println("The sum of numbers you have entered is: " + sum);
    }
    public static void minMax(){
        Scanner scanner = new Scanner(System.in);
        do{
            int numberEntered = 0;
            int min = 0;
            int max = 0;
            try{
                System.out.print("Enter any number or any character to quit: ");
                //System.out.println("You have entered: " + Integer.parseInt(scanner.nextLine()));
                numberEntered=Integer.parseInt(scanner.nextLine());
            }catch(NumberFormatException e) {
                System.out.println("Exiting...");
                break;
            }
            if (numberEntered < max) min = numberEntered;
            if (numberEntered > min) max = numberEntered;
            System.out.println("The minimum numbers is " + min + " and the maximum number is " + max);
        }while(true);

    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avg = 0;
        int loopCount = 0;
        do{
            int numberEntered = 0;
            try{
                System.out.print("Enter any number or any character to quit: ");
                numberEntered=Integer.parseInt(scanner.nextLine());
                sum+=numberEntered;
                loopCount++;
            }catch(NumberFormatException nfe) {
                break;
            }
            if(loopCount==4){
                avg = sum/loopCount;
                break;
            }
        }while(true);
            System.out.println("SUM = " + sum + " AVG = " + avg);
    }
    public static int getBucketCount(double height,double width,double areaPerBucket,int extraBuckets){
        if(areaPerBucket<=0 || extraBuckets<0 || width<=0 || height<=0){
            return -1;
        }
        return (int)(((height*width)/(areaPerBucket*extraBuckets)));
    }
    static void main(String[] args) {
        System.out.println(getBucketCount(2.75,3.25,2.5,1));
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