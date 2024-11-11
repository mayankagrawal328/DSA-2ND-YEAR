package com.Dijkstra.dsa;

public class Edge implements Comparable<Edge> {
int src, dest,weight;

public Edge(int src, int dest, int weight) {
	super();
	this.src = src;
	this.dest = dest;
	this.weight = weight;
}

@Override
public String toString() {
	return "{" + src + ", " + dest + "," + weight + "}";
}

@Override
public int compareTo(Edge o) {
	// TODO Auto-generated method stub
	return this.weight  - o.weight;
}



}
