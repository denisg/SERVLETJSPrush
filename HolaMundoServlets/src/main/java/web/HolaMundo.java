
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


//para reconocerlo desde el navegador y podamos accederlo
@WebServlet("/HolaMundo")
public class HolaMundo extends HttpServlet{
    
    //definicion de metodo doGet(sobre-escritura)
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //basicamente esta funcion, el servidor de aplicaciones(glassfish) se encarga de hacer la llamada a este metodo, despues se explica mejor
        
        
        response.setContentType("text/html;charset=UTF-8");//para indicar el tipo de contenido con el cual le vamos a responder al navegador
        PrintWriter out=response.getWriter();//con este objeto out, es como mandar imprimir a consola, en este caso se va a mandar a navegador web ESTA LINEA PUEDE GENERAR EXCEPCIONES pero ya se controlo IOException
        out.println("Hola mundo desde servlet, denis");//aqui se pueden mandar hasta codigos html's, pero no se recomienda
    }
    
    
}
