
package famj39.Entidades;


public class Pedidos {
    private int idPedido;
    private Meseros mesero;
    private Mesas mesa;
    private Productos producto;
    private boolean estado;

    public Pedidos() {
    }

    public Pedidos(Meseros mesero, Mesas mesa, Productos producto, boolean estado) {
        this.mesero = mesero;
        this.mesa = mesa;
        this.producto = producto;
        this.estado = estado;
    }

    public Pedidos(int idPedido, Meseros mesero, Mesas mesa, Productos producto, boolean estado) {
        this.idPedido = idPedido;
        this.mesero = mesero;
        this.mesa = mesa;
        this.producto = producto;
        this.estado = estado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Meseros getMesero() {
        return mesero;
    }

    public void setMesero(Meseros mesero) {
        this.mesero = mesero;
    }

    public Mesas getMesa() {
        return mesa;
    }

    public void setMesa(Mesas mesa) {
        this.mesa = mesa;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "idPedido=" + idPedido + ", mesero=" + mesero + ", mesa=" + mesa + ", producto=" + producto + ", estado=" + estado + '}';
    }
    
    
}
