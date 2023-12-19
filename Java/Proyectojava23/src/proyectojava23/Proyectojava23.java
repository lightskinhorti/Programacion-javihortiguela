
package proyectojava23;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Proyectojava23 extends JPanel{

    int numerobolas = 530;
    int anchura = 1920;
    int altura = 1080;
    
    Persona bolita[] = new Persona[numerobolas];
        
    public void inicio(){
        for(int i = 0;i<numerobolas;i++){
            bolita[i] = new Persona();
            
        }
    }
                                                          //Defino una direccion inicial
    @Override
    public void paint(Graphics g){                                              //Sobreescribo el metodo de pintura por defecto
        super.paint(g);                                                         //Pinto en la ventana principal
        Graphics2D graf2d = (Graphics2D) g;                                     //Creo un nuevo elemento de graficos 2d
        //graf2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);        //Activo el suavizado de las lineas
        for(int i = 0;i<numerobolas;i++){
            graf2d.fillOval((int)bolita[i].x, (int)bolita[i].y, 20, 20);                                //Dibujo un ovalo
           
    }
    }
    public void muevete(){
        for(int i = 0;i<numerobolas;i++){
         bolita[i].mueveBola();
        }
    } 
    public static void main(String[] args) throws InterruptedException {        //Esta es la funcion principal
        JFrame marco = new JFrame("animacion");                                 //Creo un marco de swing
        Proyectojava23 animacion = new Proyectojava23();                        //Creo una instancia del proyecto
        marco.add(animacion);                                                   //Al marco le añado el proyecto
        marco.setSize(1920, 1080);                                                //Especifico las dimensiones de la ventana
        marco.setVisible(true);                                                 //Quiero que la ventana sea visible
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                   //Instruccion para cerrar el proceso cuando cerramos la ventana
        animacion.inicio();
        while(true){                                                            //Entramos en el bucle infinito
            animacion.muevete();                                              //Mueve la bola 
            animacion.repaint();                                                //Repinta lo que hay en la pantalla
            Thread.sleep(10);                                                   //Para la ejecucion un cierto tiempo para que el bucle este en funcionamiento
        }
    } 
    
}

