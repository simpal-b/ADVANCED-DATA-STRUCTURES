

public class Queue {
private int arr[];
private int front;
private int rear;
private int size;

public Queue(int size) {
    arr = new int[size];
    size = size;
    front = rear = 0;

}

public void push(int data) {
    if(isFull())
        System.out.println("Queue is Full!");
    else {
        rear ++;
        arr[rear] = data;

    }
}


public int pop(){
    int temp = 0;
    if(isEmpty())
        System.out.println("Queue is Empty");
    else{
        temp = arr[front + 1];
        front ++;
        if(front == rear)
            front = rear = 0;

    }
    return temp;

}

public int peek(){
    int temp = 0;
    if(isEmpty())
        System.out.println("Queue is Empty!");
    else {
        temp = arr[front + 1];

    }
    return temp;
}




public boolean isEmpty() {
    return front == rear;

}

public boolean isFull() {
return rear == size - 1;

}


}
