package Array;

public class sumAverage {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Calculate the sum of all elements in the array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        // Print the results
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        // Find the maximum value in the array
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum value in the array: " + max);

        // Find the minimum value in the array
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum value in the array: " + min);
    }
}
