import java.util.*;
// import java.util.ArrayList;
class graph_practice{
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void main(String[] args) {
        int v=5;
        @SuppressWarnings("unchecked") // for ignore the error
        ArrayList<Edge>[] graph=new ArrayList[v];

        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 0));

        graph[1].add(new Edge(1, 0, 0));
        graph[1].add(new Edge(1, 2, 0));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 1, 0));
        graph[2].add(new Edge(2, 3, 0));
        graph[2].add(new Edge(2, 4, 0));

        graph[4].add(new Edge(4, 2, 0));

        //to get all neighbour of 2
        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.println(e.dest);
        }
    }
}