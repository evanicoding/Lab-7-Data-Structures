import java.io.FileNotFoundException;
import java.util.ArrayList;

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
        List list = new List(fileReader.getVertices());



    }

}
