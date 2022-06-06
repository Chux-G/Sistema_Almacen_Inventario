
package logica;

import java.sql.Connection;
/**
 *
 * @author jesus
 */
public class LPrincipal {
    public static void main(String [] args){
        Connection cn = LConexion.getConnection();
    }
}
