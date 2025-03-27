package Genericidad1;

public class DemoMetodoGenerico {
    static <T extends Comparable<T>> boolean igualArrays (T[] x, T[] y){
        
        if (x.length != y.length)
            return false;
      
        for (int i = 0; i < x.length; i++)     
            if(!x[i].equals(y[i]))
                return false;
        return true; 
    }


       

    


}
