public class shorting{
    public static void bubbel(int []arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    private static void selection(int []arr) {
        for(int i=0; i<arr.length; i++){
            int min_ind = 0;
            for(int j=i+1; j<arr.length-1; j++){
                if(arr[min_ind] < arr[j]){
                    min_ind = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind] = temp;
        }        
    }

    private static void insertion1(int []arr){
        for(int i = 1; i < arr.length; i++){
            int j = i - 1;
            int curr = arr[i];
            while(j >= 0 && curr < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
    }

    private static void insertion2(int []arr){
        for(int i = 0; i < arr.length; i++){
            int j = i - 1;
            while(j >= 0 && arr[j-1] > arr[j]){
                int key = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = key;
                j = j-1;
            }
        }
    }

    private static void quick(int []arr){
        for(int i = 1; i < arr.length; i++){
            int j = i - 1;
            int curr = arr[i];
            while(j >= 0 && curr < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
    }

    public static void marge() {
        
    }

    public static void main(String[] args) {
        int [] arr = {12,14,11,4,76,34,24,87,54,1,6,5,3,2,75};
        //bubbel(arr);
        selection(arr);
        for (int i : arr) {
            System.out.println(i+" ");
        }
    }
}

/*
2nd module

graph representation
adj mat /adj list

bfs/dfs & difference
find cycle in graph

min spening tree & application 
primps code , kusker theory
shortest path

tree:-
making tree
assingment 1-2
tree-triversal 1 100%

avl theory & making tree

bst insertion & deletion
ambay tree & b-tree theory

sequential & binary search complexity & code

hashing

1st module
stack to que & que to stack
bracket validator

stack & queue comb

reverse short insert at index sing linklist

reverse polise notation

diff b/w min spening tree & shortest path

*/