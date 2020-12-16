import java.util.*;

public class Graph {

    int numberOfNodes;
    Integer[] prev;
    List<List<Edge>> graph;

    public static class Edge {
        int from;
        int to;
        int cost;

        Edge (int u, int v, int cost) {
            this.from = u;
            this.to = v;
            this.cost = cost;
        }
    }

    Graph (int n) {
        numberOfNodes = n;
        prev = new Integer[n];
        graph = new ArrayList<>(n);
        for (int i = 0 ; i < n ; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public static void main(String[] args) {

        int inputNumberOfNodes = 10;
        Graph graph = new Graph(inputNumberOfNodes);
        createGraph(graph, 0, 1, 1);
        createGraph(graph, 1, 2, 1);
        createGraph(graph, 2, 3, 1);
        createGraph(graph, 3, 4, 1);
        createGraph(graph, 4, 5, 1);
        createGraph(graph, 5, 6, 1);
        createGraph(graph, 6, 7, 1);
        createGraph(graph, 7, 8, 1);
        createGraph(graph, 8, 9, 1);
        createGraph(graph, 9, 2, 1);

        List<Integer> path = graph.createPath(graph, 0, 9);

        for (int i : path) {
            System.out.print(i + ", ");
        }
    }

    public List<Integer> createPath (Graph graph, int start, int end) {
        bfs(graph, start);
        List<Integer> path = new ArrayList<>();
        //path.add(end);
        for (Integer i = end; i!=null; i=prev[i]) {
            path.add(i);
        }
        Collections.reverse(path);
        if(path.get(0)==start) return  path;
        path.clear();
        return path;

    }

    public void bfs (Graph graph, int n) {
        boolean[] visited = new boolean[numberOfNodes];
        prev = new Integer[numberOfNodes];
        Deque<Integer> queue = new ArrayDeque<>(numberOfNodes);

        queue.offer(n);
        visited[n]=true;

        while(!queue.isEmpty()) {
            Integer node = queue.poll();
            List<Edge> list = graph.graph.get(node);

            for (Edge edge : list) {
                if (!visited[edge.to]) {
                    visited[edge.to] = true;
                    prev[edge.to] = node;
                    queue.offer(edge.to);
                }
            }
        }
    }

    public static void createGraph (Graph graph, int u, int v, int cost) {
        createDirectedGraph (graph, u, v, cost);
        createDirectedGraph (graph, v, u, cost);
    }

    public static void createDirectedGraph (Graph graph, int u, int v, int cost) {
        graph.graph.get(u).add(new Edge(u, v, cost));
    }
}
