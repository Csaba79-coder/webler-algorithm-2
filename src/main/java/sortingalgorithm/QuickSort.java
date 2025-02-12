package sortingalgorithm;

import java.util.Arrays;

public class QuickSort {

    // https://www.youtube.com/watch?v=h8eyY7dIiN4 <- YouTube video to explain the algorithm

    public static void main(String[] args) {
        int[] numbers = {5, 3, 6, 2, 10};
        int length = numbers.length;

        quickSort(numbers, 0, length - 1);

        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }

    // quick sort algoritmus meghívása
    // az alapfüggvény elindítja az alrogitmust
    // első lépésben kiválasztjuk a pivot elemet
    // majd rekurzív módon meghívja a rendezést a baj és a jobb oldali részre
    private static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pivot = partition(nums, low, high); // pivot elem kiválasztása
            quickSort(nums, low, pivot - 1); // bal oldali rész rendezése
            quickSort(nums, pivot + 1, high); // jobb oldali rész rendezése
        }
    }

    // pivot elem kiválasztása és rendezése
    // a függvény kiválasztja a pivot elemet, majd a tömböt két részre osztja
    // az elemeket úgy cseréli ki, hogy a kisebb a pivot  bal dolalásra, míg a nagyobbak a pivit jobb oldalára kerülnek
    // ezek után meghatározza az új pivot elemet (visszaadja annak pozícióját!)
    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[high]; // a pivot elem kiválasztása (jelen esetben a tömb utolsó eleme)
        int index = low - 1; // index az elemek számához, amik a pivotnál kisebbek

        for (int i = low; i < high; i++) {
            if (nums[i] < pivot) {
                index++;
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
            }
        }
        int temp = nums[index + 1];
        nums[index + 1] = nums[high];
        nums[high] = temp;
        return index + 1; // visszaadjuk az új pivot indexét (pozícióját)
    }
}


