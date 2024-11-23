import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Util {

    /**
     * Calculates the great-circle distance between two points on the Earth using the Haversine formula.
     * The inputs are the latitude and longitude of both points in degrees, and the result is the distance
     * between the points in kilometers.
     *
     * @param lat1 the latitude of the first point in degrees
     * @param lon1 the longitude of the first point in degrees
     * @param lat2 the latitude of the second point in degrees
     * @param lon2 the longitude of the second point in degrees
     * @return the distance between the two points in kilometers
     */
    public static double getDistance(double lat1, double lon1, double lat2, double lon2) {
        // Radius of the Earth in kilometers
        final int R = 6371;

        // Convert degrees to radians
        double lat1Rad = Math.toRadians(lat1);
        double lon1Rad = Math.toRadians(lon1);
        double lat2Rad = Math.toRadians(lat2);
        double lon2Rad = Math.toRadians(lon2);

        // Differences in coordinates
        double dlat = lat2Rad - lat1Rad;
        double dlon = lon2Rad - lon1Rad;

        // Haversine formula
        double a = Math.pow(Math.sin(dlat / 2), 2) + Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.pow(Math.sin(dlon / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        // Calculate the distance
        return R * c;
    }

    public static void printGraph(Graph g) {
        StringBuilder sb = new StringBuilder();
        sb.append("Graph:\n");

        Iterator<Vertex> itr = g.vertices().iterator();
        while (itr.hasNext()) {
            Vertex v = itr.next();
            Iterable<Edge> edges = g.outgoingEdges(v);

            sb.append(v)
                .append(" -> ");

            if (!edges.iterator().hasNext()) {
                sb.append("No edges");
            } else {
                List<String> destinations = new ArrayList<>();
                for (Edge edge : edges) {
                    destinations.add(edge.getDest().toString() + ":" + edge.getWeight());
                }
                sb.append(String.join(", ", destinations));
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }


    /**
     * Computes the shortest path from the source vertex to the destination vertex using Dijkstra's algorithm.
     * The method returns the distance in kms 
     *
     * @param src the starting state (by full name as in the CSV) for the shortest path
     * @param dst the target state (by full name as in the CSV) for the shortest path
     * @return distance of shortest path from src to dst in kms
     */
    public static double dijkstra(Graph g, String src, String dst) {
        return -1; 
    }

    //helper class to represent a Vertex in the priority queue
    private static class Node implements Comparable {
        public double dist;
        public Vertex vertex;

        public Node(double dist, Vertex v) {
            this.dist = dist;
            this.vertex = v;
        }

        public int compareTo(Object o) {
            Node other = (Node) o;
            if (dist < other.dist) return -1;

            if (dist == other.dist) return 0;

            return 1;
        }
    }
}
