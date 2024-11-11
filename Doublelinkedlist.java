// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Doublelinkedlist {
    Node head;
    class Node{
        Node pre;
        int data;
        Node next;
    }
    void addEle(int i){
        if(head == null){
            Node p = new Node();
            p.data = i;
            head = p;
       }
       else{
           Node p = new Node();
           Node t = head;
           p.data = i;
           while(t.next != null){
               t = t.next;
           }
           t.next = p;
           p.pre = t;
       }
    }
    
    int count(){
            int i=0;
            Node k = this.head;
            while(k!=null){
               i++;k=k.next;
           }
           return i;
    }
    
    void display(){
        Node t = head;
        while(t != null){
            System.out.print(t.data+" ");
            t = t.next;
        }
        System.out.println();
    }
    
    void set(int x, int i){
        Node p = new Node();
        p.data = x;
        Node t = head;
        
        int k = 0;
        while(t.next != null && k<i ){
               t = t.next;k++;
           }
           p.pre = t.pre;
           p.next = t;
           t.pre = p;
           p.pre.next = p;
    }
    
    
    public static void main(String[] args) {
        Doublelinkedlist dl = new Doublelinkedlist();
        dl.addEle(1);
        dl.addEle(2);
        dl.addEle(3);
        dl.addEle(4);
        dl.addEle(5);
       // dl.display();
        dl.set(6,4);
        dl.display();
        System.out.println(dl.count());
    }
}