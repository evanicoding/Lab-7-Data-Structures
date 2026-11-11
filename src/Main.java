import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Reader fileReader = new Reader();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name");

        String path = scanner.nextLine();

        try {
            ArrayList<String> vertices = fileReader.countVertices(path);

            Matrix matrix = new Matrix(fileReader.getVertices());
            List list = new List(fileReader.getVertices());

            fileReader.readEdges(path, vertices, list, matrix);

            System.out.println("Adj Matrix");
            matrix.print();

            System.out.println("Adj List");
            list.print();

            System.out.println();
            list.bfs(vertices);

        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }





    }

}
