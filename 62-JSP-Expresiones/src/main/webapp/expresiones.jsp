<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Expresiones</title>
    </head>
    <body>
        <h1>JSP con Expresiones</h1>
        Concatenacion: <%= "Saludos" + " " + "JSP" %><%-- Expresion/ %= /  --%>
        <br>
        Operacion Matematica <%= 2 * 3 / 2 %><%-- Expresion/ %= /  --%>
        <br>
        Session id: <%= session.getId() %><%-- Expresion/ %= /  --%>
        <br>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
