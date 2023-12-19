package ShortingInArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void bucketSort(float[] arr) {
        int n = arr.length;

        if (n <= 0) return;

        // Create an array of empty buckets
        List<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Put elements into their respective buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (n * arr[i]);
            buckets[bucketIndex].add(arr[i]);
        }

        // Sort individual buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // Concatenate the sorted buckets to get the final sorted array
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }

    public static void main(String[] args) {
        float[] arr = {0.42f, 0.32f, 0.33f, 0.52f, 0.37f, 0.47f, 0.51f};
        bucketSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
