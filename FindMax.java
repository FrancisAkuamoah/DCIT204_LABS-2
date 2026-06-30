import java.util.Scanner;

public class FindMax {

    // Linear Search - finds the maximum value and its index in an unsorted array
    public static int[] linearSearch(int[] arr) {
        int maxValue = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        return new int[]{maxValue, maxIndex};
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arraySize = scr.nextInt();
        int[] arr = new int[arraySize];

        System.out.println("Array size: " + arraySize);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = scr.nextInt();
        }

        int[] result = linearSearch(arr);

        System.out.println("\n Results");
        System.out.println("Maximum value: " + result[0]);
        System.out.println("Maximum index: " + result[1]);

        scr.close();
    }
}


