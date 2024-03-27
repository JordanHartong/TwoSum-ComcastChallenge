import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!" + "\n");

        int targetVal = 12;
        int[] numbers = {-100, -12,-10, -3, -1, 1, 3, 4, 5, 15, 25, 35, 100};
        for (int i = 0; i <= numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == targetVal) {
                    System.out.printf("TargetVal: %d" + '\n', targetVal);
                    System.out.printf("Array Locations: [%d, %d]" + "\n", i, j);
                    break;
                }
            }
        }
    }
}