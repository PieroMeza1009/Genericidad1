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
    
    public double getPeso() { //para obtener el peso
        return this.peso;
    }
    
    public void setPeso(double peso) { //para modificar el peso
        this.peso = peso;    
    }
    @Override
    /// Método "equals()" para comparar si dos objetos de tipo "Golosina" son iguales
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;  //Si es null o de otra clase, retorna fals
        Golosina golosina = (Golosina) obj;  //se convierte de obj a golosina
        return Double.compare(golosina.peso, peso) == 0 &&    // Compara el nombre y el peso de ambas golosinas
               nombre.equals(golosina.nombre);
    }

    @Override
    public String toString() {
        return "Golosina{" + "nombre='" + nombre + "', peso=" + peso + '}';   // Devuelve una cadena con el nombre y peso de la golosina en formato legible
    }

}