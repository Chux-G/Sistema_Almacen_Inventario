package logica;

import datos.DUsuarios;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jesus
 */
public class LUsuarios {
    
    Connection cn = LConexion.getConnection();
    
    public DefaultTableModel mostrarUsuarios(DUsuarios misUsuarios){
        DefaultTableModel miModelo = null;
        try{
            String titulos [] = {"Id","Nombre","Usuario","Clave","Perfil"};
            String dts [] = new String[5];
            miModelo = new DefaultTableModel(null, titulos);
            CallableStatement cst = cn.prepareCall("{call sp_mostrarbuscar_usuarios(?)}");
            cst.setString(1, misUsuarios.getUsuario());
            ResultSet rs = cst.executeQuery();
            while(rs.next()){
                dts[0] = rs.getString("id_usuarios");
                dts[1] = rs.getString("nombre");
                dts[2] = rs.getString("usuario");
                dts[3] = rs.getString("clave");
                dts[4] = rs.getString("perfil");
                miModelo.addRow(dts);
                
            }
        }catch(Exception ex){
            
        }
        return miModelo;
    }
    
    public String insertarUsuarios(DUsuarios misUsuarios){
        String msg = null;
        try{
            CallableStatement cst = cn.prepareCall("{call sp_insertar_usuarios(?,?,?,?)}");
            cst.setString(1, misUsuarios.getNombre());
            cst.setString(2, misUsuarios.getUsuario());
            cst.setString(3, misUsuarios.getClave());
            cst.setString(4, misUsuarios.getPerfil());
            cst.executeUpdate();
            msg = "si";
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        return msg;
    }
    
    public String editarUsuarios(DUsuarios misUsuarios){
        String msg = null;
        try{
            CallableStatement cst = cn.prepareCall("{call sp_editar_usuarios(?,?,?,?,?)}");
            cst.setInt(1, misUsuarios.getId_usuarios());
            cst.setString(2, misUsuarios.getNombre());
            cst.setString(3, misUsuarios.getUsuario());
            cst.setString(4, misUsuarios.getClave());
            cst.setString(5, misUsuarios.getPerfil());
            cst.executeUpdate();
            msg = "si";
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        return msg;
    }
    
    public String eliminarUsuarios(DUsuarios misUsuarios){
        String msg = null;
        try{
            CallableStatement cst = cn.prepareCall("{call sp_eliminar_usuarios(?)}");
            cst.setInt(1, misUsuarios.getId_usuarios());
            cst.executeUpdate();
            msg = "si";
        }catch(Exception ex){
            ex.printStackTrace();
            msg = "no";
        }
        return msg;
    }
}

