public class Heap {
    private int SIZE;

    public Heap() {
        SIZE = 0;
    }

    public void addHeap(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            SIZE++;
            int ci = SIZE;
            int pi = ci / 2;
            while (pi >= 1) {
                if (arr[pi] < arr[ci]) {
                    break;
                }
                int temp = arr[pi];
                arr[pi] = arr[ci];
                arr[ci] = temp;
                ci = pi;
                pi = ci / 2;
            }
        }
    }

    public void deleteHeap(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int min = arr[1];
            arr[1] = arr[SIZE];
            arr[SIZE] = min;

            SIZE--;

            int pi = 1;
            int ci = pi * 2;
            while (ci <= SIZE) {
                if ((ci + 1) <= SIZE && arr[ci + 1] < arr[ci]) {
                    ci = ci + 1;
                }

                if (arr[pi] < arr[ci]) {
                    break;
                }

                int temp = arr[pi];
                arr[pi] = arr[ci];
                arr[ci] = temp;

                pi = ci;
                ci = pi * 2;
            }
        }
    }

    public void heapSort(int[] arr) {
        addHeap(arr);
        deleteHeap(arr);
    }
}