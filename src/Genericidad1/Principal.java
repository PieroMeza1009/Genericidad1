package Genericidad1;

///clase principal donde vamos a probar la clase Bolsa
public class Principal {
    
    public static void main(String[] args) {
    
        //aca creamos una bolsa de chocolates con tope de 3
        Bolsa < Chocolatina > bolsaCho = new Bolsa <Chocolatina> (3);
    
        ///creeamos varias chocolatinas
        Chocolatina c = new Chocolatina("milky");
    
        Chocolatina c1 = new Chocolatina("milka");
    
        Chocolatina c2 = new Chocolatina("ferrero"); 
        
        ///aca vamos a agregar las chocolatinas a la bolsa
        bolsaCho.add(c);

        bolsaCho.add(c1);

        bolsaCho.add(c2);

        //uso un for para que recorra todo lo de la bolsa y lo imprima
        for (Chocolatina chocolatina: bolsaCho) {
            System.out.println(chocolatina.getMarca());

        }

    }
}