import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int min = 1;
        int max = 49;
        int slots = 6;
        // all elements are initialized to be zeros
        int[] lotteryArray = new int[slots];
        boolean isRepeated;
        int randomNumber;
        for (int indexDrawn = 0; indexDrawn < slots; indexDrawn++) {
            do {
                isRepeated = false;
                // number between 1 and 49
                randomNumber = rand.nextInt(max + 1 - min) + min;
                //check for repeated number against the filled non-zero elements
                for (int k = 0; k <= indexDrawn; k++) {
                    //check against each filled non-zero elements. Hope that none repeats the random number
                    if (lotteryArray[k] == randomNumber) {
                        isRepeated = true;
                        break;
                    }
                }
            } while (isRepeated);
            lotteryArray[indexDrawn] = randomNumber;
        }
        Arrays.sort(lotteryArray);
        System.out.println("The result is:  ");
        for (int i = 0; i < slots; i++) {
            System.out.print(lotteryArray[i] + " ");
        }
    }
}
