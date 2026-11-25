import java.util.*;

public class BFSExample {
    public static List<String> bfs(Map<String, List<String>> graph, String start) {
        List<String> traversalOrder = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        visited.add(start);
        queue.offer(start);

        while (!queue.isEmpty()) {
            String node = queue.poll();
            traversalOrder.add(node);
            for (String neighbor : graph.getOrDefault(node, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
        return traversalOrder;
    }
}

public static void main(String[] args) {
    Map<String, List<String>> SampleGraph = new HashMap<>();
    SampleGraph.put("A", Arrays.asList("B", "C"));
    SampleGraph.put("B", Arrays.asList("A", "D", "E"));
    SampleGraph.put("C", Arrays.asList("A", "F"));
    SampleGraph.put("D", Collections.singletonList("B"));
    SampleGraph.put("E", Collections.singletonList("B"));
    SampleGraph.put("F", Collections.singletonList("C"));
    List<String> result = BFSExample.bfs(SampleGraph, "A");
    System.out.println(result);
}
