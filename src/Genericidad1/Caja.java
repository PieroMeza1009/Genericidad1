package Genericidad1;

import java.util.ArrayList;
import java.util.Iterator;

// Clase Caja
public class Caja {
    private String color;
    private Object contenido;

    public Caja(String color) {
        this.color = color;
    }
        
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public Object getContenido() {
        return contenido;
    }
    
    public void setContenido(Object contenido) {
        this.contenido = contenido;
    }
}
