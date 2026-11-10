import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    int verticesSize;

    public ArrayList<String> countVertices(String filename) throws FileNotFoundException {
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
        return vertices;
    }

    public void readEdges(String filename, ArrayList<String> vertices, List list,Matrix matrix) throws FileNotFoundException{
        ArrayList<String> edges = new ArrayList<>();

        try (Scanner in = new Scanner(new File(filename))) {
            while (in.hasNextLine()) {
                String line = in.nextLine().trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split("\\s+");
                if (parts.length < 3) continue;

                int from = vertices.indexOf(parts[0]);
                int to = vertices.indexOf(parts[1]);
                double weight = Double.parseDouble(parts[2]);

                matrix.addEdge(from,to,weight);
                matrix.addEdge(to,from,weight);

                list.addEdge(from,to,weight);
                list.addEdge(to,from,weight);
            }
        }
    }

    public int getVertices(){
        return verticesSize;
    }
}
