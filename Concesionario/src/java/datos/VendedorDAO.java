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
import conexion.CaException;
import conexion.ServiceLocator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import negocio.Vendedor;

public class VendedorDAO {

    private Vendedor vendedor;

    public VendedorDAO() {
        vendedor = new Vendedor();
    }

    public void incluirVendedor() throws CaException, SQLException {
        try {
            String strSQL = "INSERT INTO vendedor (idVendedor,nombreVendedor,apellidoVendedor,sueldoBase) VALUES(?,?,?,?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, vendedor.getIdVendedor());
            prepStmt.setString(2, vendedor.getNombreVendedor());
            prepStmt.setString(3, vendedor.getApellidoVendedor());
            prepStmt.setInt(4, vendedor.getSueldoBase());
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();
        } catch (SQLException e) {
            throw new CaException("VendedorDAO", "No pudo crear el tipo" + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }

    }

    public List<Vendedor> seleccionarVendedor() throws CaException {
        List<Vendedor> listaVendedores = new ArrayList<Vendedor>();
        listaVendedores.clear();
        try {
            String strSQL = "SELECT idVendedor,nombreVendedor,apellidoVendedor,sueldoBase FROM vendedor";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            //prepStmt.setString(1,tipo.getkTipo());
            ResultSet rs = prepStmt.executeQuery();
            while (rs.next()) {
                Vendedor ven = new Vendedor(); //Toca Almacenarlo en este nuevo!            
                ven.setIdVendedor(rs.getInt(1));
                ven.setNombreVendedor(rs.getString(2));
                ven.setApellidoVendedor(rs.getString(3));
                ven.setSueldoBase(rs.getInt(4));
                listaVendedores.add(ven);
            }
            
        } catch (SQLException e) {
            
            throw new CaException("VendedorDAO", "No pudo recuperar los Vendedores " + e.getMessage());            
        } finally {
            ServiceLocator.getInstance().liberarConexion();
            return listaVendedores;
        }

    }

    public Vendedor buscarVendedor(int cedula) throws CaException {
        Vendedor vendedor = new Vendedor();
        try {
            String strSQL = "SELECT idVendedor,nombreVendedor,apellidoVendedor,sueldoBase FROM vendedor WHERE idVendedor = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, cedula);
            ResultSet rs = prepStmt.executeQuery();
            while (rs.next()) {
                vendedor = new Vendedor();
                vendedor.setIdVendedor(rs.getInt(1));
                vendedor.setNombreVendedor(rs.getString(2));
                vendedor.setApellidoVendedor(rs.getString(3));
                vendedor.setSueldoBase(rs.getInt(4));
            }
        } catch (SQLException e) {
            throw new CaException("VendedorDAO", "No pudo recuperar el Vendedor " + e.getMessage());
        }
        finally {
            ServiceLocator.getInstance().liberarConexion();
            return vendedor;
        }
        
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }
}
