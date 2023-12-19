
package proyectojava8;


public class Proyectojava8 {

  
    public static void main(String[] args) {
      String diadelasemana = "lunes";
      
        switch(diadelasemana){
            case "lunes":
                System.out.println("Hoy es el peor dia de la semana");break; 
            case "martes":
                System.out.println("Hoy es el segundo peor dia de la semana");break;
            case "miercoles":
                System.out.println("Parece que casi es la mitad");break;
            case "jueves":
                System.out.println("Ya casi es viernes");break;
            case "viernes":
                System.out.println("Hoy es el mejor dia de la semana");break;
            case "sabado":
                System.out.println("Parece mentira que manana sea ya lunes de nuevo");break;
            case "domingo":
                System.out.println("Hoy es el peor dia de la semana");break;
            default:
                System.out.println("Yo no se lo que has escrito, pero eso no es un dia");break;
           
                
        }
    }
    
}
