package cl.praxis.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.util.FactorialUtil;

@WebServlet("/ServletFactoriales")
public class ServletFactoriales extends HttpServlet {
	private static final long serialVersionUID = 1L;
     public ServletFactoriales() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		int factorial = FactorialUtil.calculaFactorial(num);
		
		response.getWriter().append("El factorial de " + num + " es " + factorial + ".");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
