public class PriorityQueue {
    private final int SIZE;
    private Heap h;
    public PriorityQueue(int size){
        SIZE = size;
        h = new Heap(size);
    }

    public boolean isEmpty(){
        return h.isEmpty();
    }

    public boolean isFull(){
        return h.isFull();
    }

    public void push(int value){
        if(isFull())
            System.out.println("Queue is full");
        else
            h.addHeap(value);
    }

    public int pop(){
        if (isEmpty())
            System.out.println("Queue is Empty");
        else
            return h.deleteHeap();
        return -1;
    }

    public int peek(){
        if (isEmpty())
            System.out.println("Queue is empty");
        else
            return h.getRoot();
        return -1;
    }
}
