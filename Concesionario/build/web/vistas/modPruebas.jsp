<%-- 
    Document   : modPruebas
    Created on : 6/07/2018, 10:40:28 AM
    Author     : David Ricardo
--%>


<%@page import="java.text.SimpleDateFormat"%>
<%@page import="negocio.Concesionario "%>

<%@page import="java.sql.Date "%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
  <meta charset="utf-8">
  <title>PRUEBA</title>
  <link href="https://fonts.googleapis.com/css?family=Lato:400,400i,700,700i" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Bree+Serif" rel="stylesheet">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css" integrity="sha384-Zug+QiDoJOrZ5t4lssLdxGhVrurbmBWopoEl+M6BdEfwnCJZtKxi1KgxUyJq13dy" crossorigin="anonymous">
    
</head>
    <%      
      Concesionario concesionario = new Concesionario();     
      //Date date = new Date();
      
      //out.println("Bienvenido. Hora actual es " + date);
    %>

        <body> <!--#F44336-->
        
            <form>
  
          <div class="form-group">
            <label for="email">ID VENDEDOR</label>
            <input class="form-control" type="text" name="ven" value="">
          </div>
  
         
          <button type="submit" class="btn btn-default">PRUEBA</button>
          
        </form>
        
        
        <%if (!request.getParameterMap().isEmpty()) {
            
          try{                
              int ven = Integer.parseInt(request.getParameter("ven"));
               int prueba =  concesionario.getTotalVentas(ven);
               out.println("value: " + prueba);
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

        </body>
</html>

