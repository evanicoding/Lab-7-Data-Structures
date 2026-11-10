
public class Matrix {
    int vertices;
    int[][] aMatrix;

    private Matrix(){};

    public Matrix(int vertices){
        this.vertices = vertices;
        aMatrix = new int[vertices][vertices];
    }

    public void addEdge(int src, int dst, int weight){
        aMatrix[src][dst] = weight;
        aMatrix[dst][src] = weight;

    }

    public void print() {
        for (int[] c : aMatrix){
            for(int r : c){
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }
}
