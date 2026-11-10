
public class Matrix {
    int[][] aMatrix;

    private Matrix(){};

    public Matrix(int vertices){
        aMatrix = new int[vertices][vertices];
    }

    public void addEdge(int src, int dst, double weight){
        aMatrix[src][dst] = weight;
        aMatrix[dst][src] = weight;

    }

    public double getEdge(int src,int dst){
        return aMatrix[src][dst];
    }

    public void print() {
        for (int[] row : aMatrix){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
