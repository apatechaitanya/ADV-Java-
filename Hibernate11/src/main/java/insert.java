
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.app.EmployeeDao;
import com.cdac.entity.Employee;


public class insert extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Employee emp = new Employee();
		emp.setEmpno(Integer.parseInt(request.getParameter("empno")));
		emp.setName(request.getParameter("name"));
		emp.setPassword(request.getParameter("password"));
		EmployeeDao dao = new EmployeeDao();
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write("<h1> Record Saved</h1>");
		out.write("</body></html>");
		dao.add(emp);
				
	}
	
}
