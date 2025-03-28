package Genericidad1;

import java.util.ArrayList;

class Cajoneria<T> implements Iterable<T> {
    private ArrayList<T> lista = new ArrayList<T>();
    private int tope;

    public Cajoneria(int tope) {
        this.tope = tope;
    }


    public void add(T objeto) {
        if (lista.size() >= tope) {
            throw new RuntimeException("No caben más");
        } else {
            lista.add(objeto);
        }
    }
    public int search(T objeto) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(objeto)) {
                if (objeto instanceof Caja) {
                    return i;
                }
            }
        }
        return -1;
    }
}