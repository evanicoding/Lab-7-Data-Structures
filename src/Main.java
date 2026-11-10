import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args){
        Reader fileReader = new Reader();

        try {
            fileReader.countVertices("data/graphdata.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        List adjList = new List();

        adjList.addNode(new Node('a'));
        adjList.addNode(new Node('b'));
        adjList.addNode(new Node('c'));
        adjList.addNode(new Node('d'));

        adjList.addEdge(0,1,1);
        adjList.addEdge(1,2,2);
        adjList.addEdge(2,3,3);
        adjList.addEdge(3,0,4);

        adjList.print();

        Matrix matrix = new Matrix(fileReader.getVertices());

        matrix.addEdge(0,1,1);
        matrix.addEdge(1,2,2);
        matrix.addEdge(2,3,3);
        matrix.addEdge(3,0,4);

        matrix.print();

    }

}
