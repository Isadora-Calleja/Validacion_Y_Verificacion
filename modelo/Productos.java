
package modelo;

import java.sql.Date;

public class Productos {
         int Codigo;
   int Id_usuario;
    String Descripcion;
       Date Fecha;
       String Nombre;
          int Precio_A;
   int precio_V;
    int Cantidad;

public Productos() {

}

    public Productos(int Codigo, int Id_usuario, String Descripcion, Date Fecha, String Nombre, int Precio_A, int precio_V, int Cantidad) {
        this.Codigo = Codigo;
        this.Id_usuario = Id_usuario;
        this.Descripcion = Descripcion;
        this.Fecha = Fecha;
        this.Nombre = Nombre;
        this.Precio_A = Precio_A;
        this.precio_V = precio_V;
        this.Cantidad = Cantidad;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getId_usuario() {
        return Id_usuario;
    }

    public void setId_usuario(int Id_usuario) {
        this.Id_usuario = Id_usuario;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPrecio_A() {
        return Precio_A;
    }

    public void setPrecio_A(int Precio_A) {
        this.Precio_A = Precio_A;
    }

    public int getPrecio_V() {
        return precio_V;
    }

    public void setPrecio_V(int precio_V) {
        this.precio_V = precio_V;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

}
