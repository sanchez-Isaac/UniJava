package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletHeaders")//Servlet que debe de llamarse igual al la llamada en index.html
public class Servlet extends HttpServlet{//extends para que sea conciderado un servlet
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String metodoHttp = request.getMethod();//Que metodo se uso en la peticion
        
        //Abriendo documento html
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Headers HTTP</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Headers HTTP</h1>");
        out.print("<br>");
        out.print("Metodo Http:" + metodoHttp);//imprimiendo el metodo
        
        String uri = request.getRequestURI();//uri
        out.print("<br>");
        out.print("Uri solicitada:" + uri);//se imprime: ManejoCabeceros/ServletHeaders
        
        //Imprimimos todos los cabeceros disponibles
        out.print("<br>");
        out.print("<br>");
        Enumeration cabeceros = request.getHeaderNames();//imprime todos los cabeceros en el while loop
        while(cabeceros.hasMoreElements()){
            String nombreCabecero = (String) cabeceros.nextElement();
            out.print("<b>" + nombreCabecero + "</b>:");
            out.print(request.getHeader(nombreCabecero));
            out.print("<br>");
        }
        
        out.print("<body>");
        out.print("</html>");
        out.close();//cerrar el objeto
    }
}
