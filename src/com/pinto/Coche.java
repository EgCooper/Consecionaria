package com.pinto;

public class Coche {
    private String Matricula;
    private String color;
    private String modelo;
    private double Precio;
    private String marca;
    private String codigo;
    private Cliente cliente;

    public Coche(String matricula, String color, String modelo, double precio, String marca, String codigo, Cliente cliente) {
        setMatricula(matricula);
        this.setColor(color);
        this.setModelo(modelo);
        setPrecio(precio);
        this.setMarca(marca);
        this.setCodigo(codigo);
        this.setCliente(cliente);
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "Matricula='" + Matricula + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", Precio=" + Precio +
                ", marca='" + marca + '\'' +
                ", codigo='" + codigo + '\'' +
                ", cliente=" + cliente +
                '}';
    }
}
