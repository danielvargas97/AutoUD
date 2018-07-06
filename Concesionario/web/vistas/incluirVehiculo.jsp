<%-- 
    Document   : incluirVehiculo
    Created on : 3/07/2018, 07:59:42 PM
    Author     : David Ricardo
--%>

<%@page import="negocio.Vehiculo" %>
<%@page import="negocio.Concesionario"%>
<%@page import="java.util.Date"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
  <meta charset="utf-8">
  <title>Registrar|Cliente</title>
  <link href="https://fonts.googleapis.com/css?family=Lato:400,400i,700,700i" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Bree+Serif" rel="stylesheet">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css" integrity="sha384-Zug+QiDoJOrZ5t4lssLdxGhVrurbmBWopoEl+M6BdEfwnCJZtKxi1KgxUyJq13dy" crossorigin="anonymous">
    
</head>
    <%
      //Date date = new Date();
      Concesionario concesionario = new Concesionario();
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
          
          <h2 style="color:#000000">Ingresar | Vehiculo</h2><br>
        
        
        <font color="red">
        <form> <!--class="form" action="/registrar" method="post" enctype="multipart/form-data"-->
          <div class="form-group">
            <label for="nickname">PLACA</label>
            <input class="form-control" type="text" name="pla" value=""> 
          </div>
          <div class="form-group">
            <label for="nickname">MOTOR</label>
            <input class="form-control" type="text" name="mot" value="">
          </div>
          <div class="form-group">
            <label for="nickname">TRASNMISIÓN</label>
            <input class="form-control" type="text" name="tra" value="">
          </div>
          <div class="form-group">
            <label for="nickname">MODELO</label> <!--Altima, Versa, etc-->
            <input class="form-control" type="text" name="mod" value="">
          </div>
          <div class="form-group">
            <label for="nickname">AÑO</label>
            <input class="form-control" type="text" name="anio" value="">
          </div>
            <!--
          <div class="form-group">
            <label for="nickname">ESTADO</label>
            <input class="form-control" type="text" name="ape" value="">
          </div> 
            -->
          <div class="form-group">
            <label for="nickname">PRECIO BASE?</label>
            <input class="form-control" type="text" name="pb" value="">
          </div>
          <div class="form-group">
            <label for="nickname">MARCA</label>
            <input class="form-control" type="text" name="mar" value="">
          </div>
          <div class="form-group">
            <label for="nickname">COLOR</label>
            <select class="custom-select mb-2 mr-sm-2 mb-sm-0" id="inlineFormCustomSelect" name="col">
                <option value="ROJO" selected>ROJO</option>
                <option value="AZUL">AZUL</option>
                <option value="PLATEADO">PLATEADO</option>
            </select>
           </div>
            
       
         
         
          <button type="submit" class="btn btn-default">Agregar</button>
          
        </form>
        </font>
        
        <%if (!request.getParameterMap().isEmpty()) {
          
          try{               
               Vehiculo v = concesionario.getVehiculo();
               
               String placa = request.getParameter("pla");
               String motor = request.getParameter("mot");
               String transmision = request.getParameter("tra");
               String modelo = request.getParameter("mod");
               String anio = request.getParameter("anio");
               String estado = "disponible";
               int precioB = (int)Integer.parseInt(request.getParameter("pb"));
               String marca = request.getParameter("mar");
               String color = request.getParameter("col");
               
               //String placaConsulta = "bsr099";
                       
               v.setPlaca(placa);
               v.setMotor(motor);
               v.setTransmision(transmision);
               v.setModelo(modelo);
               v.setAnio(anio);
               v.setEstado(estado);
               v.setPrecioBase(precioB);
               v.setMarca(marca);
               v.setColor(color);
               
               concesionario.incluirVehiculo();
               //System.out.println(concesionario.consultarVehiculo(placaConsulta).getPrecioBase());
                
               out.println("El Vehiculo: ["+ v.getPlaca() +  "] Guardado");
            }
            catch(NumberFormatException e ){
                out.println("Error --> " + "Necesito 45 profe, colaboreme");
            }
            catch(Exception e1){
                out.println("Error --> " + e1 + e1.getMessage());
            }
            
        }%>
      </div>

      <div class="col-md-4 col-md-offset-4 rtl-login">
          <center> <img src="../img/kicks.png" class="img-responsive hero-logo w-35" alt="Canal"></center>
      </div>
        
    </div>
      
  </div>
   
  <footer class="footer text-white"> <br>     
        <font color="red">
    <p class="text-center">Copyright (c) Universidad Distrital Francisco José de Caldas.</p>
        </font>
  </footer>
      

</body>
</html>
