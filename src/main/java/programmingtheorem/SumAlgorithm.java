package programmingtheorem;

public class SumAlgorithm {

    public static void main(String[] args) {

    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static int sum1(int[] numbers) {
        int sum1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum1 += numbers[i];
        }
        return sum1;
    }

    public static int sum2(int[] numbers) {
        int sum2 = 0;
        for (int number : numbers) {
            sum2 += number;
        }
        return sum2;
    }
}
