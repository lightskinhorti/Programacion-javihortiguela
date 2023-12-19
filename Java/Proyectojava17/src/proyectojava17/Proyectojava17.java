
package proyectojava17;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class Proyectojava17 {


    public static void main(String[] args) {
     
        try{
             Class.forName("com.mysql.jdbc.Driver"); 
               //Ahora establezco la conexion
                     Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cursojava", "cursojava", "cursojava");
               //Preparo una peticion a la base de datos
                Statement peticion = conexion.createStatement();
               peticion.execute("INSERT INTO agenda VALUES (NULL,'Juan','1234','juan@correo.com')");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
