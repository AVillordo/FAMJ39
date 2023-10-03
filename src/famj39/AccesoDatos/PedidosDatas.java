
package famj39.AccesoDatos;


import famj39.Entidades.Mesas;
import famj39.Entidades.Meseros;
import famj39.Entidades.Pedidos;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class PedidosDatas {
    private Connection con = null;
    private MesasDatas md = new MesasDatas();
    private MeserosDatas msro = new MeserosDatas();
    private ProductosDatas produdata = new ProductosDatas();

    public PedidosDatas() {
        con = Conexion.getConexion();
    }
    
    private void crearPedido(Pedidos pedido){
    String sql="INSERT INTO `pedido`(`idMesero`, `numeroMesa`, `productos`, `estado`)"
            + " VALUES (?,?,?,?)";
    
        try {
           
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
          
            
            ps.setInt(1, pedido.getMesero().getIdMesero());
            ps.setInt(2, pedido.getMesa().getNroMesa());
            ps.setInt(3, pedido.getProducto().getCodigo());
            ps.setBoolean(4, pedido.isEstado());
            ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
            pedido.setIdPedido(rs.getInt(1));
            JOptionPane.showMessageDialog(null, " Su Pedido fue Creado");
            }
            
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PedidosDatas.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
    
    
}
