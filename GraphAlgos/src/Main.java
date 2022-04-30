import java.util.*;

public class Main {

    // The graph
    static Map<String, ArrayList<String>> adjacencyList = new HashMap<>();
    static int steps = 0;

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

//        bfs("PHX");
        dfs("PHX", null);
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

    // BFS breadth first search
    public static void bfs(String start) {

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>(List.of(start));

        while (queue.size() > 0) {
            String airport = queue.poll();
            ArrayList<String> destinations = adjacencyList.get(airport);

            for (String destination : destinations) {

                if (destination == "BKK") {
                    System.out.println("found it");
                }

                if (!visited.contains(destination)) {
                    visited.add(destination);
                    queue.add(destination);
                    System.out.println(destination);
                }
            }
        }
    }

    // DFS depth first search
    public static void dfs(String start, Set<String> v) {
        System.out.println(start);
        steps++;
        Set<String> visited = Objects.requireNonNullElseGet(v, HashSet::new);
        visited.add(start);

        ArrayList<String> destinations = adjacencyList.get(start);

        for (String destination : destinations) {
            if (destination == "BKK") {
                System.out.println("DFS found Bangkok in " + steps + " steps");
                return;
            }

            if (!visited.contains(destination)) {
                dfs(destination, visited);
            }
        }
    }
}

// Big O is O(V + E) -> Nodes + Edges -> O(n)