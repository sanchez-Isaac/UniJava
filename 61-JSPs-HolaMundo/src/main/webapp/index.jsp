<%-- 
el archivo index.jsp viene a sustituir el index.html
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %><%--Esto es una directiva "%@  %" de el inicio y final del tag--%>
<!DOCTYPE html>
<html>
    <head>
        <title>HolaMundo JSPs</title>
    </head>
    <body>
        <h1>HolaMundo JSPs</h1>
        <ul>
            <li> <% out.print("HolaMundo con Scriplets"); %> </li> <%-- los tags de JSP scrptlet agregan scrpts Java y los despliega en HTML, solo de lado del servidor    --%>
            <li>${"HolaMundo con Expression Language (EL)"}</li><%--Este tag se llama expression language / se puede mandar a imprimir informacion   --%>
            <li> <%= "HolaMundo con Expresiones" %>   </li><%--Este tag es una Expression / sirve para usar de manera interna la variable "out" imprime datos  --%>
            <li> <c:out value="HolaMundo con JSTL" /> </li><%--JSTL /se usa la DIRECTIVA "%@taglib" hay varios valores, pero aqui se usa "out"--%>
        </ul>
    </body>
</html>
