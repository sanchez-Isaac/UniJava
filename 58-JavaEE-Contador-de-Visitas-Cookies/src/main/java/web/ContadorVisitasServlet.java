package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ContadorVisitasServlet")//Java Class a java Servlet
public class ContadorVisitasServlet extends HttpServlet{ //REcuerda que se debe de extender de HttpServlet
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Declaramos la variable contador
        int contador = 0;//JavaEE no permite que se use var como declaracion, asi que se usan primitivos
        
        //Revisamos si existe la cookie contadorVisitas
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for(Cookie c: cookies){
                if(c.getName().equals("contadorVisitas")){
                    contador = Integer.parseInt(c.getValue());//se recibe un string, se debe cambiar a int
                }
            }
        }
        
        //incrementamos el contador en uno
        contador++;
        //Agregamos la respuesta al navegador
        Cookie c = new Cookie("contadorVisitas",Integer.toString(contador));
        //la cookie se almacenara en el cliente por 1 hora (3600 seg)
        c.setMaxAge(3600);
        response.addCookie(c);
        
        //Mandamos el mensaje al navegador
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Contador de visitas de cada cliente:" + contador);
        
    }
    
}
