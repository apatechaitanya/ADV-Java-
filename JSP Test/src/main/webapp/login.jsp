<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String name= request.getParameter("username");
	String password = request.getParameter("password");
	if(name.equals("John") && password.equals("123")){
		response.sendRedirect("https://chaitanya-ankita-hiteshh.netlify.app/");
	}else{
		out.write("<h1>You need to Sign Up !!</h1>");
		out.write("<h2>To do Sign Up <a href ='Sign Up.html'>Click here</a></h2>");
		out.write("</body></html>");
	}
%>
</body>
</html>