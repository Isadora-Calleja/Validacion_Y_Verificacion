package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Usuario1 {
    PreparedStatement ps;
            ResultSet rs;
            Conexion con=new Conexion();
            Connection acceso;
            public Usuario ValidarUsua(String nombre,String contraseña){
                Usuario us=new Usuario();
    String sql="SELECT *FROM usuario WHERE nombre=? AND contraseña=?";
       try{
acceso=con.Conectar();
ps=acceso.prepareStatement(sql);
ps.setString(1,nombre);
ps.setString(2,contraseña);
rs=ps.executeQuery();
while (rs.next()){
us.setId_usuario(rs.getInt(1));
us.setNombre(rs.getString(2));
us.setApellido_p(rs.getString(3));
us.setApellido_p(rs.getString(4));
us.setContraseña(rs.getString(5));
}
} catch (Exception e){
}


return us;
}
}