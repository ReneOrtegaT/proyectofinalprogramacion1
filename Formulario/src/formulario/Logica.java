
package formulario;


import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuari
 */
public class Logica {
    //este es el metodo DefaultTableModel
    public DefaultTableModel mostrarDatos(){
    String [] columnas = {"id","Usuario","nombre","apellido","telefono","correo","pasword"}; //se crea un arreglo con los nombres de las columnas
    String [] datos = new String[7];   //se crea otro arreglo donde se van a ir almacenando los registros con 7 posiciones en la columnas
    
    DefaultTableModel modelo = new DefaultTableModel(null,columnas);//aqui estoy instanciando de la clase DefaultTableModel.
    
    String consulta = "select * from registro"; //se crea variable con el codigo sql a ejecutar
    
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try{
        //establece la conexion y un codigo a ejecutar sql
        ps = Conexion.getConnection().prepareStatement(consulta); 
        rs = ps.executeQuery(); //aca se ejecuta todo el codigo y lo trae
        
        //se van iterando los valores que este encontrando en las posiciones por eso esta dentro de un bucle while
        while(rs.next()){
        datos[0] = rs.getString("id");
        datos[1] = rs.getString("Usuario");
        datos[2] = rs.getString("nombre");
        datos[3] = rs.getString("apellido");
        datos[4] = rs.getString("telefono");
        datos[5] = rs.getString("correo");
        datos[6] = rs.getString("pasword");
        modelo.addRow(datos);//luego de recorrer las posiciones se va a agregar en la variable modelo una nueva fila
        }
        
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al conectar");
        }
    
    return modelo;
    }
    
   
    
    
}// cierre clase logica
