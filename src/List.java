import java.util.ArrayList;

public class List {
    private ArrayList<ArrayList<Edge>> list;

    public List(int vertices){
        list = new ArrayList<>();
        for (int i =0;i<vertices;i++){
            list.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dst, double weight){
        list.get(src).add(new Edge(dst, weight));
    }

    public void displayAdjList(ArrayList<ArrayList<Edge>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + ": ");
            for (Edge e : adj.get(i)) {
                System.out.print(e.dst + " " + e.weight + " ");
            }
            System.out.println();
        }
    }
}
