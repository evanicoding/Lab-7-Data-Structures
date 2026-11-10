import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    int verticesSize;

    public void countVertices(String filename) throws FileNotFoundException {
        ArrayList<String> vertices = new ArrayList<>();

        try (Scanner in = new Scanner(new File(filename))) {
            while (in.hasNextLine()) {
                String line = in.nextLine().trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split("\\s+");
                if (parts.length < 3) continue;

                if (!vertices.contains(parts[0])) vertices.add(parts[0]);
                if (!vertices.contains(parts[1])) vertices.add(parts[1]);
            }
        }
        verticesSize = vertices.size();
    }

    public void addEdges(String filename) throws FileNotFoundException{

    }

    public int getVertices(){
        return verticesSize;
    }
}
