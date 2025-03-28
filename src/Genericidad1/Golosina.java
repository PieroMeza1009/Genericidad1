package Genericidad1;

public class Golosina {
    private String nombre; //nombre de la golosina 
    private double peso; ///peso de la golsina
    
    //el contructor que inicializa los atributos nombre y peso 
    public Golosina(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }
    public String getNombre() { //metodo para obtener el nombre
        return this.nombre;
    }
    
    public void setNombre(String nombre) { //metodo para modificar el nombre 
        this.nombre = nombre;    
    }
    
    public double getPeso() {
        return this.peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;    
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Golosina golosina = (Golosina) obj;
        return Double.compare(golosina.peso, peso) == 0 &&
               nombre.equals(golosina.nombre);
    }

    @Override
    public String toString() {
        return "Golosina{" + "nombre='" + nombre + "', peso=" + peso + '}';
    }

}