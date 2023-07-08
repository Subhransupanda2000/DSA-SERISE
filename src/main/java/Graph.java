import java.util.ArrayList;

public class Graph {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }

        public static void createGraph(ArrayList<Edge>[] graph, int v) {
            for (int i = 0; i < v; i++) {
                graph[i] = new ArrayList<Edge>();
            }
            graph[0].add(new Edge(0, 1, 1));
            graph[0].add(new Edge(0, 2, 1));
            graph[1].add(new Edge(1, 0, 1));
            graph[1].add(new Edge(1, 3, 1));
            graph[2].add(new Edge(2, 0, 1));
            graph[2].add(new Edge(2, 4, 1));
            graph[3].add(new Edge(3, 1, 1));
            graph[3].add(new Edge(3, 4, 1));
            graph[3].add(new Edge(3, 5, 1));
            graph[4].add(new Edge(4, 2, 1));
            graph[4].add(new Edge(4, 3, 1));
            graph[4].add(new Edge(4, 5, 1));
            graph[5].add(new Edge(5, 3, 1));
            graph[5].add(new Edge(5, 4, 1));
            graph[5].add(new Edge(5, 6, 1));
            graph[6].add(new Edge(6, 5, 1));
        }

        public static void main(String[] args) {
            int v = 7;
            ArrayList<Edge>[] graph = new ArrayList[v];
            createGraph(graph, v);

            for (int i = 0; i < graph[2].size(); i++) {
                Edge e = graph[2].get(i);
                System.out.println("Source: " + e.src + ", Destination: " + e.dest + ", Weight: " + e.wt);
            }
        }
    }
}
