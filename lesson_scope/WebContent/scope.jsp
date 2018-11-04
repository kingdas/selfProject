<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
		pageContext.setAttribute("p", "pp");
		pageContext.setAttribute("ps", "pss", pageContext.PAGE_SCOPE);
		request.setAttribute("r", "rr");
		pageContext.setAttribute("rs", "rss", pageContext.REQUEST_SCOPE);
		session.setAttribute("s", "ss");
		pageContext.setAttribute("ss", "sss", pageContext.SESSION_SCOPE);
	%>

	r =
	<%=request.getAttribute("r")%>---${r }
	<br />rs =
	<%=request.getAttribute("rs")%>---${rs }
	<br />r=
	<%=pageContext.getAttribute("r", pageContext.REQUEST_SCOPE)%>
	<br />p =
	<%=pageContext.getAttribute("p")%>
	<br />s =
	<%=pageContext.getAttribute("s", pageContext.SESSION_SCOPE)%>
	<br />ss =
	<%=session.getAttribute("ss")%> --%>

	<%
		pageContext.setAttribute("s", "ps");
		request.setAttribute("s", "rs");
		session.setAttribute("s", "ss");
		application.setAttribute("s", "as");
	%>

	<%-- ${s }
	<br />${pageScope.s }
	<br />${requestScope.s }
	<br />${sessionScope.s }
	<br />${applicationScope.s }
 --%>
	<%-- <jsp:forward page="scopeView.jsp" /> --%>
	<%
		response.sendRedirect("scopeView.jsp");
	%>
</body>
</html>