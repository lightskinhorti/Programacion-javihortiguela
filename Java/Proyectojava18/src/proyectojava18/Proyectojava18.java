
package proyectojava18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Proyectojava18 {

    public static void main(String[] args) {
  try{
             Class.forName("com.mysql.cj.jdbc.Driver"); 
               //Ahora establezco la conexion
                     Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cursojava","cursojava","cursojava");
               //Preparo una peticion a la base de datos
                Statement peticion = conexion.createStatement();
               ResultSet resultado = peticion.executeQuery("SELECT * FROM agenda");
               while(resultado.next()){
                   System.out.println(resultado.getInt(1)+"-"+resultado.getInt(2)+"-"+resultado.getInt(3));
               }
        }catch(Exception e){
            e.printStackTrace();
    }
    }
}
