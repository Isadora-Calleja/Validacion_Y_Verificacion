/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Isad
 */
public class ProductosDao {
     Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
            ResultSet rs;
    Conexion acceso=new Conexion();
    Productos p=new Productos();
public Productos listarID(int Codigo){

String sql="select *from Medicamentos where Codigo=?";
try{
con=acceso.Conectar();
 ps=con.prepareStatement(sql);
 ps.setInt(1,Codigo);
rs=ps.executeQuery();

while (rs.next()){
p.setCodigo(rs.getInt(1));
p.setId_usuario(rs.getInt(2));
p.setDescripcion(rs.getString(3));
p.setFecha(rs.getDate(4));
p.setNombre(rs.getString(5));
p.setPrecio_A(rs.getInt(6));
p.setPrecio_V(rs.getInt(7));
p.setCantidad(rs.getInt(8));               
}  
}catch (Exception e){
}
return p;
}
}
