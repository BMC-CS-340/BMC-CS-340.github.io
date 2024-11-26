public interface Graph<V> {

    /** Returns the number of vertices of the graph. */
    int numVertices();


    /** Returns the vertices of the graph as an iterable collection. */
    Iterable<Vertex<V>> vertices();

    /**
     * Returns the edges incident to vertex v as an iterable collection.
     * For an undirected graph, this includes all edges connected to v.
     * For a directed graph, this includes only outgoing edges from v.
     */
    Iterable<Edge> outgoingEdges(Vertex<V> v);


    /** Inserts and returns a new vertex with the given element. */
    void insertVertex(V element);

    /** Inserts and returns a new edge between u and v with the given weight. Throws IllegalArgumentException if u and v are not in the graph */
    void insertEdge(Vertex<V> u, Vertex<V> v, double weight) throws IllegalArgumentException;

}
