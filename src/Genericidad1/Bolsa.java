package Genericidad1;

import java.util.ArrayList;
import java.util.Iterator;
//Defino la clase generica Bolsa que implementa Iterable
public class Bolsa < T > implements Iterable < T > {
    private ArrayList < T > lista = new ArrayList < T > ();// Lista interna donde almacenamos los objetos
    private int tope; // aca esta el lmite de elementos que puede contener la bolsa

    // constructor que inicializa el tope de la bolsa
    public Bolsa(int tope) {    

        super();

        this.tope = tope;

    }
    // metodo para agregar un objeto a la bolsa
    public void add(T objeto) {

        //size es crucial para asegurarse de que no se agreguen más elementos, pues cuenta cuantos elementos hay en la lista
        if (lista.size() >= tope) { // si la bolsa ha alcanzado su límite
            throw new RuntimeException("No caben más"); //lanzamos una excepción
        } else {
            lista.add(objeto); // Agregamos el objeto a la lista
        }
    }   
    // metodo iterator para recorrer la bolsa con un iterador
    public Iterator <T> iterator(){
        return lista.iterator();
    }
}

