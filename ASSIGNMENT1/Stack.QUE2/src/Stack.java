

public class Stack {
private int arr[];
private int top;
private final int SIZE;

public Stack(int size){
    this.SIZE = size;
    this.arr = new int[SIZE];
    this.top = SIZE;
}

public void push(int value) {
    if (top == 0)
        System.out.println("Stack is Full");
    else {
        top--;
        arr[top] = value;

    }
}

    public int pop () {
        int temp = -1;
        if (top == SIZE)
            System.out.println("Stack is Empty");
        else {
            temp = arr[top];
            top++;


        }
        return temp;

    }


    public int peek () {
        int temp = -1;
        if (top == SIZE)
            System.out.println("Stack is Empty");


        else {
            temp = arr[top];
        }
        return temp;

    }

    public boolean isEmpty() {
        return top == 0;

    }

    public boolean isFull() {
        return top == SIZE;

    }

}



