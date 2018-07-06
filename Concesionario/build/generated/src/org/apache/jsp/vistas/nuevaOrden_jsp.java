package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import negocio.Vehiculo;
import negocio.OrdenPago;
import negocio.Concesionario;
import java.sql.Date;

public final class nuevaOrden_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/vistas/../estructura/noicagevan.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <title>COTIZACIÓN</title>\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Lato:400,400i,700,700i\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Bree+Serif\" rel=\"stylesheet\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css\" integrity=\"sha384-Zug+QiDoJOrZ5t4lssLdxGhVrurbmBWopoEl+M6BdEfwnCJZtKxi1KgxUyJq13dy\" crossorigin=\"anonymous\">\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("    ");
      
      Concesionario concesionario = new Concesionario();
      
      
      //Date date = new Date();
      
      //out.println("Bienvenido. Hora actual es " + date);
    
      out.write("\n");
      out.write("\n");
      out.write("<body style=\"background-color: #F2F2F2;\"> <!--#F44336-->\n");
      out.write("    ");
      out.write("<!-- Barra de NavegaciÃ³n para directorio alrevez-->\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/w3.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Lato\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Montserrat\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"w3-top\">\n");
      out.write("    \n");
      out.write("  <div class=\"w3-bar w3-red w3-card w3-left-align w3-large\">\n");
      out.write("    <a class=\"w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-red\" href=\"javascript:void(0);\" onclick=\"myFunction()\" title=\"Toggle Navigation Menu\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("    <a href=\"../index.jsp\" class=\"w3-bar-item w3-button w3-padding-large w3-white\">Inicio</a>\n");
      out.write("    \n");
      out.write("    <div class=\"w3-dropdown-hover\">\n");
      out.write("        <button class=\"w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white\">Nomina</button>\n");
      out.write("        <div class=\"w3-dropdown-content w3-border\">\n");
      out.write("            <a href=\"incluirEmpleado.jsp\" class=\"w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white\">Nuevo empleado</a><br>\n");
      out.write("            <a href=\"misEmpleados.jsp\" class=\"w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white\">Mis empleados</a>        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <a href=\"#\" class=\"w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white\">Inventario</a>\n");
      out.write("    <div class=\"w3-dropdown-hover\">\n");
      out.write("        <button class=\"w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white\">Cliente</button>\n");
      out.write("        <div class=\"w3-dropdown-content w3-border\">\n");
      out.write("            <a href=\"incluirCliente.jsp\" class=\"w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white\">Registrar Cliente</a><br>\n");
      out.write("            <a href=\"incluirCliente.jsp\" class=\"w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white\">Ver Clientes</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <a href=\"#\" class=\"w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white\">Link 3</a>    \n");
      out.write("    <a href=\"#\" class=\"w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white\">Link 4</a>     \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("             \n");
      out.write("\n");
      out.write("  <!--Barra de navegacion para pantalla pequeÃ±a(barra lat)-->\n");
      out.write("   <div id=\"navDemo\" class=\"w3-bar-block w3-white w3-hide w3-hide-large w3-hide-medium w3-large\">\n");
      out.write("    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">Link 1</a>\n");
      out.write("    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">Link 2</a>\n");
      out.write("    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">Link 3</a>\n");
      out.write("    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">Link 4</a>\n");
      out.write("   </div>\n");
      out.write("  \n");
      out.write("</div>");
      out.write("  <br><br><br> <!--Toca meterla a lo gamin pues esta fuera de la raiz--> \n");
      out.write("  <div class=\"content container-fluid text-white \" >\n");
      out.write("    <div class=\"row\" style=\"background-color: #F2F2F2;\">\n");
      out.write("      <div class=\"col-md-12 text-center\" style=\"margin-top: 20px;\">\n");
      out.write("        <a href=\"/\" style=\"display: block;\">            \n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("  \n");
      out.write("\n");
      out.write("  \n");
      out.write("    <div class=\"login-container row\">\n");
      out.write("\n");
      out.write("      <div class=\"col-md-4 ltr-login offset-2\" >\n");
      out.write("          \n");
      out.write("          <h2 style=\"color:#000000\">Modulo de Cotizaciones</h2><br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <font color=\"blue\">\n");
      out.write("        <form> <!--class=\"form\" action=\"/registrar\" method=\"post\" enctype=\"multipart/form-data\"-->\n");
      out.write("          <!--idOrden pago (6) -->\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"nickname\">PLACA</label>\n");
      out.write("            <input class=\"form-control\" type=\"text\" name=\"pla\" value=\"\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"email\">CEDULA CLIENTE</label>\n");
      out.write("            <input class=\"form-control\" type=\"text\" name=\"cli\" value=\"\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"email\">ID VENDEDOR</label>\n");
      out.write("            <input class=\"form-control\" type=\"text\" name=\"ven\" value=\"\">\n");
      out.write("          </div>\n");
      out.write("          <!--precio de ordenPAgo-->\n");
      out.write("          <!--estadoOrden auto (automatica)-->\n");
      out.write("          <!--fecha (Sale del current_date en el insert-->       \n");
      out.write("         \n");
      out.write("         \n");
      out.write("          <button type=\"submit\" class=\"btn btn-default\">COTIZAR</button>\n");
      out.write("          \n");
      out.write("        </form>\n");
      out.write("        </font>\n");
      out.write("        \n");
      out.write("        ");
if (!request.getParameterMap().isEmpty()) {
         
              try {
                  OrdenPago orden = concesionario.getOdenPago();
                  //Convertir el codigo postal a un valor num�rico  
                  int idOrden = (int) Math.random() * (999999 - 100000) + 100000;
                  String placa = request.getParameter("pla");
                  int idCliente = (int) Integer.parseInt(request.getParameter("cli"));
                  int idVendedor = (int) Integer.parseInt(request.getParameter("ven"));
                  int precioBase = concesionario.buscarVehiculo(placa).getPrecioBase();

                  int precioTotal = precioBase + orden.getIVA(precioBase) + orden.getImpuestoAvaluo(precioBase);
                  //String estado = "disponible";
                  //Date fechaActual = date;                

                  long time = System.currentTimeMillis();
                  Date today = new Date(time);
                  //System.out.println("Today: " + today);
                  //out.println("Today: " + today);

                  orden.setIdOrden(idOrden);
                  orden.setPlaca(placa);
                  orden.setIdCliente(idCliente);
                  orden.setIdVendedor(idVendedor);
                  orden.setPrecioDeOrden(precioTotal);
                  orden.setEstadoOrden("disponible");
                  orden.setFecha(today);

                  concesionario.incluirOrdenPago();

                  out.println("Orden: [" + orden.getIdOrden() + "] List@");
                  out.println(precioBase);
                  System.out.println(precioBase);
              } catch (NumberFormatException e) {
                  out.println("Error --> " + "Necesito ayuda profe, colaboreme");
              } catch (Exception e1) {
                  out.println("Error --> " + e1 + e1.getMessage());
                  System.out.println("Error: " + e1 + e1.getMessage());
              }
            
        }
      out.write("\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("      <div class=\"col-md-4 col-md-offset-4 rtl-login\">\n");
      out.write("          <center> <img src=\"../img/cotiza.png\" class=\"img-responsive hero-logo w-35\" alt=\"Canal\"></center>\n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("  </div>\n");
      out.write("   \n");
      out.write("  <footer class=\"footer text-white\"> <br>     \n");
      out.write("        <font color=\"green\">\n");
      out.write("    <p class=\"text-center\">Copyright (c) Universidad Distrital Francisco José de Caldas.</p>\n");
      out.write("        </font>\n");
      out.write("  </footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
