// Graph Data Type
import java.util.ArrayList;

public class GraphExample {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Create three vertices
        for (int i = 0; i < 3; i++) {
            graph.add(new ArrayList<>());
        }

        // Add undirected edges
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        System.out.println(graph);
    }
}
