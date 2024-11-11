package dsa.graph;

import java.util.ArrayList;

public class AdjList {

	ArrayList<Integer>[] adj;
	@SuppressWarnings("unchecked")
	AdjList(int v){
		adj = new ArrayList[v];
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Integer>();
			
		}
	}
	
	
	public void insert(int s, int d) {
		adj[s].add(d);
		adj[d].add(s);
	}
	
	
	public void creategraph() {
		insert(0, 1);
		insert(0, 2);
		insert(0, 3);
		insert(2, 1);
	}
	
	public void display() {
		for (ArrayList<Integer> arrayList : adj) {
			System.out.println(arrayList);
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		AdjList g = new AdjList(4);
		g.creategraph();
		g.display();
	}

}
