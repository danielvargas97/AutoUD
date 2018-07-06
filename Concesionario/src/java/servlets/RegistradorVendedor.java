/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Concesionario;
import negocio.Vendedor;

/**
 *
 * @author PC
 */

public class RegistradorVendedor extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            Concesionario concesionario = new Concesionario();
            Vendedor c = concesionario.getVendedor();
            int cedula = Integer.parseInt(request.getParameter("ced"));
            String nombre = request.getParameter("nom");
            String apellido = request.getParameter("ape");
            int sueldoB = Integer.parseInt(request.getParameter("sb"));

            c.setIdVendedor(cedula);
            c.setNombreVendedor(nombre);
            c.setApellidoVendedor(apellido);
            c.setSueldoBase(sueldoB);
            concesionario.incluirVendedor();
            response.sendRedirect("index.jsp");
            System.out.println("Vendedor: [" + c.getNombreVendedor() + "] List@");
        } catch (NumberFormatException e) {
            System.out.println("Error --> " + "No lo se Rick");
        } catch (Exception e1) {
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
