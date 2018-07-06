/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import conexion.CaException;
import conexion.ServiceLocator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import negocio.OrdenPago;

/**
 *
 * @author David Ricardo
 */
public class OrdenPagoDAO {
    
    private OrdenPago op;
    
    public OrdenPagoDAO(){
        op = new OrdenPago();
    }
    
    public void agregarOdenPago() throws CaException, SQLException {
      try {
        String strSQL = "INSERT INTO ordenPago (idOrden,placa,idCliente,idVendedor,precioDeOrden,estadoOrden,fecha) ";
               strSQL+= " VALUES(?,?,?,?,?,?,?)";
        //String fecha = "CURRENT_DATE";        
        
        Connection conexion = ServiceLocator.getInstance().tomarConexion();
        PreparedStatement prepStmt = conexion.prepareStatement(strSQL);        
        prepStmt.setInt(1,op.getIdOrden()); 
        prepStmt.setString(2,op.getPlaca()); 
        prepStmt.setInt(3,op.getIdCliente());         
        prepStmt.setInt(4,op.getIdVendedor());         
        prepStmt.setInt(5,op.getPrecioDeOrden());         
        prepStmt.setString(6,op.getEstadoOrden());  
        prepStmt.setDate(7, op.getFecha()); 
        prepStmt.executeUpdate();
        prepStmt.close();
        ServiceLocator.getInstance().commit();
      } catch (SQLException e) {
           throw new CaException( "OpDAO", "No pudo crear el tipo"+ e.getMessage());
      }  finally {
         ServiceLocator.getInstance().liberarConexion();
      }
      
    }
    
    public void actualizarOdenPago(int idOrdenPago) throws CaException, SQLException {
      try {
        String strSQL = "UPDATE ordenPago set estadoOrden= 'pagado' WHERE ordenPago = '";
               strSQL+= idOrdenPago + "'";
        Connection conexion = ServiceLocator.getInstance().tomarConexion();
        PreparedStatement prepStmt = conexion.prepareStatement(strSQL);        
        //prepStmt.setInt(1,op.getIdOrden());        
        prepStmt.executeUpdate();
        prepStmt.close();
        ServiceLocator.getInstance().commit();
      } catch (SQLException e) {
           throw new CaException( "OpDAO", "No pudo crear el tipo"+ e.getMessage());
      }  finally {
         ServiceLocator.getInstance().liberarConexion();
      }
      
    }            
    
    public void setOrdenPago(OrdenPago op) {
        this.op = op;
    }

    public OrdenPago getOrdenPago() {
        return op;
    }
    
}
