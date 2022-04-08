package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HolaMundo") // Esta anotacion es muy importante para que el navegador reconozca la pagina, es un servlet
public class HolaMundo extends HttpServlet{// para poder ser un servlet, debe de extender de HttpServlet
    
    @Override //vamos a sobre escribir doGet, metodo de HttpServlet
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{//reporta la exception por porrible error de printWritter
        response.setContentType("text/html;charset=UTF-8");//este es el tipo de respuesta que le mandamos al navegador
        PrintWriter out = response.getWriter();//esto es una forma similar de escribir en consola, pero este es al navegador
        out.println("Hola Mundo desde Servlets");//printea hola mundo
        
        //No se recomienda usar html en servlets
    }
    
}
