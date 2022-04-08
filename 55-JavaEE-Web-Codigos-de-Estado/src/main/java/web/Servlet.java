package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")//servlet que permite acceso desde el navegador web
public class Servlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Simulando los valores correctos simulados - hardcoded
        String usuarioOk = "Juan";
        String passwordOk = "123";
        
        //Los parametros que vienen de el HTML
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        //variable que sirve para desplegar resultados
        PrintWriter out = response.getWriter();
        
        //si el usuario y la contraseña coinciden
        if(usuarioOk.equals(usuario) && passwordOk.equals(password)){
            out.print("<h1>");
            out.print("Datos correctos");
            out.print("<br>Usuario:" + usuario);
            out.print("<br>Password:" + password);
            out.print("</h1>");
        }
        else{//Si no coincide, entonces manda error
            response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
        }
        out.close();
    }
    
}
