package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookiesServlet")//Conviertiendo clase de java en servlet
public class CookiesServlet extends HttpServlet{
    
    @Override //se sobreescribe la funcion doGet
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //el usuario visita por primera vez nuestro sitio
        boolean nuevoUsuario = true;
        
        //Obtenemos el arreglo de cookies
        Cookie[] cookies = request.getCookies();
        
        //buscamos si ya existe una cookie creada con anterioridad
        //llamada visitanteRecurrente
        if(cookies != null){
            for(Cookie c: cookies){
                if(c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")){
                    //si ya existe la cookie es un usuario recurrente
                    nuevoUsuario = false;
                    break;
                }
            }
        }
        
        String mensaje = null;
        //si usuario es nuevo
        if(nuevoUsuario){
            Cookie visitanteCookie = new Cookie("visitanteRecurrente","si");
            response.addCookie(visitanteCookie);//mandar mensaje al usuario nuevo
            mensaje = "Gracias por visitar nuestro sitio por primera vez";
        }
        else{//mandar mensaje al usuario nuevo
            mensaje = "Gracias por visitar NUEVAMENTE nuestro sitio";
        }
        //Mostrar el mensaje al usuario
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Mensaje:" + mensaje);
        out.close();
    }
}
