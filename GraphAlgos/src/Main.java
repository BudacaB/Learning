import java.util.*;

public class Main {

    // The graph
    static Map<String, ArrayList<String>> adjacencyList = new HashMap<>();

    public static void main(String[] args) {
        String[] airports = {"PHX", "BKK", "OKC", "JFK", "LAX", "MEX", "EZE", "HEL", "LOS", "LAP", "LIM"};

        String[][] routes = {
                {"PHX", "LAX"},
                {"PHX", "JFK"},
                {"JFK", "OKC"},
                {"JFK", "HEL"},
                {"JFK", "LOS"},
                {"MEX", "LAX"},
                {"MEX", "BKK"},
                {"MEX", "LIM"},
                {"MEX", "EZE"},
                {"LIM", "BKK"}
        };

        // Create the graph
        for (String airport : airports) {
            addNode(airport);
        }

        for (String[] route : routes) {
            addEdge(route[0], route[1]);
        }

        System.out.println(adjacencyList);

    }

    // Add node
    public static void addNode(String airport) {
        adjacencyList.put(airport, new ArrayList<>());
    }

    // Add edge, undirected
    public static void addEdge(String origin, String destination) {
        adjacencyList.get(origin).add(destination);
        adjacencyList.get(destination).add(origin);
    }
}