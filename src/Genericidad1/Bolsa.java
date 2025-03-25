package Genericidad1;

import java.util.ArrayList;
import java.util.Iterator;
public class Bolsa < T > implements Iterable < T > {
    private ArrayList < T > lista = new ArrayList < T > ();
    private int tope;

    public Bolsa(int tope) {

        super();

        this.tope = tope;

    }
}

