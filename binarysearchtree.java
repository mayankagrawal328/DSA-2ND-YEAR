

public class binarysearchtree {
    TreeNode root;
    private static class TreeNode{
        TreeNode left,right;
        int data;
        TreeNode(int d){ data = d; left = null; right = null;}
    }
    public static TreeNode insert(TreeNode node, int key){
        if(node == null){
            node = new TreeNode(key);
            return node;
        }
        if(key < node.data){
            node.left = insert(node.left, key);
        }
        if(key > node.data){
            node.right = insert(node.right, key);
        }
        return node;
    }

    public static void inOrder(TreeNode node){
         if(node!=null){
            inOrder(node.left);
            System.out.println(node.data+" ");
            inOrder(node.right);
         }
    }

    public static TreeNode delete(TreeNode node, int val){
        if(val<node.data){
            node.left = delete(node.left, val);
        }
        else if(val>node.data){
            node.right = delete(node.right, val);
        }
        else{
            if(node.left == null && node.right == null){
                return null;
            }
            else if(node.left == null){
                return node.right;
            }
            else if(node.right == null){
                return node.left;
            }
            TreeNode temp = successor(node);
            node.data = temp.data;
            delete(node.right,Is.data);
        }
        return node;
    }

public static void main(String[] args){
    binarysearchtree t = new binarysearchtree();
    t.root = insert.root(t.root, 25);
    t.root = insert.root(t.root, 255);
    t.root = insert.root(t.root, 2555);

    inOrder(t.root);
    t.root = delete(t.root, 25);
    inOrder(t.root);
}
}

//predesissir-l,rrr...
//sucessor-l,r,lll...


public TreeNode inOrderSuccessor(TreeNode node){
    while(node.left != null){
        node = node.left;
    }
    return node;
}
inOrderSuccessor(root.left.right); 




public TreeNode inOrderPerdecessor(TreeNode node){
    while(node.right != null){
        node = node.right;
    }
    return node;
}
inOrderPerdecessor(root.left);