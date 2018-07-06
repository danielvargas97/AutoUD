<%-- 
    Document   : misEmpleados
    Created on : 28/06/2018, 10:55:24 AM
    Author     : David Ricardo
--%>

<%@page import="negocio.Vendedor"%>
<%@page import="java.util.List"%>
<%@page import="negocio.Concesionario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head> 
	<title>Vendedores</title>
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
        List<Vendedor> ven = concesionario.getVendedores();            
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
                <th class="column1" >#Cedula</th>
                <th class="column2" >Nombre</th>
                <th class="column3" >Apellido</th>
                <th class="column4" >Salario</th>
                <th class="column5"></th>
                    </tr>
                </thead>
                <tbody> 
                   <%
                   for (int i = 0; i < ven.size(); i++) { //mientras tenga algo
                       System.out.println("for" + i);
                   %>
                   <tr>
                    <td class="column1"> <%= ven.get(i).getIdVendedor()%> </td>
                    <td class="column2"> <%= ven.get(i).getNombreVendedor()%> </td>
                    <td class="column3"> <%= ven.get(i).getApellidoVendedor()%> </td>
                    <td class="column4"> <%= ven.get(i).getSueldoBase()%> </td>
                    <td class="column5"> </td>
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
