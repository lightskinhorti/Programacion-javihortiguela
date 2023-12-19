
package proyectojava21;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;


public class Proyectojava21 {

 
    public static void main(String[] args) {
        try{
             Class.forName("com.mysql.jdbc.Driver"); 
               //Ahora establezco la conexion
                     Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cursojava","cursojava","cursojava");
               //Preparo una peticion a la base de datos
                Statement peticion = conexion.createStatement();
               ResultSet resultado = peticion.executeQuery("SELECT * FROM cursos");
               int numero = 1;
               while(resultado.next()){
                   System.out.println(resultado.getString(3));
                   //////////////////////////////////////////
                   
        int altura = 400;                                                       //Altura que tendra la imagen
        int anchura = 800;                                                      //Anchura que tiene la imagen    
        
                                                  //Recurso vacio por si mas adelante nos interesa
        
        BufferedImage imagencacheada = new BufferedImage(anchura,altura,BufferedImage.TYPE_INT_RGB); //Creo una imagen con su altura su anchura y el tipo de color
        
        Graphics2D graficos = imagencacheada.createGraphics();                  //Digo que dentro de esa imagen, voy a pintar cosas
        //En este trozo puedes pintar//
        graficos.setColor(Color.white);                                         //Digo que voy a pintar con el color blanco
        graficos.fillRect(0, 0, anchura, altura);   
        
       
        
        
        BufferedImage imagen = null;
        imagen = ImageIO.read(new File("Logos/"+resultado.getString(7)));
        graficos.drawImage(imagen,0,0,400,400, null);
        
        BufferedImage imagen2 = null;
        imagen2 = ImageIO.read(new File("fotos/"+String.format("%05d", numero)+".png"));
       
        graficos.drawImage(imagen2,400,0,400,400, null);
      
        graficos.setColor(Color.white);                                           //Digo que voy a pintar con el color rojo
        graficos.fillRect(390, 0, 20, 400);                                    //Pinto un rectangulo
        Color negrotransparente = new Color(0, 0, 0, 127); 
        graficos.setColor(negrotransparente);                                           //Digo que voy a pintar con el color rojo
        graficos.fillRect(0, 370, anchura, 400);
        
        graficos.setColor(Color.white);
        graficos.drawString(resultado.getString(3),10,395);
        graficos.setFont(new Font("Arial", Font.PLAIN, 28));
        
        
        //En este trozo puedes pintar//
        graficos.dispose();                                                     //Libero el recurso
       
        File archivo = new File("guardados/"+String.format("%05d", numero)+""+resultado.getString(2)+".png");                           //Apunto a un nuevo archivo
        
        ImageIO.write(imagencacheada, "png",archivo);                           //Con la libreria correspondiente, guardo el png en ese archivo
       
               numero++;     
                   /////////////////////////////////////////
               }
        }catch(Exception e){
            e.printStackTrace();
    }
    }
    
}
