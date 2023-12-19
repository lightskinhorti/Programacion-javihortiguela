
package proyectojava20;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Proyectojava20 {

 
    public static void main(String[] args) throws IOException {
        int altura = 400;                                                       //Altura que tendra la imagen
        int anchura = 800;                                                      //Anchura que tiene la imagen    
        
                                                  //Recurso vacio por si mas adelante nos interesa
        
        BufferedImage imagencacheada = new BufferedImage(anchura,altura,BufferedImage.TYPE_INT_RGB); //Creo una imagen con su altura su anchura y el tipo de color
        
        Graphics2D graficos = imagencacheada.createGraphics();                  //Digo que dentro de esa imagen, voy a pintar cosas
        //En este trozo puedes pintar//
        graficos.setColor(Color.white);                                         //Digo que voy a pintar con el color blanco
        graficos.fillRect(0, 0, anchura, altura);   
        
        graficos.setColor(Color.red);                                           //Digo que voy a pintar con el color rojo
        graficos.fillRect(20, 20, 300, 300);                                    //Pinto un rectangulo
        
        graficos.setColor(Color.green);
        graficos.drawString("Programa de Javier",300,200);
        
        BufferedImage imagen = null;
        imagen = ImageIO.read(new File("Logos/java-1.png"));
        graficos.drawImage(imagen,0,0,400,400, null);
        
        //En este trozo puedes pintar//
        graficos.dispose();                                                     //Libero el recurso
        for(int i=0;i<10;i++){
        File archivo = new File("guardados/primeraprueba"+i+".png");                           //Apunto a un nuevo archivo
        
        ImageIO.write(imagencacheada, "png",archivo);                           //Con la libreria correspondiente, guardo el png en ese archivo
        }
    }
    
}
