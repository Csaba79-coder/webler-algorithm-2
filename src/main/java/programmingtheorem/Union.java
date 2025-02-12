package programmingtheorem;

import java.util.Arrays;

public class Union {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // 1, 2, 3, 4, 5
        int[] nums = {3, 4, 5, 6, 7}; // 6, 7
        int unionLength = numbers.length;
        int exist = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == nums[i]) {
                    exist = 1;
                }
            }
            if (exist == 0) {
                unionLength += 1;
            }
            exist = 0;
        }
        System.out.println(unionLength);
        int[] union = new int[unionLength];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            union[index] = numbers[i];
            index++;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == nums[i]) {
                    exist = 1;
                }
            }
            if (exist == 0) {
                union[index] = nums[i];
                index++;
            }
            exist = 0;
        }
        System.out.println(Arrays.toString(union));
    }
}
