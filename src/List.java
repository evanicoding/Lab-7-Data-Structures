import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

    public void bfs(ArrayList<String> vertices){
        boolean[] explored = new boolean[vertices.size()];
        Queue<Integer> queue = new LinkedList<>();

        int start = 0;
        queue.add(start);

        System.out.println("Breadth First Search order: ");
        while (!queue.isEmpty()){
            int curr = queue.remove();
            System.out.print(vertices.get(curr));
            if (!explored[curr]){
                explored[curr] = true;
                for (Edge e : list.get(curr)){
                    int next = e.dst;
                    if (!explored[next]) {
                        queue.add(next);
                    }

                }

            }
            System.out.println();
        }


    }

}

