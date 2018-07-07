<%-- 
    Document   : nuevaOrden
    Created on : 3/07/2018, 06:30:32 PM
    Author     : David Ricardo
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="negocio.Vehiculo "%>
<%@page import="negocio.OrdenPago "%>
<%@page import="negocio.Concesionario "%>

<%@page import="java.sql.Date "%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
  <meta charset="utf-8">
  <title>COTIZACIÓN</title>
  <link href="https://fonts.googleapis.com/css?family=Lato:400,400i,700,700i" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Bree+Serif" rel="stylesheet">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css" integrity="sha384-Zug+QiDoJOrZ5t4lssLdxGhVrurbmBWopoEl+M6BdEfwnCJZtKxi1KgxUyJq13dy" crossorigin="anonymous">
    
</head>
    <%      
      Concesionario concesionario = new Concesionario();     
      //Date date = new Date();
      
      //out.println("Bienvenido. Hora actual es " + date);
    %>

<body style="background-color: #F2F2F2;"> <!--#F44336-->
    <%@include file="../estructura/noicagevan.html" %>  <br><br><br> <!--Toca meterla a lo gamin pues esta fuera de la raiz--> 
  <div class="content container-fluid text-white " >
    <div class="row" style="background-color: #F2F2F2;">
      <div class="col-md-12 text-center" style="margin-top: 20px;">
        <a href="/" style="display: block;">            
        </a>
      </div>
    </div>
      
  

  
    <div class="login-container row">

      <div class="col-md-4 ltr-login offset-2" >
          
          <h2 style="color:#000000">Modulo de Cotizaciones</h2><br>
        
        
        <font color="blue">
        <form> <!--class="form" action="/registrar" method="post" enctype="multipart/form-data"-->
          <!--idOrden pago (6) -->
          <div class="form-group">
            <label for="nickname">PLACA</label>
            <input class="form-control" type="text" name="pla" value="">
          </div>
          <div class="form-group">
            <label for="email">CEDULA CLIENTE</label>
            <input class="form-control" type="text" name="cli" value="">
          </div>
          <div class="form-group">
            <label for="email">ID VENDEDOR</label>
            <input class="form-control" type="text" name="ven" value="">
          </div>
          <!--precio de ordenPAgo-->
          <!--estadoOrden auto (automatica)-->
          <!--fecha (Sale del current_date en el insert-->       
         
         
          <button type="submit" class="btn btn-default">COTIZAR</button>
          
        </form>
        </font>
        
        <%if (!request.getParameterMap().isEmpty()) {
            
          try{                
               OrdenPago orden = concesionario.getOrdenPago();  
               
                String placa = request.getParameter("pla");
                int idCliente = (int)Integer.parseInt(request.getParameter("cli"));
                int idVendedor = (int)Integer.parseInt(request.getParameter("ven"));
                int precioBase = concesionario.buscarVehiculo(placa).getPrecioBase();
                
                int precioTotal = precioBase + orden.getIVA(precioBase) + orden.getImpuestoAvaluo(precioBase);
                //String estado = "disponible";
                //Date fechaActual = date;                               
                
                long time = System.currentTimeMillis();
                Date today = new Date(time);
                //System.out.println("Today: " + today);
                //out.println("Today: " + today);
                
                orden.setPlaca(placa);
                orden.setIdCliente(idCliente);
                orden.setIdVendedor(idVendedor);
                orden.setPrecioDeOrden(precioTotal);
                orden.setEstadoOrden("disponible");
                orden.setFecha(today);
                                
                concesionario.incluirOrdenPago();
                
                
               out.println("Orden: ["+ orden.getIdOrden() + "] List@");
               out.println(precioBase);
               System.out.println(precioBase);
            }
            catch(NumberFormatException e ){
                out.println("Error --> " + "Necesito ayuda profe, colaboreme");
            }
            catch(Exception e1){
                out.println("Error --> " + e1 + e1.getMessage());
                System.out.println("Error: " + e1 + e1.getMessage());
            }
            
        }%>
      </div>


      <div class="col-md-4 col-md-offset-4 rtl-login">
          <center> <img src="../img/cotiza.png" class="img-responsive hero-logo w-35" alt="Canal"></center>
      </div>
        
    </div>
      
  </div>
   
  <footer class="footer text-white"> <br>     
        <font color="green">
    <p class="text-center">Copyright (c) Universidad Distrital Francisco José de Caldas.</p>
        </font>
  </footer>
</body>
</html>

