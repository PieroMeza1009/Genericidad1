package Genericidad1;

import java.util.ArrayList;
import java.util.Iterator;


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
    public T delete(T objeto) {
        int index = lista.indexOf(objeto);
        if (index != -1) {
            return lista.remove(index);
        }
        return null;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Caja) {
                Caja caja = (Caja) lista.get(i);
                sb.append("Posición: ").append(i)
                  .append(", Color: ").append(caja.getColor())
                  .append(", Contenido: ").append(caja.getContenido())
                  .append("\n");
            }
        }
        return sb.toString();
    }
    
    public Iterator<T> iterator() {
        return lista.iterator();
    }
}