
package datos;

/**
 *
 * @author jesus
 */
public class DUsuarios {
    
    int id_usuarios;
    String nombre;
    String usuario;
    String clave;
    String perfil;
    
    public DUsuarios(){
        
    }
    
    public DUsuarios(int id_usuarios, String nombre, String usuario, String clave, String perfil){
        this.id_usuarios = id_usuarios;
        this.nombre = nombre;
        this.usuario = usuario;
        this.clave = clave;
        this.perfil = perfil;
    }

    public int getId_usuarios() {
        return id_usuarios;
    }

    public void setId_usuarios(int id_usuarios) {
        this.id_usuarios = id_usuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
