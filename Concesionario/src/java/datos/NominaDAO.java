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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import negocio.Nomina;

/**
 *
 * @author David Ricardo
 */
public class NominaDAO {
    
    private Nomina nomina;

    public NominaDAO() {
        nomina = new Nomina();
    }
    
    public void agregarNomina() throws CaException {
      try {
        String strSQL = "INSERT INTO nomina (idNomina,idVendedor,fecha,valor) VALUES(?,?,?,?)";
        Connection conexion = ServiceLocator.getInstance().tomarConexion();
        PreparedStatement prepStmt = conexion.prepareStatement(strSQL);        
        prepStmt.setInt(1,nomina.getIdNomina()); 
        prepStmt.setInt(2,nomina.getIdVendedor()); 
        prepStmt.setDate(3,nomina.getFecha());         
        prepStmt.setInt(4,nomina.getValor());         
        prepStmt.executeUpdate();
        prepStmt.close();
        ServiceLocator.getInstance().commit();
      } catch (SQLException e) {
           throw new CaException( "NominaDAO", "No pudo crear el tipo"+ e.getMessage());
      }  finally {
         ServiceLocator.getInstance().liberarConexion();
      }
      
    }
    
    public List<Nomina> seleccionarNominas() throws CaException{
                List<Nomina> nominas = new ArrayList<Nomina>();
      try{
         String strSQL = "SELECT idNomina,idVendedor,fecha,valor FROM nomina ORDER BY fecha,idVendedor";
         Connection conexion = ServiceLocator.getInstance().tomarConexion();
          PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
          //prepStmt.setString(1,tipo.getkTipo());
          ResultSet rs = prepStmt.executeQuery();
          while (rs.next()){
            Nomina nom = new Nomina(); //Toca Almacenarlo en este nuevo!            
            nom.setIdNomina(rs.getInt(1));
            nom.setIdVendedor(rs.getInt(2));
            nom.setFecha(rs.getDate(3));            
            nom.setValor(rs.getInt(4));
            nominas.add(nom);
          }
          return nominas;
      }
      catch(SQLException e){
        throw new CaException("NominaDAO", "No pudo recuperar las nominas "+ e.getMessage());
      }
        
    }            
        
    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }

    public Nomina getNomina() {
        return nomina;
    }
}
