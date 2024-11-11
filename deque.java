//deque

class deque{	
    static final int MAX = 100;
    int arr[];
    int front;
    int rear;
    int size;

    public boolean isEmpty(){
        return front == -1;
    }

    public void insertAtFront(int data){
        if(isFull()){
            System.out.print("Queue is full");
            return;
        }
        if(front == -1){
            front = 0;
            rear = 0;
        }
        else if(front == 0){
            front = size - 1;
        }
    }

public static void main(String[] args){


}}