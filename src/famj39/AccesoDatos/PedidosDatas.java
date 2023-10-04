
package famj39.AccesoDatos;


import famj39.Entidades.Mesas;
import famj39.Entidades.Meseros;
import famj39.Entidades.Pedidos;
import famj39.Entidades.Productos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
    public List<Pedidos> listarPedidosxMesa(Mesas mesas) {
        ArrayList<Pedidos> listaDePedidos = new ArrayList<>();

        String sql = "SELECT `idPedido`, `idMesero`, `codigoProd`,  `estado`"
                + " FROM `pedido`"
                + " WHERE `numeroMesa`= ?";
        try {
            
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1,mesas.getNroMesa());
            ResultSet rs= ps.executeQuery();
            
            while(rs.next()){
            Pedidos pedido= new Pedidos();
            Meseros mesero= new Meseros();
            Productos producto= new Productos();
            
            pedido.setIdPedido(rs.getInt("idPedido"));
            mesero.setIdMesero(rs.getInt("idMesero"));
            producto.setCodigo(rs.getInt("codigoProd"));
            pedido.isEstado();
            pedido.setMesero(mesero);
            pedido.setProducto(producto);
            }
           listaDePedidos.add(producto);
            rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(PedidosDatas.class.getName()).log(Level.SEVERE, null, ex);
        }
        


        
        
        
    return null;
    }
    
    
    }
    
    

