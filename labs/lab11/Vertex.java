public class Vertex<V>  {
    private V element;

    public Vertex(V element) {
        this.element = element;
    }

    public V getElement() {
        return element;
    }

    public String toString() {
        return element.toString();
    }

    public boolean equals(Vertex<V> other) {
        return element.equals(other.getElement());
    }
}
