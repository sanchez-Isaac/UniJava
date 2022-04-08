<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Procesa Formulario</title>
    </head>
    <body>
        <h1>Resultado de Procesar el Formulario</h1>
        Usuario: <%= request.getParameter("usuario") %> <%-- Expresion/ %= / uso de variable implicita "request" --%>
        <br>
        Password: <%= request.getParameter("password") %> <%-- Expresion/ %= / uso de variable implicita "request" --%>
        <br>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
