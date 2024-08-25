package cl.praxis.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.util.ParidadUtil;

@WebServlet("/ServletPares")
public class ServletPares extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletPares() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		String par = ParidadUtil.esPar(num) ? "par" : "impar";
		response.getWriter().append("El número " + num + " es " + par + ".");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
