
package modelo;

import java.sql.Date;

public class Pacientes {
int Id_cliente; 
int Id_usuario;
String Domicilio;
String nombre;
String apellido_p;
String apellido_m;
String tratamiento;
int edad;
int costo;
int telefono;
int total;
Date fecha;

    public Pacientes() {
    }

    public Pacientes(int Id_cliente, int Id_usuario, String Domicilio, String nombre, String apellido_p, String apellido_m, String tratamiento, int edad, int costo, int telefono, int total, Date fecha) {
        this.Id_cliente = Id_cliente;
        this.Id_usuario = Id_usuario;
        this.Domicilio = Domicilio;
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.tratamiento = tratamiento;
        this.edad = edad;
        this.costo = costo;
        this.telefono = telefono;
        this.total = total;
        this.fecha = fecha;
    }

    public int getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(int Id_cliente) {
        this.Id_cliente = Id_cliente;
    }

    public int getId_usuario() {
        return Id_usuario;
    }

    public void setId_usuario(int Id_usuario) {
        this.Id_usuario = Id_usuario;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    public String getApellido_m() {
        return apellido_m;
    }

    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
