<%-- 
    Document   : TCP
    Created on : 22-ago-2017, 20:50:33
    Author     : Ricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
             double n1=Double.parseDouble(request.getParameter("termino1"));
             double n2=Double.parseDouble(request.getParameter("termino2"));
             double n3=Double.parseDouble(request.getParameter("termino3"));
             
            double num4= Math.pow(n2,2)-(4*n1*n3);
            double num5;
            double num6;
            String binomio;
            if(num4==0){
                num5=Math.pow(n1,0.5);
                num6=Math.pow(n3,0.5);
                binomio="("+num5+" "+num6+")^2";
                out.write("<h1>"+binomio+"<h1>");
            }else{
                binomio="no es un TCP";
                 out.write("<h1>"+binomio+"<h1>");
            }
            
        %>
    </head>
    <body>
    </body>
</html>
