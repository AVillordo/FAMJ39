/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package famj39.Entidades;

import java.time.LocalDateTime;


public class Reservas {
    private int idReserva;
    private String nombreClientes;
    private int dniCliente;
    private LocalDateTime fechaReserva;
    private Mesas mesa;
    private boolean estado;

    public Reservas() {
    }

    public Reservas(String nombreClientes, int dniCliente, LocalDateTime fechaReserva, Mesas mesa, boolean estado) {
        this.nombreClientes = nombreClientes;
        this.dniCliente = dniCliente;
        this.fechaReserva = fechaReserva;
        this.mesa = mesa;
        this.estado = estado;
    }

    public Reservas(int idReserva, String nombreClientes, int dniCliente, LocalDateTime fechaReserva, Mesas mesa, boolean estado) {
        this.idReserva = idReserva;
        this.nombreClientes = nombreClientes;
        this.dniCliente = dniCliente;
        this.fechaReserva = fechaReserva;
        this.mesa = mesa;
       
        this.estado = estado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getNombreClientes() {
        return nombreClientes;
    }

    public void setNombreClientes(String nombreClientes) {
        this.nombreClientes = nombreClientes;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDateTime fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Mesas getMesa() {
        return mesa;
    }

    public void setMesa(Mesas mesa) {
        this.mesa = mesa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reservas" + "idReserva=" + idReserva + ", nombreClientes=" + nombreClientes + ", dniCliente=" + dniCliente + ", fechaReserva=" + fechaReserva + ", mesa=" + mesa +  "estado=" + estado;
    }
    
    
    
}
