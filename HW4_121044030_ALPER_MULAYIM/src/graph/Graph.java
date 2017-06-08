package graph;

import graph.Edge;

import java.util.*;
import java.io.*;



public class Graph{

    private int numV;
    private  String username;


    private boolean directed;


    private List <Edge> [] edges;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    public Graph( String username, int numV) {
        this.numV = numV;
        this.directed = true;
        this.username = username;

        edges = new List[numV];
        for (int i = 0; i < numV; i++) {
            edges[i] = new LinkedList < Edge > ();
        }
    }

    public  Graph(){

    }


    public boolean isEdge(int source, int dest) {
        return edges[source].contains(new Edge(source, dest));
    }


    public void insert(Edge edge) {
        edges[edge.getSource()].add(edge);
        if (!isDirected()) {
            edges[edge.getDest()].add(new Edge(edge.getDest(),
                    edge.getSource(),
                    edge.getWeight()));
        }
    }

    public Iterator < Edge > edgeIterator(int source) {
        return edges[source].iterator();
    }


    public Edge getEdge(int source, int dest) {
        Edge target =
                new Edge(source, dest, Integer.MAX_VALUE);
        for (Edge edge : edges[source]) {
            if (edge.equals(target))
                return edge; // Desired edge found, return it.
        }
        // Assert: All edges for source checked.
        return target; // Desired edge not found.
    }

    public int getNumV() {
        return numV;
    }

    public boolean isDirected() {
        return directed;
    }


    public String toString()
    {
        StringBuilder strB = new StringBuilder();

        strB.append("\n____ GraphStructure ___ \n");
        for(int i = 0 ; i< edges.length ; ++i){

            if(!edges[i].isEmpty()) {
                strB.append(i + "->" + edges[i]);
                strB.append("\n");
            }

        }
        return strB.toString();
    }



}
