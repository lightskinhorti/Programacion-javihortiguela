
package proyectojava13;


public class Proyectojava13 {

   
    public static void main(String[] args) {
        Persona juan = new  Persona();
        Persona jorge = new Persona();
        System.out.println("El nombre ahora mismo de juan es: "+juan.nombre);
        juan.nombre = "juan";
        juan.edad = 35;
        jorge.nombre = "jorge";
        jorge.edad = 22;
        System.out.println("El nombre ahora mismo de juan es: "+juan.nombre);
        System.out.println("La edad ahora mismo de juan es: "+juan.edad);
        System.out.println("El nombre ahora mismo de jorge es: "+jorge.nombre);
        System.out.println("La edad ahora mismo de jorge es: "+jorge.edad);
        juan.saluda();
        jorge.saluda();
    }
    
}
