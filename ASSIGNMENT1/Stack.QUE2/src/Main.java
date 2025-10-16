import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Stack st = new Stack(4);

        do{
            System.out.println("0.EXIT \n1.PUSH \n2.POP \n3.PEEK");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();


            switch(choice){
                case 1:
                    System.out.println("Enter Value: ");
                    int value = sc.nextInt();
                    st.push(value);
                    break;



                case 2:
                    System.out.println("Popped Value: " + st.pop());
                    break;
                case 3:
                    System.out.println("Peeked Value: " + st.peek());
                    break;

            }
        }while (choice != 0);
            sc.close();

    }
}
