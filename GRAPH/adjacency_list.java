import java.util.*;
public class adjacency_list{
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
    public static void creategraph(ArrayList<Edge> graph[]){ 
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2,2));
        graph[1].add(new Edge(1,2,10));
        graph[2].add(new Edge(2,0,0));
        graph[2].add(new Edge(2,3,-1));
        graph[2].add(new Edge(2,1,10));
        graph[3].add(new Edge(3,1,5));
        graph[3].add(new Edge(3,2,4));
    }
    public static void main(String[] args) {
        int v=4;
       ArrayList<Edge> graph[]=new ArrayList[v];
       creategraph(graph);
       //print 2s neighbour
       for(int i=0;i<graph[2].size();i++){
        Edge e=graph[2].get(i);System.out.println(e.dest+"  "+e.wt);
       }
    }
}