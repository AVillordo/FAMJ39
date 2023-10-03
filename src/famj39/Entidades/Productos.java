/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package famj39.Entidades;


public class Productos {
    private int codigo;
    private String nombreProd;
    private int cantidad;
    private double precio;
    private boolean estado;

    public Productos() {
    }

    public Productos(String nombreProd, int cantidad, double precio, boolean estado) {
        this.nombreProd = nombreProd;
        this.cantidad = cantidad;
        this.precio = precio;
        this.estado = estado;
    }

    public Productos(int codigo, String nombreProd, int cantidad, double precio, boolean estado) {
        this.codigo = codigo;
        this.nombreProd = nombreProd;
        this.cantidad = cantidad;
        this.precio = precio;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Productos{" + "codigo=" + codigo + ", nombreProd=" + nombreProd + ", cantidad=" + cantidad + ", precio=" + precio + ", estado=" + estado + '}';
    }
    
    
}
