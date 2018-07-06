<%-- 
    Document   : inventarioAutos
    Created on : 3/07/2018, 08:45:51 PM
    Author     : David Ricardo
--%>

<%@page import="negocio.Vehiculo"%>
<%@page import="java.util.List"%>
<%@page import="negocio.Concesionario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head> 
	<title>Vehiculos</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="../img/logo.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../colorlib/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../colorlib/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../colorlib/vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../colorlib/vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../colorlib/vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../colorlib/css/util.css">
	<link rel="stylesheet" type="text/css" href="../colorlib/css/main.css">
<!--===============================================================================================-->
</head>
    
     <%
        Concesionario concesionario = new Concesionario();             
        List<Vehiculo> veh = concesionario.getInventario();
     %>
    <body>
        <!--<h1>Mis Empleados</h1>-->
        
        <%@include file="../estructura/noicagevan.html" %><br><br><br>
    <div>
            <center> <img src="../img/inventario.png" class="img-responsive hero-logo w-35" alt="Canal"></center>
            <center> <img src="../img/march.png" class="img-responsive hero-logo w-35" alt="Canal"></center>
    </div>    
        
    <div class="container"> <!--"limiter"-->
		<div class="container"> <!--container-table100-->
			<div class="wrap-table100">
				<div class="table100">
					<table>
		<thead>
                    <tr class="table100-head">
                <th class="column1" >#PLACA</th>
                <th class="column2" >MOTOR</th>
                <th class="column3" >TRANSMISION</th>
                <th class="column4" >MODELO</th> <!--4-->
                <th class="column5" >AÑO</th> <!--4-->
                <!--<th class="column4" >ESTADO</th> 6-->
                <th class="column5" >PRECIO</th> <!--4-->
                <th class="column6" >MARCA</th> <!--4-->
                <th class="column7" >COLOR</th> <!--4-->
                <!--<th class="column8"></th>-->
                    </tr>
                </thead>
                <tbody> 
                   <%
                   for (int i = 0; i < veh.size(); i++) { //mientras tenga algo
                       System.out.println("for" + i);
                   %>
                   <tr>
                    <td class="column1"> <%= veh.get(i).getPlaca() %> </td>
                    <td class="column2"> <%= veh.get(i).getMotor() %> </td>
                    <td class="column3"> <%= veh.get(i).getTransmision()%> </td>
                    <td class="column4"> <%= veh.get(i).getModelo() %> </td>
                    <td class="column4"> <%= veh.get(i).getAnio() %> </td>
                    <td class="column4"> <%= veh.get(i).getPrecioBase()%> </td>
                    <td class="column4"> <%= veh.get(i).getMarca()%> </td>
                    <td class="column4"> <%= veh.get(i).getColor()%> </td>
                    <!--<td class="column5"> </td>-->
                   </tr>
                   <%
                   }
                   %>
                    
                </tbody>
            </table>
                                </div>
                        </div>
                </div>
    </div>
                   <%@include file="../estructura/pie.jsp" %>
    </body>
</html>
