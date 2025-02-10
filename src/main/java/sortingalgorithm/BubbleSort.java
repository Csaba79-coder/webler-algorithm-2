package sortingalgorithm;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        /*for (int i = numbers.length - 1; i >= 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }*/
        int[] numbers = {5, 3, 6, 2, 10};
        int length = numbers.length;
        boolean isSwapped;

        for (int i = 0; i < length - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }

        System.out.println("Sorted array with bubble sort: " + Arrays.toString(numbers));
    }
}
