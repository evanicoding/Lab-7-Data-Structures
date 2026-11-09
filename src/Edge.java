public class Edge {
    Node dst;
    int weight;

    private Edge(){};

    public Edge(Node dst,int weight){
        this.dst = dst;
        this.weight = weight;
    }
}
