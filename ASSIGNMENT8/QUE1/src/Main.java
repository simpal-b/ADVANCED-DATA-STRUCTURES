import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue q = new PriorityQueue(9);

        while (true){
            System.out.println("0. Exit");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.print("Enter Your choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 0:
                    sc.close();
                    break;
                case 1:
                    System.out.print("Enter Value to push: ");
                    int value = sc.nextInt();
                    q.push(value);
                    break;
                case 2:
                    System.out.println("Value is popped: "+q.pop());
                    break;
                case 3:
                    System.out.println("Peeked Value is: "+q.peek());
                    break;
            }
        }
    }
}
