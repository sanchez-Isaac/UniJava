<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Jsp que modifica a un JavaBean</title>
    </head>
    <body>
        <h1>Jsp que modifica a un JavaBean</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session" /> <!-- Uso de javaBeans rectangulo / el 
        scope="session" permite que dure mas tiempo nuestro javaBeans-->
        Modificamos los atributos:
        <br/>
        <br/>
        <%
            int baseValor = 5; // Esto nos permite modificar las veriables de nuestro javaBeans
            int alturaValor = 10;
        %>
        <jsp:setProperty name="rectangulo" property="base" value="<%=baseValor%>" /><!--Esto es lo que se envia al javaBeans para modificarlo -->
        <jsp:setProperty name="rectangulo" property="altura" value="<%=alturaValor%>" /><!--Esto es lo que se envia al javaBeans para modificarlo -->
        <br/>
        
        
        Nuevo valor base: <%=baseValor%>
        <br/>
        Nuevo valor altura: <%=alturaValor%>
        <br/>
        <br/>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
