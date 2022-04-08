<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <!--Inclusion estatica renderizara los archivos que se le especifiquen en index.jsp
        Los archivos que se le agregan, no necesitan mas que el tag que se le quiera renderizar, no usan un body
        
        La desvenjata de este tipo de build, es que debe de detenerse el servidor y volverse a ejecutar para que se
        reflejen los cambios-->
        
        
        <title>Ejemplo Inclusion Estatica</title>
    </head>
    <body>
        <h1>Ejemplo Inclusion Estatica</h1>
        <br/>
        <ul>
            <li> <%@include file="paginas/noticias1.html"  %> </li><!--Inclusion estatica de la pagina noticias1.html-->
            <h4>Global Mentoring</h4>
            <li> <%@include file="paginas/noticias2.jsp"  %> </li><!--Inclusion estatica de la pagina noticias2.html-->
        </ul>
    </body>
</html>
