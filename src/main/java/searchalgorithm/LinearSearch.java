package searchalgorithm;

public class LinearSearch {

    public static void main(String[] args) {
        int[] numbers = {5, 3, 6, 2, 10};
        int target = 6;
        int index = linearSearch(numbers, target);
        int notFound = 100;
        int notFoundedIndex = linearSearch(numbers, notFound);
        print(index);
        print(notFoundedIndex);
    }

    private static int linearSearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static void print(int index) {
        System.out.println(index == -1 ? "The target element is not in the array." : "The target element is at index: " + index);
    }
}
