package ShortingInArray;
import java.util.Arrays;

public class RadixSort {

    // A utility function to find the maximum element in an array
    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // A function to do counting sort of arr[] according to the digit represented by exp.
    private static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        Arrays.fill(count, 0);

        // Store count of occurrences in count[]
        for (int value : arr) {
            count[(value / exp) % 10]++;
        }

        // Change count[i] so that count[i] now contains the actual position of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to arr[] so that arr[] contains the sorted numbers according to the current digit
        System.arraycopy(output, 0, arr, 0, n);
    }

    // Graph.Main function to perform radix sort
    public static void radixSort(int[] arr) {
        int max = findMax(arr);

        // Do counting sort for every digit. Note that instead of passing digit number, exp is passed.
        // exp is 10^i where i is the current digit being processed.
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

