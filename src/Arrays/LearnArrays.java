package Arrays;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class LearnArrays {
    public static int[] sortArrayDesc(int[] array){
        Arrays.sort(array);
        int[] sortedArray =  new int[array.length];
        int counter = 0;
        for(int i = array.length - 1; i >= 0; i--){
            sortedArray[counter] = array[i];
            counter++;
        }
        return sortedArray;
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = ThreadLocalRandom.current().nextInt(0, 1001); // 0..99
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array ASC: " + Arrays.toString(arr));
        arr = sortArrayDesc(arr);
        System.out.println("Sorted array DESC" + Arrays.toString(arr));
    }
    }
