/*
@author:  Ricardo Alberto Machorro Vences, Raúl Daniel Rojas Santiago
@version:  1.0 
@date: 22-08-2017
*/
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ricardo
 */
@WebServlet(name = "Datum", urlPatterns = {"/datum"})
public class Datum extends HttpServlet {

   
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
         String nombre=request.getParameter("user");
        String contraseña=request.getParameter("password");  
          Connection c;
          PreparedStatement s;
          ResultSet r;
          
           try{
               Class.forName("com.mysql.jdbc.Driver");
               try{
                   c=DriverManager.getConnection("jdbc:mysql://localhost/formdata","root","n0m3l0");
                   s=c.prepareStatement("select * from usuarios where Nombre='"+nombre+"';");
                   r=s.executeQuery();
                    if(!r.next()){
                       s=c.prepareStatement("insert into  usuarios(Nombre,contrasena) values(?,?);");
                       s.setString(1, nombre);
                       s.setString(2, contraseña);
                       s.execute();
                       out.println("<html>");
                        out.println("<head>");
                        out.print(" <link href=Css/PlantillaServ.css type='text/css' rel='stylesheet'>");
                        out.println("</head>");
                        out.println("<body class='cuerpo'>");
                        out.print("<h2  align='center' id='title'>Ingreso Exitoso</h2>");
                        out.print("<div class='normal'>");
                        out.print("<div align='center' class='info'>Tus datos se ingresaron</div>");
                        out.print("<div class='centro'>");
                        out.print("Nombre: "+nombre);
                        out.print("<br>");
                        out.print("Contraseña: "+contraseña);
                        out.print("</div>");
                        out.print("</div>");
                        out.println("</body>");
                        out.println("</html>");
                    }else{
                      out.println("<html>");
                        out.println("<head>");
                        out.print(" <link href=Css/PlantillaServ.css type='text/css' rel='stylesheet'>");
                        out.println("</head>");
                        out.println("<body class='cuerpo'>");
                        out.print("<h2  align='center' id='title'>Ingreso Fallido</h2>");
                        out.print("<div class='normal'>");
                        out.print("<div align='center' class='info'>Tus datos no se ingresaron</div>");
                        out.print("<div class='centro'>");
                        out.print("El nombre "+nombre+" ya esta registrado");
                        out.print("</div>");
                        out.print("</div>");
                        out.println("</body>");
                        out.println("</html>"); 
                   }
                   
               }catch(SQLException er){
                    out.println("<html>");
                    out.println("<head>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1 align='center'>"+er.toString()+"</h1>");
                    out.println("</body>");
                    out.println("</html>");
               }
           } catch (ClassNotFoundException ex) {
             out.println("<html>");
             out.println("<head>");
             out.println("</head>");
             out.println("<body>");
             out.println("<h1 align='center'>"+ex.toString()+"</h1>");
             out.println("</body>");
             out.println("</html>");
        }
           out.close();
    }
}



