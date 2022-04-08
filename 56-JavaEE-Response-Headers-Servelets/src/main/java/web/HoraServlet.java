package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HoraServlet")
public class HoraServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("refresh", "1");//refrescar cada segundo
        
        Date fecha = new Date();//instanciar objecto date
        SimpleDateFormat formateador = new SimpleDateFormat("'Hora actualizada' HH:mm:ss");//dar formato a la fecha
        String horaConFormato = formateador.format(fecha);
        //desplegar la info 
        PrintWriter out = response.getWriter();
        out.print(horaConFormato);
        out.close();//cerrar el flujo
    }
}
