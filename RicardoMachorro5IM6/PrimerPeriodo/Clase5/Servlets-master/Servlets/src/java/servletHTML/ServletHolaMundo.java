 //Primer   Servlet.
//Muy   sencillo.

/*
@author:  Ricardo Alberto Machorro Vences, Raúl Daniel Rojas Santiago
@version:  1.0 
@date: 22-08-2017
*/
package servletHTML;

import java.io.*;
import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//@WebServlet(name = "ServletHolaMundo", urlPatterns = {"/ServletHolaMundo"})
public class ServletHolaMundo extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = new PrintWriter(res.getOutputStream());
        out.println("<html>");
        out.println("<head><title>HolaMundoServlet</title><link href=Css/PlantillaServ.css type='text/css' rel='stylesheet'></head>");
        out.println("<body>");
        out.println("<header class='nuevotitle'><center><h2 align='center' id='title'>Ejemplo   de   Ejecuci&oacute;n   de   un   Servlet con HTML</h2></center></header><br><br>");
        out.println("<div  class='normal'>");
        out.println("<div align='center' class='info'>Mensaje</div>");
        out.println("<div class='centro'>");
        out.println("<center>Hola   Mundo   desde   el   servidor WEB</center>");
        out.println("</div>");
        out.println("</div>");
        out.println("</body></html>");
        out.close();
    }

    public String getServletInfo() {
        return "Crea   una   página   HTML   que   dice   HolaMundo";
    }
}
