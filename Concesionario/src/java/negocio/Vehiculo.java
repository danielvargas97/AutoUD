/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author David Ricardo
 */
public class Vehiculo {
    
        private String placa;
        private String motor;
        private String transmision;
        private String modelo;
        private String anio;
        private String estado; //vendido o enInventario
        private int precioBase;
        private String marca;
        private String color;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String motor, String transmision, String modelo, String anio, String estado, int precioBase, String marca, String color) {
        this.placa = placa;
        this.motor = motor;
        this.transmision = transmision;
        this.modelo = modelo;
        this.anio = anio;
        this.estado = estado;
        this.precioBase = precioBase;
        this.marca = marca;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
        
        

    
}
