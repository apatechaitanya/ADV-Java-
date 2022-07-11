<%@page import="com.cdac.model.Option"%>
<%@page import="com.cdac.model.Questions"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="CalculateScoreServlet">
		<%
		Questions question = (Questions) session.getAttribute("currentQs");
		%>
		<h3>
			Q.
			<%=question.getQuestion()%></h3>

		<%
		//List <Option> options = question.getOptions();
		for (int i = 0; i < question.getOptions().size(); i++) {
			Option option = question.getOptions().get(i);
		%>
		<div>
			<input type="radio" name="op" value="<%=i%>" />
			<%=option.getOption()%>
		</div>
		<%
		}
		%>
		
		<button type="submit">Next</button>
	</form>
</body>
</html>