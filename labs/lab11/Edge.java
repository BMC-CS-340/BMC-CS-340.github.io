public class Edge {
    private double weight;
    private Vertex dest;

    public Edge(double weight, Vertex dest) {
        this.weight = weight;
        this.dest = dest;
    }

    public double getWeight() {
        return weight;
    }

    public Vertex getDest() {
        return dest;
    }

    public boolean equals(Object o) {
        Edge other = (Edge) o;
        return weight == other.getWeight() && dest.equals(other.getDest());
    }
}
