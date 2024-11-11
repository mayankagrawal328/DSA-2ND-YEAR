import java.util.ArrayList;

//AdjMatrix
public class AdjMatrix {
    boolean[][] adj;
    public AdjMatrix(int v){
        this.adj = new boolean[v][v];
    }
    public void insert(int s, int d){
        adj[s][d] = true;
        adj[d][s] = true;
    }
    public static void main(String[] args) {
        AdjMatrix g = new AdjMatrix(4);
        g.insert(0, 1);
        g.insert(0, 2);
        g.insert(0, 3);
        g.insert(2, 3);

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int x = g.adj[i][j] == true ? 1:0;
                System.out.print(g.adj[i][j]+" ");
            }
            System.out.println();
        }
    }

}
//waited
public class AdjMatrix {
    boolean[][] adj;
    public AdjMatrix(int v){
        this.adj = new boolean[v][v];
    }
    public void insert(int s, int d, int w1, int w2){
        adj[s][d] = w1;
        adj[d][s] = w2;
    }
    public static void main(String[] args) {
        AdjMatrix g = new AdjMatrix(4);
        g.insert(0, 1, , );
        g.insert(0, 2, , );
        g.insert(0, 3, , );
        g.insert(2, 3, , );

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int x = g.adj[i][j] == true ? 1:0;
                System.out.print(g.adj[i][j]+" ");
            }
            System.out.println();
        }
    }

}
//directed
public class AdjMatrix {
    boolean[][] adj;
    public AdjMatrix(int v){
        this.adj = new boolean[v][v];
    }
    public void insert(int s, int d){
        adj[s][d] = true;
    }
    public static void main(String[] args) {
        AdjMatrix g = new AdjMatrix(4);
        g.insert(0, 1);
        g.insert(0, 2);
        g.insert(0, 3);
        g.insert(2, 3);

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int x = g.adj[i][j] == true ? 1:0;
                System.out.print(g.adj[i][j]+" ");
            }
            System.out.println();
        }
    }

}

//AdjList
public class AdjList {
    ArrayList<Integer>[] list;
    public AdjList(int v){
        list = new ArrayList[v];

        for(int i = 0; i < v; i++){
            list[i] = ArrayList<Integer>();
        }
    }

    public void insert(int s, int d){
        list[s].add(d);
        list[d].add(s)
    }



    public static void main(String[] args) {
        AdjMatrix g = new AdjMatrix(4);
        g.insert(0, 1);
        g.insert(0, 2);
        g.insert(0, 3);
        g.insert(2, 3);

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int x = g.adj[i][j] == true ? 1:0;
                System.out.print(g.adj[i][j]+" ");
            }
            System.out.println();
        }
    }

}


public class Graph{

    public void bfs(){
        Queue<Edge> q = new LinkedList<>();//stack insteed for dfs
        boolean[] isVisited = new  boolean[list.length];
        q.offer(new Edge(0, 0, 0));//(2,0,0)//(2,2,0)//order not metters
        while(!q.isEmpty()){
            Edge temp = q.poll();
            if(isVisited[temp.dest] == false){
                isVisited[temp.dest] = true;
                System.out.println(temp.dest+" ");   
                for(Edge e : list[temp.dest]){
                    q.offer(e);
                }
            }
        }
    }

}


//Minimam Spening tree

pri
