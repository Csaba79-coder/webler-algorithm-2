package searchalgorithm;

import java.util.Arrays;

public class BinarySearch {

    /*
    A bináris keresés (binary search) sokkal gyorsabb, mint a lineáris keresés (linear search), különösen nagy méretű
    adatsorok esetén. A különbség lényeges lehet az időkomplexitás szempontjából.

    A bináris keresés lépésről lépésre felosztja az adatsort, és minden lépésben a keresett elemet az aktuális középponttal
    hasonlítja össze. Ez a művelet hatékonyan csökkenti az értékek számát, amelyekkel összehasonlításra kerül sor, és a
    keresett elemet általában gyorsan megtalálja.

    A lineáris keresés esetében minden egyes elemet sorban meg kell vizsgálni, és a keresett elem az adatsor méretével
    arányos időbe telik megtalálni. Tehát nagyobb adatsorok esetén a bináris keresés sokszor gyorsabb, mivel a keresési
    idő logaritmikusan nő az adatsor méretével szemben, míg a lineáris keresés esetében lineárisan nő.
     */

    public static void main(String[] args) {
        /*int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int key = 5;
        int resIndex = Arrays.binarySearch(nums, key); // built in! bal control lenyom + klikk metódus neve, átvisz a mögöttes megírt kódra!
        System.out.println(resIndex);*/

        int[] numbers = {5, 3, 6, 2, 10, 12, 16, 18}; // rendezett tömbön lehet binary search-t alkalmazni
        int[] sortedNums = sort(numbers);
        //System.out.println(Arrays.toString(sortedNums));
        int adamTargetNum = 10;
        int indexByAdam = binarySearch2(sortedNums, adamTargetNum);
        int target = 10;
        int index = binarySearch(sortedNums, target);
        System.out.println(indexByAdam);
        System.out.println(index);
    }

    private static int[] sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int swap = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = swap;
                }
            }
        }
        return nums;
    }

    private static int binarySearch(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2; // közép indexet egy szimpla átlagszámítással meghatározzuk
            if (nums[middleIndex] == target) { // megviszgáljuk, hogy a középső elem egyenlő-e a keresett elemmel
                return middleIndex; // ha igen, akkor visszatérünk a középső indexszel
            } else if (nums[middleIndex] < target) { // ha a középső elem kisebb, mint a keresett elem, akkor a bal indexet a középső index + 1-re állítjuk
                leftIndex = middleIndex + 1;
            } else { // egyéb esetben pedig a jobb indexet a középső index - 1-re állítjuk
                rightIndex = middleIndex - 1;
            }
        }
        return -1; // ha nem találjuk meg a keresett elemet, akkor -1-et adunk vissza
    }

    // made by Ádám :)
    private static int binarySearch2(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            if (nums[middleIndex] == target) { // ez a pozitiv eset
                return middleIndex;
            }
            if (nums[middleIndex] < target) { // akkor tömb második fele
                leftIndex = middleIndex + 1; // középtől jobbra lépés a kezdő index-el
            } else { // tömb első fele
                rightIndex = middleIndex -1; // közepétől balre lépés a kezdő index-el
            }
        }
        return -1;
    }
}
