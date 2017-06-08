package graph;

/**
 * Created by Alper on 30.12.2016.
 */
public class Edge {
    private int dest;
    private int source;
    private double weight;


    public Edge(int source, int dest, double weight) {
        this.dest = dest;
        this.source = source;
        this.weight = weight;
    }

    public Edge(int dest, int source) {
        this.dest = dest;
        this.source = source;
    }

    public int getDest() {
        return dest;
    }

    public void setDest(int dest) {
        this.dest = dest;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        return "(" + dest + "," + weight + ")";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Edge) {
            Edge edge = (Edge) obj;
            return (source == edge.source && dest == edge.dest);
        } else {
            return false;
        }
    }
}

