/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author David Ricardo
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import negocio.Cliente;
import conexion.CaException;
import conexion.ServiceLocator;

public class ClienteDAO {
    
    private Cliente cliente;
    
    public ClienteDAO(){
        cliente = new Cliente();
    }
    
    public void incluirCliente() throws CaException {
      try {
        String strSQL = "INSERT INTO cliente (idCliente,nombreCliente,apellidoCliente) VALUES(?,?,?)";
        Connection conexion = ServiceLocator.getInstance().tomarConexion();
        PreparedStatement prepStmt = conexion.prepareStatement(strSQL);        
        prepStmt.setInt(1,cliente.getIdCliente()); 
        prepStmt.setString(2,cliente.getNombreCliente()); 
        prepStmt.setString(3,cliente.getApellidoCliente());         
        prepStmt.executeUpdate();
        prepStmt.close();
        ServiceLocator.getInstance().commit();
      } catch (SQLException e) {
           throw new CaException( "ClienteDAO", "No pudo crear el tipo"+ e.getMessage());
      }  finally {
         ServiceLocator.getInstance().liberarConexion();
      }
      
    }
    
    public List<Cliente> seleccionarClientes() throws CaException{
        List<Cliente> listaClientes = new ArrayList<Cliente>();
      try{
         String strSQL = "SELECT idCliente,nombreCliente,apellidoCliente FROM cliente";
         Connection conexion = ServiceLocator.getInstance().tomarConexion();
          PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
          //prepStmt.setString(1,tipo.getkTipo());
          ResultSet rs = prepStmt.executeQuery();
          while (rs.next()){
            Cliente cli = new Cliente(); //Toca Almacenarlo en este nuevo!            
            cli.setIdCliente(rs.getInt(1));
            cli.setNombreCliente(rs.getString(2));
            cli.setApellidoCliente(rs.getString(3));            
            listaClientes.add(cli);
          }
          
      }
      catch(SQLException e){
        throw new CaException("ClienteDAO", "No pudo recuperar los clientes "+ e.getMessage());
      }
      finally{
        ServiceLocator.getInstance().liberarConexion();
        return listaClientes;
      }

        
    }       
    
    public Cliente buscarCliente(int cedula) throws CaException{
            Cliente cliente = new Cliente();
      try{
         String strSQL = "SELECT idCliente,nombreCliente,apellidoCliente FROM cliente WHERE idCliente = ?";
         Connection conexion = ServiceLocator.getInstance().tomarConexion();
          PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
          prepStmt.setInt(1,cedula);
          ResultSet rs = prepStmt.executeQuery();
          while (rs.next()){            
            cliente = new Cliente();
            cliente.setIdCliente(rs.getInt(1));
            cliente.setNombreCliente(rs.getString(2));
            cliente.setApellidoCliente(rs.getString(3));
          }
      }
      catch(SQLException e){
        throw new CaException("ClienteDAO", "No pudo recuperar el Cliente "+ e.getMessage());
      }
      finally{
        ServiceLocator.getInstance().liberarConexion();
         return cliente;      
      }


       
    }
    
    public void actualizarNombre(String idCliente, String nombre) throws CaException{
        String sql = "UPDATE CLIENTE SET nombreCliente=? where idCliente=?";
        ServiceLocator s = ServiceLocator.getInstance();
        try{
            Connection conn = s.tomarConexion();
            PreparedStatement ps = conn.prepareCall(sql);
            
            ps.setString(1, nombre);
            ps.setString(2, idCliente);
            
        }
        catch(SQLException e){
            throw new CaException( "ClienteDAO", "No pudo crear el tipo"+ e.getMessage());
        }
        finally{
            s.liberarConexion();
        }

    }
    public void actualizarApellido(String idCliente, String apellido) throws CaException{
        String sql = "UPDATE CLIENTE SET apellidoCliente=? where idCliente=?";
        ServiceLocator s = ServiceLocator.getInstance();
        try{
            Connection conn = s.tomarConexion();
            PreparedStatement ps = conn.prepareCall(sql);
            
            ps.setString(1, apellido);
            ps.setString(2, idCliente);
            
        }
        catch(SQLException e){
            throw new CaException( "ClienteDAO", "No pudo crear el tipo"+ e.getMessage());
        }
        finally{
            s.liberarConexion();
        }
    }
    
    
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    
    
    
}
