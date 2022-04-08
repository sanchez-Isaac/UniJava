<%
    String colorFondo = request.getParameter("colorFondo");
%>

<!-- Al estar en la carpeta WEB-INF, significa que el archivo es privado no se puede acceder desde el navegador web-->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor='<%=colorFondo%>'>
       
    </body>
</html>
