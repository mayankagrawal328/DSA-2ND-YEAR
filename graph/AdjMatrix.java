package dsa.graph;

public class AdjMatrix {

	int[][] adj;
	AdjMatrix(int v){
		adj = new int[v][v];
	}
	
	public void insert(int s, int d, int w) {
		adj[s][d] = w;
		adj[d][s] = w;
	}
	
	public void creategraph() {
		insert(0, 1,10);
		insert(0, 2,20);
		insert(0, 3,30);
		insert(2, 1,40);
	}
	
	public void display() {
		
		for (int i = 0; i < adj.length; i++) {
			for (int j = 0; j < adj.length; j++) {
				
				System.out.print(adj[i][j]+"  ");
				
			}
			System.out.println();
			
		}
	}
	
	public static void main(String[] args) {
		AdjMatrix g = new AdjMatrix(4);
		g.creategraph();
		g.display();

	}

}
