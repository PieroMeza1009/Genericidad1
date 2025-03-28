package Genericidad1;

public class TestGen {
    public static <T> boolean exist(T[] array, T elemento) {
        for (T item : array) {
            if (item.equals(elemento)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // Prueba con Golosinas
        Cajoneria<Golosina> cajoneriaGolosinas = new Cajoneria<>(5);
        cajoneriaGolosinas.add(new Golosina("Caramelo", 10.5), "rojo");
        cajoneriaGolosinas.add(new Golosina("Chocolate", 15.0), "verde");
        cajoneriaGolosinas.add(new Golosina("Goma", 5.5), "azul");
        cajoneriaGolosinas.add(new Golosina("Chicle", 8.0), "amarillo");
        cajoneriaGolosinas.add(new Golosina("Turrón", 12.3), "morado");
        
        System.out.println("Cajoneria de Golosinas:");
        System.out.println(cajoneriaGolosinas);
}
}

