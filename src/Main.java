import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        /*try (BufferedReader br = new BufferedReader(new FileReader("data/graphdata.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }*/

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

        Matrix matrix = new Matrix(4);

        matrix.addEdge(0,1,1);
        matrix.addEdge(1,2,2);
        matrix.addEdge(2,3,3);
        matrix.addEdge(3,0,4);

        matrix.print();

    }

}
