/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import conexion.ServiceLocator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import negocio.Vehiculo;

/**
 *
 * @author David Ricardo
 */
public class VehiculoDAO {
    private Vehiculo vehiculo;
    
    public VehiculoDAO(){
    
    }
    
    public void insertarVehiculo(){
        
        String sql = "INSERT INTO VEHICULO (placa,motor,transmision,modelo,año,estado,preciobase,marca,color) values (?,?,?,?,?,?,?,?,?)";
        ServiceLocator s = ServiceLocator.getInstance();
        try{
            
            Connection conn = s.tomarConexion();
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, vehiculo.getPlaca());
            ps.setString(2, vehiculo.getMotor());
            ps.setString(3, vehiculo.getTransmision());
            ps.setString(4, vehiculo.getModelo());
            ps.setString(5, vehiculo.getAnio());
            ps.setString(6, vehiculo.getEstado());
            ps.setInt(7, vehiculo.getPrecioBase());
            ps.setString(8, vehiculo.getMarca());
            ps.setString(9, vehiculo.getColor());
            
            ps.executeUpdate();
            ps.close();
            
            
            s.commit();
           
        }
        catch(Exception e){
        
            e.printStackTrace();
        }
        finally{
             s.liberarConexion();
        }
        
    }    
    
    public Vehiculo buscarVehiculo(String placa){
        String sql = "SELECT * FROM VEHICULO WHERE PLACA = ? ";
        ServiceLocator s = ServiceLocator.getInstance();
        Vehiculo vehiculoNuevo = null;
        try{
            
            Connection conn = s.tomarConexion();
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, vehiculo.getPlaca());
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                vehiculoNuevo = new Vehiculo();
                vehiculoNuevo.setPlaca(rs.getString(1));
                vehiculoNuevo.setMotor(rs.getString(2));
                vehiculoNuevo.setTransmision(rs.getString(3));
                vehiculoNuevo.setModelo(rs.getString(4));
                vehiculoNuevo.setAnio(rs.getString(5));
                vehiculoNuevo.setEstado(rs.getString(6));
                vehiculoNuevo.setPrecioBase(rs.getInt(7));
                vehiculoNuevo.setMarca(rs.getString(8));
                vehiculoNuevo.setColor(rs.getString(9));
            }
                       
           
        }
        catch(Exception e){
        
            e.printStackTrace();
        }
        finally{
             s.liberarConexion();
             return vehiculoNuevo;
        }
      
    }
    
    
    public List<Vehiculo> seleccionarVehiculo(){
        String sql = "SELECT * FROM VEHICULO";
        ServiceLocator s = ServiceLocator.getInstance();
        Vehiculo vehiculoNuevo = null;
        List<Vehiculo> listaVehiculos = new  ArrayList<>();
        try{
            
            Connection conn = s.tomarConexion();
            PreparedStatement ps = conn.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                vehiculoNuevo = new Vehiculo();
                vehiculoNuevo.setPlaca(rs.getString(1));
                vehiculoNuevo.setMotor(rs.getString(2));
                vehiculoNuevo.setTransmision(rs.getString(3));
                vehiculoNuevo.setModelo(rs.getString(4));
                vehiculoNuevo.setAnio(rs.getString(5));
                vehiculoNuevo.setEstado(rs.getString(6));
                vehiculoNuevo.setPrecioBase(rs.getInt(7));
                vehiculoNuevo.setMarca(rs.getString(8));
                vehiculoNuevo.setColor(rs.getString(9));
                
                listaVehiculos.add(vehiculoNuevo);
            }
                       
           
        }
        catch(Exception e){
            
            e.printStackTrace();            
        }
        finally{
             s.liberarConexion();
             return listaVehiculos;
        }
      
    }

    
    public void actualizarColor(String placa, String color){
                
        String sql = "UPDATE VEHICULO SET color=? where placa=?";
        ServiceLocator s = ServiceLocator.getInstance();
        try{
            
            Connection conn = s.tomarConexion();
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, color);
            ps.setString(2, placa);

            ps.executeUpdate();
            ps.close();
            s.commit();
           
        }
        catch(Exception e){
        
            e.printStackTrace();
        }
        finally{
             s.liberarConexion();
        }
    }
    
    public void actualizarTransmision(String placa, String transmision){
                String sql = "UPDATE VEHICULO SET transmision=? where placa=?";
        ServiceLocator s = ServiceLocator.getInstance();
        try{
            
            Connection conn = s.tomarConexion();
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, transmision);
            ps.setString(2, placa);

            ps.executeUpdate();
            ps.close();
            s.commit();
           
        }
        catch(Exception e){
        
            e.printStackTrace();
        }
        finally{
             s.liberarConexion();
        }
    }
    
    public void actualizarPrecioBase(String placa, int nuevoPrecio){
        String sql = "UPDATE VEHICULO SET preciobase=? where placa=?";
        ServiceLocator s = ServiceLocator.getInstance();
        try{
            
            Connection conn = s.tomarConexion();
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setInt(1, nuevoPrecio);
            ps.setString(2, placa);

            ps.executeUpdate();
            ps.close();
            s.commit();
           
        }
        catch(Exception e){
        
            e.printStackTrace();
        }
        finally{
             s.liberarConexion();
        }
    }
    
    
        public void actualizarEstado(String placa, String nuevoEstado){
        String sql = "UPDATE VEHICULO SET preciobase=? where placa=?";
        ServiceLocator s = ServiceLocator.getInstance();
        try{
            
            Connection conn = s.tomarConexion();
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, nuevoEstado);
            ps.setString(2, placa);

            ps.executeUpdate();
            ps.close();
            s.commit();
           
        }
        catch(Exception e){
        
            e.printStackTrace();
        }
        finally{
             s.liberarConexion();
        }
    }
    
    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
    
    
}
