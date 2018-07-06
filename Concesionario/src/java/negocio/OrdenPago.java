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
public class OrdenPago {
    
    private int idOrden;
    private String placa; //llave f
    private int idCliente;
    private int idVendedor;
    private int precioDeOrden;
    private String estadoOrden;
    private Date fecha;

    public OrdenPago() {
    }

    public OrdenPago(int idOrden, String placa, int idCliente, int idVendedor, int precioDeOrden, String estadoOrden, Date fecha) {
        this.idOrden = idOrden;
        this.placa = placa;
        this.idCliente = idCliente;
        this.idVendedor = idVendedor;
        this.precioDeOrden = precioDeOrden;
        this.estadoOrden = estadoOrden;
        this.fecha = fecha;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getPrecioDeOrden() {
        return precioDeOrden;
    }

    public void setPrecioDeOrden(int precioDeOrden) {
        this.precioDeOrden = precioDeOrden;
    }

    public String getEstadoOrden() {
        return estadoOrden;
    }

    public void setEstadoOrden(String estadoOrden) {
        this.estadoOrden = estadoOrden;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    //impuestos sobre el vehiculo, para la venta
    
    public int getIVA(int precioBase){
        float iva = (precioBase*19)/100;
        return (int)iva;
    }
    
    public int getImpuestoAvaluo(int precioBase){
        if(precioBase<45000000){
            float avaluo1 = (float) ((precioBase*1.5)/100);
            return (int)avaluo1;
        }
        if(precioBase>45000000&&precioBase<100000000){
            float avaluo2 = (float) ((precioBase*2.5)/100);
            return (int)avaluo2;
        }else{
            float avaluo3 = (float) ((precioBase*3.5)/100);
            return (int)avaluo3;
        }
        
    }
    
    
    
}
