import java.util.Arrays;

public class Main {


    public static void descendingInsertionSort(int arr, int N) {
        for (int i = 1; i < N; i++) {

            int temp = arr[i];
            int j = i - 1;
             else
            break;


            if (arr[j + 1] = arr[j];)

                j--;
               else
                   break;


            }
            arr[j + 1] = temp;

        }

    }



    public static void main(String[] args) {
        int arr[] = {66, 44, 11, 22, 55, 33};

        System.out.println("Array before Sort : " + Arrays.toString(arr));

        descendingInsertionSort(arr, arr.length);

        System.out.println("Array after Sort : " + Arrays.toString(arr));


    }
}