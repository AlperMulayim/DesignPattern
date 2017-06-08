package graph;

import java.util.*;



public class DijkstrasAlgorithm {


    public static void dijkstrasAlgorithm(Graph graph,
                                          int start,
                                          int[] pred,
                                          double[] dist) {
        int numV = graph.getNumV();
        HashSet < Integer > vMinusS = new HashSet < Integer > (numV);
        // Initialize V–S.
        for (int i = 0; i < numV; i++) {
            if (i != start) {
                vMinusS.add(i);
            }
        }
        // Initialize pred and dist.
        for (int v : vMinusS) {
            pred[v] = start;
            dist[v] = graph.getEdge(start, v).getWeight();
        }
        // Main loop
        while (vMinusS.size() != 0) {
            // Find the value u in V–S with the smallest dist[u].
            double minDist = Double.POSITIVE_INFINITY;
            int u = -1;
            for (int v : vMinusS) {
                if (dist[v] < minDist) {
                    minDist = dist[v];
                    u = v;
                }
            }
            // Remove u from vMinusS.
            vMinusS.remove(u);
            // Update the distances.

            Iterator<Edge> edgeIterator = graph.edgeIterator(u);

            while (edgeIterator.hasNext()){
                Edge edge = edgeIterator.next();
                int v = edge.getDest();

                if(vMinusS.contains(new Integer(v))){

                    double weight = edge.getWeight();
                    if(dist[u] + weight < dist [v]){
                        dist[v] = dist[u] + weight;
                        pred[v] = u;
                    }
                }
            }


        }
    }
}
