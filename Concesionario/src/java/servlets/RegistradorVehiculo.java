/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Concesionario;
import negocio.Vehiculo;

/**
 *
 * @author PC
 */
public class RegistradorVehiculo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            Concesionario concesionario = new Concesionario();
            Vehiculo v = concesionario.getVehiculo();
            
            String placa = request.getParameter("pla");
            String motor = request.getParameter("mot");
            String transmision = request.getParameter("tra");
            String modelo = request.getParameter("mod");
            String anio = request.getParameter("anio");
            String estado = "disponible";
            int precioB = (int) Integer.parseInt(request.getParameter("pb"));
            String marca = request.getParameter("mar");
            String color = request.getParameter("col");
            
            //String placaConsulta = "bsr099";
            
            
            v.setTransmision(transmision);
            v.setModelo(modelo);
            v.setAnio(anio);
            v.setEstado(estado);
            v.setPrecioBase(precioB);
            v.setMarca(marca);
            v.setColor(color);
            v.setPlaca(placa);
            v.setMotor(motor);            
            
            concesionario.incluirVehiculo();
            //System.out.println(concesionario.consultarVehiculo(placaConsulta).getPrecioBase());
            response.sendRedirect("index.jsp");
            System.out.println("El Vehiculo: [" + v.getPlaca() + "] Guardado");
        } catch (NumberFormatException e) {
            System.out.println("Error --> " + "Necesito 45 profe, colaboreme");
        } catch (Exception e1) {
            e1.printStackTrace();
            System.out.println("Error --> " + e1 + e1.getMessage());
        }
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
/**
 * Handles the HTTP <code>GET</code> method.
 *
 * @param request servlet request
 * @param response servlet response
 * @throws ServletException if a servlet-specific error occurs
 * @throws IOException if an I/O error occurs
 */
@Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
