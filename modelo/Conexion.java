
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class Conexion {
    Connection con;
  String URL = "jdbc:mysql://localhost/consultorio?useTimezone=tru&serverTimezone=UTC";
 String USERNAME = "root";
 String PASSWORD = "";
  public Connection Conectar() {
       

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =DriverManager.getConnection(URL, USERNAME, PASSWORD);
           // JOptionPane.showMessageDialog(null, "Conexion existosa");

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;  
} 
}

