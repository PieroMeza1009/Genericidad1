package Genericidad1;

import java.util.ArrayList;
import java.util.Iterator;


class Cajoneria<T> implements Iterable<T> {
    private ArrayList<T> lista = new ArrayList<T>();
    private ArrayList<String> colores = new ArrayList<>(); // lsta para almacenar los colores de las cajas
    private int tope; // limite de elementos que puede contener la cajoneris

    public Cajoneria(int tope) {
        this.tope = tope;
    }

   // meodo para agregar un objeto a la cajoneria con su color
    public void add(T objeto, String color) { 
        if (lista.size() >= tope) {
            throw new RuntimeException("No caben más");
        } else {
            lista.add(objeto);
            colores.add(color); // Agregamos el color a la lista de colores
        }
    }

    public int search(T objeto) {
        int index = lista.indexOf(objeto);
        return index;
    }
    
    // Método para eliminar un elemento de la cajoneria
    public T delete(T objeto) {
        int index = lista.indexOf(objeto);
        if (index != -1) {
            colores.remove(index);
            return lista.remove(index);
        }
        return null;
    }


    // Método toString para mostrar la información de la cajoneria
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Posicion\tColor Caja\tObjeto\n");
        for (int i = 0; i < lista.size(); i++) {
            sb.append((i + 1) + "\t" + colores.get(i) + "\t" + lista.get(i).toString() + "\n");
        }
        return sb.toString();
    }
    
    // Método iterator para recorrer la cajoneria con un iterador
    public Iterator<T> iterator() {
        return lista.iterator();
    }
}