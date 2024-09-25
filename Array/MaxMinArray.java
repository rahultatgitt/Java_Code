# demo
package Array;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 56, 1, 99, -4, 25};

        // Assuming first element as both min and max
        int max = arr[0];
        int min = arr[0];

        // Single scan to find both max and min
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
    
}
