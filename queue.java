/*
//simple queue
class queue {
    Node head;
    int size;
    int count;
    queue(int size){
        this.size = size;
        this.count = 0;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    void enqueue(int x){
        if(isEmpty()){
            this.head = new Node(x);
            count++;
        }
        else{
            Node n = new Node(x);
            Node k = this.head;
            while(k.next!=null){
                k=k.next;
            }
            k.next = n;
            count++;
        }
        if(count==size+1){
            this.head = this.head.next;
            count--;
            return;
        }

    }
    boolean isEmpty(){
        if(count>0){
            return false;
        }
        return true;
    }
    
    void display(){
        Node n = head;
        for(; n!=null; n=n.next){
            System.out.println(n.data);    
        }
    }
    public static void main(String[] args) {
        queue q = new queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);

        q.display();
    }
}
 */



