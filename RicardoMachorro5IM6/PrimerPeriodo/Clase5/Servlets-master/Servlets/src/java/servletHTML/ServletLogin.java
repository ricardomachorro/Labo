package servletHTML;

/*
@author:  Ricardo Alberto Machorro Vences, Raúl Daniel Rojas Santiago
@version:  1.0 
@date: 22-08-2017
*/
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String user = req.getParameter("user");
		String pass = req.getParameter("password");
		if ("emmanuel".equals(user) && "cecyt9".equals(pass)) {
			response(resp, "logeo correcto");
		} else {
			response(resp, "logeo incorrecto");
		}
	}

	private void response(HttpServletResponse resp, String msg)
			throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
                out.println("<head><link href=Css/PlantillaServ.css type='text/css' rel='stylesheet'</head>");
		out.println("<body class='cuerpo'>");
                out.println("<div class='normal'>");
                out.println("<div align='center' class='info'>Mensaje</div>");
                out.println("<div class='centro'>");
		out.println("<t1 align='center'>" + msg + "</t1>");
                out.println("</div>");
                out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}
}
