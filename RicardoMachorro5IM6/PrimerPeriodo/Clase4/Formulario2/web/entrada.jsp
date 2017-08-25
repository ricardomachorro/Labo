<%-- 
    Document   : entrada
    Created on : 22/08/2017, 08:14:21 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Salida Información</title>
        <link href=Css/form1.css type='text/css' rel='stylesheet'>
    </head>
    <body class="cuerpo">
        <%@page import='java.sql.*,java.io.*'%>
    <%
      Connection c=null;
      Statement s=null;
      PreparedStatement ps=null;
      ResultSet r=null;
      try{  
      Class.forName("com.mysql.jdbc.Driver").newInstance();
      c= DriverManager.getConnection("jdbc:mysql://localhost/escuela1","root","n0m3l0");
      s=c.createStatement();
      }catch(SQLException error){
          out.print("alert(error.toString())");
      }
       try{
           String nombre=request.getParameter("nombre");
           String apepa=request.getParameter("apellidop");
           String apema=request.getParameter("apellidom");
           String escuela=request.getParameter("escuela");
           String query="insert into formulario(Nombre,ApellidoP,ApellidoM,Escuela) values(?,?,?,?);";
          ps=c.prepareStatement(query);
          ps.setString(1,nombre);
          ps.setString(2,apepa);
          ps.setString(3,apema);
          ps.setString(4,escuela);
         ps.executeUpdate();
         ps.close();
             out.write("<header><h1 align='center' id='title'>Tus datos fueron regitrados con exito</h1></header>");
             out.write("<br>");
             out.write("<div align='center' class='info'>Tu Informacion es:</div>");
             out.write("<div class='centro'>");
             out.write("Nombre:"+nombre);
             out.write("<br>");
             out.write("<br>");
             out.write("Apellido Paterno:"+apepa);
              out.write("<br>");
             out.write("<br>");
             out.write("Apellido Materno:"+apema);
             out.write("<br>");
             out.write("<br>");
             out.write("Escuela:"+escuela);
             out.write("</div>");
             out.write(" <div  class='normal'>");
             out.write(" </div>");
       }catch(SQLException error){
           out.write("alert('"+error.toString()+"');");
       }
    %>
       
    </body>
</html>
