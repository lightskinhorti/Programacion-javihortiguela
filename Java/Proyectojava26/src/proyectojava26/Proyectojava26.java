
package proyectojava26;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Proyectojava26 {

 
    public static void main(String[] args) {
        // TODO code application logic here
           Pattern patron = Pattern.compile("\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}\\b",Pattern.CASE_INSENSITIVE);
        Matcher frase = patron.matcher("@jocarsa.com");
        
        boolean encontrado = frase.find();
        
        if(encontrado){
            System.out.println("Si que es un email");
        }else{
            System.out.println("No es un email");
        }
    }
    
}
