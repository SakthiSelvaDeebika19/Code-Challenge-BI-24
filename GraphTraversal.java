
import java.util.*;

public class GraphTraversal {
    private Map<Integer, List<Integer>> adjList;

   
    public GraphTraversal(int vertices) {
        adjList = new HashMap<>();
        for (int i = 0; i < vertices; i++) {
            adjList.put(i, new ArrayList<>());
        }
    }

   
    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src); 
    }

    
    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        System.out.print("DFS starting from node " + start + ": ");
        dfsUtil(start, visited);
        System.out.println();
    }

    
    private void dfsUtil(int node, Set<Integer> visited) {
        if (visited.contains(node)) return;
        visited.add(node);
        System.out.print(node + " ");
        for (int neighbor : adjList.get(node)) {
            if (!visited.contains(neighbor)) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        visited.add(start);
        queue.add(start);

        System.out.print("BFS starting from node " + start + ": ");
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int neighbor : adjList.get(node)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Number of vertices: ");
        int vertices = scanner.nextInt();

        GraphTraversal graph = new GraphTraversal(vertices);

        
        System.out.println("Enter edges (source destination). Type 'done' to finish:");
        while (scanner.hasNextInt()) {
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            graph.addEdge(src, dest);
        }

        
        System.out.print("Start node for DFS: ");
        int startDfs = scanner.nextInt();
        System.out.print("Start node for BFS: ");
        int startBfs = scanner.nextInt();

       
        graph.dfs(startDfs);
        graph.bfs(startBfs);

        
        scanner.close();
    }
}
