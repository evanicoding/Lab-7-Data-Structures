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

    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print((char) ('A' + i) + ": ");
            for (Edge e : list.get(i)) {
                System.out.print((char) ('A' + e.dst) + " " + e.weight + " ");
            }
            System.out.println();
        }
    }
}
