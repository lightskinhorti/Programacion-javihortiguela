
package proyectojava12;


public class Proyectojava12 {

  
    public static void main(String[] args) {
        saluda("Jose vicente");
        saluda("Jose ");
      saluda("vicente");
             saluda();
           saluda("Julia","Lunes");


              
    }
    public static void saluda(String nombre){
          System.out.println("Hola "+nombre+" como estas?");
    }
     public static void saluda(){
          System.out.println("Hola como estas?");
     }
      public static void saluda(String nombre, String dia){
          System.out.println("Hola "+nombre+" como estas? Sabes que hoy es "+dia+"?");     
      }
    
}
