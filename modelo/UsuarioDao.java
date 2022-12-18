
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDao {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
            ResultSet rs;
            Conexion acceso=new Conexion();
            Usuario em=new Usuario();

          public Usuario listarIdempleado(int Id_usuario){
             String sql="select *from Usuario where Id_usuario=?";
try{
con=acceso.Conectar();
 ps=con.prepareStatement(sql);
 ps.setInt(1,Id_usuario);
rs=ps.executeQuery();

while (rs.next()){
em.setId_usuario(rs.getInt(1));
em.setNombre(rs.getString(2));
em.setApellido_p(rs.getString(3));
em.setApellido_m(rs.getString(4));
em.setContraseña(rs.getString(5));              
}  
}catch (Exception e){
}
return em;
} 
}
