import java.util.*;

public class task_1 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int newSize = (originalArray.length + 1) / 2;
        int[] alternateArray = new int[newSize];

        for (int i = 0, j = 0; i < originalArray.length; i += 2, j++) {
            alternateArray[j] = originalArray[i];
        }

        System.out.println("Alternate Elements Array: " + Arrays.toString(alternateArray));
    }
}
