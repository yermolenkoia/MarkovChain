package view;

import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import view.elements.Edge;
import view.elements.Vertex;


class SimpleGraphView {
    public Graph<Vertex, Edge> getGraph() {
        return graph;
    }
    private Graph<Vertex, Edge> graph = new SparseMultigraph<>();
    private int idVertexCount;
    private int idEdgeCount;
    SimpleGraphView(Double[][] matrix){
        Vertex [] arr = new Vertex[6];
        for (int i = 0; i < arr.length; i++){
            arr[i] = new Vertex(idVertexCount++);
        }
        for (int i = 0; i < 5; i++) {
            graph.addEdge(new Edge(idEdgeCount++, matrix[i][i+1], arr[i].toString(), arr[i+1].toString()),
                    arr[i], arr[i+1]);
            graph.addEdge(new Edge(idEdgeCount++, matrix[matrix.length-1-i][matrix.length-2-i], arr[arr.length-1-i].toString(),
                    arr[arr.length-2-i].toString()), arr[arr.length-1-i], arr[arr.length-2-i]);
        }
    }
}
