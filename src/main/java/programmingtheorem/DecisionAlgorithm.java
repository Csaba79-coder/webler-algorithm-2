package programmingtheorem;

public class DecisionAlgorithm {

    public static void main(String[] args) {

    }

    public static boolean decideIfNumIsEven(int[] numbers) {
        // páros-e? isEven vagy ha páratlan isOdd vagy van-e keritése a háznak hasFence
        boolean isEven = false; // kezdeti érték
        for (int num: numbers) {
            if (num % 2 == 0) {
                isEven = true;
                break; // kilépünk a ciklusból, hiszen talált egy darab feltételnek megfelelő elemet
            }
        }
        return isEven;
    }
}
