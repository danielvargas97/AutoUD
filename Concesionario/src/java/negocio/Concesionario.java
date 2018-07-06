package negocio;

import datos.ClienteDAO;
import java.util.List;
/**
 *
 * @author David Ricardo
 */

import conexion.CaException;
import datos.VendedorDAO;
import datos.VehiculoDAO;
import datos.OrdenPagoDAO;
        
import java.sql.SQLException;

/**
 * Clase controladora de la aplicacion
 */
public class Concesionario {
    //concesionario es un intento de Facade desde donde pretendo manejar todo
    
    private ClienteDAO clienteDAO = new ClienteDAO();
    private VendedorDAO vendedorDAO = new VendedorDAO();
    private VehiculoDAO vehiculoDAO = new VehiculoDAO();
    private OrdenPagoDAO ordenPagoDAO = new OrdenPagoDAO();
    
    public Concesionario() {
         clienteDAO = new ClienteDAO();
         vendedorDAO = new VendedorDAO();
         vehiculoDAO = new VehiculoDAO();
         ordenPagoDAO = new OrdenPagoDAO();
    }
    
   /**
     * Invoca el m�todo del DAO para incluir y listar
     * @throws CaException
     */

     
    public void incluirCliente() throws CaException {
      clienteDAO.incluirCliente();
    }

    public Cliente getCliente() {
        return clienteDAO.getCliente();
    }   
    
     public List<Cliente> getClientes() throws CaException{        
        List<Cliente> listaClientes = clienteDAO.seleccionarClientes();
        return listaClientes;
    }     
     
    public void incluirVendedor() throws CaException, SQLException {
        vendedorDAO.incluirVendedor();        
    }

    public Vendedor getVendedor() {
        return vendedorDAO.getVendedor();
    }   
    
     public List<Vendedor> getVendedores() throws CaException{        
        List<Vendedor> listaVendedores = vendedorDAO.seleccionarVendedor();
        return listaVendedores;
    }        
     
    public void incluirVehiculo(){ // throws CaException
        vehiculoDAO.insertarVehiculo();
    }
    
    public Vehiculo getVehiculo(){
        return vehiculoDAO.getVehiculo();
    }
    
    public Vehiculo buscarVehiculo(String placa){
        return vehiculoDAO.buscarVehiculo(placa);
    }
    
    public List<Vehiculo> getInventario() throws CaException{
        List<Vehiculo> listaVehiculos = vehiculoDAO.seleccionarVehiculo();
        return listaVehiculos;
    }
    
    public Vehiculo consultarVehiculo(String placa){
        System.out.println("Consulta");
        return vehiculoDAO.buscarVehiculo(placa);        
    }
    
    public void incluirOrdenPago() throws CaException, SQLException{
        ordenPagoDAO.agregarOdenPago();
    }
    
    public void actualizarOrdenPago(int op) throws CaException, SQLException{
        ordenPagoDAO.actualizarOdenPago(op);
    }
    
    public OrdenPago getOdenPago(){
        return ordenPagoDAO.getOrdenPago();                
    } 
    
}