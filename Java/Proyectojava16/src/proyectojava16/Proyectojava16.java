
package proyectojava16;                                                         //IMPORTO LA LIBRERIA PARA ABRIR ARCHIVOS
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Proyectojava16 {
                                                                                  
                                        
   
    public static void main(String[] args) {
       
    
     try{                                                                       //Primero intenta hacer algo
         FileWriter miarchivo = new FileWriter("archivo.txt");                  //abre un archivo
         miarchivo.write("Hola que sepas que esto se ha escrito desde Java");   //escribo algo de contenido
         miarchivo.close();                                                     //Cierra los recursos despues de usarlos
     }catch(IOException e){                                                     //En caso de que el try falle
         e.printStackTrace();                                                   //Dime en que ha fallado
         
     }
     /////////////////////
     
     try{                                                                       //Primero intento hacer algo
     File miotroarchivo = new File("archivo2.txt");                              //Luego abro un archivo     
      Scanner lector = new Scanner(miotroarchivo);                              //Leo el contenido del archivo
        while(lector.hasNextLine()){                                            //Mientras que el archivo tenga lineas de texto
            System.out.println(lector.nextLine());                              //Imprimeme la linea actual en la pantalla
        }
     }catch(IOException e){                                                     //En el caso que de error de lectura
         e.printStackTrace();                                                   //Dime en que consiste el error
     }
    }

    }
