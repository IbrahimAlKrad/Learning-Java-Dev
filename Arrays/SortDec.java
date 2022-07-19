import java.util.Arrays;
import java.util.Scanner;
import java.util.Collection;

public class SortDec {

    public static int[] getIntegers(int capacity) {

        int[] myArray = new int[capacity];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < capacity; i++) {
            myArray[i] = scan.nextInt();
        }

        return myArray;
    }

    public static void printArray(int[] myArray) {
        int[] newArray = myArray;
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Element " + i + " contents " + newArray[i]);
        }
    }

    public static int[] sortInteger(int[] myArray) {
        int i, j, value;
        for (i = 1; i < myArray.length; i++) {
            value = myArray[i];
            for (j = i - 1; (j>=0) && (myArray[j] < value); j--) {
                myArray[j+1] = myArray[j];
            }
            myArray[j+1] = value;
        }
        return myArray;
    }

    public static void main(String[] args) {
        int[] array = getIntegers(5);
        int[] array_sorted =sortInteger(array);
        printArray(array_sorted);
    }

}
