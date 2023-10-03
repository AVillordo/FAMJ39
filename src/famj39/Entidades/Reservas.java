/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package famj39.Entidades;

import java.util.Date;

/**
 *
 * @author Conectar
 */
public class Reservas {
     private int idReserva;
    private String nombreClientes;
    private int dniCliente;
    private Date  fechaReserva;
    private Mesas mesa;
    private int hora;
    private boolean estado;

    public Reservas() {
    }

    public Reservas(String nombreClientes, int dniCliente, Date fechaReserva, Mesas mesa, int hora, boolean estado) {
        this.nombreClientes = nombreClientes;
        this.dniCliente = dniCliente;
        this.fechaReserva = fechaReserva;
        this.mesa = mesa;
        this.hora = hora;
        this.estado = estado;
    }

    public Reservas(int idReserva, String nombreClientes, int dniCliente, Date fechaReserva, Mesas mesa, int hora, boolean estado) {
        this.idReserva = idReserva;
        this.nombreClientes = nombreClientes;
        this.dniCliente = dniCliente;
        this.fechaReserva = fechaReserva;
        this.mesa = mesa;
        this.hora = hora;
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

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Mesas getMesa() {
        return mesa;
    }

    public void setMesa(Mesas mesa) {
        this.mesa = mesa;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reservas{" + "idReserva=" + idReserva + ", nombreClientes=" + nombreClientes + ", dniCliente=" + dniCliente + ", fechaReserva=" + fechaReserva + ", mesa=" + mesa + ", hora=" + hora + ", estado=" + estado + '}';
    }
    
    
    
}
