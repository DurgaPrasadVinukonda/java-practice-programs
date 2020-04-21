import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentAdd  extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw =res.getWriter();
		pw.println("<h1>Hello How are you </h1");
	 String id =req.getParameter("id");
	 String name = req.getParameter("name");
	 String country = req.getParameter("country");
	 int id1 =Integer.parseInt(id);
	 int rowcount =0;
	 pw.println("<P ALIGN='center'><TABLE BORDER=1>");
	 
	 
	 System.out.println("Id is "+id);
	 System.out.println("Name is "+name);
	 System.out.println("Country is "+country);
	 pw.print("<html><body>");
	 pw.print("<form action='./welcome'method='get'>");
	 pw.print("<table border='1'");
	 pw.print("<tr><th>ID</TH><TH>NAME</TH><TH>Country</TH></TR>");
	 
	 
   for (int i=0;i<id1;i++)
     {
       pw.print("<tr><td>"+id+"</td><td>"+name+"</td><td>"+country+"</td>");  
    }
	 
	 
	 
     
     pw.print("</table>");
     pw.print("</body></html>");
	 
     pw.println("<p>Id is  "+id+" " +"Name is "+name+" "+"Country is "+country);
    
	 
	
	 
//		
		
	}

}
