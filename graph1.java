import java.util.*;

public class graph1 {

    public static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    // BFS
    public static void BFS(ArrayList<Edge>[] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visit = new boolean[graph.length];
        q.add(0); // source 0 to start the visit
        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!visit[curr]) {
                System.out.print(curr + " ");
                visit[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    // DFS
    public static void DFS(ArrayList<Edge>[] graph, int curr, boolean[] vis) {
        // visit
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                DFS(graph, e.dest, vis);
            }
        }
    }

    // has path problem
    public static boolean hasPath(ArrayList<Edge>[] graph, boolean[] vis, int src, int dest) {
        // visit
        if (src == dest) {
            return true;
        }
        vis[src] = true;

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!vis[e.dest] && hasPath(graph, vis, e.dest, dest)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        @SuppressWarnings("unchecked") // for ignore the error
        ArrayList<Edge>[] graph = new ArrayList[V]; // null ->Empty arraylist

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 vertex
        graph[0].add(new Edge(0, 1, 5));
        // 1 vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        // 2 vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));
        // 3 vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));
        // 4 vertex
        graph[4].add(new Edge(4, 2, 2));

        // 2's neighbour
        // for(int i=0;i<graph[2].size();i++){
        // Edge e=graph[2].get(i);//src,dest,wt
        // System.out.println(e.dest);
        // }

        // BFS print
        // BFS(graph);
        // DFS print
        // DFS(graph, 0, new boolean[V]);

        // has path
        System.out.println(hasPath(graph, new boolean[V], 0, 3));
    }
}
