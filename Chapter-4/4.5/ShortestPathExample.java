// Shortest Paths in Graph
import java.util.*;

public class ShortestPathExample {
    public static void main(String[] args) {
        
        // Graph 0 -- 1 -- 2 -- 3
        int[][] graph = {
            {1},
            {0, 2},
            {1, 3},
            {2}
        };

        int[] distance = {-1, -1, -1, -1};

        Queue<Integer> queue = new LinkedList<>();

        distance[0] = 0;
        queue.offer(0);

        // Breadth-first search
        while (!queue.isEmpty()) {

            int current = queue.poll();

            for (int next : graph[current]) {

                if (distance[next] == -1) {
                    distance[next] = distance[current] + 1;
                    queue.offer(next);
                }
            }
        }

        System.out.println("Distance: " + distance[3]);
    }
}
