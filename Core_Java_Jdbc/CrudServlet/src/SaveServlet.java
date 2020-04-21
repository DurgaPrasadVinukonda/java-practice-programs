import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		Emp e =new Emp();
		e.setName(name);
		e.setPassword(password);
		e.setEmail(email);
		e.setCountry(country);
		// int status=EmpDao.save(e); 
		int status =EmpDao.save(e);
		if (status >0){
			out.print("<p>Record Updated Successfully</p");
			request.getRequestDispatcher("index.html").include(request, response);
			
			
		} else {
			out.print("<p>Sorry Unable to Print</p>");
		}
		out.close();
	}

}
