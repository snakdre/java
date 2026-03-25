package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Challenges {
    public static int findMin(String[] arrayOfInts){
        int[] convertedInt =  new int[arrayOfInts.length];
        for (int i = 0; i < arrayOfInts.length; i++) {
            convertedInt[i] = Integer.parseInt(arrayOfInts[i]);
        }
        Arrays.sort(arrayOfInts);
        System.out.println("here is your sorted array; " + Arrays.toString(convertedInt));
        return convertedInt[0];
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] text = s.split(",");
        System.out.println("The minimum number is : " + findMin(text));
    }
}
