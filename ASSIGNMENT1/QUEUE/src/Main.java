import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(4);
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("0.Exit \n 1.Push \n 2.Pop \n 3.Peek");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter the number to push: ");
                    int num = sc.nextInt();
                    q.push(num);
                    break;
                case 2:
                    System.out.println("Popped Data: " + q.pop());
                    break;

                case 3:
                    System.out.println("Peeked Data: " + q.peek());
                    break;

            }


        }while (choice != 0);

        sc.close();
    }
}
