package Genericidad1;
//defino la clase Chocolatina
public class Chocolatina {

    private  String marca;//atributo donde se almacena la marca de la chocolate

    ///constructor que recibir la marca de la chocolatina
    public Chocolatina (String marca){
        this.marca = marca; //Se usa "this" para diferenciar el atributo del parámetro
    }
    
    public String getMarca() {  // /metodo para obtener la marca
        return marca;
    }
    public void setMarca(String marca){ //ste para modificar la marca
        this.marca = marca;
    }
    @Override
    public boolean equals(Object obj) {   //Método equals  Sirve para comparar si dos objetos Chocolatina son iguales
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false; // getclass para obtener la clase en tiempo de ejecución de un objeto
        Chocolatina that = (Chocolatina) obj;   //Se convierte obj a Chocolatina, ya que sabemos que son del mismo tipo tras la validación anterior
        return marca.equals(that.marca);   // Compara las marcas de ambas chocolatinas
    }

    @Override
    public String toString() {  //Devuelve una representación en texto del objeto Chocolatina

        return "Chocolatina{" + "marca='" + marca + "'}";
    }
}


