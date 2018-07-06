/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.sql.Date;

/**
 *
 * @author David Ricardo
 */
public class Nomina {
    
    private int idNomina;
    private int idVendedor;
    private Date fecha;
    private int valor;

    public Nomina() {
    }

    public Nomina(int idNomina, int idVendedor, Date fecha, int valor) {
        this.idNomina = idNomina;
        this.idVendedor = idVendedor;
        this.fecha = fecha;
        this.valor = valor;
    }

    public int getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(int idNomina) {
        this.idNomina = idNomina;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    
}
