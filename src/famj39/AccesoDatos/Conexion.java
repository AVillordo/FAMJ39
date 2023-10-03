/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package famj39.AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Conectar
 */
public class Conexion {
    
        
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "resto";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;

       // constructor privado para evitar que la llamada sea instanciada en otro lugar
       private Conexion(){}
       
       //un solo metodo que retorna connection
       public static Connection getConexion(){
           //tipo de conexión Singleton
           if(connection==null){
               
               try {
                   Class.forName("org.mariadb.jdbc.Driver");
                   connection=DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
                    JOptionPane.showMessageDialog(null, "Exito al conectarte");
                   
               } catch (ClassNotFoundException ex) {
                   JOptionPane.showMessageDialog(null, "Error al cargar los driver");
               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "Error al conectarse");
               }
       }
           return connection;
       
}
}
    

