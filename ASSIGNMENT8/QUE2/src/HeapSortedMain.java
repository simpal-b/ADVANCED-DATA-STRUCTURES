
import java.util.Arrays;

public class HeapSortedMain {
    public static void main(String[] args) {
        int arr[] = {0, 6, 14, 3, 26, 8, 18, 21, 9, 5};

        System.out.println("Array Before Sort: " + Arrays.toString(Arrays.copyOfRange(arr, 1, arr.length)));

        Heap h = new Heap();
        h.heapSort(arr);

        System.out.println("Array After Sort: " + Arrays.toString(Arrays.copyOfRange(arr, 1, arr.length)));
    }

}