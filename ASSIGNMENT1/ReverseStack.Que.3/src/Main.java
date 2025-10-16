import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = null;
        int choice;
        ReverseStack stack = null;


        do{

            System.out.println("1.Enter Array Size: ");
            System.out.println("2.Reverse Array:  ");
            System.out.println("3. Display Array: ");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter size of array: ");
                    int n = sc.nextInt();
                    arr = new int[n];
                    stack = new ReverseStack(n);
                    System.out.println("Enter Elements: ");
                    for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
                    break;
                case 2:
                    if(arr == null){
                        System.out.println("Array not entered");
                    }
                    else {
                        for(int i = 0; i < arr.length; i++)stack.push(arr[i]);
                        for(int i = 0; i < arr.length; i++)arr[i] = stack.pop();
                        System.out.println("Array Reversed successfully.");


                    }

                    break;
                case 3:
                    if(arr == null){
                        System.out.println("Array not entered");
                    }
                    else{
                        System.out.println("Array Elements: ");
                        for (int num:arr) System.out.println(num + " ");
                        System.out.println();
                    }
                    break;


            }
        }while (choice != 3);

        sc.close();
    }
}

