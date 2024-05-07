
package tienda_de_animales;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    Connection con;
    String url = "jdbc:mysql://localhost:3306/tienda_de_animales_1";
    String user = "root";
    String password = "";
    
    public Conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);
            System.out.println("Coenctado a la base de datos");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
    
    public Connection getConexion(){
        return con;
    }
}
