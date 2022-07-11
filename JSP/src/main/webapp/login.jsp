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
String name = request.getParameter("username");
String password = request.getParameter("password");
if(name.equals("cdac")&&password.equals("juhu")){
	response.sendRedirect("https://chaitanya-ankita-hiteshh.netlify.app/");
}else{
	out.write("<html><body>");
	out.write("<h1>You have sign up 1st</h1>");
	out.write("</body></html>");
}
%>
</body>
</html>