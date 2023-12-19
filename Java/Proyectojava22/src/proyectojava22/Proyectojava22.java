
package proyectojava22;

import java.awt.Graphics;                                                       
import java.awt.Graphics2D;                                                     
import java.awt.RenderingHints;                                                 
import javax.swing.JFrame;                                                      
import javax.swing.JPanel;

public class Proyectojava22 extends JPanel {

    Persona bolita = new Persona();
    float x = 200;                                                              //Defino una posicion inicial
    float y = 200;                                                              //Defino una Y inicial
    float direccion = 1;                                                        //Defino una direccion inicial
    @Override
    public void paint(Graphics g){                                              //Sobreescribo el metodo de pintura por defecto
        super.paint(g);                                                         //Pinto en la ventana principal
        Graphics2D graf2d = (Graphics2D) g;                                     //Creo un nuevo elemento de graficos 2d
        graf2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);        //Activo el suavizado de las lineas
        graf2d.fillOval((int)x, (int)y, 20, 20);                                //Dibujo un ovalo
    }
    public void mueveBola(){                                                    //Esta funcion mueve la bola
        double min = -0.5;                                                      //Establezco un minimo
        double max = 0.5;                                                       //Establezco un maximo
        double random = min + Math.random() * (max - min);                      //Creo un numero aleatorio entre el minimo y el maximo
        direccion += random;                                                    //Vario la direccion de forma aleatoria
        x += Math.cos(direccion);                                               //Aumento la x en base a la direccion y su coseno
        y += Math.sin(direccion);                                               //Aumento la y en base a la direccion y su seno
        if(x > 400){direccion += Math.PI;}                                      //En caso de que la direccion sea menor que 400, pega la vuelta
        if(x < 0){direccion += Math.PI;}                                        //Pega la vuelta al colisionar
        if(y > 400){direccion += Math.PI;}                                      //Pega la vuelta al colisionar
        if(y < 0){direccion += Math.PI;}                                        //Pega la vuelta al colisionar
    }
    public static void main(String[] args) throws InterruptedException {        //Esta es la funcion principal
        JFrame marco = new JFrame("animacion");                                 //Creo un marco de swing
        Proyectojava22 animacion = new Proyectojava22();                        //Creo una instancia del proyecto
        marco.add(animacion);                                                   //Al marco le añado el proyecto
        marco.setSize(400, 400);                                                //Especifico las dimensiones de la ventana
        marco.setVisible(true);                                                 //Quiero que la ventana sea visible
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                   //Instruccion para cerrar el proceso cuando cerramos la ventana
        
        while(true){                                                            //Entramos en el bucle infinito
            animacion.mueveBola();                                              //Mueve la bola 
            animacion.repaint();                                                //Repinta lo que hay en la pantalla
            Thread.sleep(10);                                                   //Para la ejecucion un cierto tiempo para que el bucle este en funcionamiento
        }
    } 
    
}
