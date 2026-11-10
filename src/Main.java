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


        Matrix matrix = new Matrix(fileReader.getVertices());

        matrix.addEdge(0,1,1);
        matrix.addEdge(1,2,2);
        matrix.addEdge(2,3,3);
        matrix.addEdge(3,0,4);

        matrix.print();

    }

}
