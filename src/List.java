
import java.util.ArrayList;
import java.util.LinkedList;

public class List {
    ArrayList<Node> vertices;
    ArrayList<LinkedList<Edge>> alist;

    public List(){
        vertices = new ArrayList<>();
        alist = new ArrayList<>();
    }

    public void addNode(Node node){
        vertices.add(node);
        alist.add(new LinkedList<>());
    }

    public void addEdge(int src, int dst, int weight){
        alist.get(src).add(new Edge(vertices.get(dst) ,weight));
    }

    public boolean checkEdge(int src, int dst){
        Node dstNode = vertices.get(dst);
        for (Edge edge : alist.get(src)){
            if(edge.dst == dstNode){
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (int i = 0; i < vertices.size(); i++) {
            System.out.print(vertices.get(i).data + " -> ");
            for (Edge edge : alist.get(i)) {
                System.out.print(edge.dst.data + ":" + edge.weight + ", ");
            }
            System.out.println();
        }
    }

}
