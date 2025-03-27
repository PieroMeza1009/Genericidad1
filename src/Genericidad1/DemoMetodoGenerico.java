package Genericidad1;

//esta es una que contiene un metodo generico para comparar los arrays
public class DemoMetodoGenerico {
    static <T extends Comparable<T>> boolean igualArrays (T[] x, T[] y){// este es un metodo para comprobar que los array son del mismo tipo
        
        if (x.length != y.length) //if para que si son de diferentes tamaños, signific que no son iguales
            return false;
      
        for (int i = 0; i < x.length; i++)    //aca recorremos los arrays mientras comparamos sus elementod  
            
            if(!x[i].equals(y[i])) //y si algun elemento en distinto entonces los arrays no son iguales
                return false;

        return true; //si se llega hasta aqui siginifica que los arrays son iguales
    }
    public static void main(String[] args) {
        //aca definimos varios arryas de tipo integer

        Integer nums[]={1,2,3,4,5};  //los arrays se definen con Integer en lugar de int y permite que seacompatible con T extends Comparable<T>
        Integer nums2[]={1,2,3,4,5};
        Integer nums3[]={1,2,7,4,5};
        Integer nums4[]={1,2,7,4,5,6};

        //comparamos los arrays y mostramos los resultados 
        if (igualArrays(nums,nums))
            System.out.println("nums es igual a nums"); //aca siempre sera true pues se compara consigo mismo 
        if (igualArrays(nums,nums2))
            System.out.println("nums es igual a nums2"); //aca comparamos dos iguales   
        if (igualArrays(nums,nums3))
            System.out.println("nums es igual a num3"); //al menos un valor es distinto
        if (igualArrays(nums,nums4))
            System.out.println("nums es igual a nums4");//aca comparamos los de diferente longitud
        
        //Double dvals[]={1.1,2.2,3.3,4.4,5.5}; //B
        //if(igualArrays(nums,dvals)) //C
        //    System.out.println("nums es igual a dvals"); //D
        }
}

