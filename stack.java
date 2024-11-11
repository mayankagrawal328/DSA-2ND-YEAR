// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*
class Stack {
    
    private int top;
    private int[] arr;
    
    public Stack(int capacity){
        top = -1;
        arr = new int[capacity];
    }
    
    public Stack(){
        this(10);
    }
    
    public int size(){
        return top + 1;
    }
    
    public boolean isEmpty(){
        return top < 0;
    }
    
    public boolean isFull(){
        return arr.length == size();
    }
    
    public void push(int data){
        if(isFull()){
            throw new RuntimeException("Stack is full !!!");
        }
        top++;
        arr[top] = data;
    }
    
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty !!!");
        }
        int result = arr[top];
        top--;
        return result;
    }
    
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty !!!");
        }
        return arr[top];
    }
    
    public static void main(String[] args) {
        
        Stack stack = new Stack(3);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.pop();
        stack.pop();
        
    }
}

// balance_bracket 
import java.util.Stack;  
class balance_bracket {
    public static void main(String[] args) {
        String str = "{[()]}";
        Stack<Character> st = new Stack();
        
        for(Character ch : str.toCharArray()){
            if("([{".indexOf(ch)>=0 && !st.isEmpty()){
                st.push(ch);
            }
            else if("}])".indexOf(ch)>=0){
                Character cc = st.pop();
                boolean f = (cc == '(' && ch==')')||(cc == '[' && ch==']')|| (cc=='{' && ch== '}');
                if(!f){
                    System.out.println("error");
                    break;
                }
            }
        }
        if(!st.isEmpty()){
            System.out.println("error");
        }
        else{
            System.out.println("ok");
        }
    }
}

//postfix_solve
import java.util.Stack;  
class postfix_solve {
    public static void main(String[] args) {
        String s = "34+3-";
        Stack<Integer> st = new Stack<>();
        
        for(Character ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                st.push(ch - '0');
            }
            else if(ch == '+'){
                int a1 = st.pop();
                int a2 = st.pop();
                int res = a2 + a1;
                st.push(res);
            }
            else if(ch == '-'){
                int a1 = st.pop();
                int a2 = st.pop();
                int res = a2 - a1;
                st.push(res);
            }
            else if(ch == '*'){
                int a1 = st.pop();
                int a2 = st.pop();
                int res = a2 * a1;
                st.push(res);
            }
            else if(ch == '/'){
                int a1 = st.pop();
                int a2 = st.pop();
                int res = a2 / a1;
                st.push(res);
            }
        }
        System.out.println(st.pop());
    }
}

// String to Stringarray   "12+44+" -> "12","+","44","+"
import java.util.*;
public class question{
    public static String[] fun(String str){
        String res = "";
        String sum = "";
        for(Character ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                sum = sum+ch;
            }
            else{
                if(!sum.equals("")){
                    res = res + "," +sum+","+ch;
                    sum = "";
                }
                else{
                    res = res +","+ch;
                    sum = "";
                }
            }
        }
        return res.split(",");
    }
    public static void main(String[] args) {
        String str = "212+454-78*(23+45)";
        System.out.println(Arrays.toString(fun("212+454-78*(23+45)")));
}}

*/






// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class stack {
    Node head;
    int size;
    stack(int size){
        this.size=size;
    }
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    
    public void push(int x){
        
        if(head == null){
            head = new Node(x);
            return;
        }
        Node n = new  Node(x);
        n.next = head;
        head = n;
    }  
    
    public Object pop(){
        if(isEmpty()){
            System.out.println("-------Empty-------");
            return null;
        }
        int x = head.data;
        head = head.next;
        return x;
    }
    
    public void display(){
        Node n = head;
        for(;n!= null;){
               System.out.println(n.data);
               n = n.next;
        }
    }
    
    public boolean isEmpty(){
        if(head == null){
            //System.out.println("-------Empty-------");
            return true;
        }
        //System.out.println("-------not_Empty-------");
        return false;
        
    }
    
    public static void main(String[] args) {
        
        stack s = new stack(5);
    // System.out.println(   s.pop());
     s.push(3);
     s.push(3); 
      s.push(3);
    // System.out.println(   s.pop());
     //   s.pop();
    //    s.push(13);
       s.display();
        //System.out.println(s.data);
    }
}