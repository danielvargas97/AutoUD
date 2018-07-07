<%-- 
    Document   : incluirBuque
    Created on : 3/06/2018, 22:40:12 PM
    Author     : David Ricardo
--%>
<%@page import="negocio.Cliente"%>
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
          
          <h2 style="color:#000000">Ingresar | Cliente nuevo</h2><br>
        
        
        <font color="red">
        <form action="/Concesionario/RegistradorCliente" method="get"> <!--class="form" action="/registrar" method="post" enctype="multipart/form-data"-->
          <div class="form-group">
            <label for="nickname">CEDULA</label>
            <input class="form-control" type="text" name="ced" value=""> 
          </div>
          <div class="form-group">
            <label for="nickname">NOMBRE</label>
            <input class="form-control" type="text" name="nom" value="">
          </div>
          <div class="form-group">
            <label for="email">APELLIDO</label>
            <input class="form-control" type="text" name="ape" value="">
          </div>
       
         
         
          <button type="submit" class="btn btn-default">Nuevo|Cliente</button>
          
        </form>
        </font>
        
      </div>

      <div class="col-md-4 col-md-offset-4 rtl-login">
          <center> <img src="../img/clientes.png" class="img-responsive hero-logo w-35" alt="Canal"></center>
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
