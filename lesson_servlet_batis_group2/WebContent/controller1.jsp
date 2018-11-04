<%@page import="java.io.IOException"%>
<%@page import="dao.User"%>
<%@page import="java.util.List"%>
<%@page import="dao.Daoimplement"%>
<%@page import="dao.Userdao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String m = request.getParameter("m");
		out.print(m);
		if ("add".equals(m)) {
			add(request, response);
		} else if ("delete".equals(m)) {
			delete(request, response);
		} else if ("doUpdate".equals(m)) {
			doUpdate(request, response);
		} else if ("update".equals(m)) {
			update(request, response);
		} else {
			list(request, response);
		}
	%>
	<%!Userdao userDao = new Daoimplement();

	void add(HttpServletRequest req, HttpServletResponse repn) {
		Integer id = null;
		String ids = req.getParameter("id");
		if (ids != "") {
			id = Integer.valueOf(ids);
		}
		String name = req.getParameter("name");
		String groupids = req.getParameter("groupid");
		int groupid = Integer.parseInt(groupids);
		User user = new User(id, name, groupid);
		userDao.add(user);
		try {
			repn.sendRedirect("controller.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void delete(HttpServletRequest req, HttpServletResponse repn) {
		int id = Integer.parseInt(req.getParameter("id"));
		userDao.delete(id);
		try {
			repn.sendRedirect("controller.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void update(HttpServletRequest req, HttpServletResponse repn) {
		String ids = req.getParameter("id");
		int id = Integer.parseInt(ids);
		User u = userDao.findById(id);
		req.setAttribute("u", u);
		try {
			req.getRequestDispatcher("userUpdate.jsp").forward(req, repn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void doUpdate(HttpServletRequest req, HttpServletResponse repn) {
		String ids = req.getParameter("id");
		Integer id = Integer.valueOf(ids);
		String name = req.getParameter("name");
		String groupids = req.getParameter("groupid");
		int groupid = Integer.parseInt(groupids);
		User u = new User(id, name, groupid);
		userDao.update(u);
		try {
			repn.sendRedirect("controller.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void list(HttpServletRequest req, HttpServletResponse repn) {
		List<User> us = userDao.findAll();
		req.setAttribute("us", us);
		//System.out.print(us);
		try {
			req.getRequestDispatcher("userList.jsp").forward(req, repn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}%>
</body>
</html>