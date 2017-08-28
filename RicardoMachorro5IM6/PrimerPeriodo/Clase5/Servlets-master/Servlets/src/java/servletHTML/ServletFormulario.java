package servletHTML;

/**
 *
 * @author EMMANUEL
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Date;

public class ServletFormulario extends HttpServlet {
    String nombre;

    public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        nombre = peticion.getParameter("NOMBRE");
        PrintWriter out = new PrintWriter(respuesta.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Respuesta al Formulario del Servlet</title><link href=Css/PlantillaServ.css type='text/css' rel='stylesheet'></head>");
        out.println("<body class='cuerpo' padding=30px;>");
        out.println("<div class='normal'>");
        out.println("<div align='center' class='info'>");
        out.println("<header ><p><h1><center>Su nombre es:<B>" + nombre + "</B> </center></h1></p></header>");
        out.println("<div class='centro'>");
        out.println("hoy es " + new Date());
        out.println("</div>");
        out.println("</div>");
        out.println("</body></html>");
        out.close();
    }
}
