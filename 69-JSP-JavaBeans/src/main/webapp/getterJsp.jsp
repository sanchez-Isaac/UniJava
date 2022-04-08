<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que lee los valores del JavaBean</title>
    </head>
    <body>
        <h1>JSP que lee los valores del JavaBean</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session" /><!--Esto toma el javaBeans -->
        <br/>
        Valor base: <jsp:getProperty name="rectangulo" property="base" /><br/> <!--recupera o substrae la info del javaBeans -->
        Valor altura: <jsp:getProperty name="rectangulo" property="altura" /><br/><!--recupera o substrae la info del javaBeans -->
        Valor area: <jsp:getProperty name="rectangulo" property="area" /> <br/><!--recupera o substrae la info del javaBeans -->
        <br/>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
