
package modelo;

public class Herramientas {
    int Id_herramientas;
    String nombre;
    String Descripcion;
    int Cantidad;

    public Herramientas() {
    }

    public int getId_herramientas() {
        return Id_herramientas;
    }

    public void setId_herramientas(int Id_herramientas) {
        this.Id_herramientas = Id_herramientas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }


    
}
