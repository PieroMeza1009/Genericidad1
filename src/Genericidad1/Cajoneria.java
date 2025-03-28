package Genericidad1;

class Cajoneria<T> implements Iterable<T> {
    private ArrayList<T> lista = new ArrayList<T>();
    private int tope;

    public Cajoneria(int tope) {
        this.tope = tope;
    }
}