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
        String[] v = {"Perez", "Sanchez", "Rodriguez"};
        Integer[] w = {12, 34, 56};

        System.out.println(exist(v, "Sanchez")); // true
        System.out.println(exist(w, 34)); // true
        System.out.println(exist(w, 100)); // false
    }
}

