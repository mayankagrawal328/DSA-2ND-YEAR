import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class tree{
    Node root;
    private static class Node{
        Node left,right;
        int data;
        Node(int d){ data = d; left = null; right = null;}
    }

    public void addInLavel(int data){
        Node p = new Node(data);
        if(root == null){
            root = p;
            return;
        }
    }

    Queue<Node> q = new LinkedList<>();
    Node c = root;
    q.offer(c);
    boolean f = true;
    while(f){
        c = q.poll();
        if(c.left == null){
            c.left = p;
            return;
        }
        else if(c.right == null){
            c.rght = p;
            return;
        }
        else{
            if(c.left != null){
                q.offer(c.left);
            }
            if(c.right!=null){
                q.offer(c.right);
            }
        }
    }

    public static void inOrder(Node p){
        if(p!=null){
            inOrder(p.left);
        }
    }
    public static void main(String[] args){

        Tree t=new Tree();
        t.addInLavel(10);
        t.addInLavel(20);
        t.addInLavel(30);
        t.addInLavel(40);
    }
}
////////////////////////////////
//cheak for full / strict / perfect bt
boolean isFullBinaryTree(Node node){
    //cheaking tree emptiness
    if(node == null)
        return true;
    //cheaking the childrean
    if(node.left == null && node.right == null)
        return true;
    if((node.left != null) && (node.right !=null))
        return (isFullBinaryTree(node.left) && isFullBinaryTree(node.right));
    return false;

}

////cheakCumplete
{
int count = 0;
void count(Node node){
    if(node==null) return;
    count++;
    count(node.left);
    count(node.right);
}

cheakCumplete(Node root, int index){
    if(root == null) return true;
    if(index >= count) return false;

    return cheakCumplete(root.left, index*2+1)&&cheakCumplete(root.right, index*2+2);

}
}
///balancebinary tree
boolean bal = true;
int height(Node node){
    if(node==null) return 0;
    
    int hl = count(node.left);
    int hr = count(node.right);

    if(Math.abs(hl-hr) > 1) bal = false;

    return Math.max(hl,hr)+1;
}
boolean balance(Node node){
    height(node);
    return bal;
}



ArrayList<Integer> preOrderIterative(Node node){

    ArrayList<Integer> al =new ArrayList<>();
    Stack<Node> s = new Stack<>();
    s.push(node);

    while(!s.isEmpty()){
         
        Node n = s.pop();
        al.add(n.data);

        if(n.right != null)
            s.push(n.right);
        if(n.left != null)
            s.push(n.left);
    }
    
    return al;

}

int lavel(Node node){
    if(node == null)
        return 0;
    Queue<Integer> q =new LinkedList<>();
    q.offer(node);
    q.offer(null);
    int count = 1;
    wihle(!q.isEmpty()){
          TreeNode temp = q.poll();

          if(temp != null){
            if(temp.left != null) q.offer(temp.left);
            if(temp.right != null) q.offer(temp.right);
          }
          else{
            if(!q.isEmpty()){
                count++;
                q.offer(null);
            }
          }
    }
}




void printLevelOrder()
{
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);
    while (!queue.isEmpty()) {

        Node tempNode = queue.poll();
        System.out.print(tempNode.data + " ");

        if (tempNode.left != null) {
            queue.add(tempNode.left);
        }

        if (tempNode.right != null) {
            queue.add(tempNode.right);
        }
    }
}