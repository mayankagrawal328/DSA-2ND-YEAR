

import java.util.Iterator;

public class CircularQueue_class {
    
	int[] queue;
	int front;
	int rear;
	int size;
	
	
	public CircularQueue_class(int c) {
		super();
		this.queue = new int[c];
		this.front = -1;
		this.rear = -1;
		this.size = c;
	}

	public boolean isEmpty() {
		return front == -1;
	}
	
	
//	public boolean isFull() {
//		if (front == 0 && rear == size-1) {
//			return true;
//		}
//		if (front == rear+1) {
//			return true;
//		}
//		 
//		return false;
//	}
	
	
	
	public boolean isFull() {
	
		return front == (rear+1)%size;
	}
	
	
	
	public void enQueue(int data) {
		if (isFull()) {
			System.out.println("Queue is Full");
			return;		
		}
		
		rear = (rear+1)%size;
		queue[rear] = data;
		if (front == -1) {
			front = 0;
		}
		
		
		System.out.println("data "+data+ " front "+front + " rear "+rear);
	}
	
	

	
	public int deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return Integer.MIN_VALUE;
		}
		
		int temp = queue[front];
		if (rear == front) {
			front = -1;
			rear = -1;
			return temp;
		}
		
		front = (front+1)%size;
		return temp;
		
		
		
	}
	
	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return ;
					}
		
		for (int i = front; i!=rear; i = (i+1)%size) {
			System.out.print(queue[i]+"<-");
		}
		System.out.println(queue[rear]);
	}
	

	public static void main(String[] args) {
		
   CircularQueue_class q= new CircularQueue_class(5);
   q.enQueue(10);
   q.enQueue(20);
   q.enQueue(30);
   q.enQueue(40);
   q.enQueue(50);
   q.enQueue(60);
   q.enQueue(70);
   q.display();

 /*
   q.deQueue();
   q.display();
   q.deQueue();
   q.display();
   q.deQueue();
   q.display();
   q.deQueue();
   q.display();
   q.deQueue();
   q.display();
   q.deQueue();
   q.display();
    */  
	}

}
