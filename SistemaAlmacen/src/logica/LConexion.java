
package logica;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author jesus
 */
public class LConexion {
    
    static Connection conn = null;
    
    public static Connection getConnection(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_almacen","root","database10");
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return conn;
    }
}
