<%-- 
    Document   : misClientes
    Created on : 7/07/2018, 04:30:26 PM
    Author     : PC
--%>

<%@page import="java.util.List"%>
<%@page import="negocio.Cliente"%>
<%@page import="negocio.Concesionario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head> 
	<title>Clientes</title>
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
        List<Cliente> cli = concesionario.getClientes();
     %>
    <body>
        <!--<h1>Mis Empleados</h1>-->
        
        <%@include file="../estructura/noicagevan.html" %><br><br><br>
        
<div class="container"> <!--"limiter"-->
		<div class="container"> <!--container-table100-->
			<div class="wrap-table100">
				<div class="table100">
					<table>
		<thead>
                    <tr class="table100-head">
                        <th class="column1" >Doc. Identidad</th>
                        <th class="column2" >Nombre</th>
                        <th class="column3" >Apellido</th>                
                    </tr>
                </thead>
                <tbody> 
                   <%
                   for (Cliente cliente : cli) { //mientras tenga algo                       
                   %>
                   <tr>
                        <td class="column1"> <%= cliente.getIdCliente()%> </td>
                        <td class="column2"> <%= cliente.getNombreCliente()%> </td>
                        <td class="column3"> <%= cliente.getApellidoCliente()%> </td>                                        
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
