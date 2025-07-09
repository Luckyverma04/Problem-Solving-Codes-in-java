import java.util.*;

public class Subarray {
    public static int[] cutSubarray(int arr[], int start, int end) {
        if(start < 0 || end >= arr.length || start > end) {
            System.out.println("Invalid indices");
            return new int[0];
        }

        int sub[] = new int[end - start + 1];
        for(int i = start; i <= end; i++) {
            sub[i - start] = arr[i];
        }
        return sub;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int start = 3;
        int end = 6;

        int[] result = cutSubarray(arr, start, end);

        if(result.length > 0) {
            System.out.println("Subarray from index " + start + " to " + end + ":");
            for(int num : result) {
                System.out.print(num + " ");
            }
        }
    }
}
