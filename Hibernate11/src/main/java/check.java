import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.entity.Employee;



public class check extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

		com.cdac.app.EmployeeDao dao = new com.cdac.app.EmployeeDao();
		String name= request.getParameter("sname");
		String password = request.getParameter("spassword");
		PrintWriter out = response.getWriter();
		Employee ee = dao.check(name,password);
		if(ee.getName().equals(name)&&ee.getPassword().equals(password)) {
			out.write("<html><body>");
			out.write("<h1>Sign In</h1>");
			out.write("</body></html>");
		}else {
			response.sendRedirect("index.html");
		}
}}
