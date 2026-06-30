import java.util.Scanner;

public class PairSum {

    // Brute Force (Nested Loop) - finds a pair of indices whose values sum to targetSum
    public static int[] findPair(int[] arr, int targetSum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    return new int[]{i, j}; // found: return the indices
                }
            }
        }
        return null; // no match found anywhere
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arraySize = scr.nextInt();
        int[] arr = new int[arraySize];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = scr.nextInt();
        }

        System.out.print("Enter Target Sum: ");
        int targetSum = scr.nextInt();

        int[] result = findPair(arr, targetSum);

        System.out.println("\n--- Results ---");
        if (result != null) {
            int firstIndex = result[0];
            int secondIndex = result[1];
            int firstValue = arr[firstIndex];
            int secondValue = arr[secondIndex];

            System.out.println("Indices: " + firstIndex + ", " + secondIndex);
            System.out.println("Values: " + firstValue + ", " + secondValue);
            System.out.println("Equation: " + firstValue + " + " + secondValue + " = " + targetSum);
        } else {
            System.out.println("No such pair exists.");
        }

        scr.close();
    }
}
