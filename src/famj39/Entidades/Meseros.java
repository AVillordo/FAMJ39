
package famj39.Entidades;


public class Meseros {
       private int idMesero;
    private String nombreMesero;
    private Reservas reserva;
    private Pedidos pedido;
    private boolean estado;

    public Meseros() {
    }

    public Meseros(String nombreMesero, Reservas reserva, Pedidos pedido, boolean estado) {
        this.nombreMesero = nombreMesero;
        this.reserva = reserva;
        this.pedido = pedido;
        this.estado = estado;
    }

    public Meseros(int idMesero, String nombreMesero, Reservas reserva, Pedidos pedido, boolean estado) {
        this.idMesero = idMesero;
        this.nombreMesero = nombreMesero;
        this.reserva = reserva;
        this.pedido = pedido;
        this.estado = estado;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public String getNombreMesero() {
        return nombreMesero;
    }

    public void setNombreMesero(String nombreMesero) {
        this.nombreMesero = nombreMesero;
    }

    public Reservas getReserva() {
        return reserva;
    }

    public void setReserva(Reservas reserva) {
        this.reserva = reserva;
    }

    public Pedidos getPedido() {
        return pedido;
    }

    public void setPedido(Pedidos pedido) {
        this.pedido = pedido;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
      @Override
    public String toString() {
        return "Meseros{" + "idMesero=" + idMesero + ", nombreMesero=" + nombreMesero + ", reserva=" + reserva + ", pedido=" + pedido + ", estado=" + estado + '}';
    }
}
