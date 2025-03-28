package Genericidad1;
//defino la clase Chocolatina
public class Chocolatina {

    private  String marca;//atributo donde se almacena la marca de la chocolate

    ///constructor que recibir la marca de la chocolatina
    public Chocolatina (String marca){
        this.marca = marca;
    }
    
    public String getMarca() {  // /metodo para obtener la marca
        return marca;
    }
    public void setMarca(String marca){ //ste para modificar la marca
        this.marca = marca;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Chocolatina that = (Chocolatina) obj;
        return marca.equals(that.marca);
    }

    @Override
    public String toString() {
        return "Chocolatina{" + "marca='" + marca + "'}";
    }
}


