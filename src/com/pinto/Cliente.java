package com.pinto;

public class Cliente {
    private String nif;
    private String nombre;
    private String ciudad;
    private String Direccion;
    private int Telefono;

    public Cliente(String nif, String nombre, String ciudad, String direccion, int telefono) {
        this.setNif(nif);
        this.setNombre(nombre);
        this.setCiudad(ciudad);
        setDireccion(direccion);
        setTelefono(telefono);
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", Telefono=" + Telefono +
                '}';
    }
}
