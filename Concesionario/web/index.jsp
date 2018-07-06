<%-- 
    Document   : index
    Created on : 26/06/2018, 04:32:36 PM
    Author     : David Ricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<title>AutoUD</title>
<head>
    <link rel="icon" href="img/logo.ico">
</head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="css/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
<style>
body,h1,h2,h3,h4,h5,h6 {font-family: "Lato", sans-serif}
.w3-bar,h1,button {font-family: "Montserrat", sans-serif}
.fa-anchor,.fa-coffee {font-size:200px}
</style>
<body>

<!-- Barra de Navegación()Nav-->    
    <%@include file="estructura/navegacion.html"  %> 
<!-- cabecera -->
    <%@include file="estructura/cabecera.html" %>
<!-- First and second? Grid -->
    <%@include file="estructura/lorem.jsp" %>
<!--leyenda-->
    <%@include file="estructura/leyenda.html" %>
<!-- Pie de pagina-Footer -->
    <%@include file="estructura/pie.jsp" %>

<script>
// Se usa para alternar el menú en pantallas pequeñas al hacer clic en el botón de menú
function myFunction() {
    var x = document.getElementById("navDemo");
    if (x.className.indexOf("w3-show") == -1) {
        x.className += " w3-show";
    } else { 
        x.className = x.className.replace(" w3-show", "");
    }
}
</script>

</body>
</html>