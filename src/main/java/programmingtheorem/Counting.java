package programmingtheorem;

public class Counting {

    public static void main(String[] args) {

        // minta tömb
        int[] numbers = {1, 2, 3, 4, 5};
        // a páros számokat számoljuk meg!
        int counter = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                counter++;
            }
        }

        System.out.printf("Páros számok száma: %s", counter);

        // páratlan szám
        counter = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                counter++;
            }
        }

        System.out.printf("Páratlan számok száma: %s", counter);
    }

    public static int countOdd(int[] numbers) {
        int counter = 0;
        for (int num : numbers) {
            if (num % 2 == 1) {
                counter++;
            }
        }
        return counter;
    }
}
