
package famj39.Entidades;


public class Mesas {
     private int nroMesa;
    private int capacidad;
    private Pedidos pedido;
    private boolean estado;

    public Mesas() {
    }

    public Mesas(int capacidad, Pedidos pedido, boolean estado) {
        this.capacidad = capacidad;
        this.pedido = pedido;
        this.estado = estado;
    }

    public Mesas(int nroMesa, int capacidad, Pedidos pedido, boolean estado) {
        this.nroMesa = nroMesa;
        this.capacidad = capacidad;
        this.pedido = pedido;
        this.estado = estado;
    }

    public int getNroMesa() {
        return nroMesa;
    }

    public void setNroMesa(int nroMesa) {
        this.nroMesa = nroMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
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
        return "Mesas{" + "nroMesa=" + nroMesa + ", capacidad=" + capacidad + ", pedido=" + pedido + ", estado=" + estado + '}';
    }
    
    
}
