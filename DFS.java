// Question 3: Depth-First Search (DFS) Sample Problem: Implement Depth-First Search (DFS) to traverse a graph starting from a given vertex. The graph is represented by an adjacency list.

import java.util.*;
public class DFS {
    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addEdge(int v, int w) {
        adjList.computeIfAbsent(v, k -> new LinkedList<>()).add(w);
    }
    public void dfs(int v, Set<Integer> visited) {
        visited.add(v);
        System.out.print(v + " ");

        for (int neighbor : adjList.getOrDefault(v, new LinkedList<>())) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, visited);
            }
        }
    }
    public static void main(String[] args) {
        DFS graph = new DFS();
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
        System.out.println("Depth-First Traversal starting from vertex 2:");
        Set<Integer> visited = new HashSet<>();
        graph.dfs(2, visited);
    }
}
