
public class SinglyLinkedList{	//file name should be same on public
	Node head;
	Node tail;
	private static class Node{
		int data;
		Node next;
		public Node(int data){
			this.data = data;	
		}
	}
	public void addEnd(int x){
		Node p = new Node(x);
		if(head == null){
			head = tail = p;}
		else{
		  	tail.next = p;
			tail = p;
		}
	public void addFirst(int x){
		Node p = new Node(x);
		if(head == null){
			head = tail = p;		
		}	
		else{
			
			p.next=head;
			head = p;
		}
		}
	public void display(){
		Node p = head;
		while(p!=null){
			System.out.print(p.data+" -> ");
			p=p.next;			
			}	
		System.out.println();
	}
	public int length(){
		Node p = head;
		int count = 0;
		while(p != null){
			count++;
			p = p.next;
		}
		return count;
	}

	}
public static void main(String[] args){
	SinglyLinkedList sl =new SinglyLinkedList(); 
	sl.addEnd(10);
	sl.addEnd(20);
	sl.addEnd(30);
	sl.addFirst(555);
	sl.display();
	System.out.println(sl.length());
}

}

































// Linked List Class
class LinkedList
{
   Node head; 
   static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
   void addEnd(int x){
       if(this.head==null) {
           this.head=new Node(x);
       } 
       else{
           Node p = new Node(x);
           Node k = this.head;
           while(k.next!=null){
               k=k.next;
           } k.next=p;
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

    void delete(int x){
           Node k = this.head;
           
           while(k.next!=null){
               if(k.next.data==x){
                   k.next = k.next.next;
               }
               k=k.next;
        }
    }
    void display(){
        Node k = this.head;
        while(k!=null){
            System.out.println(" "+k.data);
            k=k.next;
        }
    }
//rev not working
    void rev(){
        Node cur = this.head;
        Node ne = null;
        Node pre = null;
        while(cur.next!=null){
            ne = cur.next;
            cur.next = pre;
            pre = cur;
            cur = ne;
            
        }
    }
    
    void set(int x, int idx){
        if(idx==1){
            Node p = new Node(x);
            p.next = head;
            head=p;       
     }
     else{
        Node p = head;
        Node p1 = head;
        int i=1;
        while(i!=idx){
            i++;p=p.next;
            if(i<idx) p1=p1.next;
        }
        Node pp = new Node(x);
        pp.next=p;
        p1.next=pp;
     }  
    }
/*
    void set(int x, int idx){
            if(idx==1){
            Node p = new Node(x);
            p.next = head;
            head=p;       
     }
     else{
        Node node = new Node(x);
        Node p = head;
        int count = 1;
        while(count<idx-1){
            p = p.next;
            count++;
        }
        node.next = p.next;
        p.next = node;
    }}
    */
    static void rev_rec(Node ll){
        if(ll==null){
            return;
        }
        rev_rec(ll.next);
        System.out.println(ll.data);
    }
    
    
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        
        ls.addEnd(12);
        ls.addEnd(13);
        ls.addEnd(14);
      //  ls.display();
        //System.out.println(ls.count());
        
       // ls.delete(13);
       // ls.display();
    //  System.out.println(ls.count());
        ls.rev();
        ls.display();
     //   ls.set(23,1);
        //System.out.println(ls.count());
       // ls.display();
	LinkedList.rev_rec(ls.head);
    }
}}