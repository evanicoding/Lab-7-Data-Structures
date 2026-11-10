import java.util.ArrayList;

public class List {
    private ArrayList<ArrayList<Edge>> list;

    public List(int vertices){
        list = new ArrayList<>();
        for (int i =0;i<vertices;i++){
            list.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dst, int weight){
        list.get(src).add(new Edge(dst, weight));
    }
}
