<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String opc=request.getParameter("opc");
        if(opc.equals("Ingresar")){
           out.println("<html>");
             out.println("<head>");
             out.print(" <link href=Css/PlantillaServ.css type='text/css' rel='stylesheet'>");
             out.println("</head>");
             out.println("<body class='cuerpo'>");
             out.print("<h2  align='center' id='title'>Ingreso</h2>");
             out.print("<div class='normal'>");
             out.print("<div align='center' class='info'>Acceso</div>");
             out.print("<div class='centro'>");
             out.println("<form method='POST' action='ServletLogin'>");
             out.println("<table align='center'>");
             out.println("<tr>");
             out.println("<td>User</td>");
             out.println("<td><input name='user'></td></tr>");
             out.println("<tr>");
             out.println("<td>Contraseña</td>");
             out.println("<td><input name='password'/></td>");
             out.println("</tr>");
             out.println("</table>");
             out.println("<input type='submit' class='btn' />");
             out.print("</div>");
             out.print("</div>");
             out.println("</body>");
             out.println("</html>");
        }else if(opc.equals("Registrarse")){
            out.println("<html>");
             out.println("<head>");
             out.print(" <link href=Css/PlantillaServ.css type='text/css' rel='stylesheet'>");
             out.println("</head>");
             out.println("<body class='cuerpo'>");
             out.print("<h2  align='center' id='title'>Registro</h2>");
             out.print("<div class='normal'>");
             out.print("<div align='center' class='info'>Datos</div>");
             out.print("<div class='centro'>");
             out.println("<form method='POST' action='./datum'>");
             out.println("<table align='center'>");
             out.println("<tr>");
             out.println("<td>User</td>");
             out.println("<td><input name='user' ></td></tr>");
             out.println("<tr>");
             out.println("<td>Contraseña</td>");
             out.println("<td><input name='password'/></td>");
             out.println("</tr>");
             out.println("</table>");
             out.println("<input type='submit' class='btn' />");
             out.print("</div>");
             out.print("</div>");
             out.println("</body>");
             out.println("</html>");
        }
       %>
    </body>
</html>
