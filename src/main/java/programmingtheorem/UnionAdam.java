package programmingtheorem;

import java.util.Arrays;

public class UnionAdam {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // 1, 2, 3, 4, 5
        int[] nums = {3, 4, 5, 6, 7}; // 6, 7
        int[] union = createUnion(numbers, nums);
        int[] union2 = createUnion(nums, numbers);
        System.out.println(Arrays.toString(union));
        System.out.println(Arrays.toString(union2));
    }

    private static boolean searchElementMatching(int element, int[] numbers) {
        boolean isMatching = false; // nem match!
        for (int num : numbers) {
            if (num == element) {
                isMatching = true;
                break;
            }
        }
        return isMatching;
    }

    private static int countLength(int[] numbers, int[] nums) {
        int unionLength = numbers.length;
        for (int num : nums) {
            boolean isMatching = searchElementMatching(num, numbers);
            if (!isMatching) {
                unionLength++;
            }
        }
        return unionLength;
    }

    private static int[] createUnion(int[] numbers, int[] nums) {
        int unionLength = countLength(numbers, nums);
        int[] union = new int[unionLength];
        for (int i = 0; i < numbers.length; i++) { // System.arraycopy(numbers, 0, union, 0, numbers.length);
            union[i] = numbers[i];
        }
        int index = numbers.length - 1; // 4. index-en álló elem
        for (int num : nums) {
            boolean isMatching = searchElementMatching(num, numbers);
            if (!isMatching) {
                index++; // behejezés előtt növelem
                union[index] = num;
            }
        }
        return union;
    }
}
