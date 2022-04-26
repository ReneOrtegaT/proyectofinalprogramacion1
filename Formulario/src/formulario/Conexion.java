
package formulario;

import java.sql.*;

public class Conexion {
    
    public static Connection getConnection(){
    
    Connection con =null; //declarando inicializando la variable de tipo conexion.
    
       try{
           //class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost/Registro","root", "123456");
           System.out.println("conexion exitosa");
       } catch (SQLException ex){
           System.out.println(ex.getMessage());
       }
       
       return con;
    }
    
    
    
}
