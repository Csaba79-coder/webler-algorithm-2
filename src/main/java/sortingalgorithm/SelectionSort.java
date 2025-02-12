package sortingalgorithm;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        // Min and max selection sort

        int[] numbers = {5, 3, 6, 2, 10};
        int length = numbers.length;

        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            // swap the numbers[i] element with numbers[minIndex] element
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
